package UITests.pages;

import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeliveryPage {
    public DeliveryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div/div[1]/a[3]")
    public WebElement deliveryLink;

    @FindBy(xpath = "//input[@class='custom-control-input DeliverySettings_regular-checkbox__1gkSd']")//4 tane
    public List<WebElement> deliveryTypes;

    @FindBy(xpath = "//*[@id='startTime2']")
    public WebElement buyerpvinestartTime;

    @FindBy(xpath = "//*[@id='endTime2']")
    public WebElement buyerpvinendTime;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement buyerpickstartTime;

    @FindBy(xpath = "//*[@id='endTime']")
    public WebElement buyerpickendTime;

    @FindBy(xpath = "//*[@id='SELLER_FLEXIBLE']")
    public WebElement sellerFlexible;

    @FindBy(xpath = "//*[@id='freeDeliveryRange']")
    public WebElement freeDeliveryMile;

    @FindBy(xpath = "//*[@id='minFreeDeliveryOrder']")
    public WebElement minFreeDeliveryOrder;

    @FindBy(xpath = "//*[@id='perMileCost']")
    public WebElement perMileCost;

    @FindBy(xpath = "//*[@id='maxDeliveryRange']")
    public WebElement maxDeliveryRange;

    @FindBy(xpath = "//*[@id='estimatedDeliveryTime']")
    public WebElement estimatedDeliveryTime;

    @FindBy(xpath = "//option[@value='300']")
    public WebElement selectHour;

    @FindBy(xpath = "//*[@id='providingDistance']")
    public WebElement upToMile;

    @FindBy(xpath = " //*[@id='freeFlexibleDeliveryRange']")
    public WebElement freeFlexibleDeliveryRange;

    @FindBy(xpath = "//*[@id='minFreeFlexibleDeliveryOrder']")
    public WebElement minFreeFlexibleDeliveryOrder;

    @FindBy(xpath = "//*[@id='perMileCostFlex']")
    public WebElement perMileCostFlex;

    @FindBy(xpath = "//*[@id='maxFlexibleDeliveryRange']")
    public WebElement maxFlexibleDeliveryRmile;

    @FindBy(xpath = "//*[@id='_deliveryBeginDay']")
    public WebElement orderBeginDay;

    @FindBy(xpath = "//*[@id='_deliveryBeginDay']/option[2]")
    public WebElement orderBeginDayMonday;

    @FindBy(xpath = "//*[@id='_deliveryBeginTime']")
    public WebElement orderBeginTime;

    @FindBy(xpath = "//*[@id='_deliveryEndDay']")
    public WebElement orderEndDay;

    @FindBy(xpath = "//*[@id='_deliveryEndDay']/option[3]")
    public WebElement orderEndDayWednesday;

    @FindBy(xpath = "//*[@id='_deliveryEndTime']")
    public WebElement orderEndTime;

    @FindBy(xpath = "//*[@id='_orderByDay']")
    public WebElement deliverByDay;

    @FindBy(xpath = "//*[@id='_orderByDay']/option[6]")
    public WebElement deliverByDayFriday;

    @FindBy(xpath = "//*[@id='_orderByTime']")
    public WebElement deliverByTime;

    @FindBy(xpath = "(//*[@id='hubManageSaveButton'])[2]")
    public WebElement addSign;

    @FindBy(xpath = "(//*[@id='hubManageSaveButton'])[3]")
    public WebElement updateButton;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement deliveryMessage;

    @FindBy(xpath = "//*[@id='navbarElement']/nav/div[2]")
    public WebElement sellShare;










}
