package UITests.pages;

import UITests.utilities.Driver;

import org.openqa.selenium.support.PageFactory;

public class EndToEndTestPage {
    AllElements elements = new AllElements();


    public EndToEndTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
