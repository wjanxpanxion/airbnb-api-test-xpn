package clients.propertydetails.propertydetails;

import clients.Constants;
import clients.propertydetails.propertydetails.response.PopertyDetailsWithoutPropertyID;
import clients.propertydetails.propertydetails.response.PropertyDetailsResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PropertyDetailsApiClient {

    public PropertyDetailsResponse getPropertyDetailsApiClient(String propertyId) {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("propertyId", propertyId)
                .queryParam("currency", "USD")
                .get(Constants.BASEURL + Constants.GETPROPERTYDETAILSENDPOINT);

//        response.prettyPrint();
        Gson gson = new Gson();
        PropertyDetailsResponse propertyDetailsResponse = gson.fromJson(response.asString(), PropertyDetailsResponse.class);

        return propertyDetailsResponse;
    }


    public PopertyDetailsWithoutPropertyID getPropertyWithoutPropertyId(){
        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.GETPROPERTYDETAILSENDPOINT);

        Gson gson = new Gson();
        PopertyDetailsWithoutPropertyID popertyDetailsWithInvalidPropertyID = gson.fromJson(response.asString(), PopertyDetailsWithoutPropertyID.class);

        return popertyDetailsWithInvalidPropertyID;
    }






}
