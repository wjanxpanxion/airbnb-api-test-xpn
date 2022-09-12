
package clients.filters.toptierstays.propertybygeocoordinates.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContextualPicturesPageInfo {

    @SerializedName("hasNextPage")
    @Expose
    private Boolean hasNextPage;
    @SerializedName("endCursor")
    @Expose
    private String endCursor;

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public String getEndCursor() {
        return endCursor;
    }

    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

}
