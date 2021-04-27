
Feature: checking savings option



  Scenario: TEST savings option
    Given  user on bank of america home page
    When  user click on savings
    And user click on advantage savings link
    Then user verify advantage savings is showing up

  Scenario Outline: TEST savings child saving
    Given  user on bank of america home page
    When  user click on savings
    And user click on child saving
    And user enter "<zipCode>"
    And user click search button
    Then user verify child saving
    Examples:
    |zipCode|
    |10020  |
    |11214  |
    |11204  |
    |10016  |
    |10017  |
    |10018  |

Scenario: search for different questions
  Given  user on bank of america home page
  When i send myUserName and password
  |user|123|


