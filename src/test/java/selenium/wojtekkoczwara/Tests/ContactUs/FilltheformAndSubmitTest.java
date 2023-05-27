package selenium.wojtekkoczwara.Tests.ContactUs;

import org.testng.annotations.Test;
import selenium.wojtekkoczwara.Assertions.ContactUsAssertions.ContactUsAssertions;
import selenium.wojtekkoczwara.Configs.PropertyLoader;
import selenium.wojtekkoczwara.Models.PropertyNames;
import selenium.wojtekkoczwara.Steps.ContactUsSteps;
import selenium.wojtekkoczwara.Steps.HomePageSteps;
import selenium.wojtekkoczwara.Tests.BaseTest;

import static selenium.wojtekkoczwara.Models.ThumbnailNames.*;

public class FilltheformAndSubmitTest extends BaseTest {

    private final String firstName = PropertyLoader.getProperty(PropertyNames.firstName);
    private final String lastName = PropertyLoader.getProperty(PropertyNames.lastName);
    private final String email = PropertyLoader.getProperty(PropertyNames.email);
    private final String comments = PropertyLoader.getProperty(PropertyNames.comments);

    @Test
    public void shouldFillTheContactUsFormAndSubmit() {

        with(HomePageSteps.class).goToTabByName(CONTACT_US);

        with(ContactUsSteps.class).FillTheFormAndSubmit(firstName, lastName, email, comments);
        assertion(ContactUsAssertions.class).VerifyContactAssertionSuccessMessage();
    }
}
