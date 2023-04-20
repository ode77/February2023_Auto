@NOPCOMM
Feature: NopCommerce
  Background:
    Given I am on Nopcommerce home page

  Scenario:1- Registration Using only Mandatory input field
    Given I am on Nopcommerce home page
    When I click on Register link
    And I populate only the the mandatory field firstname as "Bob", lastname as "Omotosho", email as "omo4@gmail.com", password and ConfirmPassword as "123456"
    And I click on register button
    Then registration is successful


  Scenario:2- Registration Using all input field
    Given I am on Nopcommerce home page
    When I click on Register link
    And I populate only the the mandatory field firstname as "Bob", lastname as "Omotosho", email as "omo4@gmail.com", password and ConfirmPassword as "123456"
    And I populate day as "3", month as "February", year as "1980" and company as "Malashe"
    And I click on register button
    Then registration is successful