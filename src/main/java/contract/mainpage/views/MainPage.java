package contract.mainpage.views;

import contract.mainpage.locators.MainPageLocators;
import org.openqa.selenium.WebDriver;

/**
 * Class provides methods for User to moving on a page with game searching results.
 */

public class MainPage {

    private MainPageLocators mainPageLocators;                    //here are stored all needed element for performing actions on page

    /**
     * Default constructor.
     * @param driver enable performing actions on a page
     */
    public MainPage(WebDriver driver) { mainPageLocators = new MainPageLocators(driver); }

    /**
     * Getting logged user.
     */
    public String getLoggedUserName() { return mainPageLocators.loggedUser().getText(); }

    /**
     * Opening new contract.
     */
    public void openNewContract() { mainPageLocators.addContract().click(); }

    /**
     * Log out current user.
     */
    public void logOutCurrentUser() { mainPageLocators.logOutUser().click(); }
}