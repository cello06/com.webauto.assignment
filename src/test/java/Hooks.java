
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Hooks {


//    private static String browser = Driver.browser;

    @BeforeAll
    public static void setUp() {
        Driver.getDriver().get("https://InarAcademy:Fk160621.@test.inar-academy.com");
//        if (browser.equalsIgnoreCase("firefox")) {
//            driver.navigate().refresh();
//        }
    }

    @AfterAll
    public static void tearDown() {
        Driver.closeDriver();
    }

}
