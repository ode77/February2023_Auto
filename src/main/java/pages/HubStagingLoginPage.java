package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HubStagingLoginPage extends BasePage {
    public HubStagingLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement usernameLocator;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordLocator;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement loginButtonLocator;
    @FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
    private WebElement selectOrganisationLocator;



    public void enterUserName(String username) {
        usernameLocator.sendKeys("Testqaa");
    }

    public void enterPassword(String pwrd) {
        passwordLocator.sendKeys("Testqaa");
    }

        public void clickOnLoginButton() {
            loginButtonLocator.click();
        }
        public void clickOnSelectOrganisation(){
        selectOrganisationLocator.click();
        }




}