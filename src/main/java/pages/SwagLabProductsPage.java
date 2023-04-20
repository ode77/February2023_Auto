package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLabProductsPage extends BasePage{
    public SwagLabProductsPage(WebDriver driver) {
        super(driver);
    }
//    Finding Part
    @FindBy(css = "div.inventory_item_name")
    private List<WebElement> productsLocators;

//    Doing part
    public void clickOntheFirstProduct(){
        productsLocators.get(0).click();

//        public void clickOntheFirstProduct(int inde){
//            productsLocators.get(inde -1).click();


    }
}
