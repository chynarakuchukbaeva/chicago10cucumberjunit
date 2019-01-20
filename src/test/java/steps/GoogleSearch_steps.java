package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearch_steps {
    GooglePage google= new GooglePage();

    @Given("User is on the homepage of google")
    public void user_is_on_the_homepage_of_google() {
        Driver.getDriver().get("https://google.com");

    }

    @When("User enters {string}")

    public void user_enters(String sendText) {
        google.searchBox.sendKeys(sendText);
        google.searhButton.click();


    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }




}
