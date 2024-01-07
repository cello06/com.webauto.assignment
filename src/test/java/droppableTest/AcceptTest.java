package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AcceptTest extends Hooks {

    /**
     * 1. Open the browser and navigate to the page
     * 2. click on the droppable button
     * 3. click on the 'accept' button
     * 4. Drag the draggableButNotDroppable element and drop it to the target-droppable element
     * 5. Verify that the draggableButNotDroppable element has been dragged but not dropped to the target-droppable element
     * 6. Drag the draggableAndDroppable element and drop it to the target-droppable element
     * 7. Verify that the text of the target-droppable element has changed to 'Dropped'!
     */

    @Test
    void testAcceptFunctionality() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the droppable button
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3. click on the 'accept' button
        pages.getWebAutomationPage().clickAcceptLink();

        //get initial position of draggableButNotDroppable element
        int initialX = pages.getAcceptPage().getDraggableButNotDroppableElementLocationX();
        int initialY = pages.getAcceptPage().getDraggableButNotDroppableElementLocationY();

        //4. Drag the draggableButNotDroppable element and drop it to the target-droppable element

        pages.getAcceptPage().dragDraggableButNotDroppableElementToTheTargetDroppableElement();

        //get final position of draggableButNotDroppable element
        int finalX = pages.getAcceptPage().getDraggableButNotDroppableElementLocationX();
        int finalY = pages.getAcceptPage().getDraggableButNotDroppableElementLocationY();

        //5. Verify that the draggableButNotDroppable element has been dragged but not dropped to the target-droppable element
        assertThat(finalX).as("draggableButNotDroppable element has some problem about draggability").isGreaterThan(initialY);
        String expectedTextOnTargetDroppableElement = "accept: '#draggable'";
        String actualTextOnTargetDroppableElement = pages.getAcceptPage().getTextOnTheTargetDroppableElement();
        assertThat(actualTextOnTargetDroppableElement).as("Text is different!").isEqualTo(expectedTextOnTargetDroppableElement);

        //6. Drag the draggableAndDroppable element and drop it to the target-droppable element
        pages.getAcceptPage().dragDraggableAndDroppableElementToTheTargetDroppableElement();

        //7. Verify that the text of the target-droppable element has changed to 'Dropped'!
        expectedTextOnTargetDroppableElement = "Dropped!";
        actualTextOnTargetDroppableElement = pages.getAcceptPage().getTextOnTheTargetDroppableElement();
        assertThat(actualTextOnTargetDroppableElement).as("Text is different!").isEqualTo(expectedTextOnTargetDroppableElement);

    }
}
