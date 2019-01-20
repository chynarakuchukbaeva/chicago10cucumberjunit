package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubePage;
import utilities.Driver;

import java.security.Key;

public class Youtube_steps {
    YoutubePage you = new YoutubePage();

    @Given("User is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://www.youtube.com");

    }

    @Then("user should be able to see search box")
    public void user_should_be_able_to_see_search_box() throws InterruptedException {
        Thread.sleep(2000);

        Assert.assertTrue(you.searchBox.isDisplayed());


    }

    @Then("User should be able to see the search button")
    public void user_should_be_able_to_see_the_search_button() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(you.searchButton.isDisplayed());

    }

    @When("user searches for funny cat videos")
    public void user_searches_for_funny_cat_videos() throws InterruptedException {
        Thread.sleep(2000);
        you.searchBox.sendKeys("funny cat videos" + Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("user should be able to see results of funny cats video")
    public void user_should_be_able_to_see_results_of_funny_cats_video() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("cat videos"));

    }

    @Then("user should be able to see results of funny pet video")
    public void user_should_be_able_to_see_results_of_funny_pet_video() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(" pet videos"));

    }


    @Then("^user should be able to see results of funny dog video$")
    public void userShouldBeAbleToSeeResultsOfFunnyDogVideo() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("dog videos"));

    }

    @When("^user searches for funny pet videos$")
    public void userSearchesForFunnyPetVideos() throws InterruptedException {
        Thread.sleep(2000);
        you.searchBox.sendKeys("funny pet videos"+Keys.ENTER);
        Thread.sleep(2000);
    }

    @When("user searches for funny dog videos")
    public void user_searches_for_funny_dog_videos() throws InterruptedException {
        Thread.sleep(2000);
        you.searchBox.sendKeys("funny dog videos"+Keys.ENTER);
        Thread.sleep(2000);
    }


    }

