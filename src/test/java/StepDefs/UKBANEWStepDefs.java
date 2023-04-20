package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UKBANEWStepDefs extends BaseUtil {
    private BaseUtil base;
    public UKBANEWStepDefs(BaseUtil base){
        this.base = base;
    }
    @Given("I am on the UKBANew website")
    public void i_am_on_the_ukba_new_website() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");
    }
    @When("I choose {string} nationality")
    public void i_choose_nationality(String Japan) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//select[@id='response']"));

    }
    @When("I press on Continue button")
    public void i_press_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
    }
    @When("I select {string} as reason for coming to the Uk")
    public void i_select_as_reason_for_coming_to_the_uk(String string) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@id='response-2']")).click();
    }
    @When("I choose option of Longer than {int} months")
    public void i_choose_option_of_longer_than_months(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.cssSelector("#response-1")).click();
    }
    @When("I submit the form")
    public void i_submit_the_form() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
    }
    @Then("I should informed that {string}")
    public void i_should_informed_that(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'You’ll need a visa to study in the UK')]")).isDisplayed(),is(true));
    }


    @And("I choose {string} for visting partner or family member question")
    public void iChooseForVistingPartnerOrFamilyMemberQuestion(String yesOrNo) {
        base.driver.findElement(By.cssSelector("#response-1")).click();
//        base.driver.findElement(By.xpath("//input[@value=' " + yesOrNo +" ']")).click();

    }
}
