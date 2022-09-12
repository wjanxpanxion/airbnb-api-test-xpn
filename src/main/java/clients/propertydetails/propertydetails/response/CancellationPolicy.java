
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancellationPolicy {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("cancellationPolicyId")
    @Expose
    private Integer cancellationPolicyId;
    @SerializedName("linkText")
    @Expose
    private String linkText;
    @SerializedName("milestones")
    @Expose
    private List<Object> milestones = null;
    @SerializedName("cancellationOverrideRules")
    @Expose
    private Object cancellationOverrideRules;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("subtitles")
    @Expose
    private List<String> subtitles = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("localizedCancellationPolicyName")
    @Expose
    private String localizedCancellationPolicyName;
    @SerializedName("cancellationPolicyPriceType")
    @Expose
    private Object cancellationPolicyPriceType;
    @SerializedName("cancellationPolicyPriceFactor")
    @Expose
    private Integer cancellationPolicyPriceFactor;
    @SerializedName("highlightedCancellationTip")
    @Expose
    private Object highlightedCancellationTip;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getCancellationPolicyId() {
        return cancellationPolicyId;
    }

    public void setCancellationPolicyId(Integer cancellationPolicyId) {
        this.cancellationPolicyId = cancellationPolicyId;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public List<Object> getMilestones() {
        return milestones;
    }

    public void setMilestones(List<Object> milestones) {
        this.milestones = milestones;
    }

    public Object getCancellationOverrideRules() {
        return cancellationOverrideRules;
    }

    public void setCancellationOverrideRules(Object cancellationOverrideRules) {
        this.cancellationOverrideRules = cancellationOverrideRules;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<String> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<String> subtitles) {
        this.subtitles = subtitles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocalizedCancellationPolicyName() {
        return localizedCancellationPolicyName;
    }

    public void setLocalizedCancellationPolicyName(String localizedCancellationPolicyName) {
        this.localizedCancellationPolicyName = localizedCancellationPolicyName;
    }

    public Object getCancellationPolicyPriceType() {
        return cancellationPolicyPriceType;
    }

    public void setCancellationPolicyPriceType(Object cancellationPolicyPriceType) {
        this.cancellationPolicyPriceType = cancellationPolicyPriceType;
    }

    public Integer getCancellationPolicyPriceFactor() {
        return cancellationPolicyPriceFactor;
    }

    public void setCancellationPolicyPriceFactor(Integer cancellationPolicyPriceFactor) {
        this.cancellationPolicyPriceFactor = cancellationPolicyPriceFactor;
    }

    public Object getHighlightedCancellationTip() {
        return highlightedCancellationTip;
    }

    public void setHighlightedCancellationTip(Object highlightedCancellationTip) {
        this.highlightedCancellationTip = highlightedCancellationTip;
    }

}
