package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcceptPage  extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement draggableButNotDroppableElement;

    @FindBy(id = "draggable-accept")
    private  WebElement draggableAndDroppableElement;

    @FindBy(css = "#droppable-accept.ui-widget-header")
    private WebElement targetDroppableElement;

    public int getDraggableButNotDroppableElementLocationX(){
        return draggableButNotDroppableElement.getLocation().getX();
    }
    public int getDraggableButNotDroppableElementLocationY(){
        return draggableButNotDroppableElement.getLocation().getY();
    }
    public void dragDraggableButNotDroppableElementToTheTargetDroppableElement(){
        actions.clickAndHold(draggableButNotDroppableElement).moveToElement(targetDroppableElement).release().build().perform();
    }
    public void dragDraggableAndDroppableElementToTheTargetDroppableElement(){
        actions.clickAndHold(draggableAndDroppableElement).moveToElement(targetDroppableElement).release().build().perform();
    }
    public String getTextOnTheTargetDroppableElement(){
        return targetDroppableElement.getText();
    }
}
