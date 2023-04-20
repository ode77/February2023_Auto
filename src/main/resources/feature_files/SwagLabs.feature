@SwagLabs
Feature: SwagLabs
##  @SwagLabs
  Scenario: Happy path to purchase an item on SwagLab
#    Given I am on the swaglab home page "https://www.saucedemo.com/"
    Given I am on the swaglab home page
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I complete all the required fields
    And I clicked on Continue button
    And I click on Finish button
    Then "THANK YOU FOR YOUR ORDER!" message is displayed on the order confirmation page
##  @SwagLabs

    Scenario: 2. Error msg should displayed if postcode is not populated on the checkout page
      Given I am on the swaglab home page
      When I enter valid username and valid password
      And I click on Login button
      And I click on the first item on the Products page
      And I click on Add to cart button
      And I click on Shopping cart
      And I click on Checkout
      And I enter details for only firstname and lastname
      And I clicked on Continue button
      Then error msg "Error: Postal Code is required" is displayed under Postcode field

      Scenario: 3. Error msg Should be displayed if Firstname
        Given I am on the swaglab home page "https://www.saucedemo.com/"
        When I enter valid username and valid password
        And I click on Login button
        And I click on the first item on the Products page
        And I click on Add to cart button
        And I click on Shopping cart
        And I click on Checkout
        And I enter details for only lastname and postcode
        And I clicked on Continue button
        Then error msg "Error: First Name is required" is displayed under firstname field
#
        Scenario: 4.Error msg should be displayed if Lastname field is not populated on the chevckout page
          Given I am on the swaglab home page "https://www.saucedemo.com/"
          When I enter valid username and valid password
          And I click on Login button
          And I click on the first item on the Products page
          And I click on Add to cart button
          And I click on Shopping cart
          And I click on Checkout
          And I enter details for only firstname and postcode
          And I clicked on Continue button
          Then error msg "Error: Last Name is required" is displayed under lastname field
#
          Scenario:5 Error msg should be displayed invalid password is enter for login
            Given I am on the swaglab home page "https://www.saucedemo.com/"
            When I enter valid username
            And I enter invalid password
            And I click on Login button
#            Then error message is displayed and I am not logged in

            Scenario:6 Check that items can be added and removed from the cart
              Given I am on the swaglab home page "https://www.saucedemo.com/"
              When I enter valid username and valid password
              And I click on Login button
              And I click on the first item on the Products page
              And I click on Add to cart button
              And 1 item is added to the cart
              And I click remove item button


