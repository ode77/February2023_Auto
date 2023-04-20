@NEWTOUR
Feature:
  Background:
    Given I am on the Newtours website

  Scenario Outline: Register by entring only User Information
    When I click on the Register link
    And I populate all the the mandatory field "<FirstName>", "<LastName>", "<Email>","<TelephoneNumb>",<Address>", "<City>", "<State>","<PostCode>"
    And I enter "<UserName>", password and confirm as "<Password>"
    And I enter "<CountryName>"
    And I click submit button
    Then confirmation page is displayed with my "<UserName>"
    Examples:
      | UserName | Password | CountryName | FirstName | LastName | Email            | TelephoneNumb |Address   | City     | State | PostCode    |
      | odex77     | Yahoo77     | IRELAND | Sheyi    | Odele    |odexsol77@gmail.com| 0899736888 |60 brega    | Balbriggan | Dublin | K32FK1   |



  Scenario: 2 Flight finder Page
    When I click on the Flights link on the left side menu
    Then The Flight Finder Page should be displayed
    And "RoundTrip" Flight details type is selected by default
    And "July 12" should be displayed by default for On and returning
    And "Economy Class" should be selected as default for the Service class

