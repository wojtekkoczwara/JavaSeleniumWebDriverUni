package selenium.wojtekkoczwara.Tests;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.TestInstance;
import selenium.wojtekkoczwara.Assertions.BaseAssertion;
import selenium.wojtekkoczwara.Configs.BrowserFactory;
import selenium.wojtekkoczwara.Configs.PropertyLoader;
import selenium.wojtekkoczwara.Models.PropertyNames;
import selenium.wojtekkoczwara.Steps.BaseStep;

import java.time.Duration;

public abstract class BaseTest {

    private WebDriver driver;
    private static String baseUrl = PropertyLoader.getProperty(PropertyNames.baseUrl);


    @BeforeTest
    public void setUp() {
        driver = BrowserFactory.getBrowserDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(baseUrl);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @SneakyThrows
    public <T extends BaseStep> T with(Class<T> step) {
        return step.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }

    @SneakyThrows
    public <T extends BaseAssertion> T assertion(Class<T> assertion) {
        return assertion.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }
}
