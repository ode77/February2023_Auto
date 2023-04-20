package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseAccountDeletedPage extends BasePage {
    public AutoExerciseAccountDeletedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[normalize-space()='Your account has been permanently deleted!']")
    private WebElement accountDeletedPageIsDisplayed;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement clickOnContinueLocator;


    public boolean IsAccountDeletedPageDisplayed() {
        return accountDeletedPageIsDisplayed.isDisplayed();
    }

    public void setClickOnContinueButton() {
        clickOnContinueLocator.click();
    }




}