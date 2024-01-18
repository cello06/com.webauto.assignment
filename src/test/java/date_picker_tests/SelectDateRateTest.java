package date_picker_tests;

import base_test.Hooks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectDateRateTest extends Hooks {
    /**
     * 1.Open the browser and navigate to the webautomation page
     * 2.Click on the date picker button
     * 3.Click on the select date range button
     */
    @BeforeEach
    void setUpTestEnvironment() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Click on the date picker button
        pages.getWebAutomationPage().clickDatePickerLink();

        //3.Click on the select date range button
        pages.getWebAutomationPage().clickSelectDateRangeLink();
    }

    /**
     * 4.Click on 'from date text field'
     * 5.Select 'may' from month selection drop box
     * 6.Select '15' from 'first' block
     * 7.Verify that 05/15/2024 is displayed on 'from date text field'
     * 8.Click on 'to date text field'
     * 9.Select '17' from 'first' block
     * 10.Verify that 05/17/2024 is displayed on 'to date text field'
     */
    @Test
    void testFromAndToTextFieldsFunctionality() {
        //4.Click on 'from date text field'
        pages.getSelectDateRateTest().clickOnFromDateTextField();

        // 5.Select 'may' from month selection drop box
        pages.getSelectDateRateTest().selectMonth("May");

        //6.Select '15' from 'first' block
        pages.getSelectDateRateTest().pickDateFromCalendar("first", "15");

        //7.Verify that 05/15/2024 is displayed on 'from date text field'
        String expectedDateOnFromDateTextField = "05/15/2024";
        String actualDateOnFromDateTextField = pages.getSelectDateRateTest().getDateInFromDateTextField();

        assertEquals(expectedDateOnFromDateTextField, actualDateOnFromDateTextField, "Displayed Date is Wrong !");

        //8.Click on 'to date text field'
        pages.getSelectDateRateTest().clickOnToDateTextField();

        //9.Select '17' from 'first' block
        pages.getSelectDateRateTest().pickDateFromCalendar("first", "17");

        //10.Verify that 05/17/2024 is displayed on 'to date text field'
        String expectedDateOnToDateTextField = "05/17/2024";
        String actualDateOnToDateTextField = pages.getSelectDateRateTest().getDateInToDateTextField();

        assertEquals(expectedDateOnToDateTextField, actualDateOnToDateTextField, "Displayed Date is Wrong !");

    }

    /**
     * 4.Click on 'from date text field'
     * 5.Select 'Aug' from month selection drop box
     * 6.Select '8' from 'first' block
     * 7.Verify that 08/08/2024 is displayed on 'from date text field'
     * 8.Click on 'to date text field'
     * 9.Select '2' from 'first' block
     * 10.Verify that nothing displayed on 'to date text field'
     * 11.Click on 'to date text field'
     * 12.Verify that there are '24' day elements are selectable
     */
    @Test
    void testThatFromAndToDateTextFieldSynchronization() {
        //4.Click on 'from date text field'
        pages.getSelectDateRateTest().clickOnFromDateTextField();

        //5.Select 'Aug' from month selection drop box
        pages.getSelectDateRateTest().selectMonth("Aug");

        // 6.Select '8' from 'first' block
        pages.getSelectDateRateTest().pickDateFromCalendar("first", "8");

        //7.Verify that 08/08/2024 is displayed on 'from date text field'
        String expectedDateOnFromDateTextField = "08/08/2024";
        String actualDateOnFromDateTextField = pages.getSelectDateRateTest().getDateInFromDateTextField();

        assertEquals(expectedDateOnFromDateTextField, actualDateOnFromDateTextField, "Date is not correctly displayed!");

        //8.Click on 'to date text field'
        pages.getSelectDateRateTest().clickOnToDateTextField();

        // 9.Select '2' from 'first' block
        pages.getSelectDateRateTest().pickDateFromCalendar("first", "2");

        //10.Verify that nothing displayed on 'to date text field'
        String expectedDateOnToDateTextField = "";
        String actualDateOnToDateTextField = pages.getSelectDateRateTest().getDateInToDateTextField();

        assertEquals(expectedDateOnToDateTextField, actualDateOnToDateTextField, "There is a problem in From And To DateTextField Synchronization");

        //11.Click on 'to date text field'
        pages.getSelectDateRateTest().clickOnToDateTextField();

        //12.Verify that there are '24' day elements are selectable
        int expectedCountOfSelectableDays = 24;
        int actualCountOfSelectableDays = pages.getSelectDateRateTest().getSelectableDayNumberInFirstMonthElement();

        assertEquals(expectedCountOfSelectableDays, actualCountOfSelectableDays, "Count of selectable day is wrong!");
    }

    @AfterEach
    void tearDownTestEnvironment() {
        //Return To Home Page
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickInarAcademyImageLink();
    }

}
