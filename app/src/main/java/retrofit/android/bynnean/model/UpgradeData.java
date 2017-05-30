package retrofit.android.bynnean.model;

/**
 * Created by 乾隆大帝001 on 2017/5/15.
 */

public class UpgradeData {
    private String handler;
    private Sub sub;

    public Sub getSub() {
        return sub;
    }

    public void setSub(String apkType) {
        this.sub = new Sub(apkType);
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public class Sub{
        public Sub(String apkType)
        {
            this.setApkType(apkType);
        }
        public String getApkType() {
            return apkType;
        }

        public void setApkType(String apkType) {
            this.apkType = apkType;
        }

        private  String apkType;
    }

}
