package selenium.wojtekkoczwara.Assertions.CommonAssertions;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Assertions.BaseAssertion;

import java.util.List;

public class ListAssertions extends BaseAssertion {

    public ListAssertions(WebDriver driver) {
        super(driver);
    }

    public ListAssertions AssertListContainsAnotherList(List<String> webDataList, List<String> validationList) {
        SoftAssertions.assertSoftly( x -> {
            x.assertThat(webDataList.stream().map(String::toLowerCase).toList()).asList().containsAll(validationList);
        });
        return this;
    }
}
