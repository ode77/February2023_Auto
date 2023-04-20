package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemPage extends BasePage {
    public InventoryItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButtonLocator;
    //    @FindBy(xpath = "//span[contains(text(),'1')]")
//    private WebElement itemOnChartLocator;
    @FindBy(css = ".shopping_cart_badge")
    private WebElement shoppingCartLocator;
//    @FindBy(id = "//remove-sauce-labs-backpack")
//    private WebElement removeItemFromChart;

    //    Doing Part
    public void clickOntheAddToCart() {
        addToCartButtonLocator.click();
    }

    public void clickOntheShoppingCart() {
        shoppingCartLocator.click();
    }

    public void clickOnRemoveFromChart() {

    }

//    public void itemOnChart() {
//        itemOnChartLocator.click();
//    }
}

