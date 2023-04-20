package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NopCommerceHomePage extends BasePage{
    public NopCommerceHomePage(WebDriver driver){
        super(driver);
    }

//    locating the elements
    @FindBy(css ="a[class='ico-register']") private WebElement registerLink;


//    writing methods to perform action on the locators
    public void ClickOnRegisterLink(){
        registerLink.click();
    }

}
