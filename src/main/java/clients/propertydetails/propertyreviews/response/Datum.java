
package clients.propertydetails.propertyreviews.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("disclaimer")
    @Expose
    private Object disclaimer;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("localizedDate")
    @Expose
    private String localizedDate;
    @SerializedName("localizedReview")
    @Expose
    private Object localizedReview;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("collectionTag")
    @Expose
    private Object collectionTag;
    @SerializedName("response")
    @Expose
    private Object response;
    @SerializedName("reviewee")
    @Expose
    private Reviewee reviewee;
    @SerializedName("reviewer")
    @Expose
    private Reviewer reviewer;
    @SerializedName("highlightedReviewSentence")
    @Expose
    private Object highlightedReviewSentence;
    @SerializedName("highlightReviewMentioned")
    @Expose
    private Object highlightReviewMentioned;
    @SerializedName("roomTypeListingTitle")
    @Expose
    private Object roomTypeListingTitle;
    @SerializedName("channel")
    @Expose
    private Object channel;
    @SerializedName("showMoreButton")
    @Expose
    private ShowMoreButton showMoreButton;
    @SerializedName("reviewMediaItems")
    @Expose
    private Object reviewMediaItems;
    @SerializedName("rating")
    @Expose
    private Integer rating;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(Object disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalizedDate() {
        return localizedDate;
    }

    public void setLocalizedDate(String localizedDate) {
        this.localizedDate = localizedDate;
    }

    public Object getLocalizedReview() {
        return localizedReview;
    }

    public void setLocalizedReview(Object localizedReview) {
        this.localizedReview = localizedReview;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getCollectionTag() {
        return collectionTag;
    }

    public void setCollectionTag(Object collectionTag) {
        this.collectionTag = collectionTag;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Reviewee getReviewee() {
        return reviewee;
    }

    public void setReviewee(Reviewee reviewee) {
        this.reviewee = reviewee;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public Object getHighlightedReviewSentence() {
        return highlightedReviewSentence;
    }

    public void setHighlightedReviewSentence(Object highlightedReviewSentence) {
        this.highlightedReviewSentence = highlightedReviewSentence;
    }

    public Object getHighlightReviewMentioned() {
        return highlightReviewMentioned;
    }

    public void setHighlightReviewMentioned(Object highlightReviewMentioned) {
        this.highlightReviewMentioned = highlightReviewMentioned;
    }

    public Object getRoomTypeListingTitle() {
        return roomTypeListingTitle;
    }

    public void setRoomTypeListingTitle(Object roomTypeListingTitle) {
        this.roomTypeListingTitle = roomTypeListingTitle;
    }

    public Object getChannel() {
        return channel;
    }

    public void setChannel(Object channel) {
        this.channel = channel;
    }

    public ShowMoreButton getShowMoreButton() {
        return showMoreButton;
    }

    public void setShowMoreButton(ShowMoreButton showMoreButton) {
        this.showMoreButton = showMoreButton;
    }

    public Object getReviewMediaItems() {
        return reviewMediaItems;
    }

    public void setReviewMediaItems(Object reviewMediaItems) {
        this.reviewMediaItems = reviewMediaItems;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
