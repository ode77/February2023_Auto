@UKBANEW
Feature:
  Scenario: Japan nationalities coming to study for more than 6 months
    Given I am on the UKBANew website
    When I choose "Japan" nationality
    And I press on Continue button
    And I select "study" as reason for coming to the Uk
    And I press on Continue button
    And I choose option of Longer than 6 months
    And I submit the form
    Then I should informed that "You'll need a visa to study in the UK"
  @UKBANEW

  Scenario Outline:
      Given I am on the UKBANew website
      When I choose "<CountryName>" nationality
      And I press on Continue button
      And I select "<Reason>" as reason for coming to the Uk
      And I press on Continue button
      And I choose option of Longer than 6 months
      And I submit the form
      Then I should informed that "<Message>"
      Examples:
        | CountryName |        Reason         | Message                              |
        | Japan          |     Study          | You'll need a visa to study in the UK|
        | Morocco          |     Study      | You'll need a visa to study in the UK |
        | Ukraine          |     Study         | You'll need a visa to study in the UK |
  @UKBANEW

  Scenario: Japan nationalities coming to Uk for Tourism do not require visa
  Given I am on the UKBANew website
  When I choose "Japan" nationality
  And I press on Continue button
  And I select "tourism" as reason for coming to the Uk
  And I press on Continue button
  And I choose option of Longer than 6 months
  And I submit the form
  Then I should be informed that "You will not need a visa to come to the UK"

  @UKBANEW
  Scenario Outline: Nationalities coming to Uk for Tourism that do not require visa
  Given I am on the UKBANew website
  When I choose "<CountryName>" nationality
  And I press on Continue button
  And I select "<Reason>" as reason for coming to the Uk
  And I press on Continue button
  And I choose option of Longer than 6 months
  And I submit the form
  Then I should be informed that "<Message>"
  Examples:
| CountryName |        Reason         | Message                              |
| Japan          |     tourism          | You'll need a visa to study in the UK|
| Morocco          |     tourism      | You'll need a visa to study in the UK |
| Ukraine          |     tourism         | You'll need a visa to study in the UK |
  @UKBANEW
  Scenario: Russia nationalities coming to UK for Tourism and not visting Family will require visa
      Given I am on the UKBANew website
      When I choose "Russian" nationality
      And I press on Continue button
      And I select "tourism" as reason for coming to the Uk
      And I press on Continue button
      And I choose "no" for visting partner or family member question
      And I submit the form
      Then I should informed that "You’ll need a visa to come to the UK"