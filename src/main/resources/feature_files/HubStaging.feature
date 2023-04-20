@HubStag
Feature:
  Scenario Outline: 1. Happy Path to log in to hub
    Given I am on the hub home page "https://hub-staging.tissl.com/"
#    Given I am on the hub home page
    And I enter valid "<username>" and "<password>"
    And I click on the log in button
    And I click on select your "<organisation>"
    And I click on the log in button
    Then "Testqaa" should be displayedx
    Examples:
      | username  |password |  organisation                  |
      | Testqaa  |Testqaa  |Gordon Ramsay Holdings - Street Burger |