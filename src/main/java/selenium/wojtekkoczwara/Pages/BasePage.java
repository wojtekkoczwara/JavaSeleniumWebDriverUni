package selenium.wojtekkoczwara.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private Select select;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public BasePage(WebDriver driver, By parentElement) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(new DefaultElementLocatorFactory(this.driver.findElement(parentElement)), this);
    }

    public WebElement locateVisibleElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendKeysToElement(WebElement element, String textToInsert) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(textToInsert);
    }

    public void selectElement(WebElement element, Object selectionProperty, boolean isValue) {

        wait.until(ExpectedConditions.visibilityOf(element));
        select = new Select(element);

        if(selectionProperty.getClass().isInstance(int.class)) {
            select.selectByIndex((int) selectionProperty);
            return;
        }

        if(selectionProperty.getClass().isInstance(String.class)) {

            if(!isValue) {
                select.selectByVisibleText((String) selectionProperty);
                return;
            }

            else {
                select.selectByValue((String) selectionProperty);
                return;
            }
        }

        throw new InvalidArgumentException("Element should be visible text, value or int ");
    }

    public abstract void waitToLoad();
}
