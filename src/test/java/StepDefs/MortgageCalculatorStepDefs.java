package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageCalculatorPage;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MortgageCalculatorStepDefs extends BaseUtil {
    private BaseUtil base;

    public MortgageCalculatorStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the Mortgage calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws IOException {
        base.driver.manage().window().maximize();
//        base.driver.get("https://www.mortgagecalculator.org/");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getMortgageCal_lUrl());

    }
    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.EnterHomeValue(dataTable.get(1).get(1));
        mortgageCalculatorPage.EnterDownPayment(dataTable.get(2).get(1));
        mortgageCalculatorPage.EnterIntrestRate(dataTable.get(3).get(1));
        mortgageCalculatorPage.EnterLoanTerm(dataTable.get(4).get(1));
        mortgageCalculatorPage.SelectStartMonth(dataTable.get(5).get(1));
        mortgageCalculatorPage.EnterStartYear(dataTable.get(6).get(1));
        mortgageCalculatorPage.clickOnCalculatorButton();
    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {

   }
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String tMonthly, String dPayment, String dPymPercent, String lPayOffDate, String tInrstPaid, String mTaxPaid) {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        assertThat(mortgageCalculatorPage.GetTotalMonthlyPayment(),is(equalTo(tMonthly)));
        assertThat(mortgageCalculatorPage.GetDownPaymentAmount(),is(equalTo(dPayment)));
        assertThat(mortgageCalculatorPage.GetDownPaymentPercentage(),is(equalTo(dPymPercent)));
        assertThat(mortgageCalculatorPage.GetLoanPayoffDate(),is(equalTo(lPayOffDate)));
        assertThat(mortgageCalculatorPage.GetTotalIntrestPaid(),is(equalTo(tInrstPaid)));
        assertThat(mortgageCalculatorPage.GetMonthlyTaxPaid(),is(equalTo(mTaxPaid)));

    }
}
