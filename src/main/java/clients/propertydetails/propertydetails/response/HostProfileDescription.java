
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HostProfileDescription {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("htmlText")
    @Expose
    private String htmlText;
    @SerializedName("readMoreButton")
    @Expose
    private ReadMoreButton readMoreButton;
    @SerializedName("recommendedNumberOfLines")
    @Expose
    private Integer recommendedNumberOfLines;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public ReadMoreButton getReadMoreButton() {
        return readMoreButton;
    }

    public void setReadMoreButton(ReadMoreButton readMoreButton) {
        this.readMoreButton = readMoreButton;
    }

    public Integer getRecommendedNumberOfLines() {
        return recommendedNumberOfLines;
    }

    public void setRecommendedNumberOfLines(Integer recommendedNumberOfLines) {
        this.recommendedNumberOfLines = recommendedNumberOfLines;
    }

}
