
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DisplayPrice {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("displayRateType")
    @Expose
    private String displayRateType;
    @SerializedName("priceString")
    @Expose
    private String priceString;
    @SerializedName("type")
    @Expose
    private String type;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getDisplayRateType() {
        return displayRateType;
    }

    public void setDisplayRateType(String displayRateType) {
        this.displayRateType = displayRateType;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
