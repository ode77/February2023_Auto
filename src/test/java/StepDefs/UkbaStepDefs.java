package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UkbaStepDefs extends BaseUtil {
    private BaseUtil base;

    public UkbaStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on {string}")
    public void i_am_on(String url_UKBA) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get(url_UKBA);
    }
    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        // Write code here that turns the phrase above into concrete actions
        Select select = new Select(base.driver.findElement(By.id("response")));
        select.selectByVisibleText(countryName);
    }
    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
    }
    @When("I select reason as {string}")
    public void i_select_reason_as(String Study) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@value='study']")).click();

    }
    @When("I state I intend to stay for more than {int} months")
    public void i_state_i_intend_to_stay_for_more_than_months(Integer int1) {
        base.driver.findElement(By.xpath("//label[contains(text(),'longer than 6 months')] ")).click();
    }
    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String msg) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'You’ll need a visa to study in the UK')]")).isDisplayed(),is(true));
//     assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'" + msg  +  "')]")).isDisplayed(),is(true));

    }
    @Given("I select the reason as {string}")
    public void i_select_the_reason_as(String Tourism) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//label[@for='response-0']")).click();
    }
    @Given("I select {string} button for travelling with or visiting partner or family member")
    public void i_select_button_for_travelling_with_or_visiting_partner_or_family_member(String string) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@value='yes']")).click();
    }
    @Then("I will be informed {string}")
    public void i_will_be_informed(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'You’ll usually need a visa to come to the UK')]")).isDisplayed(),is(true));
    }
//    @Then("I provide a nationality of {string}")
//    public void i_provide_a_nationality_of(String USA) {
//        // Write code here that turns the phrase above into concrete actions
////        Select select = new Select(base.driver.findElement(By.id("response")));
////        select.selectByVisibleText(USA);
//        assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'You will not need a visa to come to the UK')]")).isDisplayed(),is(true));
//    }
}
