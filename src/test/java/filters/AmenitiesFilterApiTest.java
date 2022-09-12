package filters;

import clients.filters.amenities.AmenitiesFilterApiClient;
import clients.filters.amenities.response.AmenitiesFilterResponse;
import org.testng.annotations.Test;

public class AmenitiesFilterApiTest {

    @Test
    public void shouldBeAbleToGetAmenitiesList() {

        AmenitiesFilterApiClient amenitiesFilterApiClient = new AmenitiesFilterApiClient();
        AmenitiesFilterResponse amentiesFilterResponse = amenitiesFilterApiClient.getAmenitiesApiClient();

        for (int i = 0; i < amentiesFilterResponse.getData().size(); i++) {
            System.out.println(amentiesFilterResponse.getData().get(i).getTitle());
        }
    }


    @Test
    public void shouldBeAbleToGetSpecificAmenityAvailabilityUsingKeywords() {

        AmenitiesFilterApiClient amenitiesFilterApiClient = new AmenitiesFilterApiClient();
        AmenitiesFilterResponse amentiesFilterResponse = amenitiesFilterApiClient.getAmenitiesApiClient();

        String amenity = "hot";

        for (int i = 0; i < amentiesFilterResponse.getData().size(); i++) {
            if(amentiesFilterResponse.getData().get(i).getTitle().toLowerCase().contains(amenity)){
                System.out.println("Full Amenity Name is: '" + amentiesFilterResponse.getData().get(i).getTitle() +"'" );
            }
        }
    }







}
