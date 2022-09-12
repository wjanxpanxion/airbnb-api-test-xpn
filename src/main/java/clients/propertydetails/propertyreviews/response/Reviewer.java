
package clients.propertydetails.propertyreviews.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reviewer {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("userProfilePicture")
    @Expose
    private UserProfilePicture userProfilePicture;
    @SerializedName("badges")
    @Expose
    private List<Object> badges = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserProfilePicture getUserProfilePicture() {
        return userProfilePicture;
    }

    public void setUserProfilePicture(UserProfilePicture userProfilePicture) {
        this.userProfilePicture = userProfilePicture;
    }

    public List<Object> getBadges() {
        return badges;
    }

    public void setBadges(List<Object> badges) {
        this.badges = badges;
    }

}
