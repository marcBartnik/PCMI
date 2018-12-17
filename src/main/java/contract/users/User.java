package contract.users;

import contract.newcontractpage.views.NewContractPage;
import contract.data.DataForContractTest;
import contract.mainpage.views.MainPage;
import contract.loginpage.views.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Class User is an Actor who will be performing actions on test page.
 */

public class User {

    private WebDriver driver;
    private final String chromeDriverPath = new File("src/main/resources/chromedriver.exe").getAbsolutePath();
    private LoginPage loginPage;
    private String alertMessage = DataForContractTest.getAlertMessage();
    private String loggedUserName = DataForContractTest.getLoggedUserName();
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

        assertEquals(loginPage.getAlert(), alertMessage);
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

        assertEquals(mainPage.getLoggedUserName(), loggedUserName);  //TODO start running test from checking this
    }

    /**
     * Opening new contract.
     */
    public void openAddContract() { mainPage.openNewContract(); }

    /**
     * Checking if new contract page is open.
     */
    public void checkIfAddContractWasDisplayed() { assertEquals(newContractPage.getNewContractPageTitle(), DataForContractTest.getAddContractPageTitle()); }

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

        assertEquals(newContractPage.getSaleOdomValue(), DataForContractTest.getSaleOdom());
        assertEquals(newContractPage.getVinValue(), DataForContractTest.getVin());
        assertEquals(newContractPage.getFinanceTypeSelected(), DataForContractTest.getFinanceType());
        assertEquals(newContractPage.getAmountFinancedValue(), DataForContractTest.getAmountFinanced());
        assertEquals(newContractPage.getFinanceTermValue(), DataForContractTest.getFinanceTerm());
        assertEquals(newContractPage.getLenderNumberValue(), DataForContractTest.getLenderNumber());
        assertEquals(newContractPage.getCurrencySignFromAmountField(), DataForContractTest.getReferencedCurrencySign());
    }

    /**
     * Checking if Year, Make and Model were decoded correctly (1988, NISSAN, Sentra SE).
     */
    public void checkIfYearMakeAndModelWereDecodedCorrectly() {

        assertEquals(newContractPage.getYearValue(), DataForContractTest.getYear());
        assertEquals(newContractPage.getMakeValue(), DataForContractTest.getMake());
        assertEquals(newContractPage.getModelValue(), DataForContractTest.getModel());
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