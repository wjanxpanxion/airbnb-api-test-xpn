import clients.category.CategoryApiClient;
import clients.category.response.CategoryResponse;
import clients.category.response.Datum;
import org.testng.annotations.Test;

import java.util.List;

public class CategoryApiClientTest {

    @Test
    public void shouldBeAbleToGetCategoryByTitle() {

        CategoryApiClient categoryApiClient = new CategoryApiClient();
        CategoryResponse categoryResponse = categoryApiClient.getCategoryApiClient();

        List <Datum > data = categoryResponse.getData();

        for (int i=0; i<data.size(); i++){
            if (data.get(i).getTitle().contains("pools") || data.get(i).getTitle().contains("Islands")){
                System.out.println("\n"+ data.get(i).getTitle() + "\n" + data.get(i).getImage());
            }
        }



    }
}
