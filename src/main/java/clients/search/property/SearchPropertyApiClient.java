package clients.search.property;

import clients.Constants;
import clients.search.property.response.SearchPropertyNegativeWithErrorMessage;
import clients.search.property.response.SearchPropertyResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;



public class SearchPropertyApiClient {

    public SearchPropertyResponse getPropertyApiClientDefault() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.SEARCHPROPERTYENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        SearchPropertyResponse searchPropertyResponse = gson.fromJson(response.asString(), SearchPropertyResponse.class);

        return searchPropertyResponse;
    }


    public SearchPropertyResponse getPropertyApiClientWithParams(String adults, String children, String infant, String minBedrooms, String minBeds, String minBathrooms) {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
//                .queryParam("category", "TAB_8225")
//                .queryParam("totalRecords", "10")

//            .queryParam("currency", "USD")
//            .queryParam("adult", "2")
//            .queryParam("children", "5")
//            .queryParam("infants", "0")

//                .queryParam("pets", "0")
//                .queryParam("priceMin", "500")
//                .queryParam("priceMax", "2000")

//            .queryParam("minBedrooms", "3")
//            .queryParam("minBeds", "6")
//            .queryParam("minBathrooms", "3")

//            .queryParam("property_type[0]", "House")
//            .queryParam("host_languages[0]", "English")
//                .queryParam("amenities[0]", "all")
//            .queryParam("type_of_place[0]", "Entire place")
//                .queryParam("top_tier_stays[0]", "Airbnb Plus")

//                .queryParam("self_check_in", "true")
//                .queryParam("instant_book", "true")
//                .queryParam("super_host", "true")


                .get(Constants.BASEURL + Constants.SEARCHPROPERTYENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        SearchPropertyResponse searchPropertyResponse = gson.fromJson(response.asString(), SearchPropertyResponse.class);

        return searchPropertyResponse;

    }


    public SearchPropertyResponse getPropertyWithTotalNumberOfRecords(String totalRecords){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("totalRecords", totalRecords)
                .get(Constants.BASEURL + Constants.SEARCHPROPERTYENDPOINT);

        Gson gson = new Gson();
        SearchPropertyResponse searchPropertyResponse = gson.fromJson(response.asString(), SearchPropertyResponse.class);

        return searchPropertyResponse;
    }

    public SearchPropertyResponse getFilteredPropertiesBasedOnGivenNumberOfGuests(String adults, String children, String infant){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("adults", adults)
                .queryParam("children", children)
                .queryParam("infants", infant)
                .get(Constants.BASEURL + Constants.SEARCHPROPERTYENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        SearchPropertyResponse searchPropertyResponse = gson.fromJson(response.asString(), SearchPropertyResponse.class);

        return searchPropertyResponse;
    }


    public SearchPropertyResponse getFilterPropertiesBaseOnBedroomsBedsBaths(String minBedrooms, String minBeds, String minBathrooms){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("category", minBedrooms)
                .queryParam("minBeds", minBeds)
                .queryParam("minBathrooms", minBathrooms)
                .get(Constants.BASEURL + Constants.SEARCHPROPERTYENDPOINT);

        Gson gson = new Gson();
        SearchPropertyResponse searchPropertyResponse = gson.fromJson(response.asString(), SearchPropertyResponse.class);

        return searchPropertyResponse;
    }


    public SearchPropertyNegativeWithErrorMessage getPropertyResponseForInvalidResponse(){
        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.SEARCHPROPERTYINVALIDENDPOINT);

        Assert.assertEquals(response.statusCode(), 404);

        Gson gson = new Gson();
        SearchPropertyNegativeWithErrorMessage searchPropertyNegativeWithErrorMessage = gson.fromJson(response.asString(), SearchPropertyNegativeWithErrorMessage.class);

        return searchPropertyNegativeWithErrorMessage;
    }


    public SearchPropertyNegativeWithErrorMessage getPropertyResponseForInvalidAuthorization(){

        Response response = given()
                .contentType(ContentType.JSON)
//                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.SEARCHPROPERTYENDPOINT);

        Assert.assertEquals(response.statusCode(), 401);

        Gson gson = new Gson();
        SearchPropertyNegativeWithErrorMessage searchPropertyNegativeWithErrorMessage =    gson.fromJson(response.asString(), SearchPropertyNegativeWithErrorMessage.class);
        return searchPropertyNegativeWithErrorMessage;

    }




}