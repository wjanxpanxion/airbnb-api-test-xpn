package clients.filters.toptierstays;

import clients.Constants;
import clients.filters.toptierstays.response.TopTierStaysResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TopTierStaysFilterApiClient {

    public TopTierStaysResponse getTopTierStayApiClient() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL + Constants.TOPTIERSTAYSFILTERENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        TopTierStaysResponse topTierStaysResponse = gson.fromJson(response.asString(), TopTierStaysResponse.class);

        return topTierStaysResponse;
    }
}