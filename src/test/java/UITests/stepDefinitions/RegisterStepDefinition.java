package UITests.stepDefinitions;

import UITests.pages.AllElements;

import UITests.utilities.ConfigurationReader;
import UITests.utilities.Driver;
import UITests.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class RegisterStepDefinition {
    AllElements elements = new AllElements();
 Actions actions = new Actions(Driver.getDriver());
 Faker faker=new Faker();


//1
@Given("User is on register page")
public void user_is_on_register_page() {
    ReusableMethods.waitForPageToLoad(2);
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    if (elements.getRegisterPage().registerIcon.isDisplayed()) {
        elements.getRegisterPage().registerIcon.click();
    }
    else{
        System.out.println("logout ol");
        ReusableMethods.logout();
        ReusableMethods.waitFor(2);
        elements.getRegisterPage().registerIcon.click();
    }

}
    @When("User enter firstname,lastname,e-mail, password and confirm password  with valid credentials")
    public void user_enter_firstname_lastname_e_mail_password_and_confirmpassword_with_valid_credentials() {
        elements.getRegisterPage().firstNamebox.sendKeys(faker.name().firstName());
        elements.getRegisterPage().lastNamebox.sendKeys(faker.name().lastName());
        elements.getRegisterPage(). emailbox.sendKeys(faker.name().firstName().toLowerCase()+faker.name().lastName().toLowerCase() + "@mailsac.com");
        elements.getRegisterPage().passwordbox.sendKeys("A/b123456");
        elements.getRegisterPage().confirmPasswordbox.sendKeys("A/b123456");
        ReusableMethods.waitFor(2);
   }
    @And("User clicks registerSubmit button")
    public void user_clicks_register_submit_button() {
        ReusableMethods.clickWithJS(elements.getRegisterPage().registerSubmitButton);
        ReusableMethods.waitFor(2);

   }
    @Then("User should be registered in successfully")
    public void user_should_be_registered_in_successfully() {
        ReusableMethods.waitFor(2);
        elements.getLoginPage().zipcode.sendKeys(ConfigurationReader.getProperty("loginZipcode"));
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
        elements.getLoginPage().goButton.click();
        ReusableMethods.waitFor(5);
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed());
        ReusableMethods.clickWithJS(elements.getLoginPage().logoutIcon);
        ReusableMethods.waitFor(5);
         Driver.closeDriver();
    }
    //2
    @And("User is on register page for invalid test")
    public void user_is_on_register_page_for_invalid_test() {
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        elements.getRegisterPage().registerIcon.click();

    }
    @When("User enter firstname,lastname,e-mail, password and confirm password  with invalid credentials")
    public void user_enter_firstname_lastname_e_mail_password_and_confirm_password_with_invalid_credentials() {
        elements.getRegisterPage().firstNamebox.sendKeys(faker.name().firstName());
        elements.getRegisterPage().lastNamebox.sendKeys(faker.name().lastName());
        elements.getRegisterPage(). emailbox.sendKeys(faker.name().firstName().toLowerCase()+faker.name().lastName().toLowerCase() + "@mailsac.com");
        elements.getRegisterPage().passwordbox.sendKeys("6");
        elements.getRegisterPage().confirmPasswordbox.sendKeys("6");


        ReusableMethods.waitFor(2);

    }
    @And("User clicks registerSubmit button for invalid test")
    public void user_clicks_register_submit_button_for_invalid_test() {
        ReusableMethods.clickWithJS(elements.getRegisterPage().registerSubmitButton);
        ReusableMethods.waitFor(2);

    }

    @Then("User should not be registered")
    public void user_should_receive_alert_message() {

         Assert.assertTrue(elements.getRegisterPage().registerIcon.isDisplayed());
         ReusableMethods.waitFor(2);
          Driver.closeDriver();
     }
    //3
    @Given("User is on register page for invalid mail")
    public void user_is_on_register_page_for_invalid_mail() {
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        elements.getRegisterPage().registerIcon.click();


    }
    @When("User enter firstname,lastname,{string}, password and confirm password  with invalid credentials")
    public void user_enter_firstname_lastname_password_and_confirm_password_with_invalid_credentials(String string) {
        elements.getRegisterPage().firstNamebox.sendKeys(faker.name().firstName());
        elements.getRegisterPage().lastNamebox.sendKeys(faker.name().lastName());
        elements.getRegisterPage(). emailbox.sendKeys(string);

        elements.getRegisterPage().passwordbox.sendKeys("A/b123456");
        elements.getRegisterPage().confirmPasswordbox.sendKeys("A/b123456");
        ReusableMethods.waitFor(2);


    }
    @And("User clicks registerSubmit button for invalid email")
    public void user_clicks_register_submit_button_for_invalid_email() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(elements.getRegisterPage().registerSubmitButton);
        ReusableMethods.waitFor(2);

    }
    @Then("User should not be logged in with invalid email")
    public void user_should_not_be_logged_in_with_invalid_email() {
         Assert.assertTrue(elements.getRegisterPage().registerIcon.isDisplayed());
         Driver.closeDriver();


    }



    }

