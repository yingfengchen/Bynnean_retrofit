package retrofit.android.bynnean.model;

/**
 * Comment:
 * <p>
 * Name: VideoCommonIO
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 16:01
 */

public class VideoCommonIO {
    BaseVideoIO client;
    String id;
    String resIconType;
    String mac = "mac";
    String providerCode = "chiq3";
    String version = "5";
    int safeFlag = 2;
    int categoryId;
    String filter_keyword_id; // 筛选默认类型
    String filter_age_id; // 筛选默认年份
    String filter_country_group_id; // 筛选默认地区
    String filter_condition_id; // 筛选默认排序
    int pageCount = 18;
    int pageIndex = 1;
    int pageSize = 1;

    public BaseVideoIO getClient() {
        return client;
    }

    public void setClient(BaseVideoIO client) {
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResIconType() {
        return resIconType;
    }

    public void setResIconType(String resIconType) {
        this.resIconType = resIconType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getFilter_keyword_id() {
        return filter_keyword_id;
    }

    public void setFilter_keyword_id(String filter_keyword_id) {
        this.filter_keyword_id = filter_keyword_id;
    }

    public String getFilter_age_id() {
        return filter_age_id;
    }

    public void setFilter_age_id(String filter_age_id) {
        this.filter_age_id = filter_age_id;
    }

    public String getFilter_country_group_id() {
        return filter_country_group_id;
    }

    public void setFilter_country_group_id(String filter_country_group_id) {
        this.filter_country_group_id = filter_country_group_id;
    }

    public String getFilter_condition_id() {
        return filter_condition_id;
    }

    public void setFilter_condition_id(String filter_condition_id) {
        this.filter_condition_id = filter_condition_id;
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
}
