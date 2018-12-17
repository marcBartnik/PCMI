package contract.mainpage.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class stores web page elements needed for running tests
 */
public class MainPageLocators {

    private WebDriver driver;				//driver which allows to navigate on a web page
    private By loggedUserLocator;			//currently logged user
    private By addContractLocator;		    //add new contract
    private By logoutButtonLocator;         //button which log outs current user

    /**
     * Web element representatives on a page.
     * @param driver enable performing actions on a page
     */
    public MainPageLocators(WebDriver driver){

        this.driver = driver;
        loggedUserLocator = new By.ByXPath("ucTopBar_ASPxRoundPanel2_ucLogin_cbLogin_pnl_lnkUserName");
        addContractLocator = new By.ByXPath("//*[@id=\"navMenu_ITC0i0_ctl00_0_tbMenu_0\"]/tbody/tr[1]/td[2]/a");
        logoutButtonLocator = new By.ByXPath("//*[@id=\"ucTopBar_ASPxRoundPanel2_ucLogin_cbLogin_pnl_btnLogout_CD\"]/span");
    }

    /**
     * Finding element which represent logged user name
     * @return loggedUserLocator
     */
    public WebElement loggedUser() { return driver.findElement(loggedUserLocator); }

    /**
     * Finding element which open new contract
     * @return addContractLocator
     */
    public WebElement addContract() { return driver.findElement(addContractLocator); }

    /**
     * Finding element which log out user.
     * @return logoutButtonLocator
     */
    public WebElement logOutUser() { return driver.findElement((logoutButtonLocator)); }
}