Feature: checking the functionality of become a host option
#  Background:
#    Given user is  in airbnb home page
#    When user click on become a host
#    Scenario Outline:
#      And user click on get start
#      Then user enter <phoneNumber>.
#      Examples:
#        | phoneNumber  | name |
#        | 347-286-5923 | lkoi |

  Scenario:scenario 1
    Given user is  in airbnb home page
    When  user click become a host option
    Then user verify become a host is displaying properly


    Scenario Outline:scenario 2
      Given user is  in airbnb home page
      And  user click get Started
      Then user enter your "<phoneNumber>"
      Examples:
        | phoneNumber  |  |
        | 347-286-5923 |  |
        | 345-546-2343 |  |
        | 347-231-3456 |  |
        | 657-345-4355 |  |
        | 345-345-4530 |  |


