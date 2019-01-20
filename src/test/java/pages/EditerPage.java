package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditerPage {
    WebDriver driver;
    public EditerPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newBox;
    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstname;
    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastname;
    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;
    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;
    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extension;
    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;
    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createBtn;
    @FindBy(xpath = "//div[@class='DTE_Body']")
    public WebElement createPage;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchFirstname;
    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement data;



}
