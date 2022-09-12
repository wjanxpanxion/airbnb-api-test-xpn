
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrawerCalendarLoggingEventData {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("clearDatesButton")
    @Expose
    private ClearDatesButton clearDatesButton;
    @SerializedName("selectCheckOutOnlyDateLoggingEventData")
    @Expose
    private SelectCheckOutOnlyDateLoggingEventData selectCheckOutOnlyDateLoggingEventData;
    @SerializedName("selectMinNightsViolationDateLoggingEventData")
    @Expose
    private SelectMinNightsViolationDateLoggingEventData selectMinNightsViolationDateLoggingEventData;
    @SerializedName("selectMaxNightsViolationDateLoggingEventData")
    @Expose
    private SelectMaxNightsViolationDateLoggingEventData selectMaxNightsViolationDateLoggingEventData;
    @SerializedName("selectUnavailableForCheckInDateLoggingEventData")
    @Expose
    private SelectUnavailableForCheckInDateLoggingEventData selectUnavailableForCheckInDateLoggingEventData;
    @SerializedName("selectUnavailableForCheckoutDateLoggingEventData")
    @Expose
    private SelectUnavailableForCheckoutDateLoggingEventData selectUnavailableForCheckoutDateLoggingEventData;
    @SerializedName("selectDateLoggingEventData")
    @Expose
    private SelectDateLoggingEventData selectDateLoggingEventData;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public ClearDatesButton getClearDatesButton() {
        return clearDatesButton;
    }

    public void setClearDatesButton(ClearDatesButton clearDatesButton) {
        this.clearDatesButton = clearDatesButton;
    }

    public SelectCheckOutOnlyDateLoggingEventData getSelectCheckOutOnlyDateLoggingEventData() {
        return selectCheckOutOnlyDateLoggingEventData;
    }

    public void setSelectCheckOutOnlyDateLoggingEventData(SelectCheckOutOnlyDateLoggingEventData selectCheckOutOnlyDateLoggingEventData) {
        this.selectCheckOutOnlyDateLoggingEventData = selectCheckOutOnlyDateLoggingEventData;
    }

    public SelectMinNightsViolationDateLoggingEventData getSelectMinNightsViolationDateLoggingEventData() {
        return selectMinNightsViolationDateLoggingEventData;
    }

    public void setSelectMinNightsViolationDateLoggingEventData(SelectMinNightsViolationDateLoggingEventData selectMinNightsViolationDateLoggingEventData) {
        this.selectMinNightsViolationDateLoggingEventData = selectMinNightsViolationDateLoggingEventData;
    }

    public SelectMaxNightsViolationDateLoggingEventData getSelectMaxNightsViolationDateLoggingEventData() {
        return selectMaxNightsViolationDateLoggingEventData;
    }

    public void setSelectMaxNightsViolationDateLoggingEventData(SelectMaxNightsViolationDateLoggingEventData selectMaxNightsViolationDateLoggingEventData) {
        this.selectMaxNightsViolationDateLoggingEventData = selectMaxNightsViolationDateLoggingEventData;
    }

    public SelectUnavailableForCheckInDateLoggingEventData getSelectUnavailableForCheckInDateLoggingEventData() {
        return selectUnavailableForCheckInDateLoggingEventData;
    }

    public void setSelectUnavailableForCheckInDateLoggingEventData(SelectUnavailableForCheckInDateLoggingEventData selectUnavailableForCheckInDateLoggingEventData) {
        this.selectUnavailableForCheckInDateLoggingEventData = selectUnavailableForCheckInDateLoggingEventData;
    }

    public SelectUnavailableForCheckoutDateLoggingEventData getSelectUnavailableForCheckoutDateLoggingEventData() {
        return selectUnavailableForCheckoutDateLoggingEventData;
    }

    public void setSelectUnavailableForCheckoutDateLoggingEventData(SelectUnavailableForCheckoutDateLoggingEventData selectUnavailableForCheckoutDateLoggingEventData) {
        this.selectUnavailableForCheckoutDateLoggingEventData = selectUnavailableForCheckoutDateLoggingEventData;
    }

    public SelectDateLoggingEventData getSelectDateLoggingEventData() {
        return selectDateLoggingEventData;
    }

    public void setSelectDateLoggingEventData(SelectDateLoggingEventData selectDateLoggingEventData) {
        this.selectDateLoggingEventData = selectDateLoggingEventData;
    }

}
