

Feature: Urbanic Web Delivery&Pickup
  @Smoke
  @Regression
  @Delivery
  Scenario: User should be able to arrange Delivery&Pickup settings with valid credentials
    Given User is on Delivery page
    When User clicks delivery types
    And User clicks time buttons and arrange available hours on Buyer picks up on the vine
    And User clicks time buttons and arrange available hours on Buyer picks up
    And User clicks Seller flexible delivery
    And User clicks  button and arrange Free Delivery Range on Seller delivers the products
    And User clicks  button and arrange Minimum Order Amount For Free Delivery on Seller delivers the products
    And User clicks button and arrange perMileCost on Seller delivers the products
    And User clicks button and arrange maxDeliveryRange on Seller delivers the products
    And User clicks button,click estimatedDeliveryTime and select 5 hours on Seller delivers the products
    And User clicks button and arrange upToMile on Seller delivers the products
    And User clicks Seller flexible delivery again
    And User clicks  button and arrange freeFlexibleDeliveryRange on Seller flexible delivery
    And User clicks  button and arrange minFreeFlexibleDeliveryOrder on Seller flexible delivery
    And User clicks  button and arrange perMileCostFlex on Seller flexible delivery
    And User clicks  button and arrange maxFlexibleDeliveryRange on Seller flexible delivery
    And User clicks button,click BeginDay and select Monday on Seller flexible delivery
    And And User clicks button,click deliveryBeginTime and arrange it on Seller flexible delivery
    And User clicks button,click deliveryEndDay and select Wednesday on Seller flexible delivery
    And User clicks button,click deliveryEndTime and arrange it on Seller flexible delivery
    And User clicks button,click orderByDay and select Friday on Seller flexible delivery
    And User clicks button,click orderByTime and arrange it on Seller flexible delivery
    Then User clicks update button and  complete Delivery&Pickup settings successfully

