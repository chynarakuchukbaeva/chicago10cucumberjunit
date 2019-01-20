package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditerPage;
import utilities.Driver;

import javax.annotation.Generated;

public class Editer_steps {
    EditerPage edi= new EditerPage();
    @Given("user in editer homepage")
    public void user_in_editer_homepage() {
        Driver.getDriver().get("https://editor.datatables.net");

    }

    @Given("user clicks to new button")
    public void user_clicks_to_new_button() {
        edi.newBox.click();

    }

    @Then("user should see create new entry box")
    public void user_should_see_create_new_entry_box() {
        edi.createPage.isDisplayed();


    }

    @Then("user should enter firstname")
    public void user_should_enter_firstname() {
        edi.firstname.sendKeys("Chynara");

    }

    @Then("user should enter lastname")
    public void user_should_enter_lastname() throws InterruptedException {
        Thread.sleep(1000);
        edi.lastname.sendKeys("Kuchukbaeva");


    }

    @Then("user should enter positon")
    public void user_should_enter_positon() {
        edi.position.sendKeys("QA");

    }

    @Then("user should enter office")
    public void user_should_enter_office() {
        edi.office.sendKeys("Chicago");

}

    @Then("user should enter extension")
    public void user_should_enter_extension() {
        edi.extension.sendKeys("14");

    }

    @Then("user should enter start date")
    public void user_should_enter_start_date() throws InterruptedException {
        Thread.sleep(1000);
        edi.startDate.sendKeys("2019-01-12");

    }

    @Then("user should enter salary")
    public void user_should_enter_salary() {
        edi.salary.sendKeys("4000");

    }

    @Then("user clicks create button")
    public void user_clicks_create_button() throws InterruptedException {
        edi.createBtn.click();


    }



    @Then("user should see first name is inserted to the table")
    public void user_should_see_first_name_is_inserted_to_the_table()  {
        String t=edi.data.getText();
        Assert.assertTrue(t.contains("Chynara"));




    }
    @Then("user should enter firstname {string}")
    public void user_should_enter_firstname(String firstname) {
        edi.firstname.sendKeys(firstname);


    }

    @Then("user should enter lastname {string}")
    public void user_should_enter_lastname(String lastname) {
    edi.lastname.sendKeys(lastname);
    }

    @Then("user should enter positon {string}")
    public void user_should_enter_positon(String position) {
        edi.position.sendKeys(position);

    }

    @Then("user enters {string} to search box")
    public void user_enters_to_search_box(String name) {
        edi.newBox.sendKeys(name);

    }

    @Then("user should see firstname {string} inserted to data")
    public void user_should_see_firstname_inserted_to_data(String name) {
        String t=edi.data.getText();
        Assert.assertTrue(t.contains(name));




    }
    @Then("user should enter office {string}")
    public void user_should_enter_office(String office) {
        edi.office.sendKeys(office);

    }

    @Then("user should enter extension {string}")
    public void user_should_enter_extension(String extension) {
        edi.extension.sendKeys(extension);

    }

    @Then("user should enter start date {string}")
    public void user_should_enter_start_date(String startDate) {
        edi.startDate.sendKeys(startDate);

    }

    @Then("user should enter salary {string}")
    public void user_should_enter_salary(String salary) {
        edi.salary.sendKeys(salary);


    }
    @Then("user should enter {string}")
    public void user_should_enter(String name) {

    }

    @Then("user should enter firstname {string} to search box")
    public void user_should_enter_firstname_to_search_box(String name ) {

    }

    @Then("user should see firstname  {string} is inserted to the table")
    public void user_should_see_firstname_is_inserted_to_the_table(String string) {

    }







}
