package selenium.wojtekkoczwara.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.wojtekkoczwara.Pages.Data_Tables.ListPage;

import java.util.List;

public class DataTableSteps extends BaseStep {

    public DataTableSteps(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getElementsListWithoutHeaders() {

       var dataList =  at(ListPage.class).getListElements();
      return dataList.stream()
               .filter(x -> !x.getAttribute("class").equals(ListPage.listHeader)).toList();
    }
}
