package draggable_tests;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * 1. Open the browser and navigate to the page
 * 2. Click on the draggable button
 * 3. Click on the 'constrain movement' button
 * 4. Drag the vertically draggable element by 215 pixels to the right
 * 5. Verify that vertically draggable element does not move
 * 6. Drag the vertically draggable element by 20 pixels to the downside
 * 7. Verify that vertically draggable element moved
 * 8. Drag the horizontally draggable element by 215 pixels to the right
 * 9. Verify that vertically draggable element moved
 * 10. Drag the horizontally draggable element by 20 pixels to the downside
 * 11. Verify that horizontally draggable element does not move
 * 12. Drag third draggable element outside the big box
 * 13. Verify that third draggable element does not move outside the big box
 * 14. Drag fourth draggable element outside the small box
 * 15. Verify that fourth draggable element does not move outside the small box
 */
public class ConstrainMovementTest extends Hooks {
    @Test
    void testConstrainMovementFunctionality() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        // 2. Click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. Click on the 'constrain movement' button
        pages.getWebAutomationPage().clickConstrainMovementLink();

        // get the initial X of vertically draggable element
        int initialX = pages.getConstrainMovementPage().getLocationOfVerticallyDraggableElementX();

        //4. Drag the vertically draggable element by 215 pixels to the right
        pages.getConstrainMovementPage().dragVerticallyDraggableElementByOffset(215,0);

        // get the final X of vertically draggable element
        int finalX = pages.getConstrainMovementPage().getLocationOfVerticallyDraggableElementX();

        //5. Verify that vertically draggable element does not move
        assertThat(finalX).as("Vertically Draggable Element can move horizontally!").isEqualTo(initialX);

        // get the initial Y of vertically draggable element
        int initialY = pages.getConstrainMovementPage().getLocationOfVerticallyDraggableElementY();

        //6. Drag the vertically draggable element by 20 pixels to the downside
        pages.getConstrainMovementPage().dragVerticallyDraggableElementByOffset(0,20);


        // get the final Y of vertically draggable element
        int finalY = pages.getConstrainMovementPage().getLocationOfVerticallyDraggableElementY();

        //7. Verify that vertically draggable element moved
        assertThat(finalY).as("Vertically Draggable Element can not move vertically!").isGreaterThan(initialY);

        // get the initial X of horizontally draggable element
        initialX = pages.getConstrainMovementPage().getLocationOfHorizontallyDraggableElementX();

        //8. Drag the horizontally draggable element by 215 pixels to the right
        pages.getConstrainMovementPage().dragHorizontallyDraggableElementByOffset(215,0);

        // get the final X of horizontally draggable element
        finalX = pages.getConstrainMovementPage().getLocationOfHorizontallyDraggableElementX();

        //9. Verify that vertically draggable element moved
        assertThat(finalX).as("Horizontally Draggable element can not move horizontally").isGreaterThan(initialX);

        // get the initial X of horizontally draggable element
        initialY = pages.getConstrainMovementPage().getLocationOfHorizontallyDraggableElementY();

        //10. Drag the horizontally draggable element by 20 pixels to the downside
        pages.getConstrainMovementPage().dragHorizontallyDraggableElementByOffset(0,20);

        // get the final Y of horizontally draggable element
        finalY = pages.getConstrainMovementPage().getLocationOfHorizontallyDraggableElementY();

        //11. Verify that horizontally draggable element does not move
        assertThat(finalY).as("Horizontally draggable element can also move vertically!").isEqualTo(initialY);

        BrowserUtils.scrollDownWithPageDown();

        // get the testing offsets for third draggable element
        int xOffsetForTesting = pages.getConstrainMovementPage().getWidthOfBigBoxElement() + 10;//width of big box + 10
        int yOffsetForTesting = pages.getConstrainMovementPage().getHeightOfBigBoxElement() +10;//height of big box + 10

        // get x and y coordinates of big box element
        int xOfBigBox = pages.getConstrainMovementPage().getXOfBigBoxElement();
        int yOfBigBox = pages.getConstrainMovementPage().getYOfBigBoxElement();


        //12. Drag third draggable element outside the big box
        pages.getConstrainMovementPage().dragThirdDraggableElementByOffset(xOffsetForTesting,yOffsetForTesting);

        // get the final location of third draggable element
        finalX = pages.getConstrainMovementPage().getLocationOfThirdDraggableElementX();
        finalY = pages.getConstrainMovementPage().getLocationOfThirdDraggableElementY();

        //13. Verify that third draggable element does not move outside the big box
        assertThat(finalX).isGreaterThan(xOfBigBox);
        assertThat(finalY).isGreaterThan(yOfBigBox);

        // get the testing offsets for fourth draggable element
        xOffsetForTesting = pages.getConstrainMovementPage().getWidthOfSmallBoxElement() + 10;//width of small box + 10
        yOffsetForTesting = pages.getConstrainMovementPage().getHeightOfSmallBoxElement() + 10;//height of small box + 10

        // get x and y coordinates of small box element
        int xOfSmallBox = pages.getConstrainMovementPage().getXOfSmallBoxElement();
        int yOfSmallBox = pages.getConstrainMovementPage().getYOfSmallBoxElement();

        //14. Drag fourth draggable element outside the small box
        pages.getConstrainMovementPage().dragFourthDraggableElementByOffset(xOffsetForTesting,yOffsetForTesting);

        // get the final location of fourth draggable element
        finalX = pages.getConstrainMovementPage().getLocationOfFourthDraggableElementX();
        finalY = pages.getConstrainMovementPage().getLocationOfFourthDraggableElementY();

        //15. Verify that fourth draggable element does not move outside the small box
        assertThat(finalX).isGreaterThan(xOfSmallBox);
        assertThat(finalY).isGreaterThan(yOfSmallBox);


    }

}
