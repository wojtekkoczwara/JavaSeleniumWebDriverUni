package selenium.wojtekkoczwara.Steps;

import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Models.ThumbnailNames;
import selenium.wojtekkoczwara.Pages.Home.Thumbnail;

public class HomePageSteps extends BaseStep {

    public HomePageSteps(WebDriver driver) {
        super(driver);
    }

    public HomePageSteps goToTabByName(ThumbnailNames thumbnailName) {

        at(Thumbnail.class).getThumbnailByName(thumbnailName).click();

        return this;
    }
}
