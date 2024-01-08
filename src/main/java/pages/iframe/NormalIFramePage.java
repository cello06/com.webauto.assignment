package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIFramePage extends BasePage {
    @FindBy(css = "h1")
    private WebElement headerInFrame;

    @FindBy(xpath = "//p[1]")
    private WebElement paragraphInFrame;
    @FindBy(id = "nestedIframe")
    private WebElement iFrameElement;

    public void switchToIFrame(){
        DRIVER.switchTo().frame(iFrameElement);
    }
    public void switchToPage(){
        DRIVER.switchTo().parentFrame();
    }
    public String getHeaderInFrame(){
        switchToIFrame();
        return headerInFrame.getText();
    }
    public String getParagraphInFrame(){
        switchToIFrame();
        return paragraphInFrame.getText();
    }
    public void printTitle(){
        System.out.println(DRIVER.switchTo().frame(iFrameElement).getTitle());
    }

}
