package selenium.wojtekkoczwara.Steps;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Pages.BasePage;

public class BaseStep {

    public WebDriver driver;
    public BaseStep(WebDriver driver) {
        this.driver = driver;
    }

//    public void switchTabs() {
//        var oldTab = driver.getWindowHandle();
//    }

    @SneakyThrows
    public <T extends BasePage> T at(Class<T> pageType) {
        return pageType.getDeclaredConstructor(driver.getClass()).newInstance(driver);
    }
}
