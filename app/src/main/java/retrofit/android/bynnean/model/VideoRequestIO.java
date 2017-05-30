package retrofit.android.bynnean.model;

/**
 * Comment:
 * <p>
 * Name: VideoRequestIO
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 14:47
 */

public class VideoRequestIO {
    /**
     * categoryId : 1
     * client : {"agent_name":"chiq_phone_android","agent_ver":"2.2.005","device":"PHONE","termType":"default","tv_version":"ZLM60HiS_0.99999","uid":"default_user"}
     * mac : mac
     * pageCount : 36
     * pageIndex : 1
     * pageSize : 1
     * providerCode : chiq3
     * resIconType : VER_MIDDLE
     * safeFlag : 2
     * version : 5
     */
    public VideoRequestIO(){

    }

    public VideoRequestIO(int id){
        this.pageCount = id;
    }

    private int categoryId = 1;
    private ClientBean client = new ClientBean();
    private String mac = "mac";
    private int pageCount;
    private int pageIndex = 1;
    private int pageSize = 1;
    private String providerCode = "chiq3";
    private String resIconType  = "VER_MIDDLE";
    private int safeFlag  = 2;
    private String version  = "5";

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public ClientBean getClient() {
        return client;
    }

    public void setClient(ClientBean client) {
        this.client = client;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getResIconType() {
        return resIconType;
    }

    public void setResIconType(String resIconType) {
        this.resIconType = resIconType;
    }

    public int getSafeFlag() {
        return safeFlag;
    }

    public void setSafeFlag(int safeFlag) {
        this.safeFlag = safeFlag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static class ClientBean {
        /**
         * agent_name : chiq_phone_android
         * agent_ver : 2.2.005
         * device : PHONE
         * termType : default
         * tv_version : ZLM60HiS_0.99999
         * uid : default_user
         */

        private String agent_name = "chiq_phone_android";
        private String agent_ver = "2.2.005";
        private String device  = "PHONE";
        private String termType = "default";
        private String tv_version = "ZLM60HiS_0.99999";
        private String uid = "default_user";

        public String getAgent_name() {
            return agent_name;
        }

        public void setAgent_name(String agent_name) {
            this.agent_name = agent_name;
        }

        public String getAgent_ver() {
            return agent_ver;
        }

        public void setAgent_ver(String agent_ver) {
            this.agent_ver = agent_ver;
        }

        public String getDevice() {
            return device;
        }

        public void setDevice(String device) {
            this.device = device;
        }

        public String getTermType() {
            return termType;
        }

        public void setTermType(String termType) {
            this.termType = termType;
        }

        public String getTv_version() {
            return tv_version;
        }

        public void setTv_version(String tv_version) {
            this.tv_version = tv_version;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

    // {"categoryId":1,"client":{"agent_name":"chiq_phone_android","agent_ver":"2.2.005","device":"PHONE","termType":"default","tv_version":"ZLM60HiS_0.99999","uid":"default_user"},"mac":"mac","pageCount":36,"pageIndex":1,"pageSize":1,"providerCode":"chiq3","resIconType":"VER_MIDDLE","safeFlag":2,"version":"5"}
    //{"categoryId":1,"client":{"agent_name":"chiq_phone_android","agent_ver":"2.2.005","device":"PHONE","termType":"default","tv_version":"ZLM60HiS_0.99999","uid":"default_user"},"mac":"mac","pageCount":50,"pageIndex":1,"pageSize":1,"providerCode":"chiq3","resIconType":"VER_MIDDLE","safeFlag":2,"version":"5"}
}
