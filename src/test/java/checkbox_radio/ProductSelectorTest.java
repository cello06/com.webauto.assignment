package checkbox_radio;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductSelectorTest extends Hooks {
    /**
     *  1.Open the browser and navigate to the webautomation page
     * 2.Click on the 'checkbox radio' button
     * 3.Click on the 'product selector' button
     * 4.Click 'Brand 2' element
     * 5.Verify it is clicked and verify it is displayed in preview section
     * 6.Click 'Rectangle' element
     * 7.Verify it is clicked and verify it is displayed in preview section
     * 8.Click all 'select a shape' elements
     * 9.Verify that only one element is selected
     * 10.Click 'Shadow' element and verify it is clicked
     * 11.Click 'Border' element and verify it is clicked and displayed in preview section
     * 12.Click 'Back-ground' element and verify it is clicked and displayed in preview section
     * 13.Verify that all check-boxes are selected
     * */
    @Test
    void testProductSelectorFunctionality(){
        //1.Open the browser and navigate to the webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the 'checkbox radio' button
        pages.getWebAutomationPage().clickCheckboxRadioLink();

        // 3.Click on the 'product selector' button
        pages.getWebAutomationPage().clickProductSelectorLink();
        BrowserUtils.scrollVertically(400);
        BrowserUtils.wait(1.0);

        //4.Click 'Brand 2' element
        pages.getProductSelectorPage().clickElementByName("brands","Brand 2");

        //5.Verify it is clicked and verify it is displayed in preview section
        boolean isSelected = pages.getProductSelectorPage().checkElementIsSelected("brands","Brand 2");
        boolean isDisplayed = pages.getProductSelectorPage().checkElementIsDisplayed("Brand 2");

        assertTrue(isSelected,"Element is not selected");
        assertTrue(isDisplayed,"Element is not displayed");

        //6.Click 'Rectangle' element
        pages.getProductSelectorPage().clickElementByName("shapes","Rectangle");

        //7.Verify it is clicked and verify it is displayed in preview section
        isSelected = pages.getProductSelectorPage().checkElementIsSelected("shapes","Rectangle");
        isDisplayed = pages.getProductSelectorPage().checkElementIsDisplayed("rectangle");

        assertTrue(isSelected,"Element is not selected");
        assertTrue(isDisplayed,"Element is not displayed");

        //8.Click all 'select a shape' elements
        pages.getProductSelectorPage().clickElementByName("shapes","square");
        pages.getProductSelectorPage().clickElementByName("shapes","rectangle");
        pages.getProductSelectorPage().clickElementByName("shapes","circle");
        pages.getProductSelectorPage().clickElementByName("shapes","pill");

        //9.Verify that only one element is selected
        int expectedCountOfSelectedElements = 1;
        int actualCountOfSelectedElements = pages.getProductSelectorPage().getCountOfSelectedElements("shapes");

        assertEquals(expectedCountOfSelectedElements,actualCountOfSelectedElements,"Count of selected elements is not true");

        //10.Click 'Shadow' element and verify it is clicked
        pages.getProductSelectorPage().clickElementByName("styles","color");

        isSelected = pages.getProductSelectorPage().checkElementIsSelected("styles","color");
        isDisplayed = pages.getProductSelectorPage().checkElementIsDisplayed("color");

        assertTrue(isSelected,"Element is not selected");


        //11.Click 'Border' element and verify it is clicked and displayed in preview section
        pages.getProductSelectorPage().clickElementByName("styles","border");

        isSelected = pages.getProductSelectorPage().checkElementIsSelected("styles","border");
        isDisplayed = pages.getProductSelectorPage().checkElementIsDisplayed("border");

        assertTrue(isSelected,"Element is not selected");
        assertTrue(isDisplayed,"Element is not displayed");

        //12.Click 'Back-ground' element and verify it is clicked and displayed in preview section
        pages.getProductSelectorPage().clickElementByName("styles","background-color");

        isSelected = pages.getProductSelectorPage().checkElementIsSelected("styles","background-color");
        isDisplayed = pages.getProductSelectorPage().checkElementIsDisplayed("background-color");

        assertTrue(isSelected,"Element is not selected");
        assertTrue(isDisplayed,"Element is not displayed");

        //13.Verify that all check-boxes are selected
        expectedCountOfSelectedElements = 3;
        actualCountOfSelectedElements = pages.getProductSelectorPage().getCountOfSelectedElements("styles");

        assertEquals(expectedCountOfSelectedElements,actualCountOfSelectedElements,"Count of selected elements is not true");

    }
}
