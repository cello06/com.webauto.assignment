package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerttypes.AlertTypesPage;
import pages.autocomplete.AccentFoldingPage;
import pages.autocomplete.AutocompleteDefaultFunctionalityPage;
import pages.control_group.ToolbarPage;
import pages.datepicker.DisplayMultipleMonthsPage;
import pages.datepicker.SelectDateRateTest;
import pages.dialog.ModelFormPage;
import pages.draggable.AutoScrollingPage;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.DraggableDefFuncPage;
import pages.draggable.HandlesPage;
import pages.droppable.AcceptPage;
import pages.droppable.DroppableDefFuncPage;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NestedIframePage;
import pages.iframe.NormalIFramePage;
import pages.menu.IconsPage;
import pages.progress_bar.DownloadDialogPage;
import pages.resizable.ResizableDefFuncPage;
import pages.resizable.SynchronousResizePage;
import pages.resizable.TextAreaPage;
import pages.selectable.SelectableDefFuncPage;
import pages.selectable.SerializePage;

public class Pages {

    //HOMEPAGE
    private HomePage homePage;

    //WEB_AUTOMATION_PAGE
    private WebAutomationPage webAutomationPage;
        //DRAGGABLE_TAB_PAGE
    private AutoScrollingPage autoScrollingPage;
    private ConstrainMovementPage constrainMovementPage;
    private DraggableDefFuncPage draggableDefFuncPage;
    private HandlesPage handlesPage;

        //DROPPABLE_TAB_PAGE
    private DroppableDefFuncPage droppableDefFuncPage;
    private AcceptPage acceptPage;
    private RevertDraggablePositionPage revertDraggablePositionPage;

        //RESIZABLE_TAB_PAGE
    private ResizableDefFuncPage resizableDefFuncPage;
    private SynchronousResizePage synchronousResizePage;
    private TextAreaPage textAreaPage;

        //SELECTABLE_TAB_PAGE


    private SelectableDefFuncPage selectableDefFuncPage;

    private SerializePage serializePage;

        //AUTOCOMPLETE_TAB_PAGE
    private AutocompleteDefaultFunctionalityPage autocompleteDefaultFunctionalityPage;
    private AccentFoldingPage accentFoldingPage;

        //CONTROL_GROUP_TAB_PAGE
    private ToolbarPage toolbarPage;

        //DATE_PICKER_TAB_PAGE
    private DisplayMultipleMonthsPage displayMultipleMonthsPage;
    private SelectDateRateTest selectDateRateTest;

        //DIALOG_TAB_PAGE
    private ModelFormPage modelFormPage;

        //MENU_TAB_PAGE
    private IconsPage iconsPage;

        //PROGRESS_BAR_TAB_PAGE
    private DownloadDialogPage downloadDialogPage;


        //ALERTS_TAB_PAGE
    private AlertTypesPage alertTypesPage;

        //IFRAME_TAB_PAGE
    private NestedIframePage nestedIframePage;

    private NormalIFramePage normalIFramePage;

    public Pages() {
        //HOMEPAGE
        homePage = new HomePage();
        //WEB_AUTOMATION_PAGE
        //Alphabetical order...
        acceptPage = new AcceptPage();
        accentFoldingPage = new AccentFoldingPage();
        alertTypesPage = new AlertTypesPage();
        autocompleteDefaultFunctionalityPage = new AutocompleteDefaultFunctionalityPage();
        autoScrollingPage = new AutoScrollingPage();
        constrainMovementPage = new ConstrainMovementPage();
        displayMultipleMonthsPage = new DisplayMultipleMonthsPage();
        downloadDialogPage = new DownloadDialogPage();
        draggableDefFuncPage = new DraggableDefFuncPage();
        droppableDefFuncPage = new DroppableDefFuncPage();
        handlesPage = new HandlesPage();
        iconsPage = new IconsPage();
        modelFormPage = new ModelFormPage();
        nestedIframePage = new NestedIframePage();
        normalIFramePage = new NormalIFramePage();
        selectableDefFuncPage = new SelectableDefFuncPage();
        selectDateRateTest = new SelectDateRateTest();
        serializePage = new SerializePage();
        synchronousResizePage = new SynchronousResizePage();
        resizableDefFuncPage = new ResizableDefFuncPage();
        revertDraggablePositionPage = new RevertDraggablePositionPage();
        textAreaPage = new TextAreaPage();
        toolbarPage = new ToolbarPage();
        webAutomationPage = new WebAutomationPage();

    }
    //HOMEPAGE
    public HomePage getHomePage() {
        return homePage;
    }

    //WEB_AUTOMATION_PAGE
    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public DraggableDefFuncPage getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrollingPage getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public DroppableDefFuncPage getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public ResizableDefFuncPage getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public SelectableDefFuncPage getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }

    public NestedIframePage getNestedIframePage() {
        return nestedIframePage;
    }

    public NormalIFramePage getNormalIFramePage() {
        return normalIFramePage;
    }

    public SerializePage getSerializePage() {
        return serializePage;
    }

    public ConstrainMovementPage getConstrainMovementPage() {
        return constrainMovementPage;
    }

    public HandlesPage getHandlesPage() {
        return handlesPage;
    }

    public AcceptPage getAcceptPage() {
        return acceptPage;
    }

    public RevertDraggablePositionPage getRevertDraggablePositionPage() {
        return revertDraggablePositionPage;
    }

    public SynchronousResizePage getSynchronousResizePage() {
        return synchronousResizePage;
    }

    public TextAreaPage getTextAreaPage() {
        return textAreaPage;
    }

    public AlertTypesPage getAlertTypesPage() {
        return alertTypesPage;
    }
    public AutocompleteDefaultFunctionalityPage getAutocompleteDefaultFunctionalityPage(){
        return autocompleteDefaultFunctionalityPage;
    }
    public AccentFoldingPage getAccentFoldingPage(){
        return accentFoldingPage;
    }
    public IconsPage getIconsPage(){
        return iconsPage;
    }
    public DownloadDialogPage getDownloadDialogPage(){return downloadDialogPage;}
    public DisplayMultipleMonthsPage getDisplayMultipleMonthsPage(){return displayMultipleMonthsPage;}
    public SelectDateRateTest getSelectDateRateTest(){return selectDateRateTest;}
    public ToolbarPage getToolbarPage(){return toolbarPage;}
    public ModelFormPage getModelFormPage() {return modelFormPage;}
}
