package selenium.wojtekkoczwara.Pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.wojtekkoczwara.Pages.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "text")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    @Override
    public void waitToLoad() {

    }
}
