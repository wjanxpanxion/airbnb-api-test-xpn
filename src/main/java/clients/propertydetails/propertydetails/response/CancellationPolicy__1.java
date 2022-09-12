
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancellationPolicy__1 {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("milestones")
    @Expose
    private List<Object> milestones = null;
    @SerializedName("cancellationMilestoneModal")
    @Expose
    private CancellationMilestoneModal cancellationMilestoneModal;
    @SerializedName("seeDetailsLink")
    @Expose
    private SeeDetailsLink seeDetailsLink;
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

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getMilestones() {
        return milestones;
    }

    public void setMilestones(List<Object> milestones) {
        this.milestones = milestones;
    }

    public CancellationMilestoneModal getCancellationMilestoneModal() {
        return cancellationMilestoneModal;
    }

    public void setCancellationMilestoneModal(CancellationMilestoneModal cancellationMilestoneModal) {
        this.cancellationMilestoneModal = cancellationMilestoneModal;
    }

    public SeeDetailsLink getSeeDetailsLink() {
        return seeDetailsLink;
    }

    public void setSeeDetailsLink(SeeDetailsLink seeDetailsLink) {
        this.seeDetailsLink = seeDetailsLink;
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

}
