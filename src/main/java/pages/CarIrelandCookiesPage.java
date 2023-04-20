package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarIrelandCookiesPage extends BasePage{
    public CarIrelandCookiesPage(WebDriver driver) {
        super(driver);
   }
   @FindBy(id = "didomi-notice-agree-button")
   private WebElement clickCookiesLocators;



    public void clickOnCookiesButton(){
    clickCookiesLocators.click();
    }
}

