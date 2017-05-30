package retrofit.android.bynnean.myfactory;

import android.util.Log;

/**
 * Created by 乾隆大帝001 on 2017/5/18.
 */

public class ProductA extends IProduct {

    @Override
    public void diffMothed() {
        Log.i(ProductA.class.getSimpleName(),"this class is ProductA");
    }
}
