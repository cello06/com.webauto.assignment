package slider;

import base_test.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class SnapToIncrementsTest extends Hooks {
    /**
     * 1. Open the browser and navigate to the URL
     * 2. Click on Web automation link
     * 3. Click on Slider button
     * 4. Click on Snap to Increments button
     * 5. Get initial donation amount
     * 6. Slide 'slide bar' to left
     * 7. Verify that donation amount increased
     * 8. Verify that donation amount increased $50 amount
     */
    @Test
    void testSnapToIncrementsFunctionality() {
        //1. Open the browser and navigate to the URL
        //2. Click on Web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        // 3. Click on Slider button
        BrowserUtils.scrollVertically(300);
        BrowserUtils.wait(1.0);
        pages.getWebAutomationPage().clickSliderLink();

        //4. Click on Snap to Increments button
        pages.getWebAutomationPage().clickSnapToIncrement();

        //5. Get initial donation amount
        String initialDonationAmount = pages.getSnapToIncrementsPage().getDonationAmount();

        //6. Slide 'slide bar' to left
        pages.getSnapToIncrementsPage().slideSlideBarWithHandle();

        //7. Verify that donation amount increased
        String finalDonationAmount = pages.getSnapToIncrementsPage().getDonationAmount();
        assertThat(finalDonationAmount).as("Final state is not greater than initial state").isGreaterThan(initialDonationAmount);

        //8. Verify that donation amount increased $50 amount
        assertThat(Integer.parseInt(finalDonationAmount) % 50).as("Increment value is not available").isEqualTo(0);

    }
}
