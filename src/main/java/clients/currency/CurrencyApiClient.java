package clients.currency;

import clients.Constants;
import clients.currency.response.CurrencyResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CurrencyApiClient {

    public CurrencyResponse getCurrencyApiClient(){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL+Constants.CURRENCYENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        CurrencyResponse currencyResponse= gson.fromJson(response.asString(), CurrencyResponse.class);

        return currencyResponse;
    }
}
