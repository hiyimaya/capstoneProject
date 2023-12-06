package UITests.stepDefinitions;

import UITests.pages.AllElements;
import UITests.utilities.ConfigurationReader;
import UITests.utilities.Driver;
import UITests.utilities.ExpectedDataSources;
import UITests.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;


public class LoginStepDefinition {
    Actions actions = new Actions(Driver.getDriver());
    AllElements elements = new AllElements();
    List<String> expectedInvalidEmail = Arrays.asList(ExpectedDataSources.expectedinvalidEmail());
    List<String>expectedInvalidEmailnvalidpassword = Arrays.asList(ExpectedDataSources.expectedinvalidPassword());

    @Given("User is on login page")
    public void user_is_on_login_page() {
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if (elements.getLoginPage().loginIcon.isDisplayed()) {
            elements.getLoginPage().loginIcon.click();
        }
        else{
            System.out.println("logout ol");
            ReusableMethods.logout();
            ReusableMethods.waitFor(2);elements.getLoginPage().loginIcon.click();elements.getRegisterPage().registerIcon.click();
        }

    }
    @When("User enter e-mail and password with valid credentials")
    public void user_enter_valid_credentials() {
        elements.getLoginPage().email.sendKeys(ConfigurationReader.getProperty("validemail1"));
        elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("validpassword1"));

    }
    @And("User clicks submit")
    public void user_clicks_submit() {
        elements.getLoginPage().loginButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        elements.getLoginPage().zipcode.sendKeys(ConfigurationReader.getProperty("loginZipcode"));
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);

        elements.getLoginPage().goButton.click();
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed(),"The user did not  log in successfully");
        ReusableMethods.waitFor(2);
        elements.getcreateProductPage().urban.click();
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
    //@logNegativeT02

    @Given("User is on login page with invalid credential")
    public void user_is_on_login_pagewith_invalid_credential() {
    ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if (elements.getLoginPage().loginIcon.isDisplayed()) {
        elements.getLoginPage().loginIcon.click();
    }
        else{
        System.out.println("logout ol");
        ReusableMethods.logout();
        ReusableMethods.waitFor(2);
        elements.getLoginPage().loginIcon.click();
        elements.getRegisterPage().registerIcon.click();
    }

}
    @When("User enter e-mail and password with invalid credentials")
    public void user_enter_e_mail_and_password_with_invalid_credentials() {
        elements.getLoginPage().email.sendKeys(ConfigurationReader.getProperty("invalidEmail"));
        Assert.assertTrue(expectedInvalidEmail.contains(ConfigurationReader.getProperty("invalidEmail")));
        elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        Assert.assertTrue(expectedInvalidEmailnvalidpassword.contains(ConfigurationReader.getProperty("invalidPassword")));

    }
    @And("User clicks submit for negative Test")
    public void user_clicks_submit_for_negative_Test() {
        elements.getLoginPage().loginButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("User should not be logged in")
    public void user_should_be_logged_in_unsuccessfully() {
        ReusableMethods.waitFor(2);
        String alertMessage=elements.getLoginPage().alertMessage.getText();
        System.out.println(alertMessage);
        Assert.assertEquals(alertMessage,"Invalid creds","Entered with invalid credentials");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }
    //log03

    @Given("User is on login page for with accounts valid e-mails")
   public void user_is_on_login_page_for_some_emails() {
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if (elements.getLoginPage().loginIcon.isDisplayed()) {
            elements.getLoginPage().loginIcon.click();
        }
        else{
            System.out.println("logout ol");
            ReusableMethods.logout();
            ReusableMethods.waitFor(2);
            elements.getLoginPage().loginIcon.click();
            elements.getRegisterPage().registerIcon.click();
        }

    }

    @When("User enter {string} and password with valid credentials")
    public void user_enter_and_password_with_valid_credentials(String string) {
            elements.getLoginPage().email.sendKeys(string);
            elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("validpassword2"));
    }
    @And("User clicks submit for accounts valid e-mails")
    public void user_clicks_submit_for_accounts_valid_e_mails() {
        elements.getLoginPage().loginButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("User should be logged in successfully for accounts valid emails")
    public void user_should_be_logged_in_successfully_for_accounts_valid_emails() {
        elements.getLoginPage().zipcode.sendKeys(ConfigurationReader.getProperty("loginZipcode"));
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);

        elements.getLoginPage().goButton.click();
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed(), "The user did not  log in successfully");
        Driver.closeDriver();



    }
    //Log04
    @Given("User is on login page for with accounts invalid emails")
    public void user_is_on_login_page_for_with_accounts_invalid_emails() {
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        elements.getLoginPage().loginIcon.click();

    }

    @When("User enter {string} and password with invalid credentials")
    public void user_enter_and_password_with_invalid_credentials(String string) {
        elements.getLoginPage().email.sendKeys(string);
        elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("validpassword1"));
    }
    @And("User clicks submit for accounts invalid emails")
    public void user_clicks_submit_for_accounts_invalid_emails() {
        elements.getLoginPage().loginButton.click();
        ReusableMethods.waitFor(3);

    }
    @Then("User should not be logged in successfully for accounts invalid emails")
    public void user_should_be_logged_in_successfully_for_accounts_invalid_emails() {
        Assert.assertTrue(elements.getLoginPage().loginIcon.isDisplayed());
        Driver.closeDriver();


    }






}
