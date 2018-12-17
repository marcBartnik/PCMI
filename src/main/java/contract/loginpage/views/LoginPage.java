package contract.loginpage.views;

import contract.data.DataForContractTest;
import contract.loginpage.locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;

/**
 * Class provides methods for User to moving on a page.
 */

public class LoginPage {

    private WebDriver driver;									             // driver which allows navigation on web page
    private LoginPageLocators loginPageLocators;							 // here are stored all needed element for performing action on login page

    /**
     * Constructor
     */
    public LoginPage(WebDriver driver) {

        this.driver = driver;
        loginPageLocators = new LoginPageLocators(driver);
    }

    /**
     * Opening TPA NON-FL RETAIL & GROSS RESERVE page and verification if it succeeded.
     */
    public void openHomePage() {

        driver.get(DataForContractTest.getUrl());
    }

    /**
     * Clicking into login field.
     */
    public void clickInLoginInputField() { loginPageLocators.loginInputField().click(); }

    /**
     * Typing login in login field.
     */
    public void setLogin() { loginPageLocators.loginInputField().sendKeys(DataForContractTest.getLogin()); }

    /**
     * Clicking into password field.
     */
    public void clickInPasswordInputField() { loginPageLocators.passwordInputField().click(); }

    /**
     * Typing password in password field.
     */
    public void setPassword() { loginPageLocators.passwordInputField().sendKeys(DataForContractTest.getPassword()); }

    /**
     * Clicking into password field.
     */
    public void clickInLoginButton() { loginPageLocators.loginButton().click(); }

    /**
     * Checking displayed alert.
     */
    public String getAlert() { return loginPageLocators.alert().getText(); }

    /**
     * Clicking on OK button.
     */
    public void clickOk() { loginPageLocators.okButton().click(); }
}