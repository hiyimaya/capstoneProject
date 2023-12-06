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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class DeliveryStepDefinition {
    AllElements elements = new AllElements();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    //with register
    @Given("User is on Delivery page")
    public void user_is_on_delivery_page() {
      //  ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        ReusableMethods.waitForPageToLoad(2);
        elements.getRegisterPage().registerIcon.click();
        elements.getRegisterPage().firstNamebox.sendKeys(faker.name().firstName());
        elements.getRegisterPage().lastNamebox.sendKeys(faker.name().lastName());
        elements.getRegisterPage(). emailbox.sendKeys(faker.name().firstName().toLowerCase()+faker.name().lastName().toLowerCase() + "@mailsac.com");
        elements.getRegisterPage().passwordbox.sendKeys("A/b123456");
        elements.getRegisterPage().confirmPasswordbox.sendKeys("A/b123456");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(elements.getRegisterPage().registerSubmitButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.waitFor(2);
        elements.getLoginPage().zipcode.sendKeys(ConfigurationReader.getProperty("loginZipcode"));
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
        elements.getLoginPage().goButton.click();
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed());
        //added link
        elements.getDeliveryPage().deliveryLink.click();}
    @When("User clicks delivery types")
    public void user_clicks_delivery_types() {

            for (int i = 0; i < elements.getDeliveryPage().deliveryTypes.size();i++){
                 elements.getDeliveryPage().deliveryTypes.get(i).click();

    }}
    @And("User clicks time buttons and arrange available hours on Buyer picks up on the vine")
    public void user_clicks_time_buttons_and_arrange_available_hours_on_buyer_picks_up_on_the_vine() {
        elements.getDeliveryPage().buyerpvinestartTime.click();
        ReusableMethods.cleanTextInBox(elements.getDeliveryPage().buyerpvinestartTime);
        actions.
                 sendKeys(Keys.ARROW_LEFT).
                 sendKeys(Keys.DELETE).
                 sendKeys(Keys.ARROW_LEFT).
                 sendKeys(Keys.DELETE).
                 sendKeys("09").
                 sendKeys("30").
                 sendKeys("AM").build().perform();
        elements.getDeliveryPage().buyerpvinendTime.click();
        ReusableMethods.cleanTextInBox(elements.getDeliveryPage().buyerpvinendTime);
        actions.
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).
                sendKeys("05").
                sendKeys("30").
                sendKeys("PM").build().perform();
    }
    @And("User clicks time buttons and arrange available hours on Buyer picks up")
    public void user_clicks_time_buttons_and_arrange_available_hours_on_buyer_picks_up() {
        elements.getDeliveryPage().buyerpickstartTime.click();
        ReusableMethods.cleanTextInBox(elements.getDeliveryPage().buyerpickstartTime);
        actions.
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).
                sendKeys("10").
                sendKeys("30").
                sendKeys("AM").build().perform();

        elements.getDeliveryPage().buyerpickendTime.click();
        ReusableMethods.cleanTextInBox(elements.getDeliveryPage().buyerpickendTime);
        actions.
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).
                sendKeys("06").
                sendKeys("00").
                sendKeys("PM").build().perform();

    }
    @And("User clicks Seller flexible delivery")
    public void user_clicks_seller_flexible_delivery() {
        elements.getDeliveryPage().sellerFlexible.click();

    }
    @And("User clicks  button and arrange Free Delivery Range on Seller delivers the products")
    public void user_clicks_button_and_arrange_free_delivery_range_mile_on_seller_delivers_the_products() {
        elements.getDeliveryPage().freeDeliveryMile.click();
        elements.getDeliveryPage().freeDeliveryMile.sendKeys("2");

    }
    @And("User clicks  button and arrange Minimum Order Amount For Free Delivery on Seller delivers the products")
    public void user_clicks_button_and_arrange_minimum_order_amount_for_free_delivery_$_on_seller_delivers_the_products() {
        elements.getDeliveryPage().minFreeDeliveryOrder.click();
        elements.getDeliveryPage().minFreeDeliveryOrder.sendKeys("4");

    }
    @And("User clicks button and arrange perMileCost on Seller delivers the products")
    public void user_clicks_button_and_arrange_per_mile_cost_on_seller_delivers_the_products() {
        elements.getDeliveryPage().perMileCost.click();
        elements.getDeliveryPage().perMileCost.sendKeys("4");

    }
    @And("User clicks button and arrange maxDeliveryRange on Seller delivers the products")
    public void user_clicks_button_and_arrange_max_delivery_range_on_seller_delivers_the_products() {
        elements.getDeliveryPage().maxDeliveryRange.click();
        elements.getDeliveryPage().maxDeliveryRange.sendKeys("4");

    }
    @And("User clicks button,click estimatedDeliveryTime and select {int} hours on Seller delivers the products")
    public void user_clicks_button_click_estimated_delivery_time_and_select_hours_on_seller_delivers_the_products(Integer int1) {
        elements.getDeliveryPage().estimatedDeliveryTime.click();
        elements.getDeliveryPage().selectHour.click();

    }
    @And("User clicks button and arrange upToMile on Seller delivers the products")
    public void user_clicks_button_and_arrange_up_to_mile_on_seller_delivers_the_products() {
        elements.getDeliveryPage().upToMile.click();
        elements.getDeliveryPage().upToMile.sendKeys("15");

    }
    @And("User clicks Seller flexible delivery again")
    public void user_clicks_seller_flexible_delivery_again() {
        elements.getDeliveryPage().sellerFlexible.click();

    }
    @And("User clicks  button and arrange freeFlexibleDeliveryRange on Seller flexible delivery")
    public void user_clicks_button_and_arrange_free_flexible_delivery_range_mile_on_seller_flexible_delivery() {
        elements.getDeliveryPage().freeFlexibleDeliveryRange.click();
        elements.getDeliveryPage().freeFlexibleDeliveryRange.sendKeys("1");


    }
    @And("User clicks  button and arrange minFreeFlexibleDeliveryOrder on Seller flexible delivery")
    public void user_clicks_button_and_arrange_min_free_flexible_delivery_order_on_seller_flexible_delivery() {
        elements.getDeliveryPage().minFreeFlexibleDeliveryOrder.click();
        elements.getDeliveryPage().minFreeFlexibleDeliveryOrder.sendKeys("3");

    }
    @And("User clicks  button and arrange perMileCostFlex on Seller flexible delivery")
    public void user_clicks_button_and_arrange_per_mile_cost_flex_on_seller_flexible_delivery() {
        elements.getDeliveryPage().perMileCostFlex.click();
        elements.getDeliveryPage().perMileCostFlex.sendKeys("1");

    }
    @And("User clicks  button and arrange maxFlexibleDeliveryRange on Seller flexible delivery")
    public void user_clicks_button_and_arrange_max_flexible_delivery_range_mile_on_seller_flexible_delivery() {
        elements.getDeliveryPage().maxFlexibleDeliveryRmile.click();
        elements.getDeliveryPage().maxFlexibleDeliveryRmile.sendKeys("2");

    }
    @And("User clicks button,click BeginDay and select Monday on Seller flexible delivery")
    public void user_clicks_button_click_begin_day_and_select_monday_on_seller_flexible_delivery() {
        elements.getDeliveryPage().orderBeginDay.click();
        elements.getDeliveryPage().orderBeginDayMonday.click();


    }
    @And("And User clicks button,click deliveryBeginTime and arrange it on Seller flexible delivery")
    public void and_user_clicks_button_click_delivery_begin_time_and_arrange_it_on_seller_flexible_delivery() {
        elements.getDeliveryPage().orderBeginTime.click();
        actions.
                sendKeys("08").
                sendKeys("30").
                sendKeys("AM").build().perform();


    }
    @And("User clicks button,click deliveryEndDay and select Wednesday on Seller flexible delivery")
    public void user_clicks_button_click_delivery_end_day_and_select_wednesday_on_seller_flexible_delivery() {
        elements.getDeliveryPage().orderEndDay.click();
        elements.getDeliveryPage().orderEndDayWednesday.click();

    }
    @And("User clicks button,click deliveryEndTime and arrange it on Seller flexible delivery")
    public void user_clicks_button_click_delivery_end_time_and_arrange_it_on_seller_flexible_delivery() {
        elements.getDeliveryPage().orderEndTime.click();
        actions.
                sendKeys("05").
                sendKeys("30").
                sendKeys("PM").build().perform();

    }
    @And("User clicks button,click orderByDay and select Friday on Seller flexible delivery")
    public void user_clicks_button_click_order_by_day_and_select_friday_on_seller_flexible_delivery() {

        elements.getDeliveryPage().deliverByDay.click();
        elements.getDeliveryPage().deliverByDayFriday.click();

    }
    @And("User clicks button,click orderByTime and arrange it on Seller flexible delivery")
    public void user_clicks_button_click_order_by_time_and_arrange_it_on_seller_flexible_delivery() {
        elements.getDeliveryPage().deliverByTime.click();
        actions.
                sendKeys("05").
                sendKeys("30").
                sendKeys("PM").build().perform();

    }
    @Then("User clicks update button and  complete Delivery&Pickup settings successfully")
    public void user_clicks_update_button_and_complete_delivery_pickup_settings_successfully() {
        Assert.assertTrue(elements.getDeliveryPage().updateButton.isEnabled());
        elements.getDeliveryPage().updateButton.click();
        ReusableMethods.waitForPageToLoad(2);
        ReusableMethods.waitFor(2);
      //  ReusableMethods.logout();
        Driver.closeDriver();
        ReusableMethods.waitFor(1);


    }

}
