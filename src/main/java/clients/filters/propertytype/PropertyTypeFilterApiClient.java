package clients.filters.propertytype;

import clients.Constants;
import clients.filters.propertytype.response.PropertyTypeFilterNegativeWithErrorMsg;
import clients.filters.propertytype.response.PropertyTypeFilterResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class PropertyTypeFilterApiClient {

    public PropertyTypeFilterResponse getPropertyType(){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL+Constants.PROPERTYTYPEFILTERENDPOINT);

//        response.prettyPrint();

        Assert.assertEquals(response.statusCode(), 404);

        Gson gson = new Gson();
         PropertyTypeFilterResponse propertyTypeResponse = gson.fromJson(response.asString(), PropertyTypeFilterResponse.class);

         return propertyTypeResponse;
    }



    public PropertyTypeFilterNegativeWithErrorMsg PropertyTypeFilterWithErrorMsg(){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL+Constants.PROPERTYTYPEFILTERINVALIDENDPOINT);

//        response.prettyPrint();

        Assert.assertEquals(response.statusCode(), 404);

        Gson gson = new Gson();

        PropertyTypeFilterNegativeWithErrorMsg propertyTypeFilterNegativeWithErrorMsg= gson.fromJson(response.asString(), PropertyTypeFilterNegativeWithErrorMsg.class );

        return propertyTypeFilterNegativeWithErrorMsg;
    }



}
