
package clients.propertydetails.propertyreviews.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PopertyReviewWithInvalidUseCase {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}
