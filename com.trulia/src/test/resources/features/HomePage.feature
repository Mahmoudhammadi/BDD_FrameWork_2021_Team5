Feature:

    Scenario Outline: test 1
      Given user on trulia home page
      When  user click on sign up option
      And  user enter "<email>"
      And  user click submit
      Examples:
      |email               |
      | krimo@gmail.com    |
      | mahmoud@hotmail.com|
      | lamara@yahoo.com   |
      | abes@gmail.fr      |
      | gana@hotmail.fr    |
      Scenario: test2
        Given user on trulia home page
        When user mouse hover buy
        And user click on new homes links
        Then user verify new homes page

