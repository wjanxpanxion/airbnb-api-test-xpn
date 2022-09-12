package filters;

import clients.filters.toptierstays.TopTierStaysFilterApiClient;
import clients.filters.toptierstays.response.TopTierStaysResponse;
import org.testng.annotations.Test;

public class TopTierStaysFilterApiTest {

    @Test
    public void shouldBeAbleToGetTopTierStaysFilter(){
        TopTierStaysFilterApiClient topTierStaysFilterApiClient = new TopTierStaysFilterApiClient();
        TopTierStaysResponse topTierStaysResponse = topTierStaysFilterApiClient.getTopTierStayApiClient();

        for (int i=0; i<topTierStaysResponse.getData().size(); i++){
            System.out.println(topTierStaysResponse.getData().get(i).getTitle());
        }

    }
}
