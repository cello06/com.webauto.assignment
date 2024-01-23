package spinner;

import base_test.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class SpinnerOverflowTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the URL
     * 2. Click on Web automation link
     * 3. Click on Spinner button
     * 4. Click on spinner overflow button
     * 5. Get initial value
     * 6. Click up button until value equals to 10
     * 7. Verify that value is 10
     * 8. Verify that when you click up while value is 10, value equals to -10
     * 9. Click down button
     * 10. Verify that when you click down while value is -10, value equals to 10
     */
    @Test
    void testSpinnerOverflowFunctionality() {
        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Spinner button
        BrowserUtils.scrollVertically(400);
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickSpinnerLink();

        //4. Click on spinner overflow button
        pages.getWebAutomationPage().clickSpinnerOverflowLink();

        //5. Get initial value
        int initialValueOnTextBox = pages.getSpinnerOverflow().getValueInTheText();

        //6. Click up button until value equals to 10
        int clickCountToMakeValueTen = 10 - initialValueOnTextBox;
        pages.getSpinnerOverflow().clickOnButtonAccordingToParameter("up", clickCountToMakeValueTen);

        //7. Verify that value is 10
        int currentValue = pages.getSpinnerOverflow().getValueInTheText();
        Assertions.assertThat(currentValue).as("Current value is not 10 !").isEqualTo(10);

        //8. Verify that when you click up while value is 10, value equals to -10
        pages.getSpinnerOverflow().clickUpButton();
        currentValue = pages.getSpinnerOverflow().getValueInTheText();
        Assertions.assertThat(currentValue).as("Current value is not -10 !").isEqualTo(-10);

        //9. Click down button
        pages.getSpinnerOverflow().clickDownButton();

        //10. Verify that when you click down while value is -10, value equals to 10
        currentValue = pages.getSpinnerOverflow().getValueInTheText();
        Assertions.assertThat(currentValue).as("Current value is not 10 !").isEqualTo(10);

    }
}
