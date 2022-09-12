package filters;

import clients.filters.propertytype.PropertyTypeFilterApiClient;
import clients.filters.propertytype.response.Datum;
import clients.filters.propertytype.response.PropertyTypeFilterNegativeWithErrorMsg;
import clients.filters.propertytype.response.PropertyTypeFilterResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PropertyTypeFilterApiTest {

    @Test
    public void shouldBeAbleToGetPropertyFilters() {
        PropertyTypeFilterApiClient propertyTypeFilterApiClient = new PropertyTypeFilterApiClient();
        PropertyTypeFilterResponse propertyTypeFilterResponse = propertyTypeFilterApiClient.getPropertyType();
    }


    @Test
    public void shouldBeAbleToGetRespectiveID() {
        PropertyTypeFilterApiClient propertyTypeFilterApiClient = new PropertyTypeFilterApiClient();
        PropertyTypeFilterResponse propertyTypeFilterResponse = propertyTypeFilterApiClient.getPropertyType();

        List<Datum> data = propertyTypeFilterResponse.getData();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getTitle().contains("house") || data.get(i).getTitle().contains("House")) {
                System.out.println("id: " + data.get(i).getId());
            }
        }
    }

    @Test
    public void shouldBeAbleToGetTotalTypeOfStays() {
        PropertyTypeFilterApiClient propertyTypeFilterApiClient = new PropertyTypeFilterApiClient();
        PropertyTypeFilterResponse propertyTypeFilterResponse = propertyTypeFilterApiClient.getPropertyType();

        List<Datum> data = propertyTypeFilterResponse.getData();

       int typeOfStays =  data.size();
        System.out.println(typeOfStays);
    }


    @Test
    public void shouldBeAbleToValidateResourceNotFoundStatusCode(){

        PropertyTypeFilterApiClient propertyTypeFilterApiClient = new PropertyTypeFilterApiClient();
        PropertyTypeFilterNegativeWithErrorMsg propertyTypeFilterNegativeWithErrorMsg = propertyTypeFilterApiClient.PropertyTypeFilterWithErrorMsg();

        Assert.assertEquals(propertyTypeFilterNegativeWithErrorMsg.getMessage(), "Endpoint/api/v1/getPropertyTypU does not exist");
    }



}
