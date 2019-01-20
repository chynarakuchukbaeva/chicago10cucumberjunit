package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.Driver;

import java.awt.*;

public class Wiki_steps {
    WikipediaPage wiki= new WikipediaPage();

    @Given("user is on wikipedia homepage")
    public void user_is_on_wikipedia_homepage() {
        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("user enters steve jobs to search bar and clicks enter")
    public void user_enters_steve_jobs_to_search_bar_and_clicks_enter() {
        wiki.searchBoxw.sendKeys("Steve Jobs"+ Keys.ENTER);


    }

    @Then("user should see the first header  id displaying steve jobs")
    public void user_should_see_the_first_header_id_displaying_steve_jobs() {
        //String steve=Driver.getDriver().getTitle();
        Assert.assertTrue("steve not here",wiki.header.getText().equals("Steve Jobs"));

    }

}
