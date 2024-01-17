package date_picker_test;

import base_test.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import utils.BrowserUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisplayMultipleMonthsTest extends Hooks {
    @BeforeEach
    void setUpTestEnvironment() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the date picker button
        pages.getWebAutomationPage().clickDatePickerLink();

        //3.Click on the display multiple months button
        pages.getWebAutomationPage().clickDisplayMultipleMonthsLink();
    }

    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the display multiple months button
     * 4.Get months name
     * 5.Click on date text field
     * 6.Verify that there are more than two month displayed
     */
    @Test
    void testIsMultipleMonthsDisplayed() {

        //4.Click on date text field
        pages.getDisplayMultipleMonthsPage().clickDateTextField();

        //5.Get months name
        List<String> monthsName = pages.getDisplayMultipleMonthsPage().getMonthNamesOnDatePicker();

        //6.Verify that there are more than two month displayed
        assertTrue(monthsName.size() > 2, "There are not months more than two");
    }

    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the display multiple months button
     * 4.Click on date text field
     * 5.Click on 'middle' block '18.Day' element
     * 6.Click done button
     * 7.Verify that date shown in date text field is true
     */
    @Test
    void testChosenDateIsCorrectlyDisplayed() {
        //4.Click on date text field
        pages.getDisplayMultipleMonthsPage().clickDateTextField();

        //5.Click on 'middle' block '18.Day' element
        pages.getDisplayMultipleMonthsPage().clickDateOnCalender("18", "middle");

        // 6.Click done button
        pages.getDisplayMultipleMonthsPage().clickOnDoneButton();

        // 7.Verify that date shown in date text field is true
        String expectedDate = "02/18/2024";
        String actualDateInTextField = pages.getDisplayMultipleMonthsPage().getDateTextField();
        assertEquals(expectedDate, actualDateInTextField, "Date is not correctly displayed!");

    }

    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the display multiple months button
     * 4.Click on date text field
     * 5.Click on today button
     * 6.Click done button
     * 7.Verify that date shown in date text field is true by using LocalDate class
     */

    @Test
    void testTodayDateOnTextFieldFunctionality() {
        //4.Click on date text field
        pages.getDisplayMultipleMonthsPage().clickDateTextField();

        //5.Click on today button
        pages.getDisplayMultipleMonthsPage().clickTodayDateOnCalendar();

        //6.Click done button
        pages.getDisplayMultipleMonthsPage().clickOnDoneButton();

        //7.Verify that date shown in date text field is true by using LocalDate class
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String expectedTodayDate = today.format(formatter);
        String actualTodayDate = pages.getDisplayMultipleMonthsPage().getDateTextField();

        assertEquals(expectedTodayDate, actualTodayDate, "Date is wrongly displayed!");
    }
    @AfterEach
    void tearDownTestEnvironment() {
        //Return To Home Page
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickInarAcademyImageLink();
    }

}
