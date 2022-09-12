
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoggingEventData__3 {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("loggingId")
    @Expose
    private String loggingId;
    @SerializedName("component")
    @Expose
    private String component;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("eventData")
    @Expose
    private Object eventData;
    @SerializedName("eventDataSchemaName")
    @Expose
    private Object eventDataSchemaName;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getLoggingId() {
        return loggingId;
    }

    public void setLoggingId(String loggingId) {
        this.loggingId = loggingId;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Object getEventData() {
        return eventData;
    }

    public void setEventData(Object eventData) {
        this.eventData = eventData;
    }

    public Object getEventDataSchemaName() {
        return eventDataSchemaName;
    }

    public void setEventDataSchemaName(Object eventDataSchemaName) {
        this.eventDataSchemaName = eventDataSchemaName;
    }

}
