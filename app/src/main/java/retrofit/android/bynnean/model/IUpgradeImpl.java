package retrofit.android.bynnean.model;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by 乾隆大帝001 on 2017/5/15.
 */

public interface IUpgradeImpl {

    @POST("/audio-rest/Device/native/")
    Call<String> upgradeService(@Body RequestBody requestBody);
}
