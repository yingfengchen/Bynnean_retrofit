package retrofit.android.bynnean.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import retrofit.android.bynnean.bynnean_retrofit.R;
import retrofit.android.bynnean.model.ResourcesBean;
import retrofit.android.bynnean.model.VideoResponesIO;

/**
 * Comment:
 * <p>
 * Name: GridAdapter
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 14:32
 */


public  class GridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener, View.OnLongClickListener {

    private Context mContext;
    private List<ResourcesBean> datas;

    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view);
        void onItemLongClick(View view);
    }
    public void setDatas(List<ResourcesBean> beanList){
        if(null != datas) datas.clear();
        datas = new ArrayList(beanList);
        notifyDataSetChanged();
    }

    private OnRecyclerViewItemClickListener mOnItemClickListener = null;

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        mOnItemClickListener = listener;
    }


    public GridAdapter(Context context, List<ResourcesBean> datas) {
        mContext=context;
        this.datas=datas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
     //   if(viewType==0){
            View view = LayoutInflater.from(mContext).inflate(R.layout.grid_item_layout, parent,
                    false);
            MyViewHolder holder = new MyViewHolder(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
            return holder;
    //    }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof MyViewHolder){
            Glide.with(mContext).load(datas.get(position).getIcon()).into(((MyViewHolder) holder).iv);
        }else if(holder instanceof MyViewHolder2){
         //   ((MyViewHolder2) holder).tv.setText(datas.get(position).getPage()+"页");
        }

    }

    @Override
    public int getItemCount()
    {
       return datas.size();
    }

    @Override
    public int getItemViewType(int position) {

        if (!TextUtils.isEmpty(datas.get(position).getIcon())) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {

            mOnItemClickListener.onItemClick(v);
        }

    }


    @Override
    public boolean onLongClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemLongClick(v);
        }
        return false;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        private ImageButton iv;

        public MyViewHolder(View view)
        {
            super(view);
            iv = (ImageButton) view.findViewById(R.id.iv);
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder
    {
        private TextView tv;

        public MyViewHolder2(View view)
        {
            super(view);
           // tv = (TextView) view.findViewById(R.id.tv);
        }
    }

}

