package pages.slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;
import utils.Driver;

public class SnapToIncrementsPage extends WebAutomationPage {
    @FindBy(id = "amount-snap-to-increments")
    private WebElement donationAmount;

    @FindBy(css = "#slider-snap-to-increments > span")
    private WebElement slideBarHandle;

    public String getDonationAmount(){
        return donationAmount.getAttribute("value").substring(1);}
    public void slideSlideBarWithHandle(){
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDropBy(slideBarHandle, 100, 0).perform();
    }

}
