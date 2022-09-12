package clients.filters.typeofplace;

import clients.Constants;
import clients.filters.typeofplace.response.TypeOfPlaceFilterResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TypeOfPlaceFilterApiClient {

    public TypeOfPlaceFilterResponse getTypeOfPlaceApiClient() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.TYPEOFPLACEFILTERENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();

        TypeOfPlaceFilterResponse typeOfPlaceFilterResponse = gson.fromJson(response.asString(), TypeOfPlaceFilterResponse.class);

        return typeOfPlaceFilterResponse;
    }
}