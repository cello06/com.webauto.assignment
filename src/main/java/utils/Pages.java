package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.accordion.CollapseContentPage;
import pages.alerttypes.AlertTypesPage;
import pages.autocomplete.AccentFoldingPage;
import pages.autocomplete.AutocompleteDefaultFunctionalityPage;
import pages.button.ButtonDefFuncPage;
import pages.button.WithIconPage;
import pages.checkbox_radio.ProductSelectorPage;
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
import pages.slider.SnapToIncrementsPage;
import pages.sortable.DisplayAsGridPage;
import pages.sortable.IncludeExcludeItemsPage;
import pages.spinner.SpinnerOverflow;

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

        //SORTABLE_TAB_PAGE
    private DisplayAsGridPage displayAsGridPage;
    private IncludeExcludeItemsPage includeExcludeItemsPage;

        //ACCORDION_TAB_PAGE
    private CollapseContentPage collapseContentPage;

        //AUTOCOMPLETE_TAB_PAGE
    private AutocompleteDefaultFunctionalityPage autocompleteDefaultFunctionalityPage;
    private AccentFoldingPage accentFoldingPage;

        //BUTTON_TAB_PAGE
    private ButtonDefFuncPage buttonDefFuncPage;
    private WithIconPage withIconPage;

        //CHECKBOX_RADIO_TAB_PAGE
    private ProductSelectorPage productSelectorPage;

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

        //SLIDER_TAB_PAGE
    private SnapToIncrementsPage snapToIncrementsPage;

        //SPINNER_TAB_PAGE
    private SpinnerOverflow spinnerOverflow;


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
        buttonDefFuncPage = new ButtonDefFuncPage();
        collapseContentPage = new CollapseContentPage();
        constrainMovementPage = new ConstrainMovementPage();
        displayAsGridPage = new DisplayAsGridPage();
        displayMultipleMonthsPage = new DisplayMultipleMonthsPage();
        downloadDialogPage = new DownloadDialogPage();
        draggableDefFuncPage = new DraggableDefFuncPage();
        droppableDefFuncPage = new DroppableDefFuncPage();
        handlesPage = new HandlesPage();
        iconsPage = new IconsPage();
        includeExcludeItemsPage = new IncludeExcludeItemsPage();
        modelFormPage = new ModelFormPage();
        nestedIframePage = new NestedIframePage();
        normalIFramePage = new NormalIFramePage();
        productSelectorPage = new ProductSelectorPage();
        selectableDefFuncPage = new SelectableDefFuncPage();
        selectDateRateTest = new SelectDateRateTest();
        serializePage = new SerializePage();
        snapToIncrementsPage = new SnapToIncrementsPage();
        spinnerOverflow = new SpinnerOverflow();
        synchronousResizePage = new SynchronousResizePage();
        resizableDefFuncPage = new ResizableDefFuncPage();
        revertDraggablePositionPage = new RevertDraggablePositionPage();
        textAreaPage = new TextAreaPage();
        toolbarPage = new ToolbarPage();
        webAutomationPage = new WebAutomationPage();
        withIconPage = new WithIconPage();

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
    public AutocompleteDefaultFunctionalityPage getAutocompleteDefaultFunctionalityPage(){return autocompleteDefaultFunctionalityPage;}
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
    public SnapToIncrementsPage getSnapToIncrementsPage(){return snapToIncrementsPage;}
    public SpinnerOverflow getSpinnerOverflow(){return spinnerOverflow;}
    public DisplayAsGridPage getDisplayAsGridPage(){return displayAsGridPage;}
    public IncludeExcludeItemsPage getIncludeExcludeItemsPage(){return includeExcludeItemsPage;}
    public CollapseContentPage getCollapseContentPage(){return collapseContentPage;}
    public ButtonDefFuncPage getButtonDefFuncPage(){return buttonDefFuncPage;}
    public WithIconPage getWithIconPage(){return withIconPage;}
    public ProductSelectorPage getProductSelectorPage(){return productSelectorPage;}
}
