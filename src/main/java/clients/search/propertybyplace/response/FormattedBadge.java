
package clients.search.propertybyplace.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class FormattedBadge {

    @SerializedName("textColor")
    @Expose
    private String textColor;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("borderColor")
    @Expose
    private String borderColor;
    @SerializedName("backgroundColor")
    @Expose
    private String backgroundColor;

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}
