package selenium.wojtekkoczwara.Tests.DataTables;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.wojtekkoczwara.Assertions.CommonAssertions.ListAssertions;
import selenium.wojtekkoczwara.Models.ThumbnailNames;
import selenium.wojtekkoczwara.Steps.DataTableSteps;
import selenium.wojtekkoczwara.Steps.HomePageSteps;
import selenium.wojtekkoczwara.Tests.BaseTest;

import java.util.List;

public class ListContainAnotherListTest extends BaseTest {

    private final List<String> elementsListToAssert = List.of("asparagus", "broccoli", "kidney beans", "lentils");

    @Test
    public void ShouldListContainAnotherList() {

        with(HomePageSteps.class).goToTabByName(ThumbnailNames.DATA_TABLES_BUTTON_STATES);

       var elementsListFromWeb = with(DataTableSteps.class).getElementsListWithoutHeaders()
               .stream().map(WebElement::getText).toList();;

        assertion(ListAssertions.class).AssertListContainsAnotherList(elementsListFromWeb, elementsListToAssert);

    }
}
