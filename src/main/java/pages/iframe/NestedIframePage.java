package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.WebAutomationPage;

public class NestedIframePage extends WebAutomationPage {

    @FindBy(css = "h1")
    private WebElement headerInFrame;

    @FindBy(xpath = "(//iframe)[4]")
    private WebElement iFrameElement;

    public void switchToIFrame(){
        DRIVER.switchTo().frame(iFrameElement);
    }

    public String getHeaderInFrame(){
        switchToIFrame();
        return headerInFrame.getText();
    }

    public void printTitle(){
        System.out.println(DRIVER.switchTo().frame(iFrameElement).getTitle());
    }


}
