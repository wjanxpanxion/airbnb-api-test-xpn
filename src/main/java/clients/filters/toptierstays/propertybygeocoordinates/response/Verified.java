
package clients.filters.toptierstays.propertybygeocoordinates.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Verified {

    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    @SerializedName("badgeText")
    @Expose
    private String badgeText;
    @SerializedName("badgeSecondaryText")
    @Expose
    private String badgeSecondaryText;
    @SerializedName("kickerBadgeType")
    @Expose
    private String kickerBadgeType;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getBadgeText() {
        return badgeText;
    }

    public void setBadgeText(String badgeText) {
        this.badgeText = badgeText;
    }

    public String getBadgeSecondaryText() {
        return badgeSecondaryText;
    }

    public void setBadgeSecondaryText(String badgeSecondaryText) {
        this.badgeSecondaryText = badgeSecondaryText;
    }

    public String getKickerBadgeType() {
        return kickerBadgeType;
    }

    public void setKickerBadgeType(String kickerBadgeType) {
        this.kickerBadgeType = kickerBadgeType;
    }

}
