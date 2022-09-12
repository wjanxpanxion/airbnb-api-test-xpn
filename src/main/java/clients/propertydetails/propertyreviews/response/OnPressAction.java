
package clients.propertydetails.propertyreviews.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class OnPressAction {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("userId")
    @Expose
    private String userId;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
