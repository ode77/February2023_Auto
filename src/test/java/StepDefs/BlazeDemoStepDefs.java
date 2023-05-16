package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utilities.ConfigReader;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BlazeDemoStepDefs extends BaseUtil {
    private BaseUtil base;

    public BlazeDemoStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Welcome to Simple Travel Agency Landing page")
    public void i_am_on_the_welcome_to_simple_travel_agency_landing_page() throws IOException {
        base.driver.manage().window().maximize();
//        base.driver.get("https://blazedemo.com/");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getBlazeDemo_Url());
    }
    @When("I choose the {string} and {string} from the drop menu")
    public void i_choose_the_and_from_the_drop_menu(String departureCity, String destinationCity) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//option[@value = 'Boston']")).click();
        base.driver.findElement(By.xpath("//option[@value='Rome']")).click();
        base.driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    @Then("I should be able to see {string} and {string} on the BladeDemo reserve page and {int} flights options")
    public void i_should_be_able_to_see_and_on_the_blade_demo_reserve_page_and_flights_options(String string, String string2, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(base.driver.findElement(By.xpath("//th[contains(text(),\"Departs: Boston\")]")).isDisplayed(),is(true));
        assertThat(base.driver.findElement(By.xpath("//th[contains(text(),\"Arrives: Rome\")]")).isDisplayed(),is(true));
    }

}


