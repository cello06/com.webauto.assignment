package autocompleteTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DefaultFunctionalityTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the Webautomation page
     * 2. Click on the autocomplete button
     * 3. Click on the 'default functionality' button
     * 4. Enter 'Ja' into the text box
     * 5. Verify that autocomplete box occurred
     * 6. Verify that results under the box start with 'ja'
     */

    @Test
    void testAutocompleteBoxFunctionality() {
        //1. Open the browser and navigate to the Webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the autocomplete button
        pages.getWebAutomationPage().clickOnAutocompleteLink();

        //3. Click on the 'default functionality' button
        pages.getWebAutomationPage().clickOnAutocompleteDefaultFunctionality();

        //4. Enter 'Ja' into the text box
        pages.getAutocompleteDefaultFunctionalityPage().enterTextToTextBox("Ja");

        //5. Verify that autocomplete box occurred
        BrowserUtils.wait(1.0);
        List<String> autoCompleteBox = pages.getAutocompleteDefaultFunctionalityPage().getAutocompleteBoxValues();
        assertFalse(autoCompleteBox.isEmpty(), "Box is empty!");

        //6. Verify that results under the box start with 'ja'
        assertTrue(pages.getAutocompleteDefaultFunctionalityPage().checkAutocompleteBoxFunctionality("Ja", autoCompleteBox),
                "Elements in box are not starting with 'Ja'");
    }

}
