package selenium.wojtekkoczwara.Assertions.AjaxLoaderAssertions;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Assertions.BaseAssertion;
import selenium.wojtekkoczwara.Pages.AjaxLoaderPage.AjaxLoaderModalPage;

public class AjaxLoaderAssertions extends BaseAssertion {

    public AjaxLoaderAssertions(WebDriver driver) {
        super(driver);
    }

    public AjaxLoaderAssertions VerifyModalWindowText() {

        SoftAssertions.assertSoftly( x -> {
            x.assertThat( at(AjaxLoaderModalPage.class).getModalBody().getText()
                        .equals("The waiting game can be a tricky one; " +
                        "this exercise will hopefully improve your understandings of the various types of waits."))
                    .overridingErrorMessage("Text on modal body doesn't match").isTrue();
            x.assertThat(at(AjaxLoaderModalPage.class).getModalHeader().getText()
                    .contains("Well Done For Waiting....!!!"))
                    .overridingErrorMessage("Text on modal header doesn't match").isTrue();
        });

        return this;
    }
}
