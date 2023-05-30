package selenium.wojtekkoczwara.Steps;

import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Pages.Login.LoginPage;

public class LoginSteps extends BaseStep {

    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    public LoginSteps submitLogin(String userName, String password) {

        at(LoginPage.class).getUserName().sendKeys(userName);
        at(LoginPage.class).getPassword().sendKeys(password);
        at(LoginPage.class).getLoginButton().click();
        return this;

    }
}
