package retrofit.android.bynnean.model;

/**
 * Comment:
 * <p>
 * Name: BaseVideoIO
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 16:01
 */

public class BaseVideoIO {

    /**
     * device : PHONE
     * uid : default_user
     * sn :
     * termType : default
     * agent_ver : 2.5.015
     * agent_name : chiq_phone_android
     */

    public String device  = "PHONE";
    public String uid  = "default_user";
    public String sn ;
    public String termType = "default";
    public String agent_ver = "2.2.005";
    public String agent_name = "chiq_phone_android";
    public String tv_version = "ZLM60HiS_0.99999";

    public BaseVideoIO(){

    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    public String getAgent_ver() {
        return agent_ver;
    }

    public void setAgent_ver(String agent_ver) {
        this.agent_ver = agent_ver;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getTv_version(){
        return  tv_version;
    }

    public void setTv_version(String version){
        this.tv_version = version;
    }

}
