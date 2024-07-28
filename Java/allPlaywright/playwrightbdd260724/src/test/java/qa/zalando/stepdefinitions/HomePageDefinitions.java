package qa.zalando.stepdefinitions;

import io.cucumber.java.en.Given;


public class HomePageDefinitions {
    @Given("the user is in the page {string}")
    public void the_user_is_in_the_home_page(String message) {

        System.out.println("I am here : " + message);
    }


}
