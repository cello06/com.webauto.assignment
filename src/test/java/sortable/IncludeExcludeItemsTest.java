package sortable;

import base_test.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class IncludeExcludeItemsTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the URL
     * 2. Click on Web automation link
     * 3. Click on Sortable button
     * 4. Click on Include/Exclude Items button
     */
    @BeforeEach
    void setUpTestEnvironment() {
        //1. Open the browser and navigate to the page
        //2. Click on Web automation lin
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Sortable button
        pages.getWebAutomationPage().clickSortableLink();

        //4. Click on Include/Exclude Items button
        pages.getWebAutomationPage().clickIncludeExcludeItems();
        BrowserUtils.scrollVertically(300);
        BrowserUtils.wait(1.0);
    }

    /**
     * 5. Hold 'Item 1' and drag it under 'Item 4'
     * 6. Verify that 'Item 1' is sortable
     * 7. Hold '(I'm not sortable or a drop target)' element and drag it under 'Item 4'
     * 8. Verify that '(I'm not sortable or a drop target)' element is not sortable
     * 9. Hold 'Item 4' and drag it above the '(I'm not sortable or a drop target)' element
     * 10.Verify that 'Item 4' can not be droppable above '(I'm not sortable or a drop target)' element
     */

    @Test
    void testSortableFunctionalityInUpperBox() {
        //5. Hold 'Item 1' and drag it under 'Item 4'
        pages.getIncludeExcludeItemsPage().moveUpperBoxElementByOffsets("Item 1", "Item 4");

        //6. Verify that 'Item 1' is in the fourth order
        String expectedFourthElement = "Item 1";
        String actualFourthElement = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("upper", "4");

        Assertions.assertThat(actualFourthElement).as("Item 4 is not sortable!").isEqualTo(expectedFourthElement);

        //7. Hold '(I'm not sortable or a drop target)' element and drag it under 'Item 1'
        pages.getIncludeExcludeItemsPage().moveUpperBoxElementByOffsets("(I'm not sortable or a drop target)", "Item 4");

        // 8. Verify that '(I'm not sortable or a drop target)' element is not sortable
        expectedFourthElement = "Item 1";
        actualFourthElement = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("upper", "4");

        Assertions.assertThat(actualFourthElement).as("(I'm not sortable or a drop target) is sortable!").isEqualTo(expectedFourthElement);

        //9. Hold 'Item 4' and drag it above the '(I'm not sortable or a drop target)' element
        // initial Position Of Item 4 = "3";
        pages.getIncludeExcludeItemsPage().moveUpperBoxElementByOffsets("Item 4", "(I'm not sortable or a drop target)");

        //10.Verify that 'Item 4' can not be droppable above '(I'm not sortable or a drop target)' element
        String expectedElementInThirdOrder = "Item 4";
        String actualElementInThirdOrder = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("upper", "3");

        Assertions.assertThat(actualElementInThirdOrder).as("Wrong order!").isEqualTo(expectedElementInThirdOrder);

    }

    /**
     * 5. Hold 'Item 1' and drag it under 'Item 4'
     * 6. Verify that 'Item 1' is sortable
     * 7. Hold '(I'm not sortable or a drop target)' element and drag it under 'Item 4'
     * 8. Verify that '(I'm not sortable)' element is not sortable
     */
    @Test
    void testSortableFunctionalityInBelowBox() {
        //5. Hold 'Item 1' and drag it under first '(I'm not sortable)' element
        pages.getIncludeExcludeItemsPage().moveBelowBoxElementByOffsets("Item 1", "(I'm not sortable)");
        BrowserUtils.scrollVertically(400);
        BrowserUtils.wait(1.0);


        //6. Verify that 'Item 1' is in the second order
        String expectedSecondElement = "Item 1";
        String actualFourthElement = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("below", "2");

        Assertions.assertThat(actualFourthElement).as("Item 4 is not sortable!").isEqualTo(expectedSecondElement);

        //7. Hold first '(I'm not sortable)' element and drag it under 'Item 1'
        pages.getIncludeExcludeItemsPage().moveBelowBoxElementByOffsets("(I'm not sortable)", "Item 1");

        //8. Verify that '(I'm not sortable)' element is not sortable
        expectedSecondElement = "Item 1";
        actualFourthElement = pages.getIncludeExcludeItemsPage().getWebElementsNameByItsOrder("below", "2");

        Assertions.assertThat(actualFourthElement).as("Item 4 is not sortable!").isEqualTo(expectedSecondElement);


    }

    @AfterEach
    void tearDownTestEnvironment() {
        //Return To Home Page
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickInarAcademyImageLink();
    }
}
