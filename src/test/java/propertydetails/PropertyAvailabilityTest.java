package propertydetails;

import clients.propertydetails.checkavailability.CheckAvailabilityApiClient;
import clients.propertydetails.checkavailability.response.CheckAvailabilityResponse;
import clients.propertydetails.checkavailability.response.Day;
import clients.propertydetails.propertydetails.PropertyDetailsApiClient;
import clients.propertydetails.propertydetails.response.PropertyDetailsResponse;
import clients.search.property.SearchPropertyApiClient;
import clients.search.property.response.SearchPropertyResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PropertyAvailabilityTest {

    @Test
    public void shouldBeAbleToGetPropertyDetails() {

        //searchPropertyApi
        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getPropertyApiClientDefault();
        String propertyId = searchPropertyResponse.getData().get(0).getId();

        //propertyDetailsApi
        PropertyDetailsApiClient propertyDetailsApiClient = new PropertyDetailsApiClient();
        PropertyDetailsResponse propertyDetailsResponse = propertyDetailsApiClient.getPropertyDetailsApiClient(propertyId);

        //checkAvailabilityApi
        CheckAvailabilityApiClient checkAvailabilityApiClient = new CheckAvailabilityApiClient();
        CheckAvailabilityResponse checkAvailabilityResponse = checkAvailabilityApiClient.getCheckAvailabilityApiClient(propertyId);

        List<Day> days = checkAvailabilityResponse.getData().get(11).getDays();
        System.out.println(days.get(1).getAvailable());
        Assert.assertTrue(days.get(1).getAvailable());
    }

    @Test
    public void shouldBeAbleToGetAvailableDatesOfProperty() {

        //searchPropertyApi
        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getPropertyApiClientDefault();
        String propertyId = searchPropertyResponse.getData().get(0).getId();

        //checkAvailabilityApi
        CheckAvailabilityApiClient checkAvailabilityApiClient = new CheckAvailabilityApiClient();
        CheckAvailabilityResponse checkAvailabilityResponse = checkAvailabilityApiClient.getCheckAvailabilityApiClient(propertyId);

        if (checkAvailabilityResponse.getData().get(11).getMonth() == 7) {
            List<Day> days = checkAvailabilityResponse.getData().get(11).getDays();
            for (int i = 0; i < days.size(); i++) {
                if (days.get(i).getAvailable()) {
                    System.out.println(days.get(i).getDate());
                }
            }
        }
    }

    @Test
    public void shouldBeAbleToGetNonAvailableProperties(){

        //searchPropertyApi
        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getPropertyApiClientDefault();
        String propertyId = searchPropertyResponse.getData().get(2).getId();

        System.out.println("propertyId = " + propertyId);

        //checkAvailabilityApi
        CheckAvailabilityApiClient checkAvailabilityApiClient = new CheckAvailabilityApiClient();
        CheckAvailabilityResponse checkAvailabilityResponse = checkAvailabilityApiClient.getCheckAvailabilityApiClient(propertyId);

        if (checkAvailabilityResponse.getData().get(11).getMonth() == 7) {
            List<Day> days = checkAvailabilityResponse.getData().get(11).getDays();
            for (int i = 0; i < days.size(); i++) {
                if (! days.get(i).getAvailable()) {
                    System.out.println("Not Available:  " + days.get(i).getDate());
                }
            }
        }
    }
}