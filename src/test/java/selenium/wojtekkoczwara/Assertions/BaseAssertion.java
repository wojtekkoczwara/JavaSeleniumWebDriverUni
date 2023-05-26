package selenium.wojtekkoczwara.Assertions;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Pages.BasePage;

public class BaseAssertion {

    protected final WebDriver driver;

    public BaseAssertion(WebDriver driver) {
        this.driver = driver;
    }

    @SneakyThrows
    public <T extends BasePage> T at(Class<T> pageType) {
        return pageType.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }
}
