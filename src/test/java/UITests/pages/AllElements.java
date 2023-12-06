package UITests.pages;

import UITests.utilities.ReusableMethods;

public class AllElements {
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private AddressPage addressPage;
    private DeliveryPage deliveryPage;
    private CreateProductPage createProductPage;
    private SearchPage searchPage;
    private CartPage cartPage;
    private EndToEndTestPage endToEndTestPage;
    private ReusableMethods reusableMethods;


    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }
    public AddressPage getAddressPage() {
        if (addressPage == null) {
            addressPage = new AddressPage();
        }
        return addressPage;
    }
    public DeliveryPage getDeliveryPage() {
        if (deliveryPage == null) {
            deliveryPage = new DeliveryPage();
        }
        return deliveryPage;
    }
    public CreateProductPage getcreateProductPage() {
        if (createProductPage == null) {
            createProductPage = new CreateProductPage();
        }
        return createProductPage;
    }
    public SearchPage getsearchPage() {
        if (searchPage == null) {
            searchPage = new SearchPage();
        }
        return searchPage;
    }
    public CartPage getcartPage() {
        if (cartPage == null) {
            cartPage = new CartPage();
        }
        return cartPage;
    }
    public EndToEndTestPage getEndToEndTestPage() {
        if (endToEndTestPage == null) {
            endToEndTestPage = new EndToEndTestPage();
        }
        return endToEndTestPage;
    }
    public ReusableMethods getReusableMethods() {
        if (reusableMethods == null) {
            reusableMethods = new ReusableMethods();
        }
        return reusableMethods;
    }

}
