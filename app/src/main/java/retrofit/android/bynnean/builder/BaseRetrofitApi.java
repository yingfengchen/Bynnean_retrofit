package retrofit.android.bynnean.builder;

import retrofit2.Retrofit;

/**
 * Created by 乾隆大帝001 on 2017/5/15.
 */

public class BaseRetrofitApi {
    String url="http://118.123.227.17:8080/audio-rest/Device/native/";
    private static   Retrofit.Builder builder;
    public Retrofit.Builder initRetrofitBuilder()
    {
        if(builder==null)
        {
            builder= new Retrofit.Builder().baseUrl(url);
        }
       return builder;
    }
    public Retrofit getRetrofit()
    {
        if(builder!=null)
        {
           return builder.build();
        }
        return null;
    }
}
