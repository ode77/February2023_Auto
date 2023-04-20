package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NopCommerceStepDefs extends BaseUtil {
    private BaseUtil base;

    public NopCommerceStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on Nopcommerce home page")
    public void i_am_on_nopcommerce_home_page() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get("https://demo.nopcommerce.com");
//        base.driver.navigate().to("https://demo.nopcommerce.com");
    }
    @When("I click on Register link")
    public void i_click_on_register_link() {
        // Write code here that turns the phrase above into concrete actions
//        WebElement registerButton;
//        registerButton = base.driver.findElement(By.xpath("//a[@class='ico-register']"));
//        registerButton.click();
        base.driver.findElement(By.xpath("//a[@class='ico-register']")).click();
    }
    @When("I populate only the the mandatory field firstname as {string}, lastname as {string}, email as {string}, password and ConfirmPassword as {string}")
    public void i_populate_only_the_the_mandatory_field_firstname_as_lastname_as_email_as_password_and_confirm_password_as(String fName, String lName, String email, String PWord) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        WebElement FirstName = base.driver.findElement(By.id("FirstName"));
//        FirstName.sendKeys(fName);
        base.driver.findElement(By.id("FirstName")).sendKeys(fName);
        base.driver.findElement(By.id("LastName")).sendKeys(lName);
        base.driver.findElement(By.id("Email")).sendKeys(rNumber() +email);
        Thread.sleep(4000);
        base.driver.findElement(By.id("Password")).sendKeys(PWord);
        base.driver.findElement(By.id("ConfirmPassword")).sendKeys(PWord);


    }

    private static int rNumber() {
        Random ran = new Random();
        int rNum = ran.nextInt(1000);
        return rNum;
    }

    @When("I click on register button")
    public void i_click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.id("register-button")).click();


    }
    @Then("registration is successful")
    public void registration_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(base.driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed(), is(true));
    }

    @And("I populate day as {string}, month as {string}, year as {string} and company as {string}")
    public void iPopulateDayAsMonthAsYearAsAndCompanyAs(String day, String month, String year, String company){

        Select sDay = new Select(base.driver.findElement(By.cssSelector("select[name='DateOfBirthDay']")));
        sDay.selectByVisibleText(day);

        Select sMonth = new Select(base.driver.findElement(By.cssSelector("select[name='DateOfBirthMonth']")));
        sMonth.selectByVisibleText(month);

        Select sYear = new Select(base.driver.findElement(By.cssSelector("select[name='DateOfBirthYear']")));
        sYear.selectByVisibleText(year);

        base.driver.findElement(By.id("Company")).sendKeys(company);
    }


}
