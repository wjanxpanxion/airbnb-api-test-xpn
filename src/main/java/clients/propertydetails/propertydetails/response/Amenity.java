
package clients.propertydetails.propertydetails.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amenity {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("amenities")
    @Expose
    private List<Amenity__1> amenities = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Amenity__1> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity__1> amenities) {
        this.amenities = amenities;
    }

}
