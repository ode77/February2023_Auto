@LAMBDATEST
Feature: CREATE AN ACCOUNT ON LAMBDATEST WEBSITE.
  Scenario Outline:
    Given I am on LambdaTest home page
    And I click on Register button link
    And I click new customer continue link
    And I populate all the the mandatory field "<firstname>", "<lastname>", "<email>","<telephone number>", "<password and CofirmPassword>"
    And I click on have read and agree to the Privacy Policy link
    And I click on registered button
    Then Your Account has been Created
    Examples:
      | firstname | lastname | email | telephone number | password and CofirmPassword |
      | seye | odele | odexsolo7@gmail.com | 0899768909 | Yahoo77 |