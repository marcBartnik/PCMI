package testrunners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pcmitest.TestContractPage;

/**
 * Class which run all tests from scenario.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestContractPage.class
})

public class TestRunner { }