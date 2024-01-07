package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HandlesTest extends Hooks {

    /**
     * 1. Open the browser and navigate to the page
     * 2. Click on the draggable button
     * 3. Click on the 'handles' button
     * 4. Drag first draggable element without using handle
     * 5. Verify that first draggable element didn't move
     * 6. Drag first draggable element by using handle
     * 7. Verify that first draggable element  moved
     * 8. Drag the second draggable element without using handle
     * 9. Verify that second draggable element didn't move
     * 10 Drag the second draggable element by handle
     * 11.Verify that second draggable element moved
     */
    @Test
    void testHandlesFunctionality() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. Click on the 'handles' button
        pages.getWebAutomationPage().clickHandlesLink();

        //get initial position of first draggable element
        int initialX = pages.getHandlesPage().getLocationOfFirstElementX();
        int initialY = pages.getHandlesPage().getLocationOfFirstElementY();

        //4. Drag first draggable element without using handle
        pages.getHandlesPage().dragFirstElementWithoutHandle();

        //get final position of first draggable element
        int finalX = pages.getHandlesPage().getLocationOfFirstElementX();
        int finalY = pages.getHandlesPage().getLocationOfFirstElementY();

        //5. Verify that first draggable element didn't move
        assertThat(initialX).as("First draggable element moved without using handle").isEqualTo(finalX);
        assertThat(initialY).as("First draggable element moved without using handle").isEqualTo(finalY);

        //6. Drag first draggable element by using handle
        pages.getHandlesPage().dragFirstElementByHandle();

        //get final position of first draggable element
        finalX = pages.getHandlesPage().getLocationOfFirstElementX();
        finalY = pages.getHandlesPage().getLocationOfFirstElementY();

        //7. Verify that first draggable element  moved
        assertThat(finalX).as("First draggable element has some problems about draggability by handle").isGreaterThan(initialX);
        assertThat(finalY).as("First draggable element has some problems about draggability by handle").isGreaterThan(initialY);

        //get initial position of second draggable element
        initialX = pages.getHandlesPage().getLocationOfSecondElementX();
        initialY = pages.getHandlesPage().getLocationOfSecondElementY();

        // 8. Drag the second draggable element without using handle
        pages.getHandlesPage().dragSecondElementWithoutHandle();

        //get final position of second draggable element
        finalX = pages.getHandlesPage().getLocationOfSecondElementX();
        finalY = pages.getHandlesPage().getLocationOfSecondElementY();

        //9. Verify that second draggable element moved
        assertThat(finalX).as("Second draggable element has some problems about draggability while dragged without using handle").isGreaterThan(initialX);
        assertThat(finalX).as("Second draggable element has some problems about draggability while dragged without using handle").isGreaterThan(initialY);

        //get initial position of second draggable element
        initialX = pages.getHandlesPage().getLocationOfSecondElementX();
        initialY = pages.getHandlesPage().getLocationOfSecondElementY();

        //10 Drag the second draggable element by handle
        pages.getHandlesPage().dragSecondElementByHandle();

        //get final position of second draggable element
        finalX = pages.getHandlesPage().getLocationOfSecondElementX();
        finalY = pages.getHandlesPage().getLocationOfSecondElementY();

        //11.Verify that second draggable element do not moved with handle
        assertThat(finalX).as("Second draggable element can move by handle").isEqualTo(initialX);
        assertThat(finalY).as("Second draggable element can move by handle").isEqualTo(initialY);


    }
}
