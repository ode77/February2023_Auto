package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MortgageCalculatorPage extends BasePage {
    public MortgageCalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "homeval")
    private WebElement homeValueLocator;
    @FindBy(id = "downpayment")
    private WebElement downPaymentLocator;
    @FindBy(id = "intrstsrate")
    private WebElement intrestsRateLocator;
    @FindBy(id = "loanterm")
    private WebElement loanTermLocator;
    @FindBy(xpath = "//select[@name='param[start_month]']")
    private WebElement enterMonthLocator;
    @FindBy(id = "start_year")
    private WebElement enterYearLocator;
    @FindBy(css = "input[type='submit']")
    private WebElement clickOnCalculatorLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div/div/h3")
    private List<WebElement> RepaymentSummaryList;

    public void EnterHomeValue(String hValue) {
        homeValueLocator.sendKeys(hValue);
    }

    public void EnterDownPayment(String ePayment) {
        downPaymentLocator.sendKeys(ePayment);

    }

    public void EnterIntrestRate(String intRate) {
        intrestsRateLocator.sendKeys(intRate);
    }

    public void EnterLoanTerm(String lterms) {
        loanTermLocator.sendKeys(lterms);
    }

    public void SelectStartMonth(String sMonth) {
        Select select = new Select(enterMonthLocator);
        select.selectByVisibleText(sMonth);

    }

    public void EnterStartYear(String sYear) {
        enterYearLocator.sendKeys(sYear);
    }

    public void clickOnCalculatorButton() {
        clickOnCalculatorLocator.click();
    }

    public String GetTotalMonthlyPayment() {
        return RepaymentSummaryList.get(0).getText();
    }

    public String GetDownPaymentAmount() {
        return RepaymentSummaryList.get(2).getText();
    }

    public String GetDownPaymentPercentage() {
        return RepaymentSummaryList.get(3).getText();
    }

    public String GetLoanPayoffDate() {
        return RepaymentSummaryList.get(4).getText();
    }

    public String GetTotalIntrestPaid() {
        return RepaymentSummaryList.get(5).getText();
    }

    public String GetMonthlyTaxPaid() {
        return RepaymentSummaryList.get(6).getText();
    }

}