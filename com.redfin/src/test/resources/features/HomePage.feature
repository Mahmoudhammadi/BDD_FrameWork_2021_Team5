Feature: Redfin functionality
  Scenario Outline: test 1
    Given user on redfin home page
    When  user click on sign up option
    And user enter "<email>"
    And user click continue with email
    Then user verify error message is showing up
    Examples:
      | email               |  |
      | mahmoud@gmail.com   |  |
      | mahmoud92@yahoo.com |  |
      | abes@hotmail.com    |  |
      | abes90@hotmail.fr   |  |
      | hamadi@yahoo.fr     |  |
  Scenario Outline: test 2
    Given user on redfin home page
    When  user click log in option
    And user type "<email>"
    And user click continue
    And user type1 "<password>"
    And user click continue1
    Then user should get an error message
    Examples:
      | email               | password |
      | mahmoud@gmail.com   | 4317nbvc |
      | mahmoud92@yahoo.com | @@@@@@@  |
      | abes@hotmail.com    | 23455    |
      | abes90@hotmail.fr   | asssji   |
      | hamadi@yahoo.fr     | HCDHGD   |

