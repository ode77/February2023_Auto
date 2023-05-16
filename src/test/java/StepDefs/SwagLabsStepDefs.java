package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.ConfigReader;

import java.io.IOException;
import java.time.Duration;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SwagLabsStepDefs extends BaseUtil {
    private BaseUtil base;

    public void initPages() {

    }

    public SwagLabsStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the swaglab home page {string}")
    public void i_am_on_the_swaglab_home_page(String url) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get(url);
}

    @Given("I am on the swaglab home page")
    public void iAmOnTheSwaglabHomePage() throws IOException {
//        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getSwagLab_Url());
    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.enterUserName("standard_user");
        swagLabHomePage.enterPassword("secret_sauce");
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.clickOnLoginButton();
//        WebElement loginButton = driver.findElement(By.id("//input[@id='login-button']"));
//        loginButton.sendKeys(Keys.ENTER);

    }

    @When("I click on the first item on the Products page")
    public void i_click_on_the_first_item_on_the_products_page() {
//        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        SwagLabProductsPage swagLabProductsPage = new SwagLabProductsPage(base.driver);
        swagLabProductsPage.clickOntheFirstProduct();
    }

    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        InventoryItemPage inventoryItemPage = new InventoryItemPage(base.driver);
        inventoryItemPage.clickOntheAddToCart();

    }

    @When("I click on Shopping cart")
    public void i_click_on_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        InventoryItemPage inventoryItemPage = new InventoryItemPage(base.driver);
        inventoryItemPage.clickOntheShoppingCart();
    }

    @When("I click on Checkout")
    public void i_click_on_checkout() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabYourCartIPage yourCartIPage = new SwagLabYourCartIPage(base.driver);
        yourCartIPage.clickOnCheckoutButton();
    }

    @When("I complete all the required fields")
    public void i_complete_all_the_required_fields() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.enterFirstname("sheyi");
        checkoutPage.enterLastname("odeleye");
        checkoutPage.enterPostalcode("k32");
//        ConfigReader configReader = new ConfigReader();
//        checkoutPage.enterFirstname(configReader.getFirstName());
//        checkoutPage.enterLastname(configReader.getLastName());
//        checkoutPage.enterPostalcode(configReader.getPostCode());
    }

    @When("I clicked on Continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.clickOnContinueButton();
    }

    @When("I click on Finish button")
    public void i_click_on_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        OverviewPage overviewPage = new OverviewPage(base.driver);
        overviewPage.clickOnFinishButton();
    }

    @Then("{string} message is displayed on the order confirmation page")
    public void message_is_displayed_on_the_order_confirmation_page(String msg) {
        // Write code here that turns the phrase above into concrete actions
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(base.driver);
        String actualResult = checkoutCompletePage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(msg), is(true));
    }


    @And("I enter details for only firstname and lastname")
    public void iEnterDetailsForOnlyFirstnameAndLastname() throws IOException {
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.enterFirstname("sheyi");
        checkoutPage.enterLastname("odeleye");
//        ConfigReader configReader = new ConfigReader();
//        checkoutPage.enterFirstname(configReader.getFirstName());
//        checkoutPage.enterLastname(configReader.getLastName());
    }

    @Then("error msg {string} is displayed under Postcode field")
    public void errorMsgIsDisplayedUnderPostcodeField(String msg) {
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        String actualResult = checkoutPage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(msg), is(true));
    }

    @And("I enter details for only lastname and postcode")
    public void iEnterDetailsForOnlyLastnameAndPostcode() throws IOException {
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.enterLastname("odeleye");
        checkoutPage.enterPostalcode("k32");
//        ConfigReader configReader = new ConfigReader();
//        checkoutPage.enterLastname(configReader.getLastName());
//        checkoutPage.enterPostalcode(configReader.getPostCode());


    }

    @Then("error msg {string} is displayed under firstname field")
    public void errorMsgIsDisplayedUnderFirstnameField(String msg) {
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        String actualResult = checkoutPage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(msg), is(true));
    }

    @And("I enter details for only firstname and postcode")
    public void iEnterDetailsForOnlyFirstnameAndPostcode() throws IOException {
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.enterFirstname("sheyi");
        checkoutPage.enterPostalcode("k32");
//        ConfigReader configReader = new ConfigReader();
//        checkoutPage.enterFirstname(configReader.getFirstName());
//        checkoutPage.enterPostalcode(configReader.getPostCode());

    }

    @Then("error msg {string} is displayed under lastname field")
    public void errorMsgIsDisplayedUnderLastnameField(String msg) {
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        String actualResult = checkoutPage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(msg), is(true));
    }

    @When("I enter valid username")
    public void iEnterValidUsername() {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.enterUserName("standard_user");

    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword() {
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.enterWrongPassWord("standard");


    }

//    @Then("error message is displayed and I am not logged in")
//    public void errorMessageIsDisplayedAndIAmNotLoggedIn(String pWordDoNotMatch ) {
//        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
////        String actualResult =
////                swagLabHomePage.getErrorMessage(pWordDoNotMatch);
////        assertThat(actualResult.equalsIgnoreCase(msg), equalTo(true));
//        assertThat(swagLabHomePage.getErrorMessage().contains(pWordDoNotMatch),equalTo(true));
//  }
    @And("{int} item is added to the cart")
    public void itemIsAddedToTheCart(int arg0) {
        SwagLabYourCartIPage swagLabYourCartIPage = new SwagLabYourCartIPage(base.driver);
        swagLabYourCartIPage.itemOnChart();

}
    @And("I click remove item button")
    public void iClickRemoveItemButton() {
        SwagLabYourCartIPage swagLabYourCartIPage = new SwagLabYourCartIPage(base.driver);
        swagLabYourCartIPage.clickOnRemoveItem();
    }


}


