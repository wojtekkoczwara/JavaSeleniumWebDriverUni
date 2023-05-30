package selenium.wojtekkoczwara.Assertions.LoginAssertions;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Assertions.BaseAssertion;

public class LoginAssertions extends BaseAssertion {

    public LoginAssertions(WebDriver driver) {
        super(driver);
    }

    public LoginAssertions VerifyLoginPopupErrorMessage() {
        Assertions.assertThat(driver.switchTo().alert().getText().equals("validation failed"))
                .overridingErrorMessage("Error message doesn't match").isTrue();
        return this;
    }
}
