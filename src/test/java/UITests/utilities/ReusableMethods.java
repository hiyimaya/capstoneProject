package UITests.utilities;

import UITests.pages.AllElements;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ReusableMethods {
    protected  static AllElements elements = new AllElements();
    static Actions actions = new Actions(Driver.getDriver());
    static Faker faker=new Faker();
    static String namef;

    public static  String getnameFaker(){
        namef=faker.name().firstName().toLowerCase();

        return namef;
    }
    public static void register(){
        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        elements.getRegisterPage().registerIcon.click();
        getnameFaker();
        String lastnameFaker=faker.name().lastName().toLowerCase();
        elements.getRegisterPage().firstNamebox.sendKeys(getnameFaker());
        elements.getRegisterPage().lastNamebox.sendKeys(lastnameFaker);
       String emailFaker=getnameFaker()+lastnameFaker+"@mailsac.com";
        System.out.println(emailFaker);
        elements.getRegisterPage().emailbox.sendKeys(emailFaker);
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

    }


        //login
    public static void login(){

        ReusableMethods.waitForPageToLoad(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        elements.getLoginPage().loginIcon.click();
        elements.getLoginPage().email.sendKeys(ConfigurationReader.getProperty("validemail2"));
        elements.getLoginPage().password.sendKeys(ConfigurationReader.getProperty("validpassword2"));
        elements.getLoginPage().loginButton.click();
        ReusableMethods.waitFor(2);
        elements.getLoginPage().zipcode.sendKeys(ConfigurationReader.getProperty("loginZipcode"));
        ReusableMethods.waitFor(2);
        elements.getLoginPage().goButton.click();
        ReusableMethods.waitFor(2);

    }

     //logout
    public static void logout() {
        if (elements.getLoginPage().logoutIcon.isDisplayed()) {
            ReusableMethods.waitFor(2);
            elements.getLoginPage().logoutIcon.click();
          //  Driver.closeDriver();
        }


    }

    //this method will clear text box
    public static void cleanTextInBox(WebElement element) {
        String inputText = element.getAttribute("value");
        if (inputText != null) {
            for (int i = 0; i < inputText.length(); i++) {
                element.sendKeys(Keys.BACK_SPACE);
            }
        }
    }
    //this method will provide to  wait
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //wait methods
    public static WebElement waitForClickablility(WebElement element,Duration timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable( element));
    }


    //Scrolls down to an element using JavaScript
    public static void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({block: \"center\",inline: \"center\",behavior: \"smooth\"});", element);
    }
    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };


}    //click with javascript
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }
    //select class
    public static void selectByIndex(WebElement webElement, int index) {
        Select city = new Select(webElement);
        city.selectByIndex(index);
    }
    //action class' move to element method
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
    public static void refreshPage() {
        Driver.getDriver().navigate().refresh();

    }


}
