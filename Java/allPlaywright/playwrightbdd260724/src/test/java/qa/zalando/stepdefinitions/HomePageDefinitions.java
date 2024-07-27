package qa.zalando.stepdefinitions;

import io.cucumber.java.en.Given;


public class HomePageDefinitions {
    @Given("^the user is in the home page$")
    public void the_user_is_in_the_home_page() {
        System.out.println("I am here");
    }


}
