Feature:
  Scenario Outline:checking sign in functionality
    Given user is on att home page
    When user click  account
    And  user click sign in
    And user enter "<userID>" and "<password>"
    Then user click sign in option
    Examples:
      | userID    | password  |
      | abes90    | 1234we    |
      | mahmoud92 | m4321ama  |
      | abma645   | 765yrt    |
      | krimo     | dj1002    |
      | lamara100 | benz12334 |
    Scenario: checking my favorite option
      Given user is on att home page
      When  user click on my favorites
      Then user verify you are on the right page



