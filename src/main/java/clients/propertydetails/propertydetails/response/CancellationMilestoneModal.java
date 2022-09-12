
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancellationMilestoneModal {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("subtitles")
    @Expose
    private Object subtitles;
    @SerializedName("header")
    @Expose
    private Object header;
    @SerializedName("entries")
    @Expose
    private Object entries;
    @SerializedName("actionLinkText")
    @Expose
    private Object actionLinkText;
    @SerializedName("actionLinkUrl")
    @Expose
    private Object actionLinkUrl;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(Object subtitles) {
        this.subtitles = subtitles;
    }

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }

    public Object getEntries() {
        return entries;
    }

    public void setEntries(Object entries) {
        this.entries = entries;
    }

    public Object getActionLinkText() {
        return actionLinkText;
    }

    public void setActionLinkText(Object actionLinkText) {
        this.actionLinkText = actionLinkText;
    }

    public Object getActionLinkUrl() {
        return actionLinkUrl;
    }

    public void setActionLinkUrl(Object actionLinkUrl) {
        this.actionLinkUrl = actionLinkUrl;
    }

}
