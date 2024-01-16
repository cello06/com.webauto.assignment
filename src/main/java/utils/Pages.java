package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerttypes.AlertTypesPage;
import pages.autocomplete.AccentFoldingPage;
import pages.autocomplete.AutocompleteDefaultFunctionalityPage;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.HandlesPage;
import pages.droppable.AcceptPage;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NestedIframePage;
import pages.iframe.NormalIFramePage;
import pages.menu.IconsPage;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronousResizePage;
import pages.resizable.TextAreaPage;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.SerializePage;

public class Pages {

    //HOMEPAGE
    private HomePage homePage;

    //WEB_AUTOMATION_PAGE
    private WebAutomationPage webAutomationPage;
        //DRAGGABLE_TAB_PAGE
    private AutoScrolling_Page autoScrollingPage;
    private ConstrainMovementPage constrainMovementPage;
    private Draggable_DefFunc_Page draggableDefFuncPage;
    private HandlesPage handlesPage;

        //DROPPABLE_TAB_PAGE
    private Droppable_DefFunc_Page droppableDefFuncPage;
    private AcceptPage acceptPage;
    private RevertDraggablePositionPage revertDraggablePositionPage;

        //RESIZABLE_TAB_PAGE
    private Resizable_DefFunc_Page resizableDefFuncPage;
    private SynchronousResizePage synchronousResizePage;
    private TextAreaPage textAreaPage;

        //SELECTABLE_TAB_PAGE


    private Selectable_DefFunc_Page selectableDefFuncPage;

    private SerializePage serializePage;

        //AUTOCOMPLETE_TAB_PAGE
    private AutocompleteDefaultFunctionalityPage autocompleteDefaultFunctionalityPage;
    private AccentFoldingPage accentFoldingPage;

        //MENU_TAB_PAGE
    private IconsPage iconsPage;


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
        autoScrollingPage = new AutoScrolling_Page();
        constrainMovementPage = new ConstrainMovementPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        handlesPage = new HandlesPage();
        iconsPage = new IconsPage();
        nestedIframePage = new NestedIframePage();
        normalIFramePage = new NormalIFramePage();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        serializePage = new SerializePage();
        synchronousResizePage = new SynchronousResizePage();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        revertDraggablePositionPage = new RevertDraggablePositionPage();
        textAreaPage = new TextAreaPage();
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

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
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

}
