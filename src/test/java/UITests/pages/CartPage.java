package UITests.pages;

import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage {


    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/button")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id='navbarElement']/nav/div[3]/div/div/div")
    public WebElement cartImage;

    @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div[1]/div[3]/a[1]/button")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div[4]/button[2]")
    public WebElement firstCartNext;

    @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div[4]/button[2]")
    public WebElement secondCartNext;

    @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div[4]/button[2]")
    public WebElement goToPayment;



}