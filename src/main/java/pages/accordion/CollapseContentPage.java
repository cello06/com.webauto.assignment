package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;

import java.util.List;

public class CollapseContentPage extends WebAutomationPage {
    @FindBy(css = "#accordion-2-cc > h3:nth-child(1)")
    private WebElement firstElement;

    @FindBy(css = "#accordion-2-cc > h3:nth-child(3)")
    private WebElement secondElement;

    @FindBy(css = "#accordion-2-cc > h3:nth-child(5)")
    private WebElement thirdElement;

    @FindBy(css = "#accordion-2-cc > h3:nth-child(7)")
    private WebElement fourthElement;

    @FindBy(css = "#accordion-2-cc > h3")
    private List<WebElement> allElements;

    public boolean isGivenSectionOpened(String sectionOrder) {
        return allElements.get(Integer.parseInt(sectionOrder) - 1).getAttribute("aria-selected").equalsIgnoreCase("true");
    }

    public void clickElementByName(String elementOrder) {
        switch (elementOrder) {
            case "first" -> firstElement.click();
            case "second" -> secondElement.click();
            case "third" -> thirdElement.click();
            case "fourth" -> fourthElement.click();
            default -> System.out.println("Wrong element order for clicking!");
        }
    }
}
