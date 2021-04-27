Feature: ebay deals search feature


  Scenario Outline: search for multiple products using ebay search button
    Given user is in ebay home page
    When user clicks on search button
    And user inputs "<items>" in the search box
#    Then user should see <items> search results
    Examples:
    | items     |
    | iphone x  |
    |samsung s20|
    |    mac    |
    |   cases   |
    | headphones|
    | chargers  |

