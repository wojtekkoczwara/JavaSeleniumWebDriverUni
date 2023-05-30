package selenium.wojtekkoczwara.Pages.AjaxLoaderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.wojtekkoczwara.Pages.BasePage;

public class AjaxLoaderPage extends BasePage {

    @FindBy(id="loader")
    private WebElement ajaxLoader;

    @FindBy(css = "[data-toggle='modal'] p")
    private WebElement clickMeButton;

    public AjaxLoaderPage(WebDriver driver) {
        super(driver);
        this.waitToLoad();
    }

    public WebElement getAjaxLoader() {
        return ajaxLoader;
    }

    public WebElement getClickMeButton() {
        return locateVisibleElement(clickMeButton);
    }

    @Override
    public void waitToLoad() {
        waitForElementToBeHidden(driver.findElement(By.id("loader")));
    }
}
