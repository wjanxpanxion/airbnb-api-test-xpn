package filters;

import clients.filters.hostlanguage.HostLanguageFilterApiClient;
import clients.filters.hostlanguage.response.HostLanguageResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HostLanguageFiltersApiTest {


    @Test
    public void shouldBeAbleToGetListOfHostLanguages(){
        HostLanguageFilterApiClient hostLanguageFilterApiClient = new HostLanguageFilterApiClient();
        HostLanguageResponse hostLanguageResponse = hostLanguageFilterApiClient.getHostLanguageResponseApiClient();

        for (int i=0; i<hostLanguageResponse.getData().size(); i++){
            System.out.println(hostLanguageResponse.getData().get(i).getTitle());
        }
    }


    @Test
    public void shouldBeAbleToGetIfHostOfSpecificLanguageIsAvailable(){
        HostLanguageFilterApiClient hostLanguageFilterApiClient = new HostLanguageFilterApiClient();
        HostLanguageResponse hostLanguageResponse = hostLanguageFilterApiClient.getHostLanguageResponseApiClient();

        String language="English";

        for (int i=0; i<hostLanguageResponse.getData().size(); i++){
         if ( hostLanguageResponse.getData().get(i).getTitle().toLowerCase().equals(language.toLowerCase())){
             System.out.println(language + " is available");
             break;
         }
        }

    }
}
