package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebAutomationPage;

public class TextAreaPage extends WebAutomationPage {
    @FindBy(css = ".ui-wrapper > .ui-resizable-handle:nth-child(4)")
    private WebElement handleOfTextAreaForResizing;

    @FindBy(id = "resizable-text-area-res")
    private WebElement textAreaElement;

    public void resizeTheTextAreaElement(){
        actions.clickAndHold(handleOfTextAreaForResizing).moveByOffset(50,50).release().build().perform();
    }
    public int getWidthOfTextArea(){
        return textAreaElement.getSize().getWidth();
    }
    public int getHeightOfTextArea(){
        return textAreaElement.getSize().getHeight();
    }
}
