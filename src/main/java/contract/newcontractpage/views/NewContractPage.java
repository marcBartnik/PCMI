package contract.newcontractpage.views;

import contract.data.DataForContractTest;
import contract.newcontractpage.locators.NewContractPageLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NewContractPage {

    private WebDriver driver;
    private NewContractPageLocators newContractPageLocators;      //here are stored all needed elements for performing actions on new contract page
    private Actions actions;


    /**
     * Constructor.
     * @param driver which allows to navigate on a web page
     */
    public NewContractPage(WebDriver driver) {

        this.driver = driver;
        newContractPageLocators = new NewContractPageLocators(driver);
        actions = new Actions(driver);}

    /**
     * Adding items to new contract page.
     */
    public String getNewContractPageTitle() { return driver.getTitle(); }
    /**
    * Checking that correct product was added.
    */
    public void fillSaleOdomField() {

        newContractPageLocators.saleOdom().click();
        newContractPageLocators.saleOdom().sendKeys(Keys.DELETE);
        newContractPageLocators.saleOdom().sendKeys(DataForContractTest.getSaleOdom());
    }

    /**
     * Getting price for product
     */
    public void fillVinField() {

        newContractPageLocators.vin().click();
        newContractPageLocators.saleOdom().sendKeys(Keys.DELETE);
        newContractPageLocators.vin().sendKeys(DataForContractTest.getVin());
    }
    /**
     * Checking that correct product was added.
     */
    public void fillFinanceTypeField() {

        newContractPageLocators.financeType().click();
        newContractPageLocators.financeType().click();
//        actions.moveToElement(newContractPageLocators.financeType()).sendKeys(DataForContractTest.getFinanceType());
//        actions.moveToElement(newContractPageLocators.financeType()).sendKeys(Keys.ENTER);
//        actions.moveToElement(newContractPageLocators.financeTypeLoan()).click(); //.sendKeys(newContractPageLocators.financeType(), DataForContractTest.getFinanceType());
    }

    /**
     * Fill amount financed with particular value.
     */
    public void fillAmountFinancedField() {

        newContractPageLocators.amountFinanced().click();
        newContractPageLocators.amountFinanced().sendKeys(DataForContractTest.getAmountFinanced());
    }

    /**
     * Getting url of product from new contract page.
     */
    public void fillFinanceTermField() {

        newContractPageLocators.financeTerm().click();
        newContractPageLocators.financeTerm().sendKeys(Keys.DELETE);
        newContractPageLocators.financeTerm().sendKeys(DataForContractTest.getFinanceTerm());
    }

    /**
     * Getting url of product from new contract page.
     */
    public void fillLenderNumberField() {

        newContractPageLocators.lenderNumber().click();
        newContractPageLocators.lenderNumber().sendKeys(DataForContractTest.getLenderNumber());
        newContractPageLocators.lenderNumber().sendKeys(Keys.ENTER);
    }

    /**
     * Getting typed value into sale odometer field.
     * @return text value from sale odom field
     */
    public String getSaleOdomValue() { return newContractPageLocators.saleOdomValue().getText(); }

    /**
     * Getting typed value into vin field.
     * @return text value from vin field
     */
    public String getVinValue() { return newContractPageLocators.vinValue().getText(); }

    /**
     * Getting selected value finance type field.
     * @return text value finance type field
     */
    public String getFinanceTypeSelected() { return newContractPageLocators.financeTypeSelected().getText(); }

    /**
     * Getting typed value into amount financed field.
     * @return text value from amount financed field
     */
    public String getAmountFinancedValue() { return newContractPageLocators.amountFinancedValue().getText(); }

    /**
     * Getting typed value into finance term field.
     * @return text value from finance term field
     */
    public String getFinanceTermValue() { return newContractPageLocators.financeTermValue().getText(); }

    /**
     * Getting typed value into lender number field.
     * @return text value from lender number field
     */
    public String getLenderNumberValue() { return newContractPageLocators.lenderNumberValue().getText(); }

    /**
     * Getting predefined value from year field.
     * @return text value from sale odom
     */
    public String getYearValue() { return newContractPageLocators.yearValue().getText(); }

    /**
     * Getting predefined value from make field.
     * @return text value from make field
     */
    public String getMakeValue() { return newContractPageLocators.makeValue().getText(); }

    /**
     * Getting predefined value from model value field.
     * @return text value from model value field
     */
    public String getModelValue() { return newContractPageLocators.modelValue().getText(); }

    /**
     * Closing current contract tab.
     */
    public void closeContractTab() {

        newContractPageLocators.closeContractTabButton().click();
        newContractPageLocators.closeContractTabButton().sendKeys(Keys.ENTER);
    }

    /**
     * Get currency sign located at the beginning of amount financed field.
     * @return currentCurrencySign
     */
    public char getCurrencySignFromAmountField() { return getAmountFinancedValue().charAt(0); }
}
