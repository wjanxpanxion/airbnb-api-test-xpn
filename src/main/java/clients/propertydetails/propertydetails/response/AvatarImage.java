
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvatarImage {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("accessibilityLabel")
    @Expose
    private String accessibilityLabel;
    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("onPressAction")
    @Expose
    private Object onPressAction;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getAccessibilityLabel() {
        return accessibilityLabel;
    }

    public void setAccessibilityLabel(String accessibilityLabel) {
        this.accessibilityLabel = accessibilityLabel;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getOnPressAction() {
        return onPressAction;
    }

    public void setOnPressAction(Object onPressAction) {
        this.onPressAction = onPressAction;
    }

}
