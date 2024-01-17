package resizable_test;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SynchronousResizeTest extends Hooks {
    /**
     * 1.Open the browser and navigate to the page
     * 2.Click on the resizable button
     * 3.Click on the synchronous resize button
     * 4.Get initial size of second element
     * 5.Drag the resize handle of first element to resize
     * 6.Verify that the second element has been resized
     */
    @Test
    void testSynchronousResizeFunctionality() {
        //1.Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the resizable button
        pages.getWebAutomationPage().clickOnResizableLink();

        //3.Click on the synchronous resize button
        pages.getWebAutomationPage().clickSynchronousResizeLink();

        //4.Get initial size of second element
        int initialWidth = pages.getSynchronousResizePage().getWidthOfSecondElement();
        int initialHeight = pages.getSynchronousResizePage().getHeightOfSecondElement();

        //5.Drag the resize handle of first element to resize
        pages.getSynchronousResizePage().resizeTheFirstElement();

        BrowserUtils.wait(2.0);

        //Get final size of second element
        int finalWidth = pages.getSynchronousResizePage().getWidthOfSecondElement();
        int finalHeight = pages.getSynchronousResizePage().getHeightOfSecondElement();

        //6.Verify that the second element has been resized
        assertThat(finalWidth).as("Size of second element is not changing with synchronise").isGreaterThan(initialWidth);
        assertThat(finalHeight).as("Size of second element is not changing with synchronise").isGreaterThan(initialHeight);

    }
}
