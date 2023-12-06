package UITests.pages;

import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "password")
    public  WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[contains(text(),'Logout')])[1]")
    public WebElement logoutIcon;

    @FindBy(xpath = "//a[@href='/auth/login']")
    public WebElement loginIcon;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath ="//*[@id='__next']/div[4]/div[3]/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/button")
    public WebElement goButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;



}
