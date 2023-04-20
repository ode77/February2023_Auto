package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarIrelandLandingPage extends BasePage{
    public CarIrelandLandingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement clickOnRegisterLocators;


    public void clickOnRegisterButton(){
        clickOnRegisterLocators.click();
    }
}
