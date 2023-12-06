
  Feature: Urbanic create a product
    @CreateProduct
    Scenario:User should be able to create a product
      Given User first registers and then logs in for seller for Create product Test
      When User first clicks the address link and new Address button ,then write the city name on button and user reaches the address page for Create product Test
      And User Address fills in the title, address, zipcode information and selects the Seller Address and clicks submit button for Create product Test
      And User clicks Delivery link and navigate to delivery page for Create product Test
      And User clicks delivery types and aranges time and hours on Buyer picks up on the vine for Create product Test
      And User arranges time and hours on Buyer picks up then user clicks Seller flexible delivery for Create product Test
      And User arrange Range,Minimum Order Amount For Free Delivery ,perMileCost ,maxDeliveryRange, estimatedDeliveryTime ,arrange upToMile on Seller delivers the products for Create product Test
      And User clicks Seller flexible delivery again,arrange freeFlexibleDeliveryRange,minFreeFlexibleDeliveryOrder,perMileCostFlex,maxFlexibleDeliveryRange for Create product Test
      And User clicks buttons and aranges BeginDay,BeginTime,EndDay,EndTime,orderByDay,orderByTime on Seller flexible delivery and click update button for Create product Test
      And User first clicks the address link and new Address button ,then write the city name on button and user reaches the address page for delivery for Create product Test
      And User Address fills in the title, address, zipcode information and selects the Delivery Address and clicks submit button for delivery for Create product Test
      And User first clicks the sellShareTrade link, then clicks Add button and navigate to create product page for Create product Test
      And User clicks  and aranges productName button ,price button,stock button,unit button for Create product Test
      And User clicks submit button for creation product for Create product Test
      And Admin approved products from database for Create product Test
      Then User first clicks goback link,reach hub page and return productpage and verify for approving for Create product Test








