package contract.users;

import contract.newcontractpage.views.NewContractPage;
import contract.data.DataForContractTest;
import contract.mainpage.views.MainPage;
import contract.loginpage.views.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Class User is an Actor who will be performing actions on test page.
 */

public class User {

    private WebDriver driver;
    private final String chromeDriverPath = new File("src/main/resources/chromedriver.exe").getAbsolutePath();
    private LoginPage loginPage;
    private MainPage mainPage;
    private NewContractPage newContractPage;

    /**
     * Constructor.
     */
    public User() {}

    /**
     * Setting up environment for using Chrome driver.
     */
    public void openWebBrowser() {

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        newContractPage = new NewContractPage(driver);
    }

    /**
     * Opening requested page and validation if it succeeded.
     */
    public void openProvidedUrl() { loginPage.openHomePage(); }

    /**
     * Performing logging without giving password.
     */
    public void executeLoginAttemptWithoutProvidingPassword() {

        loginPage.clickInLoginInputField();
        loginPage.setLogin();
        loginPage.clickInLoginButton();
    }

    /**
     * Checking alert message and accepting it.
     */
    public void checkDisplayedMessageAndAcceptIt() {

        boolean isAlertPresent = false;
        while (!isAlertPresent)
            if (!loginPage.getAlert().equals(DataForContractTest.getAlertMessage())) {}
            else if (loginPage.getAlert().equals(DataForContractTest.getAlertMessage())) isAlertPresent = true;
        loginPage.clickOk();
    }

    /**
     * Logging in proper way.
     */
    public void executeProperLoginProcedure() {

        loginPage.clickInPasswordInputField();
        loginPage.setPassword();
        loginPage.clickInLoginButton();
    }

    /**
     * Verification of result from correct logging procedure.
     */
    public void checkIfYouWereAbleToLoginCorrectly() {

        boolean isUserPageVisible = false;
        while (!isUserPageVisible) {
            try {
                mainPage.getLoggedUserName();
            }
            catch (org.openqa.selenium.NoSuchElementException e) {
                continue;
            }
            if (mainPage.getLoggedUserName().equals(DataForContractTest.getLoggedUserName())) {
                isUserPageVisible = true;
            }
        }
    }

    /**
     * Opening new contract.
     */
    public void openAddContract() { mainPage.openNewContract(); }

    /**
     * Checking if new contract tab is open.
     */
    public void checkIfAddContractWasDisplayed() {

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs .get(1));
        assertEquals(DataForContractTest.getAddContractPageTitle(), newContractPage.getNewContractPageTitle()); }

    /**
     * Filling fields with data.
     */
    public void fillFieldsOnDisplayedContract() {

        newContractPage.fillSaleOdomField();
        newContractPage.fillVinField();
        newContractPage.fillFinanceTypeField();
        newContractPage.fillAmountFinancedField();
        newContractPage.fillFinanceTermField();
        newContractPage.fillLenderNumberField();
    }

    /**
     * Checking if fields were correctly filled in and if "$" sign was added to amount fields.
     */
    public void checkIfFieldsWereCorrectlyFilled() {

        assertEquals(DataForContractTest.getSaleOdom(), newContractPage.getSaleOdomValue());
        assertEquals(DataForContractTest.getVin(), newContractPage.getVinValue());
        assertEquals(DataForContractTest.getFinanceType(), newContractPage.getFinanceTypeSelected());
        assertEquals(DataForContractTest.getAmountFinanced(), newContractPage.getAmountFinancedValue());
        assertEquals(DataForContractTest.getFinanceTerm(), newContractPage.getFinanceTermValue());
        assertEquals(DataForContractTest.getLenderNumber(), newContractPage.getLenderNumberValue());
        assertEquals(DataForContractTest.getReferencedCurrencySign(), newContractPage.getCurrencySignFromAmountField());
    }

    /**
     * Checking if Year, Make and Model were decoded correctly (1988, NISSAN, Sentra SE).
     */
    public void checkIfYearMakeAndModelWereDecodedCorrectly() {

        assertEquals(DataForContractTest.getYear(), newContractPage.getYearValue());
        assertEquals(DataForContractTest.getMake(), newContractPage.getMakeValue());
        assertEquals(DataForContractTest.getModel(), newContractPage.getModelValue());
    }

    /**
     * Closing tab with currently opened contract.
     */
    public void closeAddContractTab() { newContractPage.closeContractTab(); }

    /**
     * Logging out currently logged user.
     */
    public void logOut() { mainPage.logOutCurrentUser(); }

    /**
     * Closing browser and finishing test.
     */
    public void closeBrowserAndFinishTest() {

        driver.close();
        driver.quit();
    }
}