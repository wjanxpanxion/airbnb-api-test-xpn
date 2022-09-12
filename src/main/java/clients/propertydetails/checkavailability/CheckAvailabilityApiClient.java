package clients.propertydetails.checkavailability;

import clients.Constants;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import clients.propertydetails.checkavailability.response.*;
import static io.restassured.RestAssured.given;

public class CheckAvailabilityApiClient {

    public CheckAvailabilityResponse getCheckAvailabilityApiClient(String propertyId) {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("propertyId", propertyId)
                .get(Constants.BASEURL + Constants.CHECKAVAILABILITYENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        CheckAvailabilityResponse checkAvailabilityResponse = gson.fromJson(response.asString(), CheckAvailabilityResponse.class);

        return checkAvailabilityResponse;
    }
}
