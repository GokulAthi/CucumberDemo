package stepdefinitions;

import businessfunctions.GoogleFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends GoogleFunctions {

    @Given("Google site is opened")
    public void google_site_is_opened() {
        openGoogleSite();
    }

    @When("User searches for {string} keyword")
    public void user_searches_for_keyword(String string) {
        searchGoogleWithKeyword(string);
    }

    @Then("Search results display for {string}")
    public void search_results_display_for(String string) {
        verifySearchResults(string);
    }
}
