package clients.propertydetails.propertyreviews;

import clients.Constants;
import clients.propertydetails.propertydetails.response.PopertyDetailsWithoutPropertyID;
import clients.propertydetails.propertyreviews.response.PopertyReviewWithInvalidUseCase;
import clients.propertydetails.propertyreviews.response.PropertyReviewApiResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static io.restassured.RestAssured.given;

public class PropertyReviewApiClient {


    public PropertyReviewApiResponse getPropertyReviewApiClient(String propertyID) {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("propertyId", propertyID)
                .get(Constants.BASEURL + Constants.GETPROPERTYREVIEWSENDPOINT);

//        response.prettyPrint();

        Gson gson = new Gson();
        PropertyReviewApiResponse propertyReviewApiResponse = gson.fromJson(response.asString(), PropertyReviewApiResponse.class);
        return propertyReviewApiResponse;

    }


    public void getPersonNameStartingWithMAndWhoRated5(PropertyReviewApiResponse propertyReviewApiResponse) {

        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {
            if (propertyReviewApiResponse.getData().get(i).getRating() == 5) {

                String names = propertyReviewApiResponse.getData().get(i).getReviewer().getFirstName();
                if (names.substring(0, 1).equals("M")) {
                    System.out.println(propertyReviewApiResponse.getData().get(i).getReviewer().getFirstName());
                }
            }
        }
    }


    public void getCommentsOfPersonWhoRated4(PropertyReviewApiResponse propertyReviewApiResponse) {

        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {
            if (propertyReviewApiResponse.getData().get(i).getRating() == 4) {
                String comments = propertyReviewApiResponse.getData().get(i).getComments();
                System.out.println(comments);
            }
        }
    }


    public void getSpecificWordFromComments(PropertyReviewApiResponse propertyReviewApiResponse) {

        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {
            if (propertyReviewApiResponse.getData().get(i).getRating() == 4) {
                String comments = propertyReviewApiResponse.getData().get(i).getComments();
                if (comments.toLowerCase().contains("enjoyed") || comments.toLowerCase().contains("good") || comments.toLowerCase().contains("loved")) {
                    System.out.println("Premier property");
                }
            }
        }
    }


    public void getAllReviewsMadeInJuly2022(PropertyReviewApiResponse propertyReviewApiResponse) {

        int count = 0;
        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {
            String comments = "";
            if (propertyReviewApiResponse.getData().get(i).getLocalizedDate().equals("July 2022")) {
                count++;
            }
        }
        System.out.println("\nNumber of reviews in July 2022: " + count);

        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {
            String comments = "";
            if (propertyReviewApiResponse.getData().get(i).getLocalizedDate().equals("July 2022")) {
                comments = propertyReviewApiResponse.getData().get(i).getComments();
            }
            System.out.println("\n" + comments + "\n");
        }
    }


    public void getImageOfPropertyWhichReviewerRated5(PropertyReviewApiResponse propertyReviewApiResponse) {

        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {

            String image = "";

            if (propertyReviewApiResponse.getData().get(i).getRating() == 5) {
                image = propertyReviewApiResponse.getData().get(i).getReviewee().getPictureUrl();
            }
            System.out.println("\ni" + image + "\n");
        }
    }


    public String getMaximumReviewMonth(PropertyReviewApiResponse propertyReviewApiResponse) {

        String maxOccured = "";

        ArrayList<String> months = new ArrayList<>();
        for (int i = 0; i < propertyReviewApiResponse.getData().size() - 1; i++) {
            months.add(propertyReviewApiResponse.getData().get(i).getLocalizedDate());
        }

        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < months.size(); i++) {
            if (!unique.contains(months.get(i))) {
                unique.add(months.get(i));
            }
        }

        String output = "";
        for (int z = 0; z < unique.size(); z++) {
            String month = unique.get(z);
            int count = 0;
            for (int x = 0; x < months.size(); x++) {
                String m = months.get(x);
                if (m.equals(month)) {
                    count++;
                }
            }
            output += month + "," + count + ",";
        }

        String[] outputArr = output.split(",");

        ArrayList<String> outputArrList = new ArrayList<>();
        outputArrList.addAll(Arrays.asList(outputArr));

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < outputArrList.size(); i++) {
            if (i % 2 != 0) {
                num.add(Integer.valueOf(outputArrList.get(i)));
            }
        }

        Collections.sort(num);
        int max = Collections.max(num);

        maxOccured = String.valueOf(max);

        return "maximum reviews " + max + " times occured in the month of: " + outputArrList.get(outputArrList.indexOf(maxOccured) - 1);

    }



    public PopertyReviewWithInvalidUseCase getPropertyWithInvalidPropertyId(String propertyId){

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .queryParam("propertyId", propertyId)
                .get(Constants.BASEURL + Constants.GETPROPERTYREVIEWSENDPOINT);

        Gson gson = new Gson();
        PopertyReviewWithInvalidUseCase popertyReviewWithInvalidUseCase = gson.fromJson(response.asString(), PopertyReviewWithInvalidUseCase.class);

        return popertyReviewWithInvalidUseCase;
    }

}