package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewTourFlightFinderPage extends BasePage {
    public NewTourFlightFinderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@src='images/mast_flightfinder.gif']")
    private WebElement flightDetailsLocator;
    @FindBy(xpath = "//input[@value='roundtrip']")
    private WebElement roundTripLocator;

    @FindBy(xpath = "//input[@value='oneway']")
    private WebElement onewayLocator;

    @FindBy(name = "passCount")
    private WebElement passengersLocator;
    @FindBy(css = "select[name='fromPort']")
    private WebElement fromPortLocator;

    @FindBy(css = "select[name='fromMonth']")
    private WebElement fromMonthLocator;

    @FindBy(css = "select[name='fromDay']")
    private WebElement fromDayLocator;

    @FindBy(css = "select[name='toPort']")
    private WebElement toPortLocator;

    @FindBy(css = "select[name='toMonth']")
    private WebElement toMonthLocator;

    @FindBy(css = "select[name='toDay']")
    private WebElement toDayLocator;

    @FindBy(css = "input[value='Coach']")
    private WebElement economyClassLocator;

    @FindBy(css = "input[value='Business']")
    private WebElement businessClassPreferenceLocator;

    @FindBy(css = "input[value='First']")
    private WebElement firstClassPreferenceLocator;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement continueButtonLocator;


    public boolean IsFlightDetailsPageDisplayed() {
        return flightDetailsLocator.isDisplayed();
    }

    public String GetFlightDetailsText() {
        return flightDetailsLocator.getText();
    }

    public boolean IsRoundTripSelected() {
        boolean result = false;
        try {
            String value = roundTripLocator.getAttribute("checked");
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }

    public boolean IsOneWaySelected() {
        boolean result = false;
        try {
            String value = onewayLocator.getAttribute("checked");
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }

    public String GetDefaultFromMonth() {
        Select select = new Select(fromMonthLocator); //select is a class so needs to be defined
        WebElement a = select.getFirstSelectedOption();
        String b = a.getText();
        return b;

    }

    public String GetDefaultFromDay() {
        Select select = new Select(fromDayLocator); //select is a class so needs to be defined
        WebElement a = select.getFirstSelectedOption();
        String b = a.getText();
        return b;

    }

    public boolean IsEconomyClassSelectedByDefault() {
        boolean result = false;
        try {
            String value = economyClassLocator.getAttribute("checked");
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;


    }


}

