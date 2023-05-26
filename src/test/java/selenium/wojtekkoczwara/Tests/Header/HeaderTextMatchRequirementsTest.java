package selenium.wojtekkoczwara.Tests.Header;

import org.testng.annotations.Test;
import selenium.wojtekkoczwara.Assertions.HeaderAssertions.HeaderAssertions;
import selenium.wojtekkoczwara.Tests.BaseTest;

public class HeaderTextMatchRequirementsTest extends BaseTest {

    private static final String HEADER_TEXT = "WebdriverUniversity.com (New Approach To Learning)";

    @Test
    public void shouldHeaderMatchDeliveredText() {
        assertion(HeaderAssertions.class).VerifyHeaderTextMatchDesired(HEADER_TEXT);
    }

}
