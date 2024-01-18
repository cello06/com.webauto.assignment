package selectable_tests;

import base_test.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on webautomation link
 * 3. Click on Selectable button
 * 4. Click on Default Functionality button
 * 5. Click on Item 5
 * 6. Verify that Item 5 is selected
 * 7. Click on Item 7
 * 8. Verify that Item 7 is selected
 * 9. Verify that Item 5 is not selected
 * 10. Click on Item 1, Item 3, Item 5, Item 6 by holding down the Ctrl key
 * 11. Verify that Item 1, Item 3, Item 5, Item 6 are selected
 * 12. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 * 13. Verify that Item 1, Item 2, Item 3 are selected
 */
public class Selectable_DefFunc_Test extends Hooks {

    @Test
    void testSelectableDefFunc(){
        //1. Open the browser and navigate to the URL+
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. Click on Selectable button
        //4. Click on Default Functionality button
        pages.getWebAutomationPage().clickOnSelectableLink();
        pages.getWebAutomationPage().clickOnSelectableDefaultFunctionality();

        //5. Click on Item 5
        pages.getSelectableDefFuncPage().clickOnItemByIndex(5);

        //6. Verify that Item 5 is selected
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(5)).isTrue();

        //7. Click on Item 7
        pages.getSelectableDefFuncPage().clickOnItemByIndex(7);

        //8. Verify that Item 7 is selected
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(7)).isTrue();

        //9. Verify that Item 5 is not selected
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(5)).isFalse();

        //10. Click on Item 1, Item 3, Item 5, Item 6 by holding down the Ctrl key
        pages.getSelectableDefFuncPage().clickOnElementByIndexWithCtrl(1,3,5,6);

        //11.Verify that Item 1, Item 3, Item 5, Item 6 are selected
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(1)).isTrue();
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(3)).isTrue();
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(5)).isTrue();
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(6)).isTrue();

        //12. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
        pages.getSelectableDefFuncPage().clickOnElementsByIndexWithHoldingMouse(1,2,3);

        //13. Verify that Item 1, Item 2, Item 3 are selected
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(1)).isTrue();
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(2)).isTrue();
        Assertions.assertThat(pages.getSelectableDefFuncPage().isSelectedByIndex(3)).isTrue();
    }
}
