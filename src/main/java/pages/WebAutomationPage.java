package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAutomationPage extends BasePage {

    //GENERAL
    @FindBy(xpath = "(//a[@href='/'])[1]")
    private WebElement inarAcademyImage;
    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    //DRAGGABLE
    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;
    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;


    //DROPPABLE
    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;
    @FindBy(linkText = "Accept")
    private WebElement acceptLink;
    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;

    //RESIZABLE
    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronousResizeLink;
    @FindBy(linkText = "Textarea")
    private WebElement textAreaLink;

    //SELECTABLE
    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;
    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    //AUTOCOMPLETE
    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLink;
    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    //MENU
    @FindBy(linkText = "Menu")
    private WebElement menuLink;
    @FindBy(linkText = "Icons")
    private WebElement iconsLink;

    //ALERTS
    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;
    @FindBy(linkText = "Alert Types")
    private WebElement alertTypesLink;

    //IFRAME
    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;
    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;
    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;


    public void clickInarAcademyImageLink() {
        inarAcademyImage.click();
    }

    //DRAGGABLE
    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickHandlesLink() {
        handlesLink.click();
    }

    public void clickConstrainMovementLink() {
        constrainMovementLink.click();
    }


    //DROPPABLE
    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickAcceptLink() {
        acceptLink.click();
    }

    public void clickRevertDraggablePosition() {
        revertDraggablePositionLink.click();
    }


    //RESIZABLE
    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickSynchronousResizeLink() {
        synchronousResizeLink.click();
    }

    public void clickTextAreaLink() {
        textAreaLink.click();
    }


    //SELECTABLE
    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickSerializeLink() {
        serializeLink.click();
    }

    public void clickOnSelectableDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    //AUTOCOMPLETE
    public void clickOnAutocompleteLink(){
        autocompleteLink.click();
    }
    public void clickOnAutocompleteDefaultFunctionality(){
        defaultFunctionalityLink.click();
    }
    public void clickAccentFoldingLink(){
        accentFoldingLink.click();
    }

    //MENU
    public void clickMenuLink(){
        menuLink.click();
    }
    public void clickIconsLink(){
        iconsLink.click();
    }


    //ALERTS
    public void clickAlertsLink() {
        alertsLink.click();
    }

    public void clickAlertTypesLink() {
        alertTypesLink.click();
    }


    //IFRAME
    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnNormalIframe() {
        normalIframeLink.click();
    }


}
