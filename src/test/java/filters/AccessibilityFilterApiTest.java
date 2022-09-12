package filters;

import clients.filters.accessiblity.AccessibilityFilterApiClient;
import clients.filters.accessiblity.response.AccessibilityFilterResponse;
import org.testng.annotations.Test;

public class AccessibilityFilterApiTest {


    @Test
    public void shouldBeAbleToGetAccessibilityType(){
        AccessibilityFilterApiClient accessibilityFilterApiClient = new AccessibilityFilterApiClient();
        AccessibilityFilterResponse accessibilityFilterResponse = accessibilityFilterApiClient.getAccessibilityFilterApiClient();

      for (int i=0; i< accessibilityFilterResponse.getData().size(); i++){
          System.out.println( accessibilityFilterResponse.getData().get(i).getTitle() );
      }

    }
}
