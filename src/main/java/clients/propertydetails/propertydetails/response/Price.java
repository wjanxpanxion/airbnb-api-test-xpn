
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("barPrice")
    @Expose
    private BarPrice barPrice;
    @SerializedName("price")
    @Expose
    private Price__1 price;

    public BarPrice getBarPrice() {
        return barPrice;
    }

    public void setBarPrice(BarPrice barPrice) {
        this.barPrice = barPrice;
    }

    public Price__1 getPrice() {
        return price;
    }

    public void setPrice(Price__1 price) {
        this.price = price;
    }

}
