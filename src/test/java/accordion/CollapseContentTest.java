package accordion;

import base_test.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollapseContentTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the URL
     * 2. Click on Web automation link
     * 3. Click on Accordion button
     * 4. Click on Collapse Content button
     * 5. Click first element and verify that its pane collapsed
     * 6. Click second element and verify that its pane collapsed
     * 7. Click third element and verify that its pane collapsed
     * 8. Click fourth element and verify that its pane collapsed
     */
    @Test
    void testCollapseContentFunctionality() {
        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Accordion button
        pages.getWebAutomationPage().clickAccordionLink();
        BrowserUtils.scrollVertically(400);
        BrowserUtils.wait(1.0);

        //4. Click on Collapse Content button
        pages.getWebAutomationPage().clickCollapseContend();

        //5. Click first element(first element is already clicked) and verify that its pane collapsed
        //pages.getCollapseContentPage().clickElementByName("first");
        boolean isPaneCollapsed = pages.getCollapseContentPage().isGivenSectionOpened("1");
        assertTrue(isPaneCollapsed, "Pane is not collapsed!");

        //6. Click second element and verify that its pane collapsed
        pages.getCollapseContentPage().clickElementByName("second");
        isPaneCollapsed = pages.getCollapseContentPage().isGivenSectionOpened("2");
        assertTrue(isPaneCollapsed, "Pane is not collapsed!");

        //7. Click third element and verify that its pane collapsed
        pages.getCollapseContentPage().clickElementByName("third");
        isPaneCollapsed = pages.getCollapseContentPage().isGivenSectionOpened("3");
        assertTrue(isPaneCollapsed, "Pane is not collapsed!");

        //8. Click fourth element and verify that its pane collapsed
        pages.getCollapseContentPage().clickElementByName("fourth");
        isPaneCollapsed = pages.getCollapseContentPage().isGivenSectionOpened("4");
        assertTrue(isPaneCollapsed, "Pane is not collapsed!");
    }
}
