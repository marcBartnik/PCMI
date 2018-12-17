package contract.loginpage.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class stores web page elements needed for running tests.
 */

public class LoginPageLocators {

    private WebDriver driver;				// driver which allows navigation on web page
    private By loginFieldLocator;			// field where user can type it`s password
    private By passwordFieldLocator;        // field where user can type it`s password
    private By loginButtonLocator;          // button which log in user
    private By alertLocator;                // text on a alert window
    private By okButtonLocator;

    /**
     * Web element representatives on a page.
     * @param driver enable performing actions on a page
     */
    public LoginPageLocators(WebDriver driver) {

        this.driver = driver;
        loginFieldLocator = new By.ById("ucTopBar_ASPxRoundPanel2_ucLogin_cbLogin_pnl_txtLoginNew_I");
        passwordFieldLocator = new By.ById("ucTopBar_ASPxRoundPanel2_ucLogin_cbLogin_pnl_txtPasswordNew_I");
        loginButtonLocator = new By.ByXPath("//*[@id=\"ucTopBar_ASPxRoundPanel2_ucLogin_cbLogin_pnl_btnLoginNew_CD\"]/span");
        alertLocator = new By.ById("dialogText");
        okButtonLocator = new By.ByXPath("/html/body/div[2]/div[3]/div/button");
    }

    /**
     * Method locates login field.
     * @return login field
     */
    public WebElement loginInputField() { return  driver.findElement(loginFieldLocator); }

    /**
     * Methods locates password field.
     * @return password field
     */
    public WebElement passwordInputField() { return driver.findElement(passwordFieldLocator); }

    /**
     * Method locates login button.
     * @return login button
     */
    public WebElement loginButton() { return driver.findElement(loginButtonLocator); }

    /**
     * Method locates login button.
     * @return login button
     */
    public WebElement alert() { return driver.findElement(alertLocator); }

    /**
     * Methods locates OK button.
     * @return ok button
     */
    public WebElement okButton() { return driver.findElement(okButtonLocator); }
}