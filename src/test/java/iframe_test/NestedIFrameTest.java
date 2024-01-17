package iframe_test;

import base_test.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class NestedIFrameTest extends Hooks {
    /**
     * 1. Land on home page
     * 2. Click on webautomation link
     * 3.Click on Iframe link
     * 4.Click on Nested Iframe link
     * 5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
     */
    @Test
    void testNestedIframe(){
        //1. Land on home page
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);

        //3.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();

        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);

        //4.Click on Nested Iframe link
        pages.getWebAutomationPage().clickOnNestedIframe();

        //5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
        String expectedHeader = "Join Inar Academy's\n" +
                "Intro Session";


        String actualHeader = pages.getNestedIframePage().getHeaderInFrame();
        Assertions.assertEquals(expectedHeader, actualHeader, "Wrong Header !");


    }
}
