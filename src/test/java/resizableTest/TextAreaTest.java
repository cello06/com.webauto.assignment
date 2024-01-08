package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;
public class TextAreaTest extends Hooks {
    /**
     * 1.Open the browser and navigate to the page
     * 2.Click on the resizable button
     * 3.Click on the textarea button
     * 4.Get initial size of textarea element
     * 5.Drag the resize handle of textarea element to resize
     * 6.Verify that size of textarea changed to default size to get ready for resizing
     * 7.Drag the resize handle of textarea element to resize
     * 8.Verify that the textarea element has been resized
     */
    @Test
    void testTextAreaResizableFunctionality(){
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        // 3.Click on the textarea button
        pages.getWebAutomationPage().clickTextAreaLink();

        //4.Get initial size of textarea element
        int initialWidth = pages.getTextAreaPage().getWidthOfTextArea();
        int initialHeight = pages.getTextAreaPage().getHeightOfTextArea();

        //5.Drag the resize handle of textarea element to resize
        pages.getTextAreaPage().resizeTheTextAreaElement();

        //Get final size of textarea element
        int finalWith = pages.getTextAreaPage().getWidthOfTextArea();
        int finalHeight = pages.getTextAreaPage().getHeightOfTextArea();

        //6.Verify that size of textarea changed to default size to get ready for resizing
        int defaultWidth = 186;
        int defaultHeight =  127;
        assertThat(finalWith).isCloseTo(defaultWidth,within(1));
        assertThat(finalHeight).isCloseTo(defaultHeight,within(1));

        //4.Get initial size of textarea element
        initialWidth = pages.getTextAreaPage().getWidthOfTextArea();
        initialHeight = pages.getTextAreaPage().getHeightOfTextArea();

        //7.Drag the resize handle of textarea element to resize
        pages.getTextAreaPage().resizeTheTextAreaElement();

        //Get final size of textarea element
        finalWith = pages.getTextAreaPage().getWidthOfTextArea();
        finalHeight = pages.getTextAreaPage().getHeightOfTextArea();

        //8.Verify that the textarea element has been resized
        assertThat(finalWith).as("Size is not changed.").isGreaterThan(initialWidth);
        assertThat(finalHeight).as("Size is not changed.").isGreaterThan(initialHeight);
    }
}
