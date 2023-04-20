@UKBA
Feature:
  Scenario: Country and Study
Given I am on "https://www.gov.uk/check-uk-visa/y"
When I provide nationality of "Japan"
And I click on Continue button
And I select reason as "Study"
And I click on Continue button
And I state I intend to stay for more than 6 months
And I click on Continue button
Then I should be informed that "You'll need a visa to study in the UK"
  @UKBA

  Scenario Outline: Country and Study using scenario ouline
    Given I am on "https://www.gov.uk/check-uk-visa/y"
    When I provide nationality of "<CountryName>"
    And I click on Continue button
    And I select reason as "Study"
    And I click on Continue button
    And I state I intend to stay for more than 6 months
    And I click on Continue button
    Then I should be informed that "You'll need a visa to study in the UK"
    Examples:
      |CountryName  |
      |Japan        |
      |Ukraine      |
      |Morocco    |

  Scenario Outline: Nationalities and Tourism
    Given I am on "https://www.gov.uk/check-uk-visa/y"
    Given I provide nationality of "<CountryName>"
    And I click on Continue button
    And I select the reason as "Tourism"
    And I click on Continue button
    And I select "Yes" button for travelling with or visiting partner or family member
    And I click on Continue button
    Then  I will be informed "You'll usually need a visa to come to the UK"
    Examples:
      | CountryName |
      | Russia      |
      |Cuba         |
      |Belarus      |
      |Albania      |

