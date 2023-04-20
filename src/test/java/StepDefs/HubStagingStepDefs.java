package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.HubStagingLoginPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HubStagingStepDefs extends BaseUtil {
    private BaseUtil base;

    public HubStagingStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the hub home page {string}")
    public void iAmOnTheHubHomePage(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get("https://hub-staging.tissl.com/login?returnUrl=%2Fhome");
    }
//    @Given("I am on the hub home page")
//    public void i_am_on_the_hub_home_page() {
//       assertThat(base.driver.findElement(By.xpath("//img[@class='logo ng-tns-c71-0']")).isDisplayed(), is(true));
//    }
    @Given("I enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String pwrd) {
        HubStagingLoginPage hubStagingLoginPage = new HubStagingLoginPage(base.driver);
        hubStagingLoginPage.enterUserName(username);
        hubStagingLoginPage.enterPassword(pwrd);
    }

    @Given("I click on the log in button")
    public void i_click_on_the_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
   }

    @Given("I click on select your {string}")
    public void i_click_on_select_your(String string) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
    }


}
