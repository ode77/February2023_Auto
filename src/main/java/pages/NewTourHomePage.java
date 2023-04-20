package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTourHomePage extends BasePage{
    public NewTourHomePage(WebDriver driver) {
        super(driver);
   }
@FindBy(xpath = "//a[contains(text(),'REGISTER')]")
   private WebElement registerLocator;
@FindBy(xpath = "//a[@href='reservation.php']")
private WebElement clickOnFlightLocator;




    public void clickOnRegisterButton(){
        registerLocator.click();
    }
    public void clickOnFlightButton(){ clickOnFlightLocator.click();
    }
}


