package clients.filters.hostlanguage;

import clients.Constants;
import clients.filters.hostlanguage.response.HostLanguageResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class HostLanguageFilterApiClient {

    public HostLanguageResponse getHostLanguageResponseApiClient() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.HOSTLANGUAGEFILTERENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        HostLanguageResponse hostLanguageResponse = gson.fromJson(response.asString(), HostLanguageResponse.class);

        return hostLanguageResponse;
    }
}
