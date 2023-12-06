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

import java.util.Random;


public class AddressStepDefinition {
    AllElements elements = new AllElements();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Random random = new Random();
    int number = random.nextInt(10);
    String addressNumber = String.valueOf(number);

    //Address01withRegister
    @Given("User first registers and then logs in for delivery")
    public void user_first_registers_and_then_logs_in_delivery() {
        ReusableMethods.register();

    }


    @When("User first clicks the address link, then clicks the Add new Address button for delivery")
    public void user_first_clicks_the_address_link_then_clicks_the_add_new_address_button_delivery() {
        elements.getAddressPage().addressLink.click();
        elements.getAddressPage().Add_New_Address.click();

    }

    @And("User click on the button, write the city name and user reaches the address page for delivery")
    public void user_click_on_the_button_write_the_city_name_and_user_reaches_the_address_page() {
        ReusableMethods.waitFor(3);
        elements.getAddressPage().searchPlaces.sendKeys("Carlstadt");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(5);
        elements.getAddressPage().firstOption.click();

    }

    @Then("User Address fills in the title, address, zipcode information and selects the DeliveryAddress")
    public void user_address_fills_in_the_title_address_zipcode_information_and_selects_DeliveryAddress() {
        ReusableMethods.cleanTextInBox(elements.getAddressPage().addressTitle);
        elements.getAddressPage().addressTitle.sendKeys("DeliveryAddress");
        elements.getAddressPage().markAsDeliveryAddress.click();
        ReusableMethods.waitFor(3);

        elements.getAddressPage().postal.sendKeys("07074");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed());
        elements.getLoginPage().logoutIcon.click();
        ReusableMethods.waitFor(1);
        Driver.closeDriver();


    }


//seller
   @Given("User first registers and then logs in for seller")
   public void user_first_registers_and_then_logs_in_seller() {
       ReusableMethods.waitFor(3);
           ReusableMethods.register();

   }
    @When("User first clicks the address link, then clicks the Add new Address button for seller")
    public void user_first_clicks_the_address_link_then_clicks_the_add_new_address_button_seller() {
        elements.getAddressPage().addressLink.click();
        elements.getAddressPage().Add_New_Address.click();

    }
    @And("User click on the button, write the city name and user reaches the address page for seller")
    public void user_click_on_the_button_write_the_city_name_and_user_reaches_the_address_page_for_seller() {
        ReusableMethods.waitFor(3);
        elements.getAddressPage().searchPlaces.sendKeys("Clifton");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(5);
        elements.getAddressPage().firstOption.click();

    }
    @Then("User Address fills in the title, address, zipcode information and selects the Seller Address")
    public void user_address_fills_in_the_title_address_zipcode_information_and_selects_the_seller_address() {
        ReusableMethods.cleanTextInBox(elements.getAddressPage().addressTitle);
        elements.getAddressPage().addressTitle.sendKeys("SellerAddress");
        elements.getAddressPage().markAsSalesAddress.click();
        ReusableMethods.waitFor(3);
        elements.getAddressPage().postal.sendKeys("07011");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed());
        elements.getLoginPage().logoutIcon.click();
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }



    }

