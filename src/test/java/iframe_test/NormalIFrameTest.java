package iframe_test;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NormalIFrameTest extends Hooks {
    /**
     * 1. Land on home page
     * 2. Click on webautomation link
     * 3.Click on Iframe link
     * 4.Click on Normal Iframe link
     * 5.Verify that the header text "Inar academy" in iframe
     * 6.Verify that the paragraph is seen in frame
     */
    @Test
    void testNormalIFrame(){
        //1. Land on home page
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3.Click on Iframe link
        BrowserUtils.scrollDownWithPageDown();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickOnIframeLink();

        //4.Click on Normal Iframe link
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickOnNormalIframe();

        //5.Verify that the header text "Inar academy" in iframe
        String expectedHeader = "Inar academy";
        String actualHeader = pages.getNormalIFramePage().getHeaderInFrame();
        assertThat(expectedHeader).as("Header in Frame is different from expected header").isEqualTo(actualHeader);

        //6.Verify that the paragraph is seen in frame
        pages.getNormalIFramePage().switchToPage();
        BrowserUtils.scrollVertically(300);
        BrowserUtils.wait(1.0);
        String expectedParagraph = "This domain is for use in illustrative examples in documents."+
                " You may use this domain in literature without prior coordination or asking for permission.";
        String actualParagraph = pages.getNormalIFramePage().getParagraphInFrame();
        assertThat(expectedParagraph).as("Paragraph in Frame is different from expected Paragraph").isEqualTo(actualParagraph);
    }
}
