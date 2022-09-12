
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("priceDisclaimer")
    @Expose
    private String priceDisclaimer;
    @SerializedName("reviewRating")
    @Expose
    private Object reviewRating;
    @SerializedName("reviewCount")
    @Expose
    private Object reviewCount;
    @SerializedName("reviewAccessibilityLabel")
    @Expose
    private Object reviewAccessibilityLabel;
    @SerializedName("drawerCalendarLoggingEventData")
    @Expose
    private DrawerCalendarLoggingEventData drawerCalendarLoggingEventData;
    @SerializedName("descriptionItems")
    @Expose
    private List<DescriptionItem> descriptionItems = null;
    @SerializedName("amenities")
    @Expose
    private List<Amenity> amenities = null;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("locationDisclaimer")
    @Expose
    private Object locationDisclaimer;
    @SerializedName("locationDetails")
    @Expose
    private List<Object> locationDetails = null;
    @SerializedName("additionalHosts")
    @Expose
    private Object additionalHosts;
    @SerializedName("additionalHostsTitle")
    @Expose
    private Object additionalHostsTitle;
    @SerializedName("disclaimerItems")
    @Expose
    private Object disclaimerItems;
    @SerializedName("hostAvatar")
    @Expose
    private HostAvatar hostAvatar;
    @SerializedName("hostBasicInfos")
    @Expose
    private List<HostBasicInfo> hostBasicInfos = null;
    @SerializedName("hostFeatures")
    @Expose
    private List<HostFeature> hostFeatures = null;
    @SerializedName("hostImage")
    @Expose
    private Object hostImage;
    @SerializedName("hostInfos")
    @Expose
    private List<Object> hostInfos = null;
    @SerializedName("hostProfileDescription")
    @Expose
    private HostProfileDescription hostProfileDescription;
    @SerializedName("hostTags")
    @Expose
    private List<HostTag> hostTags = null;
    @SerializedName("hostFirstName")
    @Expose
    private Object hostFirstName;
    @SerializedName("experienceId")
    @Expose
    private String experienceId;
    @SerializedName("additionalHouseRules")
    @Expose
    private String additionalHouseRules;
    @SerializedName("additionalHouseRulesTitle")
    @Expose
    private String additionalHouseRulesTitle;
    @SerializedName("cancellationPolicyForDisplay")
    @Expose
    private Object cancellationPolicyForDisplay;
    @SerializedName("cancellationPolicies")
    @Expose
    private List<CancellationPolicy__1> cancellationPolicies = null;
    @SerializedName("cancellationPolicyTitle")
    @Expose
    private String cancellationPolicyTitle;
    @SerializedName("discountData")
    @Expose
    private Object discountData;
    @SerializedName("houseRules")
    @Expose
    private List<HouseRule> houseRules = null;
    @SerializedName("houseRulesTitle")
    @Expose
    private String houseRulesTitle;
    @SerializedName("listingExpectations")
    @Expose
    private List<Object> listingExpectations = null;
    @SerializedName("listingExpectationsTitle")
    @Expose
    private Object listingExpectationsTitle;
    @SerializedName("reportButton")
    @Expose
    private Object reportButton;
    @SerializedName("seeAllHouseRulesButton")
    @Expose
    private SeeAllHouseRulesButton seeAllHouseRulesButton;
    @SerializedName("seeCancellationPolicyButton")
    @Expose
    private SeeCancellationPolicyButton seeCancellationPolicyButton;
    @SerializedName("safetyAndPropertyTitle")
    @Expose
    private String safetyAndPropertyTitle;
    @SerializedName("previewSafetyAndProperties")
    @Expose
    private List<PreviewSafetyAndProperty> previewSafetyAndProperties = null;
    @SerializedName("seeAllSafetyAndPropertyButton")
    @Expose
    private SeeAllSafetyAndPropertyButton seeAllSafetyAndPropertyButton;
    @SerializedName("safetyExpectationsAndAmenities")
    @Expose
    private List<SafetyExpectationsAndAmenity> safetyExpectationsAndAmenities = null;

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

    public String getPriceDisclaimer() {
        return priceDisclaimer;
    }

    public void setPriceDisclaimer(String priceDisclaimer) {
        this.priceDisclaimer = priceDisclaimer;
    }

    public Object getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(Object reviewRating) {
        this.reviewRating = reviewRating;
    }

    public Object getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Object reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Object getReviewAccessibilityLabel() {
        return reviewAccessibilityLabel;
    }

    public void setReviewAccessibilityLabel(Object reviewAccessibilityLabel) {
        this.reviewAccessibilityLabel = reviewAccessibilityLabel;
    }

    public DrawerCalendarLoggingEventData getDrawerCalendarLoggingEventData() {
        return drawerCalendarLoggingEventData;
    }

    public void setDrawerCalendarLoggingEventData(DrawerCalendarLoggingEventData drawerCalendarLoggingEventData) {
        this.drawerCalendarLoggingEventData = drawerCalendarLoggingEventData;
    }

    public List<DescriptionItem> getDescriptionItems() {
        return descriptionItems;
    }

    public void setDescriptionItems(List<DescriptionItem> descriptionItems) {
        this.descriptionItems = descriptionItems;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Object getLocationDisclaimer() {
        return locationDisclaimer;
    }

    public void setLocationDisclaimer(Object locationDisclaimer) {
        this.locationDisclaimer = locationDisclaimer;
    }

    public List<Object> getLocationDetails() {
        return locationDetails;
    }

    public void setLocationDetails(List<Object> locationDetails) {
        this.locationDetails = locationDetails;
    }

    public Object getAdditionalHosts() {
        return additionalHosts;
    }

    public void setAdditionalHosts(Object additionalHosts) {
        this.additionalHosts = additionalHosts;
    }

    public Object getAdditionalHostsTitle() {
        return additionalHostsTitle;
    }

    public void setAdditionalHostsTitle(Object additionalHostsTitle) {
        this.additionalHostsTitle = additionalHostsTitle;
    }

    public Object getDisclaimerItems() {
        return disclaimerItems;
    }

    public void setDisclaimerItems(Object disclaimerItems) {
        this.disclaimerItems = disclaimerItems;
    }

    public HostAvatar getHostAvatar() {
        return hostAvatar;
    }

    public void setHostAvatar(HostAvatar hostAvatar) {
        this.hostAvatar = hostAvatar;
    }

    public List<HostBasicInfo> getHostBasicInfos() {
        return hostBasicInfos;
    }

    public void setHostBasicInfos(List<HostBasicInfo> hostBasicInfos) {
        this.hostBasicInfos = hostBasicInfos;
    }

    public List<HostFeature> getHostFeatures() {
        return hostFeatures;
    }

    public void setHostFeatures(List<HostFeature> hostFeatures) {
        this.hostFeatures = hostFeatures;
    }

    public Object getHostImage() {
        return hostImage;
    }

    public void setHostImage(Object hostImage) {
        this.hostImage = hostImage;
    }

    public List<Object> getHostInfos() {
        return hostInfos;
    }

    public void setHostInfos(List<Object> hostInfos) {
        this.hostInfos = hostInfos;
    }

    public HostProfileDescription getHostProfileDescription() {
        return hostProfileDescription;
    }

    public void setHostProfileDescription(HostProfileDescription hostProfileDescription) {
        this.hostProfileDescription = hostProfileDescription;
    }

    public List<HostTag> getHostTags() {
        return hostTags;
    }

    public void setHostTags(List<HostTag> hostTags) {
        this.hostTags = hostTags;
    }

    public Object getHostFirstName() {
        return hostFirstName;
    }

    public void setHostFirstName(Object hostFirstName) {
        this.hostFirstName = hostFirstName;
    }

    public String getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(String experienceId) {
        this.experienceId = experienceId;
    }

    public String getAdditionalHouseRules() {
        return additionalHouseRules;
    }

    public void setAdditionalHouseRules(String additionalHouseRules) {
        this.additionalHouseRules = additionalHouseRules;
    }

    public String getAdditionalHouseRulesTitle() {
        return additionalHouseRulesTitle;
    }

    public void setAdditionalHouseRulesTitle(String additionalHouseRulesTitle) {
        this.additionalHouseRulesTitle = additionalHouseRulesTitle;
    }

    public Object getCancellationPolicyForDisplay() {
        return cancellationPolicyForDisplay;
    }

    public void setCancellationPolicyForDisplay(Object cancellationPolicyForDisplay) {
        this.cancellationPolicyForDisplay = cancellationPolicyForDisplay;
    }

    public List<CancellationPolicy__1> getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(List<CancellationPolicy__1> cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public String getCancellationPolicyTitle() {
        return cancellationPolicyTitle;
    }

    public void setCancellationPolicyTitle(String cancellationPolicyTitle) {
        this.cancellationPolicyTitle = cancellationPolicyTitle;
    }

    public Object getDiscountData() {
        return discountData;
    }

    public void setDiscountData(Object discountData) {
        this.discountData = discountData;
    }

    public List<HouseRule> getHouseRules() {
        return houseRules;
    }

    public void setHouseRules(List<HouseRule> houseRules) {
        this.houseRules = houseRules;
    }

    public String getHouseRulesTitle() {
        return houseRulesTitle;
    }

    public void setHouseRulesTitle(String houseRulesTitle) {
        this.houseRulesTitle = houseRulesTitle;
    }

    public List<Object> getListingExpectations() {
        return listingExpectations;
    }

    public void setListingExpectations(List<Object> listingExpectations) {
        this.listingExpectations = listingExpectations;
    }

    public Object getListingExpectationsTitle() {
        return listingExpectationsTitle;
    }

    public void setListingExpectationsTitle(Object listingExpectationsTitle) {
        this.listingExpectationsTitle = listingExpectationsTitle;
    }

    public Object getReportButton() {
        return reportButton;
    }

    public void setReportButton(Object reportButton) {
        this.reportButton = reportButton;
    }

    public SeeAllHouseRulesButton getSeeAllHouseRulesButton() {
        return seeAllHouseRulesButton;
    }

    public void setSeeAllHouseRulesButton(SeeAllHouseRulesButton seeAllHouseRulesButton) {
        this.seeAllHouseRulesButton = seeAllHouseRulesButton;
    }

    public SeeCancellationPolicyButton getSeeCancellationPolicyButton() {
        return seeCancellationPolicyButton;
    }

    public void setSeeCancellationPolicyButton(SeeCancellationPolicyButton seeCancellationPolicyButton) {
        this.seeCancellationPolicyButton = seeCancellationPolicyButton;
    }

    public String getSafetyAndPropertyTitle() {
        return safetyAndPropertyTitle;
    }

    public void setSafetyAndPropertyTitle(String safetyAndPropertyTitle) {
        this.safetyAndPropertyTitle = safetyAndPropertyTitle;
    }

    public List<PreviewSafetyAndProperty> getPreviewSafetyAndProperties() {
        return previewSafetyAndProperties;
    }

    public void setPreviewSafetyAndProperties(List<PreviewSafetyAndProperty> previewSafetyAndProperties) {
        this.previewSafetyAndProperties = previewSafetyAndProperties;
    }

    public SeeAllSafetyAndPropertyButton getSeeAllSafetyAndPropertyButton() {
        return seeAllSafetyAndPropertyButton;
    }

    public void setSeeAllSafetyAndPropertyButton(SeeAllSafetyAndPropertyButton seeAllSafetyAndPropertyButton) {
        this.seeAllSafetyAndPropertyButton = seeAllSafetyAndPropertyButton;
    }

    public List<SafetyExpectationsAndAmenity> getSafetyExpectationsAndAmenities() {
        return safetyExpectationsAndAmenities;
    }

    public void setSafetyExpectationsAndAmenities(List<SafetyExpectationsAndAmenity> safetyExpectationsAndAmenities) {
        this.safetyExpectationsAndAmenities = safetyExpectationsAndAmenities;
    }

}
