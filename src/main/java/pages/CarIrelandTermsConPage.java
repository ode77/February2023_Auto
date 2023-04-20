package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarIrelandTermsConPage extends BasePage{
    public CarIrelandTermsConPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@class='form-check-input' and @type='checkbox']") private WebElement clickOnTermsConLocator;


    public void clickOnTermsConButton(){
        clickOnTermsConLocator.click();
    }
}
