
Feature: Urbanic Cart Functionality
  @Regression
  @Smoke
  @Cart
  Scenario:TC1_User can add product to cart
    Given User navigate to homepage  for CartTest
    When User select product,Search in miles,Categories for CartTest
    And User clicks on searchFilter ,sellerDelivery type,Unit type,priceFilter for CartTest
    And User clicks on onlyOrganicSwicthButton and opens searchFilter thenselects searchButton for CartTest
    Then User add product to cart for CartTest










