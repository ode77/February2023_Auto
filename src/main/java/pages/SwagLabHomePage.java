package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabHomePage extends BasePage {
    public SwagLabHomePage(WebDriver driver) {
        super(driver);
    }

    ////// Locator
    @FindBy(id = "user-name")
    private WebElement usernameLocator;
    @FindBy(id = "password")
    private WebElement passwordLocator;
    @FindBy(id = "login-button")
    private WebElement loginButtonLocator;
   @FindBy(css = "#password")
    private WebElement wrongPasswordLocator;
    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement pWordDoNotMatch;


    public void enterUserName(String username) {
        usernameLocator.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordLocator.sendKeys(password);
    }

    public void enterWrongPassWord(String WrongpWord) {
        wrongPasswordLocator.sendKeys(WrongpWord);
    }
        public void clickOnLoginButton() {
            loginButtonLocator.click();
        }


//        public String getErrorMessage () { return pWordDoNotMatch.getText();
//        }


}