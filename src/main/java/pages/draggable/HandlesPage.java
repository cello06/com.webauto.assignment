package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HandlesPage extends BasePage {
    @FindBy(id = "draggable13")
    private WebElement firstDraggableElement;

    @FindBy(css = "#draggable13 > p.ui-widget-header")
    private WebElement handleOfFirstDraggableElement;

    @FindBy(id = "draggable14")
    private WebElement secondDraggableElement;

    @FindBy(xpath = "//p[contains(text(),'You can drag me around…')]")
    private WebElement draggablePartOfSecondElement;

    @FindBy(css = "#draggable14 > p.ui-widget-header")
    private WebElement handleOfSecondDraggableElement;

    public void dragFirstElementByHandle(){
        actions.clickAndHold(handleOfFirstDraggableElement).moveByOffset(25,25).release().build().perform();
    }
    public void dragFirstElementWithoutHandle(){
        actions.dragAndDropBy(firstDraggableElement,25,25);
    }
    public void dragSecondElementByHandle(){
        actions.clickAndHold(handleOfSecondDraggableElement).moveByOffset(25,25).release().build().perform();
    }
    public void dragSecondElementWithoutHandle(){

        actions.clickAndHold(draggablePartOfSecondElement).moveByOffset(25,25).release().build().perform();
    }
    public int getLocationOfFirstElementX(){
        return firstDraggableElement.getLocation().getX();
    }
    public int getLocationOfFirstElementY(){
        return firstDraggableElement.getLocation().getY();
    }
    public int getLocationOfSecondElementX(){
        return secondDraggableElement.getLocation().getX();
    }
    public int getLocationOfSecondElementY(){
        return secondDraggableElement.getLocation().getY();
    }
}
