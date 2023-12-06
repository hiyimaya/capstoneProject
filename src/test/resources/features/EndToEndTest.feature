

Feature: Urbanic EndToEndTest
  @Smoke
  @Regression
  Scenario: User should be able to Urbanic EndToEndTest
    Given User first registers and then logs in for seller in EndToEndTest
    When User first clicks the address link and new Address button ,then write the city name on button and user reaches the address page
    And User Address fills in the title, address, zipcode information and selects the Seller Address and clicks submit button
    And User clicks Delivery link and navigate to delivery page
    And User clicks delivery types and aranges time and hours on Buyer picks up on the vine
    And User arranges time and hours on Buyer picks up then user clicks Seller flexible delivery
    And User arrange Range,Minimum Order Amount For Free Delivery ,perMileCost ,maxDeliveryRange, estimatedDeliveryTime ,arrange upToMile on Seller delivers the products
    And User clicks Seller flexible delivery again,arrange freeFlexibleDeliveryRange,minFreeFlexibleDeliveryOrder,perMileCostFlex,maxFlexibleDeliveryRange,
    And User clicks buttons and aranges BeginDay,BeginTime,EndDay,EndTime,orderByDay,orderByTime on Seller flexible delivery and click update button
    And User first clicks the address link and new Address button ,then write the city name on button and user reaches the address page for delivery
    And User Address fills in the title, address, zipcode information and selects the Delivery Address and clicks submit button for delivery
    And User first clicks the sellShareTrade link, then clicks Add button and navigate to create product page
    And User clicks  and aranges productName button ,price button,stock button,unit button
    And User clicks submit button for creation product
    And Admin approved products from database
    And User first clicks goback link,reach hub page and return productpage and verify for approving
    And User navigate to homepage for search
    And User search product
    And User add product to cart for buying
    Then User navigate to Paypal page to product for buying






