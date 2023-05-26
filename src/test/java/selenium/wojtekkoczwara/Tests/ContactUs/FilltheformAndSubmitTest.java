package selenium.wojtekkoczwara.Tests.ContactUs;

import org.testng.annotations.Test;
import selenium.wojtekkoczwara.Steps.HomePageSteps;
import selenium.wojtekkoczwara.Tests.BaseTest;

import static selenium.wojtekkoczwara.Models.ThumbnailNames.*;

public class FilltheformAndSubmitTest extends BaseTest {

    @Test
    public void shouldFillTheContactUsFormAndSubmit() {

        with(HomePageSteps.class).goToTabByName(CONTACT_US);


    }
}
