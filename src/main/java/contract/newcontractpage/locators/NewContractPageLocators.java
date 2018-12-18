package contract.newcontractpage.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewContractPageLocators {

    private WebDriver driver;				    //driver which allows to navigate on a web page
    private By saleOdomLocator;				    //field which represents sale odometer
    private By vinLocator;                      //field which represents vin
    private By financeTypeLocator;		        //field which represents finance type
    private By financeTypeLoanLocator;
    private By amountFinancedLocator;		    //field which represents amount financed
    private By financeTermLocator;     		    //field which represents finance term
    private By lenderNumberLocator;     		//field which represents lender number

    private By saleOdomValueLocator;     		//field which represents retrieved sale odometer value
    private By vinValueLocator;                 //field which represents retrieved vin value
    private By financeTypeSelectedLocator;      //field which represents retrieved finance type value
    private By amountFinancedValueLocator;      //field which represents retrieved amount financed value
    private By financeTermValueLocator;         //field which represents retrieved finance term value
    private By lenderNumberValueLocator;        //field which represents retrieved lender number value

    private By yearValueLocator;                //field which represents retrieved year value
    private By makeValueLocator;                //field which represents retrieved make value
    private By modelValueLocator;               //field which represents retrieved model value

    private By closeContractTabButtonLocator;   //field which represents close new contract tab

    /**
     * Web element representatives on a page.
     * @param driver enable performing actions on a page
     */
    public NewContractPageLocators(WebDriver driver){

        this.driver = driver;

        //locators which help in finding fields to type into
        saleOdomLocator = new By.ByXPath("(//input[@type='text'])[2]");
        vinLocator = new By.ByXPath("(//input[@type='text'])[4]");
        financeTypeLocator = new By.ByXPath("//div[3]/div/div[2]/form/div/div/div/div/div/div[2]/div/div");
        financeTypeLoanLocator = new By.ByXPath("//*[@id=\"3b96c431-5926-d495-a675-d1a9c79dbe6d\"]/div");
        amountFinancedLocator = new By.ByXPath("(//input[@type='text'])[16]");
        financeTermLocator = new By.ByXPath("(//input[@type='text'])[17]");
        lenderNumberLocator = new By.ByXPath("(//input[@type='text'])[21]");

        //locators which help in retrieving values from fields
        saleOdomValueLocator = new By.ByXPath("//*[@id=\"formAddContract\"]/div[2]/div[2]");
        vinValueLocator = new By.ByXPath("//*[@id=\"formAddContract\"]/div[4]/div[2]");
        financeTypeSelectedLocator = new By.ByXPath("//*[@id=\"divFinanceType\"]");
        amountFinancedValueLocator = new By.ByXPath("//*[@id=\"divPanelFinancialInfo\"]/form/div[3]/div[2]");
        financeTermValueLocator = new By.ByXPath("//*[@id=\"divPanelFinancialInfo\"]/form/div[4]/div[2]/span");
        lenderNumberValueLocator = new By.ByXPath("//*[@id=\"689982a6-1e54-a6a5-064a-4df7ed11b78b\"]/div[1]/div[1]/div[2]/div/div");

        //locators which help in retrieving values from predefined fields
        yearValueLocator = new By.ByXPath("//*[@id=\"formAddContract\"]/div[5]/div[2]");
        makeValueLocator = new By.ByXPath("//*[@id=\"formAddContract\"]/div[6]/div[2]");
        modelValueLocator = new By.ByXPath("//*[@id=\"formAddContract\"]/div[7]/div[2]");

        //locator which helps in closing tab with current contract
        closeContractTabButtonLocator = new By.ByXPath("//*[@id=\"ddCostType\"]/li/ul/li[5]/a");
    }

    /**
     * Finding sale odometer field.
     * @return saleOdomLocator
     */
    public WebElement saleOdom() { return driver.findElement(saleOdomLocator); }

    /**
     * Finding typed value into sale odometer field.
     * @return saleOdomValueLocator
     */
    public WebElement saleOdomValue() { return  driver.findElement(saleOdomValueLocator); }

    /**
     * Finding vin field.
     * @return vinLocator
     */
    public WebElement vin() { return driver.findElement(vinLocator); }

    /**
     * Finding typed value into vin field.
     * @return vinValueLocator
     */
    public WebElement vinValue() {return  driver.findElement(vinValueLocator);}

    /**
     * Finding finance type field.
     * @return financeTypeLocator
     */
    public WebElement financeType() { return driver.findElement(financeTypeLocator); }

    /**
     * Finding loan as finance type.
     * @return financeTypeLoanLocator
     */
    public WebElement financeTypeLoan() { return driver.findElement(financeTypeLoanLocator); }

    /**
     * Finding selected finance type.
     * @return financeTypeSelectedLocator
     */
    public WebElement financeTypeSelected() { return driver.findElement(financeTypeSelectedLocator); }

    /**
     * Finding amount financed field.
     * @return amountFinancedLocator
     */
    public WebElement amountFinanced() { return driver.findElement(amountFinancedLocator); }

    /**
     * Finding typed amount financed.
     * @return amountFinancedValueLocator
     */
    public WebElement amountFinancedValue() { return driver.findElement(amountFinancedValueLocator); }

    /**
     * Finding finance term field.
     * @return financeTermLocator
     */
    public WebElement financeTerm() { return driver.findElement(financeTermLocator); }

    /**
     * Finding typed finance term.
     * @return financeTermValueLocator
     */
    public WebElement financeTermValue() { return driver.findElement(financeTermValueLocator); }

    /**
     * Finding lender number.
     * @return lenderNumberLocator
     */
    public WebElement lenderNumber() { return driver.findElement(lenderNumberLocator); }

    /**
     * Finding typed lender number.
     * @return lenderNumberValueLocator
     */
    public WebElement lenderNumberValue() { return driver.findElement(lenderNumberValueLocator); }

    /**
     * Finding decoded year.
     * @return yearValueLocator
     */
    public WebElement yearValue() { return driver.findElement(yearValueLocator); }

    /**
     * Finding decoded make.
     * @return makeValueLocator
     */
    public WebElement makeValue() { return driver.findElement(makeValueLocator); }

    /**
     * Finding decoded model.
     * @return modelValueLocator
     */
    public WebElement modelValue() { return driver.findElement(modelValueLocator); }

    /**
     * Finding close contract tab button
     * @return closeContractTabButtonLocator
     */
    public WebElement closeContractTabButton() { return driver.findElement(closeContractTabButtonLocator); }
}