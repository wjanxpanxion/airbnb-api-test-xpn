
package clients.propertydetails.propertyreviews.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserProfilePicture {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("loggingEventData")
    @Expose
    private Object loggingEventData;
    @SerializedName("onPressAction")
    @Expose
    private OnPressAction onPressAction;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Object getLoggingEventData() {
        return loggingEventData;
    }

    public void setLoggingEventData(Object loggingEventData) {
        this.loggingEventData = loggingEventData;
    }

    public OnPressAction getOnPressAction() {
        return onPressAction;
    }

    public void setOnPressAction(OnPressAction onPressAction) {
        this.onPressAction = onPressAction;
    }

}
