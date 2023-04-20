package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTourConfirmationPage extends BasePage{
    public NewTourConfirmationPage(WebDriver driver) {
        super(driver);
   }
  @FindBy(xpath = "//b[contains(text(),'Note: Your user name is odex77.')]")
    private WebElement noteElement;


    public String getNoteText(){
        return noteElement.getText();
    }
}

