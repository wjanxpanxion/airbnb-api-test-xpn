package propertydetails;

import clients.propertydetails.propertydetails.PropertyDetailsApiClient;
import clients.propertydetails.propertydetails.response.Message;
import clients.propertydetails.propertydetails.response.PopertyDetailsWithoutPropertyID;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PropertyDetailsTest {



    @Test
    public void shouldBeAbleToGetInvalidPropertyIDMsg(){

        PropertyDetailsApiClient propertyDetailsApiClient = new PropertyDetailsApiClient();

        PopertyDetailsWithoutPropertyID invalidPropertyIDMsg = propertyDetailsApiClient.getPropertyWithoutPropertyId();

        Message message =  invalidPropertyIDMsg.getMessage().get(0);

       Assert.assertEquals(message.getPropertyId(), "Invalid value");

    }
}
