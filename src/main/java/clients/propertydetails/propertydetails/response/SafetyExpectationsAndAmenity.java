
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SafetyExpectationsAndAmenity {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("learnMoreButton")
    @Expose
    private LearnMoreButton__1 learnMoreButton;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public LearnMoreButton__1 getLearnMoreButton() {
        return learnMoreButton;
    }

    public void setLearnMoreButton(LearnMoreButton__1 learnMoreButton) {
        this.learnMoreButton = learnMoreButton;
    }

}
