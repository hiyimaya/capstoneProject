
Feature: Urbanic Web Login
  @Regression
  @Smoke
  @log01
  Scenario: User should be able to login with one accunt valid credentials
    Given User is on login page
    When User enter e-mail and password with valid credentials
    And User clicks submit
    Then User should be logged in successfully
  @Regression
  @Smoke
  @logNegativeT02
  Scenario:User should not be able to login with one accunt invalid credentials
    Given User is on login page with invalid credential
    When User enter e-mail and password with invalid credentials
    And User clicks submit for negative Test
    Then User should not be logged in
  @Regression
  @Log03
  Scenario Outline:User should be able to login with accounts valid e-mails
    Given User is on login page for with accounts valid e-mails
    When User enter "<email>" and password with valid credentials
    And User clicks submit for accounts valid e-mails
    Then User should be logged in successfully for accounts valid emails
    Examples:
      |email|
      | juliannkozey@mailsac.com |
      | chadparisian@mailsac.com |
      | alfredstehr@mailsac.com  |
   @Regression
   @LogNegativeT04
  Scenario Outline:User should not be able to login with with accounts invalid emails
   Given User is on login page for with accounts invalid emails
    When User enter "<invalidemail>" and password with invalid credentials
    And User clicks submit for accounts invalid emails

    Examples:
          | invalidemail           |
          |juliannkozeymailsac.com |
          |juliann..zey@mailsac.com|
          |            @mailsac.com|
          |.liannkozey@mailsac.com |
          |juliannkozey@mailsac.   |
          |juliannkozey@mailsac..com|
