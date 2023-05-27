package selenium.wojtekkoczwara.Steps;

import org.openqa.selenium.WebDriver;
import selenium.wojtekkoczwara.Pages.Conctact_Us.ContactUsPage;

public class ContactUsSteps extends BaseStep {

    public ContactUsSteps(WebDriver driver) {
        super(driver);
    }

    public ContactUsSteps FillTheForm(String firstName, String lastName, String emailAddress, String message) {

        at(ContactUsPage.class).getFirstNameInput().sendKeys(firstName);
        at(ContactUsPage.class).getLastNameInput().sendKeys(lastName);
        at(ContactUsPage.class).getEmailInput().sendKeys(emailAddress);
        at(ContactUsPage.class).getComments().sendKeys(message);

        return this;
    }

    public ContactUsSteps FillTheFormAndSubmit(String firstName, String lastName, String emailAddress, String message) {
        FillTheForm(firstName, lastName, emailAddress, message);
        at(ContactUsPage.class).getSubmitButton().click();

        return this;
    }

    public ContactUsSteps FillTheFormAndReset(String firstName, String lastName, String emailAddress, String message) {
        FillTheForm(firstName, lastName, emailAddress, message);
        at(ContactUsPage.class).getResetButton().click();

        return this;
    }
}
