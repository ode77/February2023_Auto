package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstnameLocator;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastnameLocator;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalcodeLocator;
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueLocator;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[1]/div[4]/h3[1]")
    private WebElement PostalCodeisrequired;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[1]/div[4]/h3[1]")
    private WebElement  FirstNameisrequired;
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[1]/div[4]/h3[1]")
    private WebElement LastNameIsRequired;

    //    Doing Part
    public void enterFirstname(String fName) {
        firstnameLocator.sendKeys(fName);
    }

    public void enterLastname(String lName) {
        lastnameLocator.sendKeys(lName);
    }

    public void enterPostalcode(String pCode) {
        postalcodeLocator.sendKeys(pCode);
    }

   public void clickOnContinueButton() {
        continueLocator.click();
  }

    public String getMessage() {
        return PostalCodeisrequired.getText();

    }
    public String getFirstNameRequiredMessage(){
        return FirstNameisrequired.getText();
    }
    public String getLastNameRequiredMessage(){
        return LastNameIsRequired.getText();
    }
}
