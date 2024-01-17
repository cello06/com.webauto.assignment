package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebAutomationPage;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class IconsPage extends WebAutomationPage {
    @FindBy(css = "#menu-w-icons > li > div")
    private List<WebElement> elementsInMenuBox;

    @FindBy(id = "ui-id-72")
    private WebElement saveElement;

    @FindBy(id = "ui-id-73")
    private WebElement zoomInElement;

    @FindBy(id = "ui-id-74")
    private WebElement zoomOutElement;

    @FindBy(css = "#menu-w-icons > li:nth-child(4)")
    private WebElement printElement;

    @FindBy(id = "ui-id-76")
    private WebElement playbackElement;

    @FindBy(id = "ui-id-81")
    private WebElement learnMoreAboutElement;

    public List<String> getSelectableElementsNameList() {
        List<String> selectableElements = new ArrayList<>();
        for (WebElement element : elementsInMenuBox) {
            actions.moveToElement(element).perform();
           // BrowserUtils.wait(1.0);
            if (element.getAttribute("class").contains("ui-state-active")) {
                selectableElements.add(element.getText().toLowerCase());
            }

        }
        return selectableElements;
    }

    public int getNonSelectableElementsNameList() {
        return elementsInMenuBox.size() - getSelectableElementsNameList().size();
    }

    public boolean checkSelectabilityOfElementByName(String elementName) {
        List<String> selectableElements = getSelectableElementsNameList();

        if (selectableElements.contains(elementName.toLowerCase())) {
            return true;
        }
        return false;
    }


}
