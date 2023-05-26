package selenium.wojtekkoczwara.Configs;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import selenium.wojtekkoczwara.Models.PropertyNames;

public class BrowserFactory {

    public static WebDriver getBrowserDriver() {

        return switch (PropertyLoader.getProperty(PropertyNames.browser)) {
            case "chrome" -> new ChromeDriver();
            case "chromium" -> new EdgeDriver();
            case "firefox" -> new FirefoxDriver();
            case "safari" -> new SafariDriver();
            default -> throw new InvalidArgumentException("Incorrect browser name");
        };
    }

}
