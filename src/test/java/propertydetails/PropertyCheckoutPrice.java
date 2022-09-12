package propertydetails;

import clients.propertydetails.checkoutprice.CheckoutPriceApiClient;
import clients.propertydetails.checkoutprice.response.CheckoutMessageForPropertyNonAvailibility;
import clients.propertydetails.checkoutprice.response.CheckoutPriceResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PropertyCheckoutPrice {


    @Test
    public void shouldBeAbleToGetPropertyAvailabilityMessage(){

        CheckoutPriceApiClient checkoutPriceApiClient = new CheckoutPriceApiClient();
        CheckoutMessageForPropertyNonAvailibility checkoutMessageForPropertyNonAvailibility = checkoutPriceApiClient.getCheckoutForNonAvailableProperty ("42164367", "2023-02-15", "2023-02-28");

        Assert.assertTrue( checkoutMessageForPropertyNonAvailibility.getData().contains("someone else just requested a reservation") );

    }


}
