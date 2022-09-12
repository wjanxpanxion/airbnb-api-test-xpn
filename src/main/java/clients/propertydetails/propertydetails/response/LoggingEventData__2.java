
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoggingEventData__2 {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("loggingId")
    @Expose
    private String loggingId;
    @SerializedName("component")
    @Expose
    private Object component;
    @SerializedName("section")
    @Expose
    private Object section;
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

    public Object getComponent() {
        return component;
    }

    public void setComponent(Object component) {
        this.component = component;
    }

    public Object getSection() {
        return section;
    }

    public void setSection(Object section) {
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
