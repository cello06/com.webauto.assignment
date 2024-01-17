package pages.progress_bar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;
import utils.BrowserUtils;

public class DownloadDialogPage extends WebAutomationPage {
    @FindBy(id = "downloadButton-download-dialog")
    private WebElement startDownloadButton;

    @FindBy(xpath = "//button[contains(text(),'Cancel Download')]")
    private WebElement cancelDownloadElement;

    @FindBy(id = "progressbar-download-dialog")
    private WebElement downloadBar;

    @FindBy(id = "ui-id-82")
    private WebElement fileDownloadTitleText;

    public void clickStartDownloadButton(){

        startDownloadButton.click();
    }
    public void clickCancelDownloadButton(){
        actions.scrollByAmount(0,400).perform();
        BrowserUtils.wait(1.0);
        cancelDownloadElement.click();
    }
    public String getFileDownloadTitleText(){
        return fileDownloadTitleText.getText();
    }
    public double getProgressBarLevel(){
        actions.scrollToElement(downloadBar).perform();
        String style = downloadBar.getAttribute("aria-valuenow");
        System.out.println(style);
        return Double.parseDouble(style);
    }
    public String getStartDownloadButtonText(){
        return startDownloadButton.getText();
    }

}
