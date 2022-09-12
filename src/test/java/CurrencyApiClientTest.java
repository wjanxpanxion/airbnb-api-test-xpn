import clients.currency.CurrencyApiClient;
import clients.currency.response.CurrencyResponse;
import clients.currency.response.Datum;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CurrencyApiClientTest {

    @Test
    public void shouldBeAbleToGetCurrencyCodeMatchingUSDollars() {

        CurrencyApiClient currencyApiClient = new CurrencyApiClient();
        CurrencyResponse currencyResponse = currencyApiClient.getCurrencyApiClient();

        List<Datum> data = currencyResponse.getData();

        for (int i = 0; i < data.size(); i++) {

            if (data.get(i).getSymbol().equals("$") && data.get(i).getIsEligibleForGuest().equals(true)) {

                if (! data.get(i).getLocalizedFullName().equals("United States dollar")) {
                    System.out.println("\n"+ data.get(i).toString());
                }
            }
        }


    }
}
