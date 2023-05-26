package selenium.wojtekkoczwara.Pages.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.wojtekkoczwara.Pages.BasePage;

public class HeaderPage extends BasePage {

    @FindBy(className = "navbar-header")
    private WebElement headerContainer;

    @FindBy(id="nav-title")
    private WebElement headerTitle;


    public HeaderPage(WebDriver driver) {
        super(driver, By.className("navbar-header"));
        this.waitToLoad();
    }

    public WebElement getHeaderTitle() {
        return headerTitle;
    }

    public String getHeaderTitleText() {
        return getHeaderTitle().getText();
    }

    @Override
    public void waitToLoad() {
       wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.className("navbar-header"))));
    }
}
