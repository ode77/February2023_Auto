package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoExerciseStepdefs extends BaseUtil {
    private BaseUtil base;

    public AutoExerciseStepdefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page()  {
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        base.driver.get("https://automationexercise.com/");


    }

    @Then("I Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        AutoExerciseHomePage autoExerciseHomePage = new AutoExerciseHomePage(base.driver);
        assertThat(autoExerciseHomePage.IsHomePageDisplayed(), equalTo(true));

    }

    @Then("Click on {string} button")
    public void click_on_button(String string) {
        AutoExerciseHomePage autoExerciseHomePage = new AutoExerciseHomePage(base.driver);
        autoExerciseHomePage.setClickOnLoginLocator();

    }

    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        AutoExerciseNewUsersPage autoExerciseNewUsersPage = new AutoExerciseNewUsersPage(base.driver);
        assertThat(autoExerciseNewUsersPage.IsNewUsersPageDisplayed(), equalTo(true));

    }

    @Then("I Enter {string} and {string}")
    public void i_enter_and(String name, String email) {
        AutoExerciseNewUsersPage autoExerciseNewUsersPage = new AutoExerciseNewUsersPage(base.driver);
        autoExerciseNewUsersPage.setEnterUserName();
        autoExerciseNewUsersPage.setEnterEmailAddress(email);


    }

    @Then("Click {string} button")
    public void click_button(String string) {
        AutoExerciseNewUsersPage autoExerciseNewUsersPage = new AutoExerciseNewUsersPage(base.driver);
        autoExerciseNewUsersPage.clickOnSignUpButton();

    }

    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        AutoExerciseEnterAccountInfoPage autoExerciseEnterAccountInfoPage = new AutoExerciseEnterAccountInfoPage(base.driver);
        assertThat(autoExerciseEnterAccountInfoPage.IsAccountInfoPageDisplayed(), equalTo(true));

    }
@When("Fill details: Title, {string} and {string}")
public void fill_details_title_and(String pwrd, String dob) {
        AutoExerciseEnterAccountInfoPage autoExerciseEnterAccountInfoPage = new AutoExerciseEnterAccountInfoPage(base.driver);
        autoExerciseEnterAccountInfoPage.clickOnTitleButton();
        autoExerciseEnterAccountInfoPage.setEnterPassWord(pwrd);
        autoExerciseEnterAccountInfoPage.setEnterDayOfBirth();
        autoExerciseEnterAccountInfoPage.setEnterMonthOfBirth();
        autoExerciseEnterAccountInfoPage.setEnterDayOfBirth();

    }

    @When("Select checkbox {string}")
    public void select_checkbox(String string) {
        AutoExerciseEnterAccountInfoPage autoExerciseEnterAccountInfoPage = new AutoExerciseEnterAccountInfoPage(base.driver);
        autoExerciseEnterAccountInfoPage.clickOnNewsLetterButton();
        autoExerciseEnterAccountInfoPage.clickOnOfferButton();

    }

    @When("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        AutoExerciseEnterAccountInfoPage autoExerciseEnterAccountInfoPage = new AutoExerciseEnterAccountInfoPage(base.driver);
        autoExerciseEnterAccountInfoPage.setEnterFirstName();
        autoExerciseEnterAccountInfoPage.setEnterLastName();
        autoExerciseEnterAccountInfoPage.setEnterCompanyName();
        autoExerciseEnterAccountInfoPage.setEnterAddressName();
        autoExerciseEnterAccountInfoPage.setEnterCountryName();
        autoExerciseEnterAccountInfoPage.setEnterSateName();
        autoExerciseEnterAccountInfoPage.setEnterCityName();
        autoExerciseEnterAccountInfoPage.setEnterZipCodeNumber();
        autoExerciseEnterAccountInfoPage.setEnterMobileNumber();


    }

    @When("Click {string}")
    public void click(String string) {
        AutoExerciseEnterAccountInfoPage autoExerciseEnterAccountInfoPage = new AutoExerciseEnterAccountInfoPage(base.driver);
        autoExerciseEnterAccountInfoPage.clickOnCreateAccountButton();

    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        AutoExerciseAccountCreatedPage autoExerciseAccountCreatedPage = new AutoExerciseAccountCreatedPage(base.driver);
        assertThat(autoExerciseAccountCreatedPage.IsAccountCreatedPageDisplayed(), equalTo(true));

    }

    @Then("Click Continue button")
    public void click_continue_button() {
        AutoExerciseAccountCreatedPage autoExerciseAccountCreatedPage = new AutoExerciseAccountCreatedPage(base.driver);
        autoExerciseAccountCreatedPage.clickOnContinueButton();

    }

    @Given("I Enter correct {string} and {string}")
    public void iEnterCorrectAnd(String email, String arg1) {
        AutoExerciseLoginPage autoExerciseLoginPage = new AutoExerciseLoginPage(base.driver);
        autoExerciseLoginPage.EnterLoginEmailAddress(email);
        autoExerciseLoginPage.setEnterPassWord();
        autoExerciseLoginPage.clickOnLoginButton();
    }

    @And("I Click login button")
    public void iClickLoginButton() {
        AutoExerciseLoginPage autoExerciseLoginPage = new AutoExerciseLoginPage(base.driver);
        autoExerciseLoginPage.clickOnLoginButton();

    }

    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        AutoExerciseLoginPage autoExerciseLoginPage = new AutoExerciseLoginPage(base.driver);
        assertThat(autoExerciseLoginPage.IsLoginPageIsVisible(), equalTo(true));

    }
    @And("Enter incorrect {string} and {string}")
    public void enterIncorrectAnd(String arg0, String arg1) {
        AutoExerciseLoginPage autoExerciseLoginPage = new AutoExerciseLoginPage(base.driver);
        autoExerciseLoginPage.EnterWrongLogEmailAddress();
        autoExerciseLoginPage.wrongEnterPassWord();
        autoExerciseLoginPage.clickOnLoginButton();
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        AutoExerciseLoginPage autoExerciseLoginPage = new AutoExerciseLoginPage(base.driver);
        assertThat(autoExerciseLoginPage.errorMessageIsVisible(),equalTo(true));
        autoExerciseLoginPage.clickOnLoginButton();

    }
    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        AutoExerciseHomePage autoExerciseHomePage = new AutoExerciseHomePage(base.driver);
        assertThat(autoExerciseHomePage.IsUserNameVisible(),equalTo(true));



    }
    @And("Click Logout button")
    public void clickLogoutButton() {
        AutoExerciseLogOutPage autoExerciseLogOutPage = new AutoExerciseLogOutPage(base.driver);
        autoExerciseLogOutPage.clickOnLogOutButton();
    }
    @And("Enter {string} and already registered {string}")
    public void enterAndAlreadyRegistered(String name, String email) {
        AutoExerciseNewUsersPage autoExerciseNewUsersPage = new AutoExerciseNewUsersPage(base.driver);
        autoExerciseNewUsersPage.setEnterUserName();
        autoExerciseNewUsersPage.setEnterEmailAddress(email);
   }
    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        AutoExerciseHomePage autoExerciseHomePage = new AutoExerciseHomePage(base.driver);
        autoExerciseHomePage.clickOnContactButton();
    }
    @Then("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        AutoExerciseContactsPage autoExerciseContactsPage = new AutoExerciseContactsPage(base.driver);
        assertThat(autoExerciseContactsPage.IsGetInTouchPageIsVisible(),equalTo(true));

    }
    @And("Enter {string}, {string}, {string} and {string}")
    public void enter_and(String name, String email, String string3, String string4) {
        AutoExerciseContactsPage autoExerciseContactsPage = new AutoExerciseContactsPage(base.driver);
        autoExerciseContactsPage.setEnterNameLocator();
        autoExerciseContactsPage.EnterEmailAddress();
        autoExerciseContactsPage.EnterSubjectText();
        autoExerciseContactsPage.EnterYouQueryMessages();

    }
    @Then("Click Submit button")
    public void click_submit_button() {
        AutoExerciseContactsPage autoExerciseContactsPage = new AutoExerciseContactsPage(base.driver);
        autoExerciseContactsPage.clickOnSubmitButton();
//        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @And("Click OK button")
    public void click_ok_button() {
        base.driver.switchTo().alert().accept();

    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        AutoExerciseContactsPage autoExerciseContactsPage = new AutoExerciseContactsPage(base.driver);
        assertThat(autoExerciseContactsPage.IsGetSuccessMessageIsVisible(), equalTo(true));
    }
    @And("Click Home button")
    public void clickHomeButton() {
        AutoExerciseContactsPage autoExerciseContactsPage = new AutoExerciseContactsPage(base.driver);
        autoExerciseContactsPage.clickOnHomeButton();


    }
    @Then("verify that landed to home page successfully")
    public void verifyThatLandedToHomePageSuccessfully() {
        AutoExerciseContactsPage autoExerciseContactsPage = new AutoExerciseContactsPage(base.driver);
        assertThat(autoExerciseContactsPage.LandedHomePageIsSuccessful(),equalTo(false));
    }

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        AutoExerciseHomePage autoExerciseHomePage = new AutoExerciseHomePage(base.driver);
        autoExerciseHomePage.clickOnTestCasesButton();

    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully(String TestCases) {
        AutoExerciseHomePage autoExerciseHomePage = new AutoExerciseHomePage(base.driver);
        assertThat(autoExerciseHomePage.UserNavinatedToTestCasesIsSuccessful(),equalTo(true));

    }
    @Then("I Click on {string} button")
    public void i_click_on_button(String string) {
        AutoExerciseProductsPage autoExerciseProductsPage = new AutoExerciseProductsPage(base.driver);
        autoExerciseProductsPage.clickOnProductsButton();

    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        AutoExerciseProductsPage autoExerciseProductsPage = new AutoExerciseProductsPage(base.driver);
        assertThat(autoExerciseProductsPage.ProductsPageIsVisible(),equalTo(true));

    }
    @Then("Click on {string} of first product")
    public void click_on_of_first_product(String string) {
        AutoExerciseProductsPage autoExerciseProductsPage= new AutoExerciseProductsPage(base.driver);
        autoExerciseProductsPage.clickOnViewProductButton();

    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {

    }
    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {

    }

}



