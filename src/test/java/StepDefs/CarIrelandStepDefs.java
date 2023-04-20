package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import pages.CarIrelandCookiesPage;
import pages.CarIrelandLandingPage;
import pages.CarIrelandRegisterPage;
import pages.CarIrelandTermsConPage;

import java.util.Random;

public class CarIrelandStepDefs extends BaseUtil {
    private BaseUtil base;

    public CarIrelandStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on CarIreland home page")
    public void i_am_on_car_ireland_home_page()  {
        base.driver.manage().window().maximize();
        base.driver.get("https://my.carsireland.ie/");
//        Thread.sleep(4000);
    }
    @When("I click on Agree and Close Cookies link")
    public void i_click_on_agree_and_close_cookies_link() {
        CarIrelandCookiesPage carIrelandCookiesPage = new CarIrelandCookiesPage(base.driver);
        carIrelandCookiesPage.clickOnCookiesButton();

    }
    @And("I click on Not a Member Register link")
    public void i_click_on_not_a_member_register_link() {
        CarIrelandLandingPage carIrelandLandingPage = new CarIrelandLandingPage(base.driver);
        carIrelandLandingPage.clickOnRegisterButton();

    }
    @And("I populate all the the mandatory field {string}, {string}, {string}, {string}")
    public void i_populate_all_the_the_mandatory_field(String firstname, String lastname, String eMail, String pWord) {
        CarIrelandRegisterPage carIrelandRegisterPage = new CarIrelandRegisterPage(base.driver);
        carIrelandRegisterPage.enterFirstName(firstname);
        carIrelandRegisterPage.enterLastName();
        carIrelandRegisterPage.enterEmailAddress(generateRandomEmail()+eMail);
        carIrelandRegisterPage.enterPassWord();
        carIrelandRegisterPage.enterReEnterPassWord(pWord);
    }
    private String generateRandomEmail(){
        return RandomStringUtils.random(4, true, true) + "@GMAIL.COM";
    }
    @And("I click on have read and agree to the Terms and Privacy Policy link")
    public void i_click_on_have_read_and_agree_to_the_terms_and_privacy_policy_link() {
       CarIrelandRegisterPage carIrelandRegisterPage = new CarIrelandRegisterPage(base.driver);
       carIrelandRegisterPage.clickOnCheckTermsButton();


    }
    @And("I click on Submit button")
    public void i_click_on_submit_button() {

    }
    @Then("Your Registration is successful")
    public void your_registration_is_successful() {

    }

}
