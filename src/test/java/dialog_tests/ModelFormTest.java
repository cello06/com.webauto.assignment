package dialog_tests;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModelFormTest extends Hooks {
    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the dialog button
     * 3.Click on the model form button
     * 4.Click create account button
     * 5.Enter 'Celalettin' to name text field
     * 6.Enter 'Aktürk' to surname text field
     * 7.Enter 'celalettin@email.com' to e-mail text field
     * 8.Click on submit button
     * 9.Verify that account successfully created
     */
    @Test
    void testModelFormFunctionality() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the dialog button
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickDialogLink();

        //3.Click on the model form button
        BrowserUtils.scrollVertically(300);
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickModelFormLink();

        //4.Click create account button
        pages.getModelFormPage().clickOnCreateAccountButton();

        //5.Enter 'Celalettin' to name text field
        pages.getModelFormPage().enterName("Celalettin");

        //6.Enter 'Aktürk' to surname text field
        pages.getModelFormPage().enterSurname("Aktürk");

        //7.Enter 'celalettin@email.com' to e-mail text field
        pages.getModelFormPage().enterEmail("celalettin@email.com");

        //8.Click on submit button
        pages.getModelFormPage().clickSubmitButton();

        // 9.Verify that account successfully created
        List<String> rows = new ArrayList<>(pages.getModelFormPage().getRows());
        boolean isContain = rows.contains("Celalettin Aktürk celalettin@email.com");

        assertTrue(isContain, "Account is not correctly created!");
    }
}
