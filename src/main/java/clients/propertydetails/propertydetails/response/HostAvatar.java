
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HostAvatar {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("avatarImage")
    @Expose
    private AvatarImage avatarImage;
    @SerializedName("badge")
    @Expose
    private Object badge;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("loggingEventData")
    @Expose
    private LoggingEventData__1 loggingEventData;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public AvatarImage getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(AvatarImage avatarImage) {
        this.avatarImage = avatarImage;
    }

    public Object getBadge() {
        return badge;
    }

    public void setBadge(Object badge) {
        this.badge = badge;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LoggingEventData__1 getLoggingEventData() {
        return loggingEventData;
    }

    public void setLoggingEventData(LoggingEventData__1 loggingEventData) {
        this.loggingEventData = loggingEventData;
    }

}
