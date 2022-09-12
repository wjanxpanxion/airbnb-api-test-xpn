
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BarPrice {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("accessibilityLabel")
    @Expose
    private String accessibilityLabel;
    @SerializedName("displayPrices")
    @Expose
    private List<DisplayPrice> displayPrices = null;
    @SerializedName("explanationData")
    @Expose
    private Object explanationData;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getAccessibilityLabel() {
        return accessibilityLabel;
    }

    public void setAccessibilityLabel(String accessibilityLabel) {
        this.accessibilityLabel = accessibilityLabel;
    }

    public List<DisplayPrice> getDisplayPrices() {
        return displayPrices;
    }

    public void setDisplayPrices(List<DisplayPrice> displayPrices) {
        this.displayPrices = displayPrices;
    }

    public Object getExplanationData() {
        return explanationData;
    }

    public void setExplanationData(Object explanationData) {
        this.explanationData = explanationData;
    }

}
