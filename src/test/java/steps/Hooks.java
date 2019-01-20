package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println("This is running before each scenario");

    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("THis is running after each scenario");
    }
}
