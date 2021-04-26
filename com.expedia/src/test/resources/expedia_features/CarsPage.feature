Feature: users are able to book a car
  Scenario: test (1)
    Given user is on expedia home page
    When user click on cars option
    And user select pick up location
    And user select drop off location
    Scenario: test(2)
      Given user is on expedia home page
      When user click on cars option
      And user select pick up date
      And user select drop off date
      Scenario: test(3)
        Given user is on expedia home page
        When user click on cars option
        And user select pick up time
        And user select drop off time
