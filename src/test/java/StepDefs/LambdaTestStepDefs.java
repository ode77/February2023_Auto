package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaTestStepDefs extends BaseUtil {
    private BaseUtil base;

    public LambdaTestStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on LambdaTest home page")
    public void i_am_on_lambda_test_home_page() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
//        base.driver.get("https://ecommerce-playground.lambdatest.io/");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getLambdaTest_Url());
    }

    @Given("I click on Register button link")
    public void i_click_on_register_button_link() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//header/div[@id='main-navigation']/div[@id='entry_217831']/div[1]/div[3]/nav[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/span[1]")).click();
    }

    @And("I click new customer continue link")
    public void iClickNewCustomerContinueLink() {
        base.driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
    }

    @And("I populate all the the mandatory field {string}, {string}, {string},{string}, {string}")
    public void i_populate_all_the_the_mandatory_field_firstname_as_lastname_as_email_as_telephone_number_as_password_and_cofirm_password_as(String fName, String lName, String email, String tphone, String pWord) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(fName);
        base.driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lName);
        base.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(pNumber() + email);
//        base.driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(generateRandomEmail);
        base.driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(tphone);
        base.driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pWord);
        base.driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(pWord);
    }

    static int pNumber() {
        Random ran = new Random();
        return ran.nextInt(1000);
    }

    @And("I click on have read and agree to the Privacy Policy link")
    public void iClickOnHaveReadAndAgreeToThePrivacyPolicyLink() {
        base.driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]")).click();

    }

    @And("I click on registered button")
    public void i_click_on_registered_button() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();
    }
//    private String generateRandomEmail(){
//        return RandomStringUtils.random(4, true, true) + "@GMAIL.COM";
//    }

    @Then("Your Account has been Created")
    public void your_account_has_been_created() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(base.driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/div[1]/h1[1]")).isDisplayed(), is(true));
    }


    @When("I click on Home link")
    public void i_click_on_shop_by_category_link() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();

    }

    @When("I click on linux link")
    public void i_click_on_software_link() {
        // Write code here that turns the phrase above into concrete actions
//       base.driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/figure[1]/div[1]/img[1]")).click();
        base.driver.findElement(By.xpath("//a[@title='Lumix S Series From Panasonic']//div[@class='hover-effect hover-effect-2']")).click();
    }



}
