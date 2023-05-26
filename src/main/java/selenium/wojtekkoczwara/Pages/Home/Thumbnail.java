package selenium.wojtekkoczwara.Pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.wojtekkoczwara.Models.ThumbnailNames;
import selenium.wojtekkoczwara.Pages.BasePage;

public class Thumbnail extends BasePage {

    public Thumbnail(WebDriver driver) {
        super(driver, By.className("thumbnail"));
    }

    public WebElement getThumbnailByName(ThumbnailNames thumbnailName)
    {
      return driver.findElement(By.xpath("//h1[contains(text(), '" + thumbnailName.containedText +"')]"));
    }

    @Override
    public void waitToLoad() {

    }
}
