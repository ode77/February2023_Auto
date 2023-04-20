package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabYourCartIPage extends BasePage {
    public SwagLabYourCartIPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checkout")
    private WebElement checkoutButtonLocator;
    @FindBy(xpath = "//span[contains(text(),'1')]")
    private WebElement itemOnChartLocator;
    @FindBy(xpath = "/html//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeItemOnChart;
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']")
    private WebElement emptyChartLocator;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement clearCartLocator;

//    @FindBy(id = "continue-shopping")
//private WebElement clickContinueBtnLocator;
//    Doing Part
    public void clickOnCheckoutButton() {
        checkoutButtonLocator.click();
    }

    public void itemOnChart() {
        itemOnChartLocator.click();
    }

    public void clickOnRemoveItem() {
        removeItemOnChart.click();
    }
//    public void emptyProductChart(){
//        emptyChartLocator.clear();


    //    public String getEmptyChart(){
//        return clearCartLocator.getText();
//    }
//    public void clickContinueButton() {
//        clickContinueBtnLocator.click();
//    }


}