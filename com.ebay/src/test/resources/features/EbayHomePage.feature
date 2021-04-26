Feature: users are able to search for items in the search bar

  Scenario Outline: test (1)
    Given user is on ebay home page
    When user click on search bar
    And user type "<items>" in search bar
    And user click on search Box button
    Examples:
      | items       |
      | macbook pro |
      | lg tv       |
      | iphone 12   |
      | samsung S21 |
      | headphones  |
    Scenario Outline:
      Given user is on ebay home page
      When  user click sign in
      And   user enter "<email>"
      And   user click continue
      Examples:
        | email               |  |
        | abes90@gmail.com    |  |
        | mahmoud98@gmail.fr  |  |
        | abes@hotmail.com    |  |
        | mahmoud@hotmail.fr  |  |
        | mahmoud43@yahoo.com |  |
