package retrofit.android.bynnean.bynnean_retrofit;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit.android.bynnean.builder.BaseRetrofitApi;
import retrofit.android.bynnean.bynnean_retrofit.convert.Gson2ConvertFactory;
import retrofit.android.bynnean.bynnean_retrofit.convert.StringConvertFactor;
import retrofit.android.bynnean.model.IUpgradeImpl;
import retrofit.android.bynnean.model.UpgradeData;
import retrofit.android.bynnean.utils.GsonUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 乾隆大帝001 on 2017/5/15.
 */

public class APPUpdate {

    public void initData()
    {
        new BaseRetrofitApi().initRetrofitBuilder()
                .addConverterFactory(new StringConvertFactor());
        Retrofit retrofit= new BaseRetrofitApi().getRetrofit();
        IUpgradeImpl upgradeImpl= retrofit.create(IUpgradeImpl.class);
        UpgradeData upgradeData=new UpgradeData();
        upgradeData.setHandler("apkDownHandler");
        upgradeData.setSub("0");
        String upgradeStr= GsonUtils.toJson(upgradeData).toString();
       final RequestBody requestBody= RequestBody.create(okhttp3.MediaType.parse("application/json,charset=utf-8"),upgradeStr);
        Call<String> call= upgradeImpl.upgradeService(requestBody);
        call.enqueue(new Callback<String>(){

            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.i("response--->",response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });





    }


}
