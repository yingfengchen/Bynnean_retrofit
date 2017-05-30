package retrofit.android.bynnean.myfactory;

import android.util.Log;

/**
 * Created by 乾隆大帝001 on 2017/5/18.
 */

public abstract class IProduct {
        public abstract void diffMothed();
       public void smaeMothed(){

           Log.i(IProduct.class.getSimpleName(),"The sameMothed");
       }
}
