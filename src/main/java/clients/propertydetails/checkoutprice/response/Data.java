
package clients.propertydetails.checkoutprice.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("accommodationCost")
    @Expose
    private Double accommodationCost;
    @SerializedName("accommodationCostFormatted")
    @Expose
    private String accommodationCostFormatted;
    @SerializedName("accommodationCostTitle")
    @Expose
    private String accommodationCostTitle;
    @SerializedName("cleaningFee")
    @Expose
    private Double cleaningFee;
    @SerializedName("cleaningFeeFormatted")
    @Expose
    private String cleaningFeeFormatted;
    @SerializedName("cleaningFeeTitle")
    @Expose
    private String cleaningFeeTitle;
    @SerializedName("airbnbGuestFee")
    @Expose
    private Double airbnbGuestFee;
    @SerializedName("airbnbGuestFeeFormatted")
    @Expose
    private String airbnbGuestFeeFormatted;
    @SerializedName("airbnbGuestTitle")
    @Expose
    private String airbnbGuestTitle;

    public Double getAccommodationCost() {
        return accommodationCost;
    }

    public void setAccommodationCost(Double accommodationCost) {
        this.accommodationCost = accommodationCost;
    }

    public String getAccommodationCostFormatted() {
        return accommodationCostFormatted;
    }

    public void setAccommodationCostFormatted(String accommodationCostFormatted) {
        this.accommodationCostFormatted = accommodationCostFormatted;
    }

    public String getAccommodationCostTitle() {
        return accommodationCostTitle;
    }

    public void setAccommodationCostTitle(String accommodationCostTitle) {
        this.accommodationCostTitle = accommodationCostTitle;
    }

    public Double getCleaningFee() {
        return cleaningFee;
    }

    public void setCleaningFee(Double cleaningFee) {
        this.cleaningFee = cleaningFee;
    }

    public String getCleaningFeeFormatted() {
        return cleaningFeeFormatted;
    }

    public void setCleaningFeeFormatted(String cleaningFeeFormatted) {
        this.cleaningFeeFormatted = cleaningFeeFormatted;
    }

    public String getCleaningFeeTitle() {
        return cleaningFeeTitle;
    }

    public void setCleaningFeeTitle(String cleaningFeeTitle) {
        this.cleaningFeeTitle = cleaningFeeTitle;
    }

    public Double getAirbnbGuestFee() {
        return airbnbGuestFee;
    }

    public void setAirbnbGuestFee(Double airbnbGuestFee) {
        this.airbnbGuestFee = airbnbGuestFee;
    }

    public String getAirbnbGuestFeeFormatted() {
        return airbnbGuestFeeFormatted;
    }

    public void setAirbnbGuestFeeFormatted(String airbnbGuestFeeFormatted) {
        this.airbnbGuestFeeFormatted = airbnbGuestFeeFormatted;
    }

    public String getAirbnbGuestTitle() {
        return airbnbGuestTitle;
    }

    public void setAirbnbGuestTitle(String airbnbGuestTitle) {
        this.airbnbGuestTitle = airbnbGuestTitle;
    }

}
