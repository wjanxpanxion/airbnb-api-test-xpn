package clients.filters.accessiblity;

import clients.Constants;
import clients.filters.accessiblity.response.AccessibilityFilterResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AccessibilityFilterApiClient {

    public AccessibilityFilterResponse getAccessibilityFilterApiClient() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.ACCESSIBILITYFILTERENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        AccessibilityFilterResponse accessibilityFilterResponse = gson.fromJson(response.asString(), AccessibilityFilterResponse.class);
        return accessibilityFilterResponse;
    }
}
