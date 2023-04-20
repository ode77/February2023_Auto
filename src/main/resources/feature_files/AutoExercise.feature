@AUTOEXE
Feature:
  Background:
    Given I am on autoexercise home page
    Then I Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then I Verify 'New User Signup!' is visible
  Scenario Outline: Test Case 1: Register User
##  Given I am on autoexercise home page
##  Then I Verify that home page is visible successfully
##  And Click on 'Signup / Login' button
##  Then I Verify 'New User Signup!' is visible
    And  I Enter "<name>" and "<email address>"
    And  Click 'Signup' button
    Then I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    When Fill details: Title and "<Password>"
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Fill details: "<First name>", "<Last name>", "<Company>", "<Address>", "<Country>", "<State>", "<City>", "<Zipcode>", "<Mobile Number>"
    And Click 'Create Account button'
    Then Verify that 'ACCOUNT CREATED!' is visible
    And Click Continue button
    Then Verify that 'Logged in as username' is visible

      Examples:
        | name | email address      | Password | First name | Last name | Company | Address | Country | State | City | Zipcode | Mobile Number |
        | solo | odexsolo77@gmail.com   | Yahoo77 | solomon | odele | eledavibes | 60 brega | Canada | Dublin | Balbriggan | k32 | 0899736888 |
  @AUTOEXE
  Scenario Outline: Test Case 2: Login User with correct email and password
    Given I am on autoexercise home page
    Then I Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then I Verify 'Login to your account' is visible
  Given I Enter correct "<email address>" and "<password>"
    And I Click login button
  Examples:
    | email address         | password |
    | odexsolo007@gmail.com | Yahoo777 |

  Scenario Outline: Test Case 3: Login User with incorrect email and password
    Given I am on autoexercise home page
    Then I Verify that home page is visible successfully
    And Click on 'Signup / Login' button
  Then Verify 'Login to your account' is visible
  When Enter incorrect "<email address>" and "<password>"
  And Click 'login' button
#  Then Verify error 'Your email or password is incorrect!' is visible
    Examples:
      | email address | password |
      | odexsol77@gmail.com |Yahoo70 |

    Scenario Outline: Test Case 4: Logout User
      Given I am on autoexercise home page
      Then I Verify that home page is visible successfully
      And Click on 'Signup / Login' button
      Then I Verify 'Login to your account' is visible
      Given I Enter correct "<email address>" and "<password>"
      And I Click login button
      Then Verify that Logged in as username is visible
#      And Click 'Logout' button
#      Then Verify that user is navigated to login page
      Examples:
        | email address         | password |
        | odexsolo007@gmail.com | Yahoo777 |

      Scenario Outline: TEST CASE 5:
        Given I am on autoexercise home page
        Then I Verify that home page is visible successfully
        And Click on 'Signup / Login' button
        Then I Verify 'New User Signup!' is visible
        And Enter "<name>" and already registered "<email address>"
        And Click 'Signup' button
        Then Verify error 'Email Address already exist!' is visible
        Examples:
          | name        | email address  |
          | solo        | odexsolo007@gmail.com |

  @AUTOEXE
 Scenario Outline: TEST CASES 6:
          Given I am on autoexercise home page
          Then I Verify that home page is visible successfully
          And Click on Contact Us button
          And Verify GET IN TOUCH is visible
          And Enter "<name>", "<email>", "<subject>" and "<message>"
          And Click Submit button
         And Click OK button
          Then Verify success message 'Success! Your details have been submitted successfully.' is visible
          And Click Home button
          Then verify that landed to home page successfully
    Examples:
      | name | email                 | subject      | message                             |
      | solo | odexsolo007@gmail.com | Order Issues | Please unable to place my order with the payment gateway |

  @AUTOEXE

  Scenario: TEST CASES 7:
      Given I am on autoexercise home page
      Then I Verify that home page is visible successfully
      And Click on Test Cases button

  @AUTOEXE
  Scenario: TEST CASES 8:
    Given I am on autoexercise home page
    Then I Verify that home page is visible successfully
    And I Click on 'Products' button
    Then The products list is visible
#    And Click on 'View Product' of first product
    Then User is landed to product detail page
    Then Verify that detail is visible: product name, category, price, availability, condition, brand