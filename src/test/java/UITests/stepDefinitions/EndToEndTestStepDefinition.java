package UITests.stepDefinitions;

import APITests.LoginAPI;
import DATABASETest.ProductApproveDataBase;
import UITests.pages.AllElements;
import UITests.utilities.ConfigurationReader;
import UITests.utilities.Driver;
import UITests.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EndToEndTestStepDefinition {

    ProductApproveDataBase productApproveDataBase=new ProductApproveDataBase();
    AllElements elements = new AllElements();
    Actions actions = new Actions(Driver.getDriver());
    LoginAPI loginAPI=new LoginAPI();
    //Register
    @Given("User first registers and then logs in for seller in EndToEndTest")
    public void user_first_registers_and_then_logs_in_for_seller_in_end_to_end_test() {
       ReusableMethods.register();

     }
     //Address Page
    @When("User first clicks the address link and new Address button ,then write the city name on button and user reaches the address page")
    public void user_first_clicks_the_address_link_and_new_address_button_then_write_the_city_name_on_button_and_user_reaches_the_address_page() {
        elements.getAddressPage().addressLink.click();
        elements.getAddressPage().Add_New_Address.click();
        ReusableMethods.waitFor(2);
        elements.getAddressPage().searchPlaces.sendKeys("Clifton");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
        elements.getAddressPage().firstOption.click();

    }
    @And("User Address fills in the title, address, zipcode information and selects the Seller Address and clicks submit button")
    public void user_address_fills_in_the_title_address_zipcode_information_and_selects_the_seller_address_and_clicks_submit_button() {
        ReusableMethods.cleanTextInBox(elements.getAddressPage().addressTitle);
        elements.getAddressPage().addressTitle.sendKeys("SellerAddress");
        elements.getAddressPage().markAsSalesAddress.click();

        ReusableMethods.waitFor(1);
        elements.getAddressPage().postal.sendKeys("07011");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);

    }
    //Delivery Page
    @And("User clicks Delivery link and navigate to delivery page")
    public void user_clicks_delivery_Link() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(elements.getDeliveryPage().deliveryLink);

    }
    @And("User aranges time and hours on Buyer picks up on the vine")
    public void user_aranges_time_and_hours_on_buyer_picks_up_on_the_vine() {
        //delivery types click
        for (int i = 0; i < elements.getDeliveryPage().deliveryTypes.size();i++) {
            elements.getDeliveryPage().deliveryTypes.get(i).click();
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
    }
    @And("User clicks delivery types and aranges time and hours on Buyer picks up on the vine")
    public void user_clicks_delivery_types_and_aranges_time_and_hours_on_Buyer_picks_upo_n_the_vine() {
        for (int i = 0; i < elements.getDeliveryPage().deliveryTypes.size();i++){
            elements.getDeliveryPage().deliveryTypes.get(i).click();
        }
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
    @And("User arranges time and hours on Buyer picks up then user clicks Seller flexible delivery")
    public void user_arranges_time_and_hours_on_buyer_picks_up_then_user_clicks_seller_flexible_delivery() {
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
        elements.getDeliveryPage().sellerFlexible.click();

    }
    @And("User arrange Range,Minimum Order Amount For Free Delivery ,perMileCost ,maxDeliveryRange, estimatedDeliveryTime ,arrange upToMile on Seller delivers the products")
    public void user_arrange_range_minimum_order_amount_for_free_delivery_on_seller_delivers_the_products() {
        elements.getDeliveryPage().freeDeliveryMile.click();
        elements.getDeliveryPage().freeDeliveryMile.sendKeys("2");
        elements.getDeliveryPage().minFreeDeliveryOrder.click();
        elements.getDeliveryPage().minFreeDeliveryOrder.sendKeys("4");
        elements.getDeliveryPage().perMileCost.click();
        elements.getDeliveryPage().perMileCost.sendKeys("4");
        elements.getDeliveryPage().maxDeliveryRange.click();
        elements.getDeliveryPage().maxDeliveryRange.sendKeys("4");
        elements.getDeliveryPage().estimatedDeliveryTime.click();
        elements.getDeliveryPage().selectHour.click();
        elements.getDeliveryPage().upToMile.click();
        elements.getDeliveryPage().upToMile.sendKeys("15");


    }
    @And("User clicks Seller flexible delivery again,arrange freeFlexibleDeliveryRange,minFreeFlexibleDeliveryOrder,perMileCostFlex,maxFlexibleDeliveryRange,")
    public void user_clicks_seller_flexible_delivery_again_arrange_free_flexible_delivery_range_min_free_flexible_delivery_order_per_mile_cost_flex_max_flexible_delivery_range() {
        elements.getDeliveryPage().sellerFlexible.click();
        elements.getDeliveryPage().freeFlexibleDeliveryRange.click();
        elements.getDeliveryPage().freeFlexibleDeliveryRange.sendKeys("1");
        elements.getDeliveryPage().minFreeFlexibleDeliveryOrder.click();
        elements.getDeliveryPage().minFreeFlexibleDeliveryOrder.sendKeys("3");
        elements.getDeliveryPage().perMileCostFlex.click();
        elements.getDeliveryPage().perMileCostFlex.sendKeys("1");
        elements.getDeliveryPage().maxFlexibleDeliveryRmile.click();
        elements.getDeliveryPage().maxFlexibleDeliveryRmile.sendKeys("2");

    }
    @And("User clicks buttons and aranges BeginDay,BeginTime,EndDay,EndTime,orderByDay,orderByTime on Seller flexible delivery and click update button")
    public void user_clicks_buttons_and_aranges_begin_day_begin_time_end_day_end_time_order_by_day_order_by_time_on_seller_flexible_delivery_and_click_update_button() {
        elements.getDeliveryPage().orderBeginDay.click();
        elements.getDeliveryPage().orderBeginDayMonday.click();
        elements.getDeliveryPage().orderBeginTime.click();
        actions.
                sendKeys("08").
                sendKeys("30").
                sendKeys("AM").build().perform();
        elements.getDeliveryPage().orderEndDay.click();
        elements.getDeliveryPage().orderEndDayWednesday.click();
        elements.getDeliveryPage().orderEndTime.click();
        actions.
                sendKeys("05").
                sendKeys("30").
                sendKeys("PM").build().perform();
        elements.getDeliveryPage().deliverByDay.click();
        elements.getDeliveryPage().deliverByDayFriday.click();
        elements.getDeliveryPage().updateButton.click();
        elements.getDeliveryPage().deliverByTime.click();
        actions.
                sendKeys("05").
                sendKeys("30").
                sendKeys("PM").build().perform();
        elements.getDeliveryPage().updateButton.click();
        ReusableMethods.waitFor(2);



    }
    //deliveryaddress

    @And("User first clicks the address link and new Address button ,then write the city name on button and user reaches the address page for delivery")
    public void user_first_clicks_the_address_link_and_new_address_button_then_write_the_city_name_on_button_and_user_reaches_the_address_page_for_delivery() {
        elements.getAddressPage().addressLink.click();
        elements.getAddressPage().Add_New_Address.click();
        ReusableMethods.waitFor(2);
        elements.getAddressPage().searchPlaces.sendKeys("Carlstadt");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
        elements.getAddressPage().firstOption.click();

    }
    @And("User Address fills in the title, address, zipcode information and selects the Delivery Address and clicks submit button for delivery")
    public void user_address_fills_in_the_title_address_zipcode_information_and_selects_the_seller_address_and_clicks_submit_button_for_delivery() {
        ReusableMethods.cleanTextInBox(elements.getAddressPage().addressTitle);
        elements.getAddressPage().addressTitle.sendKeys("DeliveryAddress");
        elements.getAddressPage().markAsDeliveryAddress.click();

        ReusableMethods.waitFor(2);
        elements.getAddressPage().postal.sendKeys("07074");
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);

    }
    //Create Product Page
    @And("User first clicks the sellShareTrade link, then clicks Add button and navigate to create product page")
    public void user_first_clicks_the_sell_share_trade_link_then_clicks_add_button_and_navigate_to_create_product_page() {
        ReusableMethods.clickWithJS(elements.getcreateProductPage().sellShareTrade);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(elements.getcreateProductPage().addButton);
        ReusableMethods.waitFor(2);

    }
    @And("User clicks  and aranges productName button ,price button,stock button,unit button")
    public void user_clicks_and_aranges_product_name_button_price_button_stock_button_unit_button() {
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithJS(elements.getcreateProductPage().productNameButton);
        elements.getcreateProductPage().productNameButton.sendKeys("Cherry Tomato");
   //     elements.getcreateProductPage().productNameButton.sendKeys("Apple");
        ReusableMethods.waitFor(1);
        elements.getcreateProductPage().priceButton.click();
        elements.getcreateProductPage().priceButton.sendKeys("3");
        ReusableMethods.waitFor(2);
        elements.getcreateProductPage().stockButton.click();
        elements.getcreateProductPage().stockButton.sendKeys("3");
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithJS(elements.getcreateProductPage().unit);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithJS(elements.getcreateProductPage().pound);
        ReusableMethods.waitFor(1);


    }
    @And("User clicks submit button for creation product")
    public void User_clicks_submit_button_for_creation_product() {
        ReusableMethods.clickWithJS(elements.getcreateProductPage().submit);

    }
    //Database approved product

    @And("Admin approved products from database")
    public void admin_approved_products_from_database() {
       productApproveDataBase.testProductApprove();


    }
    //approved create product

    @And("User first clicks goback link,reach hub page and return productpage and verify for approving")
    public void user_first_clicks_goback_link_reach_hub_page_and_return_productpage_and_verify_for_approving() {
        elements.getcreateProductPage().goBack.click();
        elements.getcreateProductPage().veghubimage.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(elements.getcreateProductPage().approvedText.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.logout();

    }
    //buyer
    @And("User navigate to homepage for search")
    public void user_navigate_to_homepage1() {
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
        ReusableMethods.cleanTextInBox(elements.getLoginPage().email);
        ReusableMethods.waitFor(2);
        elements.getLoginPage().email.sendKeys(ConfigurationReader.getProperty("validemail1"));
        ReusableMethods.cleanTextInBox(elements.getLoginPage().password);
        ReusableMethods.waitFor(2);
        elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("validpassword1"));
        elements.getLoginPage().loginButton.click();

        ReusableMethods.waitFor(2);
        elements.getLoginPage().zipcode.sendKeys(ConfigurationReader.getProperty("loginZipcode"));
        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);

        ReusableMethods.waitFor(2);
        elements.getcreateProductPage().urban.click();
        ReusableMethods.waitFor(2);

    }
    @And("User search product")
      public void user_search_Product() {
        elements.getsearchPage().productSearchBoxd.click();
        ReusableMethods.waitFor(2);
      // elements.getsearchPage().productSearchBoxd.sendKeys("tomato");
        elements.getsearchPage().productSearchBoxd.sendKeys("Apple");
        elements.getsearchPage().distanceSearchBox.click();
        elements.getsearchPage().searchInMiles.click();

        elements.getsearchPage().categoriesSearchBox.click();
        elements.getsearchPage().searchCategoriesList.click();
        ReusableMethods.waitFor(2);

        elements.getsearchPage().searchFilterButton.click();
        ReusableMethods.waitFor(2);
        elements.getsearchPage().sellerDelivery.click();
        ReusableMethods.waitFor(2);


        elements.getsearchPage().unitTypePound.click();
        ReusableMethods.waitFor(2);
        elements.getsearchPage().priceFilter.click();
        actions.sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                build().perform();
        ReusableMethods.waitFor(1);


        elements.getsearchPage().searchFilterButton.click();
        ReusableMethods.waitFor(1);
        elements.getsearchPage().onlyOrganicSwicthButton.click();
        ReusableMethods.waitFor(1);
        elements.getsearchPage().searchButton.click();
        ReusableMethods.waitFor(1);

    }


    @And("User add product to cart for buying")
    public void userAddProductToCartForBuying() {
        elements.getcartPage().addToCart.click();
        elements.getcartPage().cartImage.click();


    }

    @Then("User navigate to Paypal page to product for buying")
    public void userNavigateToPaypalPageToProductForBuying() {
        elements.getcartPage().proceedToCheckout.click();
        elements.getcartPage().firstCartNext.click();
        ReusableMethods.waitFor(2);
        elements.getcartPage().secondCartNext.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(elements.getcartPage().goToPayment.isDisplayed());
        elements.getcartPage().goToPayment.click();
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
        ReusableMethods.waitFor(1);



    }
}
