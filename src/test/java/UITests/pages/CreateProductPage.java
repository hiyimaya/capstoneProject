package UITests.pages;

import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateProductPage {

    public CreateProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='navbarElement']/nav/div[2]/span")
    public WebElement sellShareTrade ;

    @FindBy(xpath ="//*[@id='__next']/div[4]/div[3]/div/div/div[2]/div/div/div/div/button")
    public WebElement addButton ;

    @FindBy(xpath =" //input[@id='selectProductName']")
    public WebElement productNameButton ;

    @FindBy(xpath ="//*[@id='productName']/option[87]")
    public WebElement cherryTomato;

    @FindBy(xpath = "//*[@id='productName']/option[45]")//blueberry
    public WebElement blueberry;

    @FindBy(xpath = "//*[@id='productName']/option")//320
    public List<WebElement> productNames ;

    @FindBy(xpath = "//input[@id='hubManagePrice']")
    public WebElement priceButton ;

    @FindBy(xpath = "//input[@id='hubManageStock']")
    public WebElement  stockButton;

    @FindBy(xpath = "//select[@id='selectProductUnit']")
    public WebElement unit ;

    @FindBy(xpath = "//*[@id='selectProductUnit']/option[1]")
    public WebElement pound;

    @FindBy(xpath = "//button[@id='hubManageSaveButton']")
    public WebElement submit ;

   @FindBy(xpath = "//*[@id='vegetables']")
    public WebElement veghubimage;

   @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div/div[2]/div[1]/div/a")
   public WebElement goBack;

   @FindBy(xpath = "//span[@class='col-6 col-sm-4 text-center mb-3 cursor-pointer text-secondary']")
   public WebElement veghubImage;

   @FindBy(xpath = "//*[@id='__next']/div[4]/div[3]/div/div/div[2]/div[2]/div[2]/div/span")
   public WebElement approvedText;

   @FindBy(css ="#navbarElement #Group_3")
   public WebElement  urban;







}
