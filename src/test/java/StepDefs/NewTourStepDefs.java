package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewTourConfirmationPage;
import pages.NewTourFlightFinderPage;
import pages.NewTourHomePage;
import pages.NewTourRegisterPage;
import utilities.ConfigReader;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewTourStepDefs extends BaseUtil {
    private BaseUtil base;

    public NewTourStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Newtours website")
    public void i_am_on_the_newtours_home_page() throws IOException {
        base.driver.manage().window().maximize();
//        base.driver.get("https://demo.guru99.com/selenium/newtours");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getNewTour_Url());

    }
    @When("I click on the Register link")
    public void i_click_on_register_links() {
        NewTourHomePage newTourHomePage = new NewTourHomePage(base.driver);
        newTourHomePage.clickOnRegisterButton();
    }
    @When("I populate all the the mandatory field {string}, {string}, {string},{string},{int} brega\", \"Balbriggan\", \"Dublin\",\"K32FK1\"")
    public void i_populate_all_the_the_mandatory_field_brega_balbriggan_dublin_k32fk1(String string, String string2, String string3, String string4, Integer int1) {
        NewTourRegisterPage newTourRegisterPage = new NewTourRegisterPage(base.driver);
        newTourRegisterPage.enterFirstName();
        newTourRegisterPage.enterLastName();
        newTourRegisterPage.enterPhoneNumber();
        newTourRegisterPage.enterEmailaddress();
        newTourRegisterPage.enterAddress();
        newTourRegisterPage.enterCity();
        newTourRegisterPage.enterState();
        newTourRegisterPage.enterPostCode();

    }
    @When("I enter {string}, password and confirm as {string}")
    public void i_enter_username_as_password_and_confirm_password_as(String uName, String pWord) {
        NewTourRegisterPage newTourRegisterPage = new NewTourRegisterPage(base.driver);
        newTourRegisterPage.enterUserName(uName);
        newTourRegisterPage.enterPasswordLocator(pWord);
        newTourRegisterPage.enterConfirmPwdLocator(pWord);
    }
    @And("I enter {string}")
    public void iEnter(String countryNme) {
        NewTourRegisterPage newTourRegisterPage = new NewTourRegisterPage(base.driver);
        newTourRegisterPage.CountryName(countryNme);
    }

    @When("I click submit button")
    public void i_click_on_submit_button() {
        NewTourRegisterPage newTourRegisterPage = new NewTourRegisterPage(base.driver);
        newTourRegisterPage.clickOnSubmitButton();
    }
    @Then("confirmation page is displayed with my {string}")
    public void the_confirmation_page_is_displayed_with_the_username_as(String odex77) {
        NewTourConfirmationPage newTourConfirmationPage = new NewTourConfirmationPage(base.driver);
        assertThat(newTourConfirmationPage.getNoteText().contains(odex77),equalTo(true));

    }

    @When("I click on the Flights link on the left side menu")
    public void i_click_on_the_flights_link_on_the_left_side_menu() {
        NewTourHomePage newTourHomePage = new NewTourHomePage(base.driver);
        newTourHomePage.clickOnFlightButton();
    }
    @Then("The Flight Finder Page should be displayed")
    public void the_flight_finder_page_should_be_displayed() {
        NewTourFlightFinderPage newTourFlightFinderPage = new NewTourFlightFinderPage(base.driver);
        assertThat(newTourFlightFinderPage.IsFlightDetailsPageDisplayed(),equalTo(true));

    }
    @Then("{string} Flight details type is selected by default")
    public void flight_details_type_is_selected_by_default(String string) {
        NewTourFlightFinderPage newTourFlightFinderPage = new NewTourFlightFinderPage(base.driver);
        assertThat(newTourFlightFinderPage.IsRoundTripSelected(),equalTo(true));

    }
    @Then("{string} should be displayed by default for On and returning")
    public void should_be_displayed_by_default_for_on_and_returning(String string) {
        NewTourFlightFinderPage newTourFlightFinderPage = new NewTourFlightFinderPage(base.driver);
        assertThat(newTourFlightFinderPage.GetDefaultFromMonth(),equalTo("July"));
        assertThat(newTourFlightFinderPage.GetDefaultFromDay(),equalTo("12"));


    }
    @Then("{string} should be selected as default for the Service class")
    public void should_be_selected_as_default_for_the_service_class(String string) {
        NewTourFlightFinderPage newTourFlightFinderPage = new NewTourFlightFinderPage(base.driver);
        assertThat(newTourFlightFinderPage.IsEconomyClassSelectedByDefault(),equalTo(true));



    }



}

