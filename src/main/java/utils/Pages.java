package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.HandlesPage;
import pages.droppable.AcceptPage;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NestedIframe_Page;
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

    private NestedIframe_Page nestedIframePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;
    private SerializePage serializePage;
    private HandlesPage handlesPage;

    private AcceptPage acceptPage;
    private RevertDraggablePositionPage revertDraggablePositionPage;

    private SynchronousResizePage synchronousResizePage;

    private TextAreaPage textAreaPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        serializePage = new SerializePage();
        constrainMovementPage = new ConstrainMovementPage();
        handlesPage = new HandlesPage();
        acceptPage = new AcceptPage();
        revertDraggablePositionPage = new RevertDraggablePositionPage();
        synchronousResizePage = new SynchronousResizePage();
        textAreaPage = new TextAreaPage();
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

    public NestedIframe_Page nestedIframePage() {
        return nestedIframePage;
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

}
