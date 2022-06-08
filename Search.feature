Feature: Search
  
  @SmokeTests
  Scenario: Search Success Advantageonlineshopping
    Given I am in homepage
    When I enter a search keyword in the search box
    |mice|9|
    |Tablet|2|
    |abcd|0|
    Then I validate the outcomes
  
  