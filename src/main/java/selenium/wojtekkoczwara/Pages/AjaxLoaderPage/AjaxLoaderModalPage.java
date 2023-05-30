package selenium.wojtekkoczwara.Pages.AjaxLoaderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.wojtekkoczwara.Pages.BasePage;

public class AjaxLoaderModalPage extends BasePage {

    @FindBy(className = "modal-header")
    private WebElement modalHeader;

    @FindBy(css = ".modal-body")
    private WebElement modalBody;

    @FindBy(css = "[data-dismiss='modal']")
    private WebElement closeModalButton;

    public AjaxLoaderModalPage(WebDriver driver) {
        super(driver, By.className("modal-content"));
    }

    public WebElement getModalHeader() {
        return locateVisibleElement(modalHeader);
    }

    public WebElement getModalBody() {
        return locateVisibleElement(modalBody);
    }

    public WebElement getCloseModalButton() {
        return locateVisibleElement(closeModalButton);
    }

    @Override
    public void waitToLoad() {

    }
}
