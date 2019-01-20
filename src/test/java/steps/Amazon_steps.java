package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.Driver;

public class Amazon_steps {
    AmazonPage amazon= new AmazonPage();
    @Given("user in amazon homepage")
    public void user_in_amazon_homepage() {
        Driver.getDriver().get("http://amazon.com");

    }

    @When("user enters headphone keyword")
    public void user_enters_headphone_keyword() {
        amazon.searchBoxA.sendKeys("headphones");


    }

    @When("user clicks to search button")
    public void user_clicks_to_search_button() {
        amazon.button.click();

    }

    @Then("user should see headphones in results")
    public void user_should_see_headphones_in_results() {
        String result=amazon.headphonesText.getText();

        Assert.assertTrue("keyword headphones was not found",result.contains("headphones"));

    }


}
