package pcmitest;

import contract.users.User;
import org.junit.Test;

/**
 * Class collect tests which will be run against https://qa-alpha-auto.pcrsdev.com page.
 */

public class TestContractPage {

    private static User user = new User();

    /**
     * Abstract: User login on qa-alpha-auto and check contract.
     */
    @Test
    public void checkContract() {

        user.openWebBrowser();
        user.openProvidedUrl();
        user.executeLoginAttemptWithoutProvidingPassword();
        user.checkDisplayedMessageAndAcceptIt();
        user.executeProperLoginProcedure();
        user.checkIfYouWereAbleToLoginCorrectly();
        user.openAddContract();
        user.checkIfAddContractWasDisplayed();
        user.fillFieldsOnDisplayedContract();
        user.checkIfFieldsWereCorrectlyFilled();
        user.checkIfYearMakeAndModelWereDecodedCorrectly();
        user.closeAddContractTab();
        user.logOut();
        user.closeBrowserAndFinishTest();
    }
}