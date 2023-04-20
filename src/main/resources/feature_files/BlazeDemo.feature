Feature:
  Scenario:purchasing a flight ticket on BlazeDemo
  @BlazeDemo
  Scenario Outline: Choosing Departure and destination Cities and finding flights
    Given I am on the Welcome to Simple Travel Agency Landing page
    When I choose the "<departureCity>" and "<destinationCity>" from the drop menu
    Then I should be able to see "<departureCity>" and "<destinationCity>" on the BladeDemo reserve page and 5 flights options
    Examples:
      | departureCity | destinationCity  |
      |Boston         | Rome             |
      |Paris          | London           |
      |San Diego      | Berlin           |
      |Mexico City    | Dublin           |
      |Portland       | cairo            |
