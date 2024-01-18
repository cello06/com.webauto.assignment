package control_group_tests;

import base_test.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ToolbarTest extends Hooks {

    /**
     *  1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the select date range button
     * 4.Get initial style of text
     * 5.Select %150 from zoom drop box
     * 6.Select 'Red' as background
     * 7.Select 'Yellow' as text color
     * 8.Click 'B' button to make text 'font-weigh' bold
     * 9.Click 'I' button to make text 'font-style' italic
     * 10.Click 'U' button to make text 'text-decoration' underlined
     * 11.Get final style of text
     * 12.Verify that styles of initial and final text are different
     * 13.Verify that final text style is as expected
     * */
    @Test
    void testTextStyleToolBarSynchronization(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the control group button
        pages.getWebAutomationPage().clickOnControlGroupLink();

        //3.Click on the toolbar button
        pages.getWebAutomationPage().clickToolbarLink();

        //4.Get initial style of text
        Map<String,String> initialFeaturesOfText = pages.getToolbarPage().getTextStyleFeatures();

        //5.Select %150 from zoom drop box
        pages.getToolbarPage().selectZoomRatio("150%");

        //6.Select 'Red' as background
        pages.getToolbarPage().selectBackgroundColor("Red");

        //7.Select 'Yellow' as text color
        pages.getToolbarPage().selectTextColor("Yellow");

        //8.Click 'B' button to make text 'font-weigh' bold
        pages.getToolbarPage().clickOnBoldButton();

        //9.Click 'I' button to make text 'font-style' italic
        pages.getToolbarPage().clickItalicButton();

        //10.Click 'U' button to make text 'text-decoration' underlined
        pages.getToolbarPage().clickUnderlineButton();

        //11.Get final style of text
        Map<String,String> finalFeaturesOfText = pages.getToolbarPage().getTextStyleFeatures();

        //12.Verify that styles of initial and final text are different
        assertNotEquals(initialFeaturesOfText,finalFeaturesOfText);

        //13.Verify that final text style is as expected
        String actualZoom =  finalFeaturesOfText.get("zoom");
        String expectedZoom = "150%";
        assertEquals(expectedZoom,actualZoom,"Zoom ratio is not correct");

        String actualBackgroundColor =finalFeaturesOfText.get("background-color");
        String expectedBackgroundColor ="red";
        assertEquals(expectedBackgroundColor,actualBackgroundColor,"Background color is not correct");

        String actualTextColor =finalFeaturesOfText.get("color");
        String expectedTextColor ="yellow";
        assertEquals(expectedTextColor,actualTextColor,"Text color is not correct");

        String actualFontWeight = finalFeaturesOfText.get("font-weight");
        String expectedFontWeight ="bold";
        assertEquals(expectedFontWeight,actualFontWeight,"Font-weight is not correct");

        String actualFontStyle = finalFeaturesOfText.get("font-style");
        String expectedFontStyle = "italic";
        assertEquals(expectedFontStyle,actualFontStyle);

        String actualTextDecoration = finalFeaturesOfText.get("text-decoration");
        String expectedTextDecoration = "underline";
        assertEquals(expectedTextDecoration,actualTextDecoration,"Text decoration is not correct");

    }
}
