package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Selectable_DefFunc_Page extends BasePage {
    @FindBy(css = "#selectable-def-functionality > li")
    private List<WebElement> itemList;

    public void clickOnItemByIndex(int index){
        itemList.get(index-1).click();
    }

    public boolean isSelectedByIndex(int index){
        return itemList.get(index-1).getAttribute("class").contains("ui-selected");
    }

    public void clickOnElementByIndexWithCtrl(int index1,int index2, int index3, int index4){
        actions.keyDown(Keys.CONTROL).click(itemList.get(index1-1)).click(itemList.get(index2-1)).click(itemList.get(index3-1)).click(itemList.get(index4-1))
                .keyUp(Keys.CONTROL).build().perform();
    }

    public void clickOnElementsByIndexWithHoldingMouse(int index1, int index2, int index3){
        actions.clickAndHold(itemList.get(index1-1)).moveToElement(itemList.get(index2-1)).moveToElement(itemList.get(index3-1)).release().build().perform();
    }
}
