package selenium.wojtekkoczwara.Pages.Conctact_Us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.wojtekkoczwara.Pages.BasePage;

public class ContactUsPage extends BasePage {

    @FindBy(tagName = "h2")
    private WebElement header;

    @FindBy(name = "first_name")
    private WebElement firstNameInput;

    @FindBy(name = "last_name")
    private WebElement lastNameInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "message")
    private WebElement comments;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    @FindBy(css = "[type='reset']")
    private WebElement resetButton;

    public ContactUsPage(WebDriver driver) {
        super(driver, By.id("contact_form"));
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getComments() {
        return comments;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getResetButton() {
        return resetButton;
    }

    @Override
    public void waitToLoad() {
    }
}
