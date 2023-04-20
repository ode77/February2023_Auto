@CARIRELAND
Feature:
  Scenario Outline:CREATING AN ACCOUNT ON CARIRELAND WEBSITE WITH VALID DETAILS
    Given I am on CarIreland home page
    And I click on Agree and Close Cookies link
    And I click on Not a Member Register link
    And I populate all the the mandatory field "<firstname>", "<lastname>", "<email>", "<password and CofirmPassword>"
#    And I click on have read and agree to the Terms and Privacy Policy link
#    And I click on Submit button
#    Then Your Registration is successful
    Examples:
      | firstname | lastname | email               | password and CofirmPassword |
      | solomon   | ode      | odexseye@gmail.com  | Yahoo7@                  |
