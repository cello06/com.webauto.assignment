package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

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

    //SORTABLE
    @FindBy(linkText = "Sortable")
    private WebElement sortableLink;
    @FindBy(linkText = "Display as Grid")
    private WebElement displayAsGrid;
    @FindBy(linkText = "Include / exclude items")
    private WebElement includeExcludeItemsLink;

    //AUTOCOMPLETE
    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLink;
    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    //CONTROL GROUP
    @FindBy(linkText = "Control Group")
    private WebElement controlGroupLink;
    @FindBy(linkText = "Toolbar")
    private WebElement toolbarLink;

    //DATE PICKER
    @FindBy(linkText = "Datepicker")
    private WebElement datePickerLink;
    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonthsLink;
    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;

    //DIALOG
    @FindBy(linkText = "Dialog")
    private WebElement dialogLink;
    @FindBy(linkText = "Modal Form")
    private WebElement modelFormLink;

    //MENU
    @FindBy(linkText = "Menu")
    private WebElement menuLink;
    @FindBy(linkText = "Icons")
    private WebElement iconsLink;

    //PROGRESS BAR
    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;
    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;


    //SLIDER
    @FindBy(linkText = "Slider")
    private WebElement sliderLink;
    @FindBy(linkText = "Snap to increments")
    private WebElement snapToIncrementsLink;

    //SPINNER
    @FindBy(linkText = "Spinner")
    private WebElement spinnerLink;
    @FindBy(linkText = "Spinner Overflow")
    private WebElement spinnerOverflowLink;


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

    //SORTABLE
    public void clickSortableLink(){sortableLink.click();}

    public void clickDisplayAsGridLink(){displayAsGrid.click();}
    public void clickIncludeExcludeItems(){includeExcludeItemsLink.click();}



    //AUTOCOMPLETE
    public void clickOnAutocompleteLink() {
        autocompleteLink.click();
    }

    public void clickOnAutocompleteDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickAccentFoldingLink() {
        accentFoldingLink.click();
    }

    //CONTROL GROUP
    public void clickOnControlGroupLink() {
        controlGroupLink.click();
    }

    public void clickToolbarLink() {
        toolbarLink.click();
    }

    //DATE PICKER
    public void clickDatePickerLink() {
        datePickerLink.click();
    }

    public void clickDisplayMultipleMonthsLink() {
        displayMultipleMonthsLink.click();
    }

    public void clickSelectDateRangeLink() {
        selectDateRangeLink.click();
    }

    //DIALOG
    public void clickDialogLink() {
        dialogLink.click();
    }
    public void clickModelFormLink() {
        modelFormLink.click();
    }

    //MENU
    public void clickMenuLink() {
        menuLink.click();
    }

    public void clickIconsLink() {
        iconsLink.click();
    }

    //PROGRESS BAR
    public void clickOnProgressBarLink() {
        progressBarLink.click();
    }

    public void clickDownloadDialogLink() {
        downloadDialogLink.click();
    }


    //SLIDER
    public void clickSliderLink(){sliderLink.click();}
    public void clickSnapToIncrement(){snapToIncrementsLink.click();}

    //SPINNER
    public void clickSpinnerLink(){spinnerLink.click();}
    public void clickSpinnerOverflowLink(){spinnerOverflowLink.click();}



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
