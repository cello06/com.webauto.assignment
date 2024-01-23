package sortable;

import base_test.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class DisplayAsGridTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the URL
     * 2. Click on Web automation link
     * 3. Click on Sortable button
     * 4. Click on Display as grid button
     * 5. Hold '1' and move it to place of '6'
     * 6. Verify that location of '1' is now '6'
     * 7. Verify that arrangement of numbers changed
     */
    @Test
    void testDisplayAsGridFunctionality(){
        // 1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Sortable button
        pages.getWebAutomationPage().clickSortableLink();

        //4. Click on Display as grid button
        pages.getWebAutomationPage().clickDisplayAsGridLink();
        BrowserUtils.scrollVertically(200);
        String initialArrangement = pages.getDisplayAsGridPage().lineageOfNumbers();

        //5. Hold '1' and move it to place of '6'
        pages.getDisplayAsGridPage().moveElementByOffset("1",110,100);


        //6. Verify that location of '1' is now '6'
        String expectedLocation = "1";
        String actualLocation = pages.getDisplayAsGridPage().getNumberElementLocation("6");

        Assertions.assertThat(actualLocation).as("Location is not true!").isEqualTo(expectedLocation);

        //7. Verify that arrangement of numbers changed
        String finalArrangement = pages.getDisplayAsGridPage().lineageOfNumbers();

        Assertions.assertThat(finalArrangement).as("Arrangement is not changed!").isNotEqualTo(expectedLocation);
        

    }
}
