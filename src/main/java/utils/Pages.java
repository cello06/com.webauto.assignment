package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.draggable.DefaultFunctionality_Page;

public class Pages {

    private HomePage homePage;

    private WebAutomationPage webAutomationPage;

    private DefaultFunctionality_Page defaultFunctionalityPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        defaultFunctionalityPage = new DefaultFunctionality_Page();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public DefaultFunctionality_Page getDefaultFunctionalityPage() {
        return defaultFunctionalityPage;
    }

}
