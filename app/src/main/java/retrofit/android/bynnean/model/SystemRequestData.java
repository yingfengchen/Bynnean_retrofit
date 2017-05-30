package retrofit.android.bynnean.model;

/**
 * Created by 乾隆大帝001 on 2017/5/16.
 */

public class SystemRequestData {
    String handler;
    SystemSubData sub;

    public SystemRequestData(String handler, SystemSubData sub) {
        this.handler = handler;
        this.sub = sub;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public SystemSubData getSub() {
        return sub;
    }

    public void setSub(SystemSubData sub) {
        this.sub = sub;
    }


}
