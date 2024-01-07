package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class RevertDraggablePositionTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the page
     * 2. Click on the droppable button
     * 3. Click on the Revert draggable position button
     * 4. Drag the revertWhenDroppedElement and drop it to the target-droppable element
     * 5. Verify that target-droppable element has changed to 'Dropped'! and the revertWhenDroppedElement return to its first place
     * 6. Drag the revertWhenNotDroppedElement and drop it to the another place
     * 7. Verify that the revertWhenNotDroppedElement did not change its position
     */
    @Test
    void testRevertDraggablePositionFunctionality() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. Click on the Revert draggable position button
        pages.getWebAutomationPage().clickRevertDraggablePosition();

        //get initial position of the revertWhenDroppedElement
        int initialX = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDroppedElementX();
        int initialY = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDroppedElementY();

        //4. Drag the revertWhenDroppedElement and drop it to the target-droppable element
        pages.getRevertDraggablePositionPage().dragRevertWhenDroppedElementToTargetDroppableElement();

        BrowserUtils.wait(2.0);

        //get initial position of the revertWhenDroppedElement
        int finalX = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDroppedElementX();
        int finalY = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenDroppedElementY();

        //5. Verify that target-droppable element has changed to 'Dropped'! and the revertWhenDroppedElement return to its first place
        String expectedTextOnTargetDroppableElement = "Dropped!";
        String actualTextOnTargetDroppableElement = pages.getRevertDraggablePositionPage().getTargetDroppableElementText();

        assertThat(expectedTextOnTargetDroppableElement).as("Text is different!").isEqualTo(actualTextOnTargetDroppableElement);
        assertThat(initialX).as("Reverting to same position is not functioning").isCloseTo(finalX, within(1));
        assertThat(initialY).as("Reverting to same position is not functioning").isCloseTo(finalY, within(1));

        //get initial position of the revertWhenNotDroppedElement
        initialX = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDroppedElementX();
        initialY = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDroppedElementY();

        //6. Drag the revertWhenNotDroppedElement and drop it to the another place
        pages.getRevertDraggablePositionPage().dragRevertWhenNotDroppedElement();
        BrowserUtils.wait(2.0);

        //get final position of the revertWhenNotDroppedElement
        finalX = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDroppedElementX();
        finalY = pages.getRevertDraggablePositionPage().getLocationOfRevertWhenNotDroppedElementY();

        //7. Verify that the revertWhenNotDroppedElement did not change its position
        assertThat(initialX).as("Reverting to same position is not functioning").isCloseTo(finalX, within(1));
        assertThat(initialY).as("Reverting to same position is not functioning").isCloseTo(finalY, within(1));


    }
}
