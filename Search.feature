Feature: Search
  
  @SmokeTests
  Scenario: Search Success Advantageonlineshopping
    Given I am in homepage
    When I enter a search keyword in the search box
    |mice|
    |Tablet|
    |abcd|
    Then I validate the outcomes
  
  