package retrofit.android.bynnean.model;

import io.realm.RealmObject;

/**
 * Comment:
 * <p>
 * Name: ResourcesBean
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-28 11:27
 */

public class ResourcesBean extends RealmObject{

    private String id;
    private String name;
    private String issue;
    private String icon;
    private String providerCode;
    private String model;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
