package menu_tests;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IconsTest extends Hooks {
    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the menu button
     * 3.Click on the icons button
     * 4.Verify that there are 5 elements selectable and 1 element is not selectable
     * 5.Verify that 'Save' element is converted into selectable item when hover over it
     * 6.Verify that 'print' element is not converted into selectable item when hover over it
     *
     */
    @Test
    void testIconsFunctionality(){
        //1.Open the browser and navigate to the webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the menu button
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickMenuLink();

        //3.Click on the icons button
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickIconsLink();

        //4.Verify that there are 5 elements selectable and 1 element is not selectable
        List<String> actualSelectableList = pages.getIconsPage().getSelectableElementsNameList();
        BrowserUtils.wait(1.0);
        int expectedCountOfSelectableElements = 5;
        softAssertions.assertThat(actualSelectableList.size()).isEqualTo(expectedCountOfSelectableElements);

        int actualNonSelectableElements = pages.getIconsPage().getNonSelectableElementsNameList();
        int expectedCountOfNonSelectableElements = 1;
        softAssertions.assertThat(actualNonSelectableElements).isEqualTo(expectedCountOfNonSelectableElements);

        //5.Verify that 'Save' element is converted into selectable item when hover over it
        boolean checkSelectabltyOfElement = pages.getIconsPage().checkSelectabilityOfElementByName("save");
        assertTrue(checkSelectabltyOfElement,"Save element is not selectable!");

        //6.Verify that 'print' element is not converted into selectable item when hover over it
        checkSelectabltyOfElement = pages.getIconsPage().checkSelectabilityOfElementByName("print");
        assertFalse(checkSelectabltyOfElement,"Print element is selectable!");

        softAssertions.assertAll();
    }
}
