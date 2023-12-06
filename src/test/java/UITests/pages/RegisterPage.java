package UITests.pages;
import UITests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement registerIcon;

    @FindBy(xpath = "//input[@id='registration_form_firstname']")
    public WebElement firstNamebox;

    @FindBy(id = "registration_form_middlename")
    public WebElement middleNamebox;

    @FindBy(id = "registration_form_lastname")
    public WebElement lastNamebox;

    @FindBy(id = "registration_form_email")
    public WebElement emailbox;

    @FindBy(id = "registration_form_plainPassword")
    public WebElement passwordbox;

    @FindBy(id = "registration_form_confirmPassword")
    public WebElement confirmPasswordbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerSubmitButton;



}
