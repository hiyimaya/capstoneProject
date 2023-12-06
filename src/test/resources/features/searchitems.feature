

Feature: Urbanic Search Functionality
 @Regression
 @Search
  Scenario:TC1_User can search items to  add cart
   Given User navigate to homepagea
    When User clicks on  What are you looking for? button and sends tomato
    And User clicks on Search in miles button and selects Search in miles
    And User clicks on  Categories button user selects Categories  #Vegetables&fruits
    And User clicks on searchFilter and selects sellerDelivery type
    And User clicks on  Unit type button and selects Unit type
    And User selects on priceFilter
    Then User clicks on onlyOrganicSwicthButton ,opens searchFilter and selects searchButton


