package filters;

import clients.filters.typeofplace.TypeOfPlaceFilterApiClient;
import clients.filters.typeofplace.response.TypeOfPlaceFilterResponse;
import org.testng.annotations.Test;

public class TypeOfPlaceFilterApiTest {

    @Test
    public void shouldBeAbleToGetAvailableTypeOfPlaces(){

        TypeOfPlaceFilterApiClient typeOfPlaceFilterApiClient = new TypeOfPlaceFilterApiClient();
        TypeOfPlaceFilterResponse typeOfPlaceFilterResponse = typeOfPlaceFilterApiClient.getTypeOfPlaceApiClient();

        for (int i=0; i<typeOfPlaceFilterResponse.getData().size(); i++){
            System.out.println(typeOfPlaceFilterResponse.getData().get(i).getTitle());
        }
    }
}
