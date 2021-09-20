package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseUtils {

    static {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    static void get(WebDriver driver) {
        driver.get("http://the-internet.herokuapp.com/");
    }

    public static WebDriver createDriver(String browser) {
        WebDriver driver;
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--window-size=1920,1080");

            driver = new ChromeDriver(chromeOptions);

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return driver;
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--window-size=1920,1080");

            driver = new FirefoxDriver(firefoxOptions);

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return driver;
        } else {
            return null;
        }
    }
}
