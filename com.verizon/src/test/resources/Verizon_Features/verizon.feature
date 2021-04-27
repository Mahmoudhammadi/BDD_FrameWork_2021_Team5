Feature: verizon search feature
  Background:
    Given user is in verizon home page
  Scenario Outline: search for multiple products using verizon search button
    Given user is in verizon home page
    When user clicks on search button
    And user inputs "<items>" in the search box
#    Then user should see <items> search results
    Examples:
      | items|
      |    iphone 6  |
      |   s21    |
      | iphone x  |
      |samsung s20|
      |    mac    |
      |   cases   |
      | headphones|
      | chargers  |
  Scenario:User try to click on many button on Verizon page
    Then i click on shop button
    Then  i click on why verizon button
    Then  i click on support button
  Scenario:
    Then i click on shop all button
    Then iclic on add filter
    Then i click on brand
    Then i check apple box