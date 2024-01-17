package base_test;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utils.Driver;
import utils.Pages;

public class Hooks {


    private static String browser = Driver.browser;
    protected static Pages pages = new Pages();
    public SoftAssertions softAssertions = new SoftAssertions();

    @BeforeAll
    public static void setUp() {
        Driver.getDriver().get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        if (browser.equalsIgnoreCase("firefox")) {
            Driver.getDriver().navigate().refresh();
        }
    }

    @AfterAll
    public static void tearDown() {
        Driver.closeDriver();
    }

}
