package selenium.wojtekkoczwara.Assertions.HeaderAssertions;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Assertions.BaseAssertion;
import selenium.wojtekkoczwara.Pages.Header.HeaderPage;

import static org.assertj.core.api.Assertions.*;

public class HeaderAssertions extends BaseAssertion {

    public HeaderAssertions(WebDriver driver) {
        super(driver);
    }

    public void VerifyHeaderTextMatchDesired(String headerText) {

        assertThat(at(HeaderPage.class).getHeaderTitleText().equals(headerText))
                .overridingErrorMessage("Text from application doesn't match \"" + headerText + "\"")
                .isTrue();
    }

}
