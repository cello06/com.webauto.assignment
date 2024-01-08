package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(xpath = "(//a[@href='/'])[1]")
    private WebElement inarAcademyImage;

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;
    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;
    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronousResizeLink;

    @FindBy(linkText = "Textarea")
    private WebElement textAreaLink;
    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;
    @FindBy(linkText = "Alert Types")
    private WebElement alertTypesLink;

    public void clickInarAcademyImageLink() {
        inarAcademyImage.click();
    }

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnNormalIframe() {
        normalIframeLink.click();
    }

    public void clickSerializeLink() {
        serializeLink.click();
    }

    public void clickConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickHandlesLink() {
        handlesLink.click();
    }

    public void clickAcceptLink() {
        acceptLink.click();
    }

    public void clickRevertDraggablePosition() {
        revertDraggablePositionLink.click();
    }

    public void clickSynchronousResizeLink() {
        synchronousResizeLink.click();
    }

    public void clickTextAreaLink() {
        textAreaLink.click();
    }

    public void clickAlertsLink() {
        alertsLink.click();
    }

    public void clickAlertTypesLink() {
        alertTypesLink.click();
    }
}
