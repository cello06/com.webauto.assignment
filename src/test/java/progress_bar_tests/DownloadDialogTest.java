package progress_bar_tests;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DownloadDialogTest extends Hooks {
    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the progress bar button
     * 3.Click on the download dialog button
     * 4.Get start download button text
     * 5.Click on start download button
     * 6.Verify that text on the start download button changed into 'Downloading...'
     * 7.Click cancel download button
     * 8.7.Verify that text on the start download button turned into initial state
     */
    @Test
    void startDownloadButtonFunctionality(){
        //1.Open the browser and navigate to the webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the progress bar button
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickOnProgressBarLink();

        //3.Click on the download dialog button
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickDownloadDialogLink();

        //4.Get start download button text
        String initialTextOnButton = pages.getDownloadDialogPage().getStartDownloadButtonText();
        String expectedTextOnButton = "Start Download";
        assertEquals(expectedTextOnButton,initialTextOnButton,"Text on button is not correct");

        //5.Click on start download button
        pages.getDownloadDialogPage().clickStartDownloadButton();

        //6.Verify that text on the start download button changed into 'Downloading...'
        String finalTextOnButton = pages.getDownloadDialogPage().getStartDownloadButtonText();
        expectedTextOnButton = "Downloading...";
        assertEquals(expectedTextOnButton,finalTextOnButton,"Text on button is not correct");

        //7.Click cancel download button
        pages.getDownloadDialogPage().clickCancelDownloadButton();
        finalTextOnButton = pages.getDownloadDialogPage().getStartDownloadButtonText();
        expectedTextOnButton = "Start Download";
        assertEquals(expectedTextOnButton,finalTextOnButton,"Text on button is not correct");


    }
    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the progress bar button
     * 3.Click on the download dialog button
     * 4.Click on start download button
     * 5.Get initial size of progress bar
     * 6.Wait 1 second
     * 7.Get final size of progress bar
     * 8.Ver(ify that final size is bigger than initial size
     */
    @Test
    void testProgressbarFunctionality(){
        //1.Open the browser and navigate to the webautomation page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the progress bar button
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickOnProgressBarLink();

        //3.Click on the download dialog button
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickDownloadDialogLink();

        //4.Click on start download button
        pages.getDownloadDialogPage().clickStartDownloadButton();

        //5.Get initial size of progress bar
        BrowserUtils.wait(2.0);
        double initialSizeOfProgressBar = pages.getDownloadDialogPage().getProgressBarLevel();

        //6.Wait 1 second
        BrowserUtils.wait(1.0);

        //7.Get final size of progress bar
        double finalSizeOfProgressBar = pages.getDownloadDialogPage().getProgressBarLevel();

        //8.Ver(ify that final size is bigger than initial size
        assertTrue(finalSizeOfProgressBar > initialSizeOfProgressBar,"Progress Bar is not functioning well");


    }

}
