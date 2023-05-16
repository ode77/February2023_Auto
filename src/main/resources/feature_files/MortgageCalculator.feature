Feature: Mortgage Calculator Test DATATABLE
  @Mortgage
  Scenario Outline: Calculate Mortgage rate with given values and default values
    Given I am on the Mortgage calculator website
    When I enter the following
      | field       | Value |
      | homeValue   | 50000 |
      | downPayment | 20000 |
      | intrestRate | 5     |
      | loanTerm    | 25    |
      | startMonth  | Sep   |
      | startYear   | 2020  |
    And accept default value for all the remaining values
    Then I should get mortgage offer with "<totalMonthlyPayment>", "<downPaymentAmount>", "<downPaymentPercentage>", "<loanPayoffDate>", "<totalIntrestPaid>" and "<monthlyTaxPaid>"
    Examples:
      | totalMonthlyPayment | downPaymentAmount | downPaymentPercentage | loanPayoffDate | totalIntrestPaid | monthlyTaxPaid |
      | $458.71             | $20,000.00        | 40.00%                | Aug, 2045      | $22,613.10       | $200.00        |
