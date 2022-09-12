
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClearDatesButton {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("action")
    @Expose
    private Object action;
    @SerializedName("anchor")
    @Expose
    private Object anchor;
    @SerializedName("accessibilityLabel")
    @Expose
    private Object accessibilityLabel;
    @SerializedName("icon")
    @Expose
    private Object icon;
    @SerializedName("loggingEventData")
    @Expose
    private LoggingEventData loggingEventData;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("screenNavigation")
    @Expose
    private Object screenNavigation;
    @SerializedName("subtitle")
    @Expose
    private Object subtitle;
    @SerializedName("button")
    @Expose
    private Object button;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public Object getAnchor() {
        return anchor;
    }

    public void setAnchor(Object anchor) {
        this.anchor = anchor;
    }

    public Object getAccessibilityLabel() {
        return accessibilityLabel;
    }

    public void setAccessibilityLabel(Object accessibilityLabel) {
        this.accessibilityLabel = accessibilityLabel;
    }

    public Object getIcon() {
        return icon;
    }

    public void setIcon(Object icon) {
        this.icon = icon;
    }

    public LoggingEventData getLoggingEventData() {
        return loggingEventData;
    }

    public void setLoggingEventData(LoggingEventData loggingEventData) {
        this.loggingEventData = loggingEventData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getScreenNavigation() {
        return screenNavigation;
    }

    public void setScreenNavigation(Object screenNavigation) {
        this.screenNavigation = screenNavigation;
    }

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public Object getButton() {
        return button;
    }

    public void setButton(Object button) {
        this.button = button;
    }

}
