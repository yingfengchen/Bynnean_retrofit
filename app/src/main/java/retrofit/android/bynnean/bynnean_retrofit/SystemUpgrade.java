package retrofit.android.bynnean.bynnean_retrofit;

import android.util.Log;

import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit.android.bynnean.bynnean_retrofit.convert.StringConvertFactor;
import retrofit.android.bynnean.model.ISystemUpgrade;
import retrofit.android.bynnean.model.SystemRequestData;
import retrofit.android.bynnean.model.SystemSubData;
import retrofit.android.bynnean.utils.GsonUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by 乾隆大帝001 on 2017/5/16.
 */

public class SystemUpgrade {
    String url="http://118.123.227.17:8080/audio-rest/Device/native/";
    public void getSystemInfo()
    {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(new StringConvertFactor())
                .build();
        ISystemUpgrade systemUpgrade=retrofit.create(ISystemUpgrade.class);
        SystemRequestData systemRequestData=new SystemRequestData("sysDownHandler",new SystemSubData());
        String json= GsonUtils.toJson(systemRequestData);
        RequestBody requestBody=RequestBody.create(MediaType.parse("application/json,charset=utf-8"),json);
        Call<String> call= systemUpgrade.getSystemInfo(requestBody);
        call.enqueue(new Callback<String>(){

            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                Log.i("request","response----->"+response.code()+response.body()+response.message());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

    }




}
