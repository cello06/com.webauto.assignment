package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebAutomationPage;

public class RevertDraggablePositionPage extends WebAutomationPage {
    @FindBy(id = "draggable-revert-draggable")
    private WebElement revertWhenDroppedElement;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement revertWhenNotDroppedElement;

    @FindBy(id = "droppable-revert-draggable")
    private WebElement targetDroppableElement;

    public void dragRevertWhenDroppedElementToTargetDroppableElement(){
        actions.clickAndHold(revertWhenDroppedElement).moveToElement(targetDroppableElement).release().build().perform();
    }
    public void dragRevertWhenNotDroppedElement(){
        actions.clickAndHold(revertWhenNotDroppedElement).moveByOffset(50,0).release().build().perform();
    }
    public String getTargetDroppableElementText(){
        return targetDroppableElement.getText();
    }
    public int getLocationOfRevertWhenDroppedElementX(){
        return revertWhenDroppedElement.getLocation().getX();
    }
    public int getLocationOfRevertWhenDroppedElementY(){
        return revertWhenDroppedElement.getLocation().getY();
    }
    public int getLocationOfRevertWhenNotDroppedElementX(){
        return revertWhenNotDroppedElement.getLocation().getX();
    }
    public int getLocationOfRevertWhenNotDroppedElementY(){
        return revertWhenNotDroppedElement.getLocation().getY();
    }


}
