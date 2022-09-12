
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("personCapacity")
    @Expose
    private Integer personCapacity;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("descriptionLanguage")
    @Expose
    private String descriptionLanguage;
    @SerializedName("listingLat")
    @Expose
    private Double listingLat;
    @SerializedName("listingLng")
    @Expose
    private Double listingLng;
    @SerializedName("homeTier")
    @Expose
    private Integer homeTier;
    @SerializedName("roomType")
    @Expose
    private String roomType;
    @SerializedName("visibleReviewCount")
    @Expose
    private Object visibleReviewCount;
    @SerializedName("valueRating")
    @Expose
    private Object valueRating;
    @SerializedName("locationRating")
    @Expose
    private Object locationRating;
    @SerializedName("pictureCount")
    @Expose
    private Integer pictureCount;
    @SerializedName("communicationRating")
    @Expose
    private Object communicationRating;
    @SerializedName("checkinRating")
    @Expose
    private Object checkinRating;
    @SerializedName("accuracyRating")
    @Expose
    private Object accuracyRating;
    @SerializedName("cleanlinessRating")
    @Expose
    private Object cleanlinessRating;
    @SerializedName("guestSatisfactionOverall")
    @Expose
    private Object guestSatisfactionOverall;
    @SerializedName("allowsChildren")
    @Expose
    private Boolean allowsChildren;
    @SerializedName("allowsInfants")
    @Expose
    private Boolean allowsInfants;
    @SerializedName("allowsPets")
    @Expose
    private Boolean allowsPets;
    @SerializedName("hostId")
    @Expose
    private String hostId;
    @SerializedName("hostName")
    @Expose
    private String hostName;
    @SerializedName("hostProfilePhotoUrl")
    @Expose
    private String hostProfilePhotoUrl;
    @SerializedName("isHotelRatePlanEnabled")
    @Expose
    private Boolean isHotelRatePlanEnabled;
    @SerializedName("isSuperhost")
    @Expose
    private Boolean isSuperhost;
    @SerializedName("maxNights")
    @Expose
    private Integer maxNights;
    @SerializedName("minNights")
    @Expose
    private Integer minNights;
    @SerializedName("reviewsCount")
    @Expose
    private String reviewsCount;
    @SerializedName("reviewsRating")
    @Expose
    private String reviewsRating;
    @SerializedName("roomAndPropertyType")
    @Expose
    private String roomAndPropertyType;
    @SerializedName("barPrice")
    @Expose
    private Object barPrice;
    @SerializedName("canInstantBook")
    @Expose
    private Boolean canInstantBook;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("cancellationPolicies")
    @Expose
    private List<CancellationPolicy> cancellationPolicies = null;
    @SerializedName("images")
    @Expose
    private List<String> images = null;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPersonCapacity() {
        return personCapacity;
    }

    public void setPersonCapacity(Integer personCapacity) {
        this.personCapacity = personCapacity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    public Double getListingLat() {
        return listingLat;
    }

    public void setListingLat(Double listingLat) {
        this.listingLat = listingLat;
    }

    public Double getListingLng() {
        return listingLng;
    }

    public void setListingLng(Double listingLng) {
        this.listingLng = listingLng;
    }

    public Integer getHomeTier() {
        return homeTier;
    }

    public void setHomeTier(Integer homeTier) {
        this.homeTier = homeTier;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Object getVisibleReviewCount() {
        return visibleReviewCount;
    }

    public void setVisibleReviewCount(Object visibleReviewCount) {
        this.visibleReviewCount = visibleReviewCount;
    }

    public Object getValueRating() {
        return valueRating;
    }

    public void setValueRating(Object valueRating) {
        this.valueRating = valueRating;
    }

    public Object getLocationRating() {
        return locationRating;
    }

    public void setLocationRating(Object locationRating) {
        this.locationRating = locationRating;
    }

    public Integer getPictureCount() {
        return pictureCount;
    }

    public void setPictureCount(Integer pictureCount) {
        this.pictureCount = pictureCount;
    }

    public Object getCommunicationRating() {
        return communicationRating;
    }

    public void setCommunicationRating(Object communicationRating) {
        this.communicationRating = communicationRating;
    }

    public Object getCheckinRating() {
        return checkinRating;
    }

    public void setCheckinRating(Object checkinRating) {
        this.checkinRating = checkinRating;
    }

    public Object getAccuracyRating() {
        return accuracyRating;
    }

    public void setAccuracyRating(Object accuracyRating) {
        this.accuracyRating = accuracyRating;
    }

    public Object getCleanlinessRating() {
        return cleanlinessRating;
    }

    public void setCleanlinessRating(Object cleanlinessRating) {
        this.cleanlinessRating = cleanlinessRating;
    }

    public Object getGuestSatisfactionOverall() {
        return guestSatisfactionOverall;
    }

    public void setGuestSatisfactionOverall(Object guestSatisfactionOverall) {
        this.guestSatisfactionOverall = guestSatisfactionOverall;
    }

    public Boolean getAllowsChildren() {
        return allowsChildren;
    }

    public void setAllowsChildren(Boolean allowsChildren) {
        this.allowsChildren = allowsChildren;
    }

    public Boolean getAllowsInfants() {
        return allowsInfants;
    }

    public void setAllowsInfants(Boolean allowsInfants) {
        this.allowsInfants = allowsInfants;
    }

    public Boolean getAllowsPets() {
        return allowsPets;
    }

    public void setAllowsPets(Boolean allowsPets) {
        this.allowsPets = allowsPets;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostProfilePhotoUrl() {
        return hostProfilePhotoUrl;
    }

    public void setHostProfilePhotoUrl(String hostProfilePhotoUrl) {
        this.hostProfilePhotoUrl = hostProfilePhotoUrl;
    }

    public Boolean getIsHotelRatePlanEnabled() {
        return isHotelRatePlanEnabled;
    }

    public void setIsHotelRatePlanEnabled(Boolean isHotelRatePlanEnabled) {
        this.isHotelRatePlanEnabled = isHotelRatePlanEnabled;
    }

    public Boolean getIsSuperhost() {
        return isSuperhost;
    }

    public void setIsSuperhost(Boolean isSuperhost) {
        this.isSuperhost = isSuperhost;
    }

    public Integer getMaxNights() {
        return maxNights;
    }

    public void setMaxNights(Integer maxNights) {
        this.maxNights = maxNights;
    }

    public Integer getMinNights() {
        return minNights;
    }

    public void setMinNights(Integer minNights) {
        this.minNights = minNights;
    }

    public String getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(String reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getReviewsRating() {
        return reviewsRating;
    }

    public void setReviewsRating(String reviewsRating) {
        this.reviewsRating = reviewsRating;
    }

    public String getRoomAndPropertyType() {
        return roomAndPropertyType;
    }

    public void setRoomAndPropertyType(String roomAndPropertyType) {
        this.roomAndPropertyType = roomAndPropertyType;
    }

    public Object getBarPrice() {
        return barPrice;
    }

    public void setBarPrice(Object barPrice) {
        this.barPrice = barPrice;
    }

    public Boolean getCanInstantBook() {
        return canInstantBook;
    }

    public void setCanInstantBook(Boolean canInstantBook) {
        this.canInstantBook = canInstantBook;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<CancellationPolicy> getCancellationPolicies() {
        return cancellationPolicies;
    }

    public void setCancellationPolicies(List<CancellationPolicy> cancellationPolicies) {
        this.cancellationPolicies = cancellationPolicies;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

}
