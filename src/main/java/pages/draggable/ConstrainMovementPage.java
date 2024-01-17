package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebAutomationPage;

public class ConstrainMovementPage extends WebAutomationPage {
    @FindBy(id = "draggable5")
    private WebElement verticallyDraggableElement;

    @FindBy(id = "draggable6")
    private WebElement horizontallyDraggableElement;

    @FindBy(id = "draggable7")
    private WebElement thirdDraggableElement;
    @FindBy(id = "draggable8")
    private WebElement fourthDraggableElement;

    @FindBy(xpath = "//div[@id='containment-wrapper']/div[2]")
    private WebElement smallBox;
    @FindBy(id = "containment-wrapper")
    private WebElement bigBox;

    public void dragVerticallyDraggableElementByOffset(int xOffset,int yOffset){
        actions.dragAndDropBy(verticallyDraggableElement,xOffset,yOffset).perform();
    }
    public int getLocationOfVerticallyDraggableElementX(){
        return verticallyDraggableElement.getLocation().getX();
    }
    public int getLocationOfVerticallyDraggableElementY(){
        return verticallyDraggableElement.getLocation().getY();
    }
    public void dragHorizontallyDraggableElementByOffset(int xOffset,int yOffset){
        actions.dragAndDropBy(horizontallyDraggableElement,xOffset,yOffset).perform();
    }
    public int getLocationOfHorizontallyDraggableElementX(){
        return horizontallyDraggableElement.getLocation().getX();
    }
    public int getLocationOfHorizontallyDraggableElementY(){
        return horizontallyDraggableElement.getLocation().getY();
    }
    public void dragThirdDraggableElementByOffset(int xOffset,int yOffset){
        actions.dragAndDropBy(thirdDraggableElement,xOffset,yOffset).perform();
    }
    public int getLocationOfThirdDraggableElementX(){
        return thirdDraggableElement.getLocation().getX();
    }
    public int getLocationOfThirdDraggableElementY(){
        return thirdDraggableElement.getLocation().getY();
    }
    public void dragFourthDraggableElementByOffset(int xOffset,int yOffset){
        actions.dragAndDropBy(fourthDraggableElement,xOffset,yOffset).perform();
    }
    public int getLocationOfFourthDraggableElementX(){
        return fourthDraggableElement.getLocation().getX();
    }
    public int getLocationOfFourthDraggableElementY(){
        return fourthDraggableElement.getLocation().getY();
    }
    public int getYOfBigBoxElement(){
        return bigBox.getLocation().getY();
    }
    public int getXOfBigBoxElement(){
        return bigBox.getLocation().getX();
    }
    public int getWidthOfBigBoxElement(){
        return bigBox.getSize().getWidth();
    }
    public int getHeightOfBigBoxElement(){
        return bigBox.getSize().getHeight();
    }
    public int getYOfSmallBoxElement(){
        return smallBox.getLocation().getY();
    }
    public int getXOfSmallBoxElement(){
        return smallBox.getLocation().getX();
    }
    public int getWidthOfSmallBoxElement(){
        return smallBox.getSize().getWidth();
    }
    public int getHeightOfSmallBoxElement(){
        return smallBox.getSize().getHeight();
    }


}
