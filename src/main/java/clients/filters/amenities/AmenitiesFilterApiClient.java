package clients.filters.amenities;

import clients.Constants;
import clients.filters.amenities.response.AmenitiesFilterResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AmenitiesFilterApiClient {

    public AmenitiesFilterResponse getAmenitiesApiClient() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.AMENITIESFILTERENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();

        AmenitiesFilterResponse amentiesFilterResponse = gson.fromJson(response.asString(), AmenitiesFilterResponse.class);

        return amentiesFilterResponse;

    }
}