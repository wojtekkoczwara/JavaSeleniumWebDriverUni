package selenium.wojtekkoczwara.Steps;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Pages.BasePage;

public abstract class BaseStep {

    public WebDriver driver;
    public BaseStep(WebDriver driver) {
        this.driver = driver;
    }

    public void switchTabs() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }


    @SneakyThrows
    public <T extends BasePage> T at(Class<T> pageType) {
        return pageType.getDeclaredConstructor(WebDriver.class).newInstance(driver);
    }
}
