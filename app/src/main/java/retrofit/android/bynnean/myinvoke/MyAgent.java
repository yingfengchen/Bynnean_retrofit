package retrofit.android.bynnean.myinvoke;

/**
 * Created by 乾隆大帝001 on 2017/5/26.
 */

public class MyAgent implements ISell {

    Vendor vendor;
    public MyAgent(Vendor vendor)
    {
        this.vendor=vendor;
    }
    @Override
    public void sell() {
        vendor.sell();
    }

    @Override
    public void ad() {

        vendor.ad();
    }
}
