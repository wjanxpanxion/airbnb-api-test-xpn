
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Total {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("amountFormatted")
    @Expose
    private String amountFormatted;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("amountMicros")
    @Expose
    private Integer amountMicros;
    @SerializedName("isMicrosAccuracy")
    @Expose
    private Boolean isMicrosAccuracy;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAmountFormatted() {
        return amountFormatted;
    }

    public void setAmountFormatted(String amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmountMicros() {
        return amountMicros;
    }

    public void setAmountMicros(Integer amountMicros) {
        this.amountMicros = amountMicros;
    }

    public Boolean getIsMicrosAccuracy() {
        return isMicrosAccuracy;
    }

    public void setIsMicrosAccuracy(Boolean isMicrosAccuracy) {
        this.isMicrosAccuracy = isMicrosAccuracy;
    }

}
