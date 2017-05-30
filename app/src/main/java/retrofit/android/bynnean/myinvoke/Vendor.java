package retrofit.android.bynnean.myinvoke;

import android.util.Log;

/**
 * Created by 乾隆大帝001 on 2017/5/26.
 */

public class Vendor implements ISell {
    @Override
    public void sell() {
        Log.i(Vendor.class.getSimpleName(),"sell");
    }

    @Override
    public void ad() {
        Log.i(Vendor.class.getSimpleName(),"ad");
    }
}
