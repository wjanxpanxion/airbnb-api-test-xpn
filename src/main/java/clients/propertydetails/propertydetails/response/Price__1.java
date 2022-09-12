
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price__1 {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("discountData")
    @Expose
    private DiscountData discountData;
    @SerializedName("promotionBadgeDiscountDisplays")
    @Expose
    private Object promotionBadgeDiscountDisplays;
    @SerializedName("total")
    @Expose
    private Total total;
    @SerializedName("priceItems")
    @Expose
    private List<Object> priceItems = null;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public DiscountData getDiscountData() {
        return discountData;
    }

    public void setDiscountData(DiscountData discountData) {
        this.discountData = discountData;
    }

    public Object getPromotionBadgeDiscountDisplays() {
        return promotionBadgeDiscountDisplays;
    }

    public void setPromotionBadgeDiscountDisplays(Object promotionBadgeDiscountDisplays) {
        this.promotionBadgeDiscountDisplays = promotionBadgeDiscountDisplays;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public List<Object> getPriceItems() {
        return priceItems;
    }

    public void setPriceItems(List<Object> priceItems) {
        this.priceItems = priceItems;
    }

}
