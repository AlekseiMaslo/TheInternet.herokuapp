package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Parameters("browser")
    @BeforeClass

    public void setup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("chrome")) {
            startDriver(browser);
        } else if (browser.equalsIgnoreCase("firefox")) {
            startDriver(browser);
        } else {
            throw new Exception("Browser is not correct");
        }
        getWait();
    }

    @BeforeMethod
    protected void BeforeMethod() {
        try {
            System.out.println("Browser open, get web page");
            getWeb();
        } catch (Exception e) {
            stopDriver();
            throw e;
        }
    }

    protected void getWeb() {
        BaseUtils.get(getDriver());
    }

    protected void startDriver(String browser) {
        driver = BaseUtils.createDriver(browser);
    }

    @AfterMethod
    protected void stopDriver() {
        driver.quit();
        wait = null;

        System.out.println("Browser closed");
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }
}
