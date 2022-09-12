package clients.propertydetails.checkoutprice;

import clients.Constants;
import clients.propertydetails.checkoutprice.response.CheckoutMessageForPropertyNonAvailibility;
import clients.propertydetails.checkoutprice.response.CheckoutPriceResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CheckoutPriceApiClient {

    public CheckoutPriceResponse getCheckoutApiClient(String propertyID, String plannedCheckInDate, String plannedCheckOutDate) {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("propertyId", propertyID)
                .queryParam("checkIn", plannedCheckInDate)
                .queryParam("checkOut", plannedCheckOutDate)
                .queryParam("currency", "USD")
                .get(Constants.BASEURL + Constants.GETPROPERTYCHECKOUTPRICEENDPOINT);

        response.prettyPrint();

        Gson gson = new Gson();

        CheckoutPriceResponse checkoutPriceResponse =  gson.fromJson(response.asString(), CheckoutPriceResponse.class);

        return checkoutPriceResponse;
    }


    public CheckoutMessageForPropertyNonAvailibility getCheckoutForNonAvailableProperty(String propertyID, String plannedCheckInDate, String plannedCheckOutDate){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("propertyId", propertyID)
                .queryParam("checkIn", plannedCheckInDate)
                .queryParam("checkOut", plannedCheckOutDate)
                .queryParam("currency", "USD")
                .get(Constants.BASEURL + Constants.GETPROPERTYCHECKOUTPRICEENDPOINT);

        response.prettyPrint();

        Gson gson = new Gson();

        CheckoutMessageForPropertyNonAvailibility checkoutMessageForPropertyNonAvailibility =  gson.fromJson(response.asString(), CheckoutMessageForPropertyNonAvailibility.class);

        return checkoutMessageForPropertyNonAvailibility;

    }





}