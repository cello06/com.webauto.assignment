package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private List<WebElement> defaultFunctionalityLink;

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDefaultFunctionalityLink() {
        defaultFunctionalityLink.get(0).click();
    }

}
