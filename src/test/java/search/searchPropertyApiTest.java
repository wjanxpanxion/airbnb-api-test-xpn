package search;

import clients.category.CategoryApiClient;
import clients.category.response.CategoryResponse;
import clients.currency.CurrencyApiClient;
import clients.currency.response.CurrencyResponse;
import clients.filters.amenities.AmenitiesFilterApiClient;
import clients.filters.amenities.response.AmenitiesFilterResponse;
import clients.filters.hostlanguage.HostLanguageFilterApiClient;
import clients.filters.hostlanguage.response.HostLanguageResponse;
import clients.filters.propertytype.PropertyTypeFilterApiClient;
import clients.filters.propertytype.response.PropertyTypeFilterResponse;
import clients.filters.toptierstays.TopTierStaysFilterApiClient;
import clients.filters.toptierstays.response.TopTierStaysResponse;
import clients.filters.typeofplace.TypeOfPlaceFilterApiClient;
import clients.filters.typeofplace.response.TypeOfPlaceFilterResponse;
import clients.search.property.SearchPropertyApiClient;
import clients.search.property.response.SearchPropertyNegativeWithErrorMessage;
import clients.search.property.response.SearchPropertyResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchPropertyApiTest {

    @Test
    public void shouldBeAbleToValidateTotalNumberOfProperties() {

        String total = "10";

        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getPropertyWithTotalNumberOfRecords(total);

        int totalNoOfRecords = Integer.parseInt(total);
        int actualCountOfRecords = searchPropertyResponse.getData().size();

        Assert.assertEquals(totalNoOfRecords, actualCountOfRecords);
    }


    @Test
    public void shouldBeAbleToGetPropertyBasedOnGivenNumbersOfGuests() {

        String adults = "4";
        String children = "8";
        String infant = "0";

        int expectedTotalNumbersOfGuest = (Integer.parseInt(adults) + Integer.parseInt(children) + Integer.parseInt(infant));

        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getFilteredPropertiesBasedOnGivenNumberOfGuests(adults, children, infant);

        for (int i = 0; i < searchPropertyResponse.getData().size(); i++) {
            String[] listingGuestLabel = searchPropertyResponse.getData().get(i).getListingGuestLabel().split(" ");
            String numberOfGuests = listingGuestLabel[0];
            int numberOFGuestsAllowed = Integer.parseInt(numberOfGuests);

            Assert.assertTrue(numberOFGuestsAllowed >= expectedTotalNumbersOfGuest);
        }
    }


    @Test
    public void shouldBeAbleToGetPropertyBasedOnBedroomsBedsBathrooms() {

        String minBedrooms = "2";
        String minBeds = "4";
        String minBathroom = "2";

        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getFilterPropertiesBaseOnBedroomsBedsBaths(minBedrooms, minBeds, minBathroom);

        for (int i = 0; i < searchPropertyResponse.getData().size(); i++) {

            int actualMinBedrooms = searchPropertyResponse.getData().get(i).getBedrooms();
            int actualMinBed = searchPropertyResponse.getData().get(i).getBeds();
            double actualBathrooms = searchPropertyResponse.getData().get(i).getBathrooms();

            Assert.assertTrue(actualMinBedrooms >= Integer.parseInt(minBedrooms) && actualMinBed >= Integer.parseInt(minBeds) && actualBathrooms >= Double.parseDouble(minBathroom));
        }

    }


    @Test
    public void shouldBeAbleToValidateResourceNotFoundStatusCode(){
        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyNegativeWithErrorMessage searchPropertyNegativeWithErrorMessage = searchPropertyApiClient.getPropertyResponseForInvalidResponse();

        Assert.assertEquals(searchPropertyNegativeWithErrorMessage.getMessage(), "Endpoint/api/v1/searchPropertU does not exist");

    }


    @Test
    public void shouldBeAbleToValidateForUnAuthorizedStatusCode(){

        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyNegativeWithErrorMessage searchPropertyNegativeWithErrorMessage = searchPropertyApiClient.getPropertyResponseForInvalidAuthorization();

        Assert.assertEquals(searchPropertyNegativeWithErrorMessage.getMessage(), "Invalid API key. Go to https://docs.rapidapi.com/docs/keys for more info.");

    }




























    public void shouldBeAbleToProperty() {

        SearchPropertyApiClient searchPropertyApiClient = new SearchPropertyApiClient();
        SearchPropertyResponse searchPropertyResponse = searchPropertyApiClient.getPropertyApiClientDefault();

        //Optional parameter 'category'- To get other available category please call Get Category API
        CategoryApiClient categoryApiClient = new CategoryApiClient();
        CategoryResponse categoryResponse = categoryApiClient.getCategoryApiClient();
        for (int i = 0; i < categoryResponse.getData().size(); i++) {
            System.out.println(categoryResponse.getData().get(i).getId());
        }
        System.out.println("------------------------------");

        //Optional parameter 'currency'- Default currency is USD. To get other available currency please call Get Currency API
        CurrencyApiClient currencyApiClient = new CurrencyApiClient();
        CurrencyResponse currencyResponse = currencyApiClient.getCurrencyApiClient();
        for (int i = 0; i < currencyResponse.getData().size(); i++) {
            System.out.println(currencyResponse.getData().get(i).getId());
        }
        System.out.println("------------------------------");

        //Optional parameter 'property_type'- You are retrieve available property_type from Get Property Type Filter
        PropertyTypeFilterApiClient propertyTypeFilterApiClient = new PropertyTypeFilterApiClient();
        PropertyTypeFilterResponse propertyTypeFilterResponse = propertyTypeFilterApiClient.getPropertyType();

        for (int i = 0; i < propertyTypeFilterResponse.getData().size(); i++) {
            System.out.println(propertyTypeFilterResponse.getData().get(i).getTitle());
        }
        System.out.println("------------------------------");

        //Optional parameter 'host_language'- You are retrieve available host_languages from Get Host Language Filters
        HostLanguageFilterApiClient hostLanguageFilterApiClient = new HostLanguageFilterApiClient();
        HostLanguageResponse hostLanguageResponse = hostLanguageFilterApiClient.getHostLanguageResponseApiClient();

        for (int i = 0; i < hostLanguageResponse.getData().size(); i++) {
            System.out.println(hostLanguageResponse.getData().get(i).getTitle());
        }
        System.out.println("------------------------------");

        //Optional parameter 'amenities'- You are retrieve available amenities from Get Amenities Filters
        AmenitiesFilterApiClient amenitiesFilterApiClient = new AmenitiesFilterApiClient();
        AmenitiesFilterResponse amenitiesFilterResponse = amenitiesFilterApiClient.getAmenitiesApiClient();

        for (int i = 0; i < amenitiesFilterResponse.getData().size(); i++) {
            System.out.println(amenitiesFilterResponse.getData().get(i).getTitle());
        }
        System.out.println("------------------------------");

        //Optional parameter 'type_of_place'- You are retrieve available typeofplace from Get Type of Place Filter
        TypeOfPlaceFilterApiClient typeOfPlaceFilterApiClient = new TypeOfPlaceFilterApiClient();
        TypeOfPlaceFilterResponse typeOfPlaceFilterResponse = typeOfPlaceFilterApiClient.getTypeOfPlaceApiClient();

        for (int i = 0; i < typeOfPlaceFilterResponse.getData().size(); i++) {
            System.out.println(typeOfPlaceFilterResponse.getData().get(i).getTitle());
        }
        System.out.println("------------------------------");

        //Optional parameter 'top_tier_stays'- You are retrieve available toptierstays from Get Top Tier Stays Filter
        TopTierStaysFilterApiClient topTierStaysFilterApiClient = new TopTierStaysFilterApiClient();
        TopTierStaysResponse topTierStaysResponse = topTierStaysFilterApiClient.getTopTierStayApiClient();

        for (int i = 0; i < topTierStaysResponse.getData().size(); i++) {
            System.out.println(topTierStaysResponse.getData().get(i).getTitle());
        }
    }
}
