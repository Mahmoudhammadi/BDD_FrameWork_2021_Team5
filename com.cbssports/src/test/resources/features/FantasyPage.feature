Feature:user are be abel to see the sport news on fantasy page
  Background:
    Given user is on CBS Sports home page
  Scenario: test1
     When user click on baseball option
     Then user is on baseball page
    Scenario: test2
      When user click on baseball option
      And user mouse hover Football
      And user click on player news
      Then user verify the players display properly
