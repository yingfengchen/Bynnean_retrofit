package retrofit.android.bynnean.builder;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit.android.bynnean.utils.NetUtils;
import retrofit2.Retrofit;

/**
 * Comment:
 * <p>
 * Name: BaseApi
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 13:53
 */

public class BaseApi {

   final String baseurl = "http://chiq3.smart-tv.cn";
   public static Retrofit retrofit ;
   public static Retrofit.Builder builder;

   public  Retrofit.Builder initRetrofitBuilder(){
       if(null == builder)  builder = new Retrofit.Builder().baseUrl(baseurl);
      return   builder;
    }

    public void builder(){

    }

    public Retrofit getRetrofit(){
        return builder.build();
    }


    /**
     * okhttpclient 配置缓存机制
     */
    public static OkHttpClient setCacheIntercepor(){
        OkHttpClient client = new OkHttpClient.Builder()
                             .addInterceptor(new Interceptor() {
                                 @Override
                                 public Response intercept(Chain chain) throws IOException {
                                     Request request = chain.request();
                                     if(!NetUtils.isNetConnected()) {
                                        request =  request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
                                     }
                                     Response response = chain.proceed(request);
                                     if(NetUtils.isNetConnected()){
                                           response.newBuilder()
                                                   .removeHeader("Pragma")
                                                   .addHeader("Cache-Control","public, max-age="+ 2 * 60 * 60)
                                                   .build();
                                     } else {
                                         response.newBuilder()
                                                 .removeHeader("Pragma")
                                                 .addHeader("Cache-Control","public, only-if-cached, max-stale="+ 24 * 60 * 60)
                                                 .build();
                                     }
                                     return response;
                                 }
                             })
                             .build();
        return client;
    }
}
