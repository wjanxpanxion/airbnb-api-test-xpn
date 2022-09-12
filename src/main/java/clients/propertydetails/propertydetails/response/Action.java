
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("screenId")
    @Expose
    private String screenId;
    @SerializedName("loggingData")
    @Expose
    private LoggingData loggingData;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public LoggingData getLoggingData() {
        return loggingData;
    }

    public void setLoggingData(LoggingData loggingData) {
        this.loggingData = loggingData;
    }

}
