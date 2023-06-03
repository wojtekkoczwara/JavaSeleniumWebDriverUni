package selenium.wojtekkoczwara.Pages.Data_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.wojtekkoczwara.Pages.BasePage;

import java.util.List;

public class ListPage extends BasePage {

    public static final String listHeader = "list-header";

    @FindBy(tagName = "li")
    private List<WebElement> elementList;

    public ListPage(WebDriver driver) {
        super(driver, By.xpath("//*[text()='Lists']/parent::div"));
    }

    public List<WebElement> getListElements() {
        return elementList;
    }



    @Override
    public void waitToLoad() {

    }
}
