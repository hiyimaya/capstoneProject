Feature: Urbanic Address Functionality
  @Address01
  Scenario:User should be able to add to delivery address with valid credentials(with register)
    Given User first registers and then logs in for delivery
    When User first clicks the address link, then clicks the Add new Address button for delivery
    And User click on the button, write the city name and user reaches the address page for delivery
    Then User Address fills in the title, address, zipcode information and selects the DeliveryAddress
  @Address02
  Scenario:User should be able to add to seller address with valid credentials(with register)
    Given User first registers and then logs in for seller
    When User first clicks the address link, then clicks the Add new Address button for seller
    And User click on the button, write the city name and user reaches the address page for seller
    Then User Address fills in the title, address, zipcode information and selects the Seller Address


