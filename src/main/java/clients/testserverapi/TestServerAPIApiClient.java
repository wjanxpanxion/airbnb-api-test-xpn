package clients.testserverapi;

import clients.Constants;
import clients.testserverapi.response.TestServerResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestServerAPIApiClient {

    public TestServerResponse getTestServerApi() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.TESTSERVERENDPOINT);

        response.prettyPrint();

        Gson gson = new Gson();
        TestServerResponse testServerResponse = gson.fromJson(response.asString(), TestServerResponse.class);

        return testServerResponse;
    }
}
