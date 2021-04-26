Feature: user are be able to apply to new credit Cards
  Scenario:1
    Given user is on credit home page
    When user click on credit cards option
    Then user is on the credit cards page
    Scenario: 2
      Given user is on credit home page
      When user click on credit cards option
      And user click on cash reward credit cards link
      And user click on apply now button
      And user enter your credentials
        | mahmoud | hamad | hammadi |