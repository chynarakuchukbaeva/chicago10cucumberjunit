package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class google_stepDefs {
    GooglePage googlePage= new GooglePage();
    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("http://google.com");

    }

    @Given("user enters flowers")
    public void user_enters_flowers() {
        googlePage.searchBox.sendKeys("flowers");

    }

    @Given("user clicks search button")
    public void user_clicks_search_button() {
        googlePage.searhButton.click();

    }

    @Then("user should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue("Keyword was not located in title",title.contains("flowers"));

    }



}
