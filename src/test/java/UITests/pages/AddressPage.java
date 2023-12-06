package UITests.pages;

import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class AddressPage {

    public AddressPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Address')]")
    public WebElement addressLink;

    @FindBy(xpath = "//button[contains(.,'Add New Address')]")
    public WebElement Add_New_Address;

    @FindBy(xpath = "//input[@placeholder='Search Places ...']")
    public  WebElement searchPlaces;

    @FindBy(xpath = "(//li[@class='list-group-item cursor-pointer rounded suggestion-item'])[1]")
    public WebElement firstOption;

    @FindBy(xpath = "//input[@id='isDefault']")
    public  WebElement markAsDeliveryAddress;

    @FindBy(xpath = "//input[@aria-label='seller address']")
    public  WebElement markAsSalesAddress;

    @FindBy(xpath = "//input[@id='addressTitle']")
    public  WebElement addressTitle;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='postal']")
     public WebElement  postal;


}

