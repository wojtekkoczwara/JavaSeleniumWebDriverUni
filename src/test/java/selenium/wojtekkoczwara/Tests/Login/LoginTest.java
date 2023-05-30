package selenium.wojtekkoczwara.Tests.Login;

import org.testng.annotations.Test;
import selenium.wojtekkoczwara.Assertions.LoginAssertions.LoginAssertions;
import selenium.wojtekkoczwara.Configs.PropertyLoader;
import selenium.wojtekkoczwara.Models.PropertyNames;
import selenium.wojtekkoczwara.Models.ThumbnailNames;
import selenium.wojtekkoczwara.Steps.HomePageSteps;
import selenium.wojtekkoczwara.Steps.LoginSteps;
import selenium.wojtekkoczwara.Tests.BaseTest;

import static selenium.wojtekkoczwara.Models.PropertyNames.*;

public class LoginTest extends BaseTest {

    private final String userName = PropertyLoader.getProperty(incorrectUserName);
    private final String password = PropertyLoader.getProperty(incorrectPassword);

    @Test
    public void ShouldDisplayValidationFailedPopup() {
        with(HomePageSteps.class).goToTabByName(ThumbnailNames.LOGIN_PORTAL);

        with(LoginSteps.class).submitLogin(userName, password);
        assertion(LoginAssertions.class).VerifyLoginPopupErrorMessage();
    }
}
