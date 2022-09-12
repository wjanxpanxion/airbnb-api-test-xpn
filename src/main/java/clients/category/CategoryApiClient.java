package clients.category;

import clients.Constants;
import clients.category.response.CategoryResponse;
import com.google.gson.Gson;
import com.sun.tools.jxc.ap.Const;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CategoryApiClient {

    public CategoryResponse getCategoryApiClient(){

    Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .get(Constants.BASEURL+Constants.CATEGORYENDPOINT);

//    response.prettyPrint();

    Gson gson = new Gson();
    CategoryResponse categoryResponse = gson.fromJson(response.asString(), CategoryResponse.class);

    return categoryResponse;
    }
}
