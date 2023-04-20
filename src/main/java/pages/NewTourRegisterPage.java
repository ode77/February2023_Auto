package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTourRegisterPage extends BasePage{
    public NewTourRegisterPage(WebDriver driver) {
        super(driver);
   }
   @FindBy(xpath = "//input[@name='firstName']")
   private WebElement enterFirstNameLocator;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement enterLastNameLocator;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement enterPhoneNumberLocator;
    @FindBy(id = "userName")
    private WebElement enterEmailAddressLocator;
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement enterAddressLocator;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement enterCityLocator;
    @FindBy(xpath = "//input[@name='state']")
    private WebElement enterStateLocator;
    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement enterPostCodeLocator;
   @FindBy(css = "select[name='country']")
   private WebElement countryName;
   @FindBy(id = "email")
   private WebElement userNameLocator;
    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;
    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPwdLocator;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement clickOnSubmitLocator;





    public void enterFirstName(){
        enterFirstNameLocator.sendKeys("sheyi");
    }
    public void enterLastName(){
        enterLastNameLocator.sendKeys("Odele");
    }
    public void enterPhoneNumber(){
        enterPhoneNumberLocator.sendKeys("0899736888");
    }
    public void enterEmailaddress(){
        enterEmailAddressLocator.sendKeys("odexsol77@gmail.com");
    }
    public void enterAddress(){
        enterAddressLocator.sendKeys("60 brega");
    }
    public void enterCity(){
        enterCityLocator.sendKeys("Balbriggan");
    }
    public void enterState(){
        enterStateLocator.sendKeys("Dublin");
    }
    public void enterPostCode(){
        enterPostCodeLocator.sendKeys("K32FK");
    }
    public void CountryName(String countryNme){
//        selectFromDropDownByVisibilityOfText(countryName, "IRELAND");
    countryName.sendKeys("IRELAND");
}
    public void enterUserName(String uName){
        userNameLocator.sendKeys("odex77");
    }
    public void enterPasswordLocator(String pWord){
        passwordLocator.sendKeys("Yahoo77");
    }
    public void enterConfirmPwdLocator(String pWord){
    confirmPwdLocator.sendKeys("Yahoo77");

    }
    public void clickOnSubmitButton(){
    clickOnSubmitLocator.click();
    }
}

