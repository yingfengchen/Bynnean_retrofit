package retrofit.android.bynnean.model;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Comment:
 * <p>
 * Name: ContentBean
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-28 11:31
 */

public class ContentBean extends RealmObject{

    private String code;
    private String serviceMethod;
    private int pageCount;
    private int pageIndex;
    private int pageTotal;
    private int resourceTotal;
    private RealmList<ResourcesBean> resources;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod;
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

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getResourceTotal() {
        return resourceTotal;
    }

    public void setResourceTotal(int resourceTotal) {
        this.resourceTotal = resourceTotal;
    }

    public RealmList<ResourcesBean> getResources() {
        return resources;
    }

    public void setResources(RealmList<ResourcesBean> resources) {
        this.resources = resources;
    }
}
