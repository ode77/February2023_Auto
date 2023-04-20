@NOPCOMMLogin
Feature: NopCommerceLogin

  Background:
    Given I am on Nopcommerce home page
    And I have no item in the shopping cart
    And I click on login link
  @NopE2ELogin

  Scenario: 2-Login with incorrect credentials to display appropriate error message
    When I attempt to login using incorrect credentials with email as "babymox@gmail.com" and password as "123456"
    And I click login button
    Then I should get the appropriate error message displayed