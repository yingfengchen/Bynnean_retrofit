package retrofit.android.bynnean.model;

import android.util.Log;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit.android.bynnean.bynnean_retrofit.convert.Gson2ConvertFactory;
import retrofit.android.bynnean.bynnean_retrofit.convert.StringConvertFactor;
import retrofit.android.bynnean.utils.GsonUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by 乾隆大帝001 on 2017/5/16.
 */

public class DeviceMotionInfo {
    private String url="http://118.123.227.17:8080/audio-rest/Device/native/";
    public void initDeviceMotionInfo(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(new StringConvertFactor())
                .build();
        ISystemUpgrade systemUpgrade=retrofit.create(ISystemUpgrade.class);

        String json= GsonUtils.toJson(new DeviceMotionData("deviceMotionHandler",new DeviceMotionData.DeviceSub("124445","local_music")));
        RequestBody requestBody=RequestBody.create(MediaType.parse("application/json,charset=utf-8"),json);
        Call<String> call= systemUpgrade.devicesMotionHandler(requestBody);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.i("requst",response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

//        Retrofit retrofit=new Retrofit.Builder()
//                .baseUrl(url)
//                .addConverterFactory(new StringConvertFactor())
//                .build();
//        ISystemUpgrade systemUpgrade=retrofit.create(ISystemUpgrade.class);
//        DeviceMotionData deviceMotionData=new DeviceMotionData("deviceMotionHandler",new DeviceMotionData.DeviceSub("234345453535",));
    }
}
