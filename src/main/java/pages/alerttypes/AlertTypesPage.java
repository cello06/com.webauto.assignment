package pages.alerttypes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertTypesPage extends BasePage {
    @FindBy(xpath = "//button[text()='Show Alert']")
    private WebElement showAlertButtonElement;

    @FindBy(xpath = "//button[contains(text(),'Show Confirm')]")
    private WebElement showConfirmButtonElement;

    @FindBy(xpath = "//button[contains(text(),'Show Prompt')]")
    private WebElement showPromptButtonElement;

    public void clickShowAlertButton(){
        showAlertButtonElement.click();
    }
    public void clickShowConfirmButton(){
        showConfirmButtonElement.click();
    }
    public void clickShowPromptButton(){
        showPromptButtonElement.click();
    }


    public  String getAlertMessage(){
        Alert alert = DRIVER.switchTo().alert();
        return alert.getText();
    }
    public void confirmAlertMessage(){
        Alert alert = DRIVER.switchTo().alert();
        alert.accept();
    }
    public void cancelAlertMessage(){
        Alert alert = DRIVER.switchTo().alert();
        alert.dismiss();
    }
    public void enterMessageIntoAlert(String message){
        Alert alert = DRIVER.switchTo().alert();
        alert.sendKeys(message);
    }

}
