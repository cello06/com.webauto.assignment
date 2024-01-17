package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebAutomationPage;

public class SynchronousResizePage extends WebAutomationPage {
    @FindBy(id = "resizable-synchr-resize")
    private WebElement firstResizableElement;

    @FindBy(css = "#resizable-synchr-resize > .ui-icon-gripsmall-diagonal-se")
    private WebElement handleOfFirsElement;

    @FindBy(id = "also-synchr-resize")
    private WebElement secondResizableElement;

    public void resizeTheFirstElement(){
        actions.clickAndHold(handleOfFirsElement).moveByOffset(100,100).release().build().perform();
    }
    public int getWidthOfSecondElement(){
        return secondResizableElement.getSize().getWidth();
    }
    public int getHeightOfSecondElement(){
        return secondResizableElement.getSize().getHeight();
    }
}
