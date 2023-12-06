package UITests.stepDefinitions;

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



public class CartStepDefinition {

        AllElements elements=new AllElements();
        Actions actions = new Actions(Driver.getDriver());
        @Given("User navigate to homepage  for CartTest")
        public void User_navigate_to_homepage_for_cart() {
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


            elements.getLoginPage().email.sendKeys(ConfigurationReader.getProperty("validemail1"));
            elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("validpassword1"));
            elements.getLoginPage().loginButton.click();
            ReusableMethods.waitFor(2);
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
        }


        @When("User select product,Search in miles,Categories for CartTest")
        public void user_select_product_Search_in_miles_Categories() {

            elements.getsearchPage().productSearchBoxd.click();
            ReusableMethods.waitFor(2);
            elements.getsearchPage().productSearchBoxd.sendKeys("Apple");//tomato
            elements.getsearchPage().distanceSearchBox.click();
            elements.getsearchPage().searchInMiles.click();
            elements.getsearchPage().categoriesSearchBox.click();
            elements.getsearchPage().searchCategoriesList.click();
            ReusableMethods.waitFor(2);

        }

        @And("User clicks on searchFilter ,sellerDelivery type,Unit type,priceFilter for CartTest")
        public void user_Ulicks_on_searchFilter_sellerDelivery_type_Unit_type_priceFilter() {
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
            ReusableMethods.waitFor(2);

        }

        @And("User clicks on onlyOrganicSwicthButton and opens searchFilter thenselects searchButton for CartTest")
        public void user_clicks_onlyOrganicSwicthButton_then_selects_searchButton() {
                    elements.getsearchPage().searchFilterButton.click();
                    ReusableMethods.waitFor(2);
                    elements.getsearchPage().onlyOrganicSwicthButton.click();
                    ReusableMethods.waitFor(2);
                    elements.getsearchPage().searchButton.click();
                    ReusableMethods.waitFor(2);
                }
        //cart
        @Then("User add product to cart for CartTest")
        public void userAddProductToCart() {
            elements.getcartPage().addToCart.click();
            ReusableMethods.waitFor(2);
            elements.getcartPage().cartImage.click();
            ReusableMethods.waitFor(2);
            elements.getcartPage().proceedToCheckout.click();
            ReusableMethods.waitFor(2);
            elements.getcartPage().firstCartNext.click();
            ReusableMethods.waitFor(2);
            elements.getcartPage().secondCartNext.click();
            ReusableMethods.waitFor(2);
            elements.getcartPage().goToPayment.click();
            ReusableMethods.waitFor(3);
            Driver.closeDriver();

        }
    }

