package retrofit.android.bynnean.bynnean_retrofit;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import okhttp3.RequestBody;
import retrofit.android.bynnean.builder.BaseApi;
import retrofit.android.bynnean.model.IVideoImpl;
import retrofit.android.bynnean.model.VideoRequestIO;
import retrofit.android.bynnean.model.VideoResponesIO;
import retrofit.android.bynnean.utils.GsonUtils;
import retrofit.android.bynnean.view.GridAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Comment:
 * <p>
 * Name: VideoGsonListActivity
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-05-04 10:06
 */

public class VideoGsonListActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

    RecyclerView recyclerview;
    private CoordinatorLayout coordinatorLayout;
    private GridLayoutManager mLayoutManager;
    private SwipeRefreshLayout swipeRefreshLayout;
    GridAdapter adapter ;
    Realm realm = Realm.getDefaultInstance();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        initView();
        getData();
    }

    private void initView(){
        coordinatorLayout=(CoordinatorLayout)findViewById(R.id.grid_coordinatorLayout);
        recyclerview=(RecyclerView)findViewById(R.id.grid_recycler);
        mLayoutManager = new GridLayoutManager(VideoGsonListActivity.this,3,GridLayoutManager.VERTICAL,false);
        recyclerview.setLayoutManager(mLayoutManager);
        swipeRefreshLayout=(SwipeRefreshLayout) findViewById(R.id.grid_swipe_refresh) ;
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setProgressViewOffset(false, 0,  (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 24, getResources().getDisplayMetrics()));
    }

    /**
     * 获取UI数据
     */
    void getData(){
        getLocalData();
        Retrofit retrofit =  new BaseApi().getRetrofit();
        IVideoImpl impl = retrofit.create(IVideoImpl.class);
        VideoRequestIO requestIO = new VideoRequestIO();
        requestIO.setPageCount(100);
        String json = GsonUtils.toJson(requestIO);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);
        Call<VideoResponesIO> call = impl.getVideoFilter(body);
        call.enqueue(new Callback<VideoResponesIO>() {
            @Override
            public void onResponse(Call<VideoResponesIO> call, Response<VideoResponesIO> response) {
                Log.v("Callback--onResponse","success");
                Message msg = mHandler.obtainMessage();
                msg.what = 1;
                msg.obj = response.body();
                mHandler.sendMessage(msg);
            }

            @Override
            public void onFailure(Call<VideoResponesIO> call, Throwable t) {
                Log.v("Callback--onFailure","onFailure");
            }
        });
    }

    /**
     *  获取本地数据
     */
    void getLocalData(){
        RealmQuery<VideoResponesIO> realmQuery = realm.where(VideoResponesIO.class);
        RealmResults<VideoResponesIO> responesIOs = realmQuery.findAll();
        if(null == responesIOs || responesIOs.size() == 0) return;
        recyclerview.setAdapter( adapter = new GridAdapter(VideoGsonListActivity.this,responesIOs.get(0).getContent().getResources()));
    }

    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            swipeRefreshLayout.setRefreshing(false);
            if(msg.what == 2) return;
            if(msg.obj instanceof VideoResponesIO){
                VideoResponesIO responesIO = (VideoResponesIO)msg.obj;
                //  数据提交
                realm.beginTransaction();;
                realm.copyToRealm(responesIO);
                realm.commitTransaction();
                if(null == adapter){
                    recyclerview.setAdapter( adapter = new GridAdapter(VideoGsonListActivity.this,responesIO.getContent().getResources()));
                } else adapter.notifyDataSetChanged();
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onDestroy() {
        mHandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override
    public void onRefresh() {
        getData();
    }

}
