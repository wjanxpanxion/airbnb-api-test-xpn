
package clients.propertydetails.propertydetails.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DescriptionItem {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("title")
    @Expose
    private String title;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
