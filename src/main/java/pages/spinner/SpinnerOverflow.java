package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;
import utils.BrowserUtils;

import java.util.Locale;

public class SpinnerOverflow extends WebAutomationPage {
    @FindBy(id = "spinner-overflow")
    private WebElement valueInTheTextBox;

    @FindBy(xpath = "(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n'])[6]")
    private WebElement upButtonElement;

    @FindBy(xpath = "(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s'])[6]")
    private WebElement downButtonElement;

    public int getValueInTheText(){
        return Integer.parseInt(valueInTheTextBox.getAttribute("aria-valuenow"));
    }
    public void clickUpButton(){
        upButtonElement.click();
    }
    public void clickDownButton(){
        downButtonElement.click();
    }
    public void clickOnButtonAccordingToParameter(String buttonToClick,int countOfClick){
        switch (buttonToClick.toLowerCase(Locale.ROOT)) {
            case "up" -> {
                for (int i = 0; i < countOfClick; i++) {
                    upButtonElement.click();
                }
            }
            case "down" -> {
                for (int i = 0; i < countOfClick; i++) {
                    downButtonElement.click();
                }
            }
            default -> System.out.println("Wrong button name to click!");
        }
    }
}
