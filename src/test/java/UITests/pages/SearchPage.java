package UITests.pages;

import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css="input#mapSearchBox.form-control")
    public WebElement productSearchBoxd;

    @FindBy(id = "location")
    public WebElement distanceSearchBox;

    @FindBy(xpath = "//*[@id='location']/option[3]")
    public WebElement searchInMiles;

    @FindBy(id = "allCategories")
    public WebElement categoriesSearchBox;

    @FindBy(xpath = "//*[@id='allCategories']/option[2]")
    public WebElement searchCategoriesList;

    @FindBy(xpath = "//button[@class='btn p-0 SearchBarOptions_sliderButton__1oak8']")
    public WebElement searchFilterButton;

    @FindBy(xpath= "//*[@id='SELLER_DELIVERY']")
    public WebElement sellerDelivery;

    @FindBy(xpath = "//*[@id='searchFilters']/div/div[3]/div[1]/label")
    public WebElement unitTypePound;

    @FindBy(id = "searchMapButton")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='SearchBarOptions_slider__1xZ3L SearchBarOptions_round__3BMhA']")
    public WebElement onlyOrganicSwicthButton;

    @FindBy(xpath = "//input[@value='150']")
    public WebElement priceFilter;



}
