package selenium.wojtekkoczwara.Tests.Ajax_Loader;

import org.testng.annotations.Test;
import selenium.wojtekkoczwara.Assertions.AjaxLoaderAssertions.AjaxLoaderAssertions;
import selenium.wojtekkoczwara.Models.ThumbnailNames;
import selenium.wojtekkoczwara.Steps.AjaxLoaderSteps;
import selenium.wojtekkoczwara.Steps.HomePageSteps;
import selenium.wojtekkoczwara.Tests.BaseTest;

public class AjaxLoaderTest extends BaseTest {

    @Test
    public void ShouldWaitfForAjaxLoaderToFinishAndClickButton() {

        with(HomePageSteps.class).goToTabByName(ThumbnailNames.AJAX_LOADER);

        with(AjaxLoaderSteps.class).WaitForButtonVisibleAndClick();

        assertion(AjaxLoaderAssertions.class).VerifyModalWindowText();

        with(AjaxLoaderSteps.class).CloseModalWindow();
    }
}
