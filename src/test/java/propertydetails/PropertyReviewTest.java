package propertydetails;

import clients.propertydetails.propertydetails.response.PopertyDetailsWithoutPropertyID;
import clients.propertydetails.propertyreviews.PropertyReviewApiClient;
import clients.propertydetails.propertyreviews.response.Message;
import clients.propertydetails.propertyreviews.response.PopertyReviewWithInvalidUseCase;
import clients.propertydetails.propertyreviews.response.PropertyReviewApiResponse;
import org.apache.commons.lang3.ObjectUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.CollectionUtils;

import java.util.Collections;
import java.util.List;

public class PropertyReviewTest {

    /*
    Steps:
    1- Move the common code to base test and add the @BeforeMethod
    2- Move the core logic to Api Client class with the reusable method
    3- Now in the Test method use the Api client object and call the respective reusable method passing POJO object as an argument.


    H.W:
    1- Complete the manual test case spread sheet.
    2- Move all the core logic to respective Api Client classes and repeat the no.3 above.
     */

    String propertyID1083329 = "1083329";
    String getPropertyIDEmpty= "";

    @DataProvider(name = "getPropertyIDs")
    public Object[][] shouldBeAbleToGetPropertiesIDFromExcelSheet(){

        return new Object[][]{ {"1083329"}, {"11111"} };
    }

    @Test (dataProvider = "getPropertyIDs")
    public void shouldBeAbleToGetPersonNameStartingWithMAndWhoRated5(String propertyID) {

        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PropertyReviewApiResponse propertyReviewApiResponse = propertyReviewApiClient.getPropertyReviewApiClient(propertyID);

        propertyReviewApiClient.getPersonNameStartingWithMAndWhoRated5(propertyReviewApiResponse);
    }

    @Test
    public void shouldBeAbleToGetCommentsOfPersonWhoRated4() {
        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PropertyReviewApiResponse propertyReviewApiResponse = propertyReviewApiClient.getPropertyReviewApiClient(propertyID1083329);

        propertyReviewApiClient.getCommentsOfPersonWhoRated4(propertyReviewApiResponse);
    }

    @Test
    public void shouldBeActedToGetSpecificWordFromComments() {
        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PropertyReviewApiResponse propertyReviewApiResponse = propertyReviewApiClient.getPropertyReviewApiClient(propertyID1083329);

        propertyReviewApiClient.getSpecificWordFromComments(propertyReviewApiResponse);
    }

    @Test
    public void shouldBeAbleToGetAllReviewsMadeInJuly2022() {
        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PropertyReviewApiResponse propertyReviewApiResponse = propertyReviewApiClient.getPropertyReviewApiClient(propertyID1083329);

       propertyReviewApiClient.getAllReviewsMadeInJuly2022(propertyReviewApiResponse);
    }

    @Test
    public void shouldBeAbleToGetImageOfPropertyWhichReviewerRated5() {
        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PropertyReviewApiResponse propertyReviewApiResponse = propertyReviewApiClient.getPropertyReviewApiClient(propertyID1083329);

        propertyReviewApiClient.getImageOfPropertyWhichReviewerRated5(propertyReviewApiResponse);
    }

    @Test
    public void shouldBeAbleToGetTheMonthOfMostReviews() {
        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PropertyReviewApiResponse propertyReviewApiResponse = propertyReviewApiClient.getPropertyReviewApiClient(propertyID1083329);

        String result = propertyReviewApiClient.getMaximumReviewMonth(propertyReviewApiResponse);
        System.out.println(result);
    }

    @Test
    public void shouldBeAbleToGetMessageAndStatus(){
        PropertyReviewApiClient propertyReviewApiClient = new PropertyReviewApiClient();
        PopertyReviewWithInvalidUseCase popertyReviewWithInvalidUseCase = propertyReviewApiClient.getPropertyWithInvalidPropertyId(getPropertyIDEmpty);

        Assert.assertFalse( popertyReviewWithInvalidUseCase.getStatus());

        Message message = popertyReviewWithInvalidUseCase.getMessage();
        System.out.println( message);
    }


}