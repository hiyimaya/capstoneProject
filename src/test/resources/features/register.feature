
Feature: Urbanic Web Register
  @Regression
  @Smoke
  @US_02TC_08Regis
  Scenario:TC_08 User should be able to register with valid credentials
    Given User is on register page
    When User enter firstname,lastname,e-mail, password and confirm password  with valid credentials
    And User clicks registerSubmit button
    Then User should be registered in successfully
  @Regression
  @Smoke
  Scenario: TC_09 User should  not be able to register with invalid password
    Given User is on register page for invalid test
    When User enter firstname,lastname,e-mail, password and confirm password  with invalid credentials
    And User clicks registerSubmit button for invalid test
    Then User should not be registered
  @Regression
  @Smoke
  Scenario Outline:TC_10 User should  not be able to register with invalid mail
    Given User is on register page for invalid mail
    When User enter firstname,lastname,"<invalidEmail>", password and confirm password  with invalid credentials
    And User clicks registerSubmit button for invalid email
    Then User should not be logged in with invalid email
    Examples:
      | invalidEmail           |
      |juliannkozeymailsac.com |
      |            @mailsac.com|
        |juliannkozey@mailsac.   |


