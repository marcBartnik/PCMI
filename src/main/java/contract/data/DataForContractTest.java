package contract.data;

/**
 * Class stores necessary contract.data for running tests
 */

public class DataForContractTest {

    private static final String LOGIN = "tester@pcmi.com";
    private static final String PASSWORD = "qQadfi4$2";
    private static final String URL = "https://qa-alpha-auto.pcrsdev.com";
    private static final String TEST_PAGE_TITLE = "Policy Claim and Reporting Solutions";
    private static final String ALERT_MESSAGE = "Password is required.";
    private static final String LOGGED_USER_NAME = "Test Dealer";
    private static final String ADD_CONTRACT_PAGE_TITLE = "Add Contract";
    private static final String SALE_ODOM = "100";
    private static final String VIN = "3N4BB41D7W2794739";
    private static final String FINANCE_TYPE = "Loan";
    private static final String AMOUNT_FINANCED = "10000";
    private static final String FINANCE_TERM = "26";
    private static final String LENDER_NUMBER = "LN00000012";
    private static final char REFERENCED_CURRENCY_SIGN = '$';
    private static final String YEAR = "1988";
    private static final String MAKE = "NISSAN";
    private static final String MODEL = "Sentra SE";

    public static String getLogin() { return LOGIN; }

    public static String getPassword() {return PASSWORD; }

    public static String getUrl() { return URL; }

    public static String getTestPageTitle() { return TEST_PAGE_TITLE; }

    public static String getAlertMessage() { return ALERT_MESSAGE; }

    public static String getLoggedUserName() { return LOGGED_USER_NAME; }

    public static String getAddContractPageTitle() { return ADD_CONTRACT_PAGE_TITLE; }

    public static String getSaleOdom() { return SALE_ODOM; }

    public static String getVin() { return VIN; }

    public static String getFinanceType() { return FINANCE_TYPE; }

    public static String getAmountFinanced() { return AMOUNT_FINANCED; }

    public static String getFinanceTerm() { return FINANCE_TERM; }

    public static String getLenderNumber() { return LENDER_NUMBER; }

    public static char getReferencedCurrencySign() { return REFERENCED_CURRENCY_SIGN; }

    public static String getYear() { return YEAR; }

    public static String getMake() { return MAKE; }

    public static String getModel() { return MODEL; }
}