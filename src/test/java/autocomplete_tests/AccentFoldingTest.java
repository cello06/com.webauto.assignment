package autocomplete_tests;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccentFoldingTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the Webautomation page
     * 2. Click on the autocomplete button
     * 3. Click on the 'accent folding' button
     * 4. Enter 'Jo' into the text box
     * 5. Verify that autocomplete box show words starting with 'Jo' and 'Jö'
     * 6. Enter 'Jö' into the text box
     * 7. Verify that results under the box start with 'jö'
     * 8. Verify that results under the box does not contain words starts with 'jo'
     */

    @Test
    void testAccentFoldingFunctionality() {
        //1. Open the browser and navigate to the Webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the autocomplete button
        pages.getWebAutomationPage().clickOnAutocompleteLink();

        //3. Click on the 'accent folding' button
        pages.getWebAutomationPage().clickAccentFoldingLink();

        // 4. Enter 'Jo' into the text box
        pages.getAccentFoldingPage().enterTextToTextBox("Jo");

        // 5. Verify that autocomplete box show words starting with 'Jo' and 'Jö'
        BrowserUtils.wait(1.0);
        List<String> accentFoldingBox = pages.getAccentFoldingPage().getAccentFoldingBoxValues();
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("Jo");
        expectedValues.add("Jö");
        boolean conditionForPassingTest = pages.getAccentFoldingPage().checkAccentFoldingBoxFunctionality(accentFoldingBox, expectedValues);
        assertTrue(conditionForPassingTest, "Accent Folding Box is not properly functioning");


        //6. Enter 'Jö' into the text box
        pages.getAccentFoldingPage().clearTextBox();
        pages.getAccentFoldingPage().enterTextToTextBox("Jö");

        //7. Verify that results under the box only start with 'jö'
        accentFoldingBox = null;
        expectedValues.clear();
        BrowserUtils.wait(1.0);
        accentFoldingBox = pages.getAccentFoldingPage().getAccentFoldingBoxValues();
        expectedValues.add("jö");
        conditionForPassingTest = pages.getAccentFoldingPage().checkAccentFoldingBoxFunctionality(accentFoldingBox, expectedValues);
        assertTrue(conditionForPassingTest, "Accent Folding Box is not properly functioning");

        //8. Verify that results under the box does not contain words starts with 'jo'
        BrowserUtils.wait(1.0);
        String nonExpectedValue = "jo";
        conditionForPassingTest = pages.getAccentFoldingPage().checkAccentFoldingBoxFunctionality(accentFoldingBox, nonExpectedValue);
        assertFalse(conditionForPassingTest, "Accent Folding Box is not properly functioning");
    }
}
