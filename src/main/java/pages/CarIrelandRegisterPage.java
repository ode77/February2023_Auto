package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class CarIrelandRegisterPage extends BasePage{
    public CarIrelandRegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Enter First Name']")
    private WebElement enterFirstNameLocator;
    @FindBy(xpath = "//input[@placeholder='Enter Last Name']")
    private WebElement enterLastNameLocator;
//    @FindBy(xpath = "//label[@for='email_address']")
    @FindBy(xpath = "//form[@class='account-login-wrapper']//input[@placeholder='Enter Email Address']")
    private WebElement enterEmailAddressLocator;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[4]/input[1]")
    private WebElement enterPassWordLocator;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[5]/input[1]")
    private WebElement enterReEnterPassWordLocator;
    @FindBy(xpath = "//input[#'terms']")
    private WebElement clickOnCheckTermsLocator;



    public void enterFirstName(String firstname){
        enterFirstNameLocator.sendKeys("solomon");
    }
    public void enterLastName(){
        enterLastNameLocator.sendKeys("ode");
    }
    public void enterEmailAddress(String email){
        enterEmailAddressLocator.sendKeys("odexsolo99@gmail.com");

    }
    public void enterPassWord(){
        enterPassWordLocator.sendKeys("Yahoo77@");
    }
    public void enterReEnterPassWord(String pWord){
        enterReEnterPassWordLocator.sendKeys("Yahoo77@");
    }
    public void clickOnCheckTermsButton(){
        clickOnCheckTermsLocator.click();
    }
//    private String generateRandomEmail(){
//        return RandomStringUtils.random(4, true, true) + "@GMAIL.COM";
//    }
}

