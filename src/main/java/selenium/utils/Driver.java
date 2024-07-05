package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static selenium.utils.BaseTest.driver;

public class Driver {


    //public WebDriver driver;
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public WebDriver initDriver(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {

            driver.set(new ChromeDriver());
            driver.get();

        }else if(browser.equalsIgnoreCase("firefox")) {
            driver.set(new FirefoxDriver());
            driver.get();
        }

        return driver.get();

    }
}
