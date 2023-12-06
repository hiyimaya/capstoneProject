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
public class SearchStepDefinition {
    AllElements elements = new AllElements();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User navigate to homepagea")
    public void user_navigate_to_homepageo() {
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if (elements.getLoginPage().loginIcon.isDisplayed()) {
            elements.getLoginPage().loginIcon.click();
        } else {
            System.out.println("logout ol");
            ReusableMethods.logout();
            ReusableMethods.waitFor(2);
            elements.getLoginPage().loginIcon.click();
            elements.getRegisterPage().registerIcon.click();
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
        Assert.assertTrue(elements.getLoginPage().logoutIcon.isDisplayed(), "The user did not  log in successfully");
        ReusableMethods.waitFor(2);
        elements.getcreateProductPage().urban.click();
        ReusableMethods.waitFor(2);
    }


    @When("User clicks on  What are you looking for? button and sends tomato")
    public void user_clicks_on_what_are_you_looking_for_button_and_sends_tomato() {

        elements.getsearchPage().productSearchBoxd.click();
        ReusableMethods.waitFor(2);
        elements.getsearchPage().productSearchBoxd.sendKeys("Apple");//tomato
    }

    @And("User clicks on Search in miles button and selects Search in miles")
    public void user_clicks_on_search_in_miles_button_and_selects_search_in_miles() {
        elements.getsearchPage().distanceSearchBox.click();
        elements.getsearchPage().searchInMiles.click();

    }

    @And("User clicks on  Categories button user selects Categories  #Vegetables&fruits")
    public void user_clicks_on_categories_button_user_selects_categories_vegetables_fruits() {
        elements.getsearchPage().categoriesSearchBox.click();
        elements.getsearchPage().searchCategoriesList.click();
        ReusableMethods.waitFor(2);

    }

    @And("User clicks on searchFilter and selects sellerDelivery type")
    public void user_clicks_on_searchFilter_and_selects_delivery_type() {
        elements.getsearchPage().searchFilterButton.click();
        ReusableMethods.waitFor(2);
        elements.getsearchPage().sellerDelivery.click();
        ReusableMethods.waitFor(2);
    }

    @And("User clicks on  Unit type button and selects Unit type")
    public void user_clicks_on_unit_type_button_and_selects_unit_type() {
        elements.getsearchPage().unitTypePound.click();
        ReusableMethods.waitFor(2);

    }

    @And("User selects on priceFilter")
    public void user_selects_on_priceFilter() {
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
    }

    @Then("User clicks on onlyOrganicSwicthButton ,opens searchFilter and selects searchButton")
    public void user_clicks_onlyOrganicSwicthButton_and_selects_searchButton() {
        elements.getsearchPage().searchFilterButton.click();
        ReusableMethods.waitFor(1);
        elements.getsearchPage().onlyOrganicSwicthButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(elements.getsearchPage().searchButton.isEnabled());
        elements.getsearchPage().searchButton.click();
        ReusableMethods.waitFor(1);
        Driver.getDriver().close();

    }


}