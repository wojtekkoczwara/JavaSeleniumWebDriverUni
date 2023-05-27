package selenium.wojtekkoczwara.Assertions.ContactUsAssertions;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Assertions.BaseAssertion;
import selenium.wojtekkoczwara.Pages.Conctact_Us.ContactUsSuccessPage;

public class ContactUsAssertions extends BaseAssertion {

    public ContactUsAssertions(WebDriver driver) {
        super(driver);
    }

    public ContactUsAssertions VerifyContactAssertionSuccessMessage () {
        Assertions.assertThat(at(ContactUsSuccessPage.class).getSuccessMessage().getText()
                .equals("Thank You for your Message!")).isTrue();
        return this;
    }
}
