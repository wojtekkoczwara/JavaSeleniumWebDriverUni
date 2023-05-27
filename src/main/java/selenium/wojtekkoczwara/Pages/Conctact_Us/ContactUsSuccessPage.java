package selenium.wojtekkoczwara.Pages.Conctact_Us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.wojtekkoczwara.Pages.BasePage;

public class ContactUsSuccessPage extends BasePage {

    @FindBy(id = "contact_reply")
    private WebElement successMessage;

    public ContactUsSuccessPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    @Override
    public void waitToLoad() {

    }
}
