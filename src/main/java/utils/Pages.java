package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerttypes.AlertTypesPage;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.HandlesPage;
import pages.droppable.AcceptPage;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NestedIframePage;
import pages.iframe.NormalIFramePage;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronousResizePage;
import pages.resizable.TextAreaPage;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.SerializePage;

public class Pages {

    private AutoScrolling_Page autoScrollingPage;
    private ConstrainMovementPage constrainMovementPage;
    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;

    private NestedIframePage nestedIframePage;

    private NormalIFramePage normalIFramePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;
    private SerializePage serializePage;
    private HandlesPage handlesPage;

    private AcceptPage acceptPage;
    private RevertDraggablePositionPage revertDraggablePositionPage;

    private SynchronousResizePage synchronousResizePage;

    private TextAreaPage textAreaPage;
    private AlertTypesPage alertTypesPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframePage();
        normalIFramePage = new NormalIFramePage();
        serializePage = new SerializePage();
        constrainMovementPage = new ConstrainMovementPage();
        handlesPage = new HandlesPage();
        acceptPage = new AcceptPage();
        revertDraggablePositionPage = new RevertDraggablePositionPage();
        synchronousResizePage = new SynchronousResizePage();
        textAreaPage = new TextAreaPage();
        alertTypesPage = new AlertTypesPage();
    }

    public HomePage getHomePage() {
        return homePage;
    }

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

}
