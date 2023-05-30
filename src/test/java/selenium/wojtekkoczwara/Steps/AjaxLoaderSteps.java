package selenium.wojtekkoczwara.Steps;

import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Pages.AjaxLoaderPage.AjaxLoaderModalPage;
import selenium.wojtekkoczwara.Pages.AjaxLoaderPage.AjaxLoaderPage;

public class AjaxLoaderSteps extends BaseStep{

    public AjaxLoaderSteps(WebDriver driver) {
        super(driver);
    }

    public AjaxLoaderSteps WaitForButtonVisibleAndClick() {
        at(AjaxLoaderPage.class).getClickMeButton().click();
        return this;
    }

    public AjaxLoaderSteps CloseModalWindow() {
        at(AjaxLoaderModalPage.class).getCloseModalButton().click();
        return this;
    }
}
