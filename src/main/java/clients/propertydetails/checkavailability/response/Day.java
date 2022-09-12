
package clients.propertydetails.checkavailability.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Day {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("max_nights")
    @Expose
    private Integer maxNights;
    @SerializedName("min_nights")
    @Expose
    private Integer minNights;
    @SerializedName("available_for_checkin")
    @Expose
    private Boolean availableForCheckin;
    @SerializedName("available_for_checkout")
    @Expose
    private Boolean availableForCheckout;
    @SerializedName("bookable")
    @Expose
    private Boolean bookable;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
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

    public Boolean getAvailableForCheckin() {
        return availableForCheckin;
    }

    public void setAvailableForCheckin(Boolean availableForCheckin) {
        this.availableForCheckin = availableForCheckin;
    }

    public Boolean getAvailableForCheckout() {
        return availableForCheckout;
    }

    public void setAvailableForCheckout(Boolean availableForCheckout) {
        this.availableForCheckout = availableForCheckout;
    }

    public Boolean getBookable() {
        return bookable;
    }

    public void setBookable(Boolean bookable) {
        this.bookable = bookable;
    }

}
