
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiscountData {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("tieredPricingDiscountData")
    @Expose
    private Object tieredPricingDiscountData;
    @SerializedName("chinaDiscountPromotionData")
    @Expose
    private Object chinaDiscountPromotionData;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Object getTieredPricingDiscountData() {
        return tieredPricingDiscountData;
    }

    public void setTieredPricingDiscountData(Object tieredPricingDiscountData) {
        this.tieredPricingDiscountData = tieredPricingDiscountData;
    }

    public Object getChinaDiscountPromotionData() {
        return chinaDiscountPromotionData;
    }

    public void setChinaDiscountPromotionData(Object chinaDiscountPromotionData) {
        this.chinaDiscountPromotionData = chinaDiscountPromotionData;
    }

}
