package retrofit.android.bynnean.model;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by 乾隆大帝001 on 2017/5/16.
 */

public interface ISystemUpgrade {
    @POST("http://118.123.227.17:8080/audio-rest/Device/native/")
    Call<String> getSystemInfo(@Body RequestBody requestBody);

    @POST("http://118.123.227.17:8080/audio-rest/Device/native/")
    Call<String> devicesMotionHandler(@Body RequestBody requestBody);
}
