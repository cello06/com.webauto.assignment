package alerttypeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AlertTypesTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the page
     * 2. Click on the alert button
     * 3. Click on the 'alert types' button
     * 4. Click on show alert button
     * 5. Verify that 'This is an alert!' message occurred on the page and confirm alert
     * 6. Click on show confirm button
     * 7. Verify that  'Are you sure?' message occurred on the page and confirm alert
     * 8. Verify that you see second alert message 'Confirmed!' occurred and confirm alert
     * 9. Click on show prompt button
     * 10.Verify that alert message 'Enter your name' text and text box occurred
     * 11.Enter 'Inar Academy' into the text box and confirm alert
     * 12.Verify that 'Hello, Inar Academy' message occurred as another alert and confirm alert
     */
    @BeforeEach
    void setUpTestEnvironment() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(2.0);


        //2. Click on the alert button

        pages.getWebAutomationPage().clickAlertsLink();

        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(2.0);

        // 3. Click on the 'alert types' button
        // pages.getWebAutomationPage().clickAlertTypesLink();
    }

    @Test
    void testShowAlertButtonFunctionality() {
        //4. Click on show alert button
        pages.getAlertTypesPage().clickShowAlertButton();
        BrowserUtils.wait(2.0);

        //5. Verify that 'This is an alert!' message occurred on the page and confirm alert
        String expectedMessage = "This is an alert!";
        String actualMessage = pages.getAlertTypesPage().getAlertMessage();
        assertThat(expectedMessage).as("Alert message is different from expected!").isEqualTo(actualMessage);
        pages.getAlertTypesPage().confirmAlertMessage();
    }

    @Test
    void testShowConfirmButtonFunctionality() {
        //6. Click on show confirm button
        pages.getAlertTypesPage().clickShowConfirmButton();
        BrowserUtils.wait(2.0);

        //7. Verify that  'Are you sure?' message occurred on the page and confirm alert
        String expectedMessage = "Are you sure?";
        String actualMessage = pages.getAlertTypesPage().getAlertMessage();
        assertThat(expectedMessage).as("Alert message is different from expected!").isEqualTo(actualMessage);
        pages.getAlertTypesPage().confirmAlertMessage();

        // 8. Verify that you see second alert message 'Confirmed!' occurred and confirm alert
        expectedMessage = "Confirmed!";
        actualMessage = pages.getAlertTypesPage().getAlertMessage();
        assertThat(expectedMessage).as("Alert message is different from expected!").isEqualTo(actualMessage);
        pages.getAlertTypesPage().confirmAlertMessage();

        //to test cancel option
        pages.getAlertTypesPage().clickShowConfirmButton();
        BrowserUtils.wait(2.0);
        pages.getAlertTypesPage().cancelAlertMessage();

    }

    @Test
    void testShowPromptButtonFunctionality() {
        //9. Click on show prompt button
        pages.getAlertTypesPage().clickShowPromptButton();

        //10.Verify that alert message 'Enter your name' text
        String expectedText = "Enter your name:";
        String actualText = pages.getAlertTypesPage().getAlertMessage();
        assertThat(expectedText).as("Alert message is different from expected!").isEqualTo(actualText);

        //11.Enter 'Inar Academy' into the text box and confirm alert
        pages.getAlertTypesPage().enterMessageIntoAlert("Inar Academy");
        pages.getAlertTypesPage().confirmAlertMessage();
        BrowserUtils.wait(1.0);

        //12.Verify that 'Hello, Inar Academy' message occurred as another alert and confirm alert
        expectedText = "Hello, Inar Academy";
        actualText = pages.getAlertTypesPage().getAlertMessage();
        pages.getAlertTypesPage().confirmAlertMessage();


    }

    @AfterEach
    void tearDownTestEnvironment() {
        //Return To Home Page
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickInarAcademyImageLink();
    }

}
