package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;

import java.util.List;

public class ModelFormPage extends WebAutomationPage {
    @FindBy(css = ".ui-widget.ui-widget-content.mb-4 > tbody > tr")
    private List<WebElement>rowsOnTheTableBody;
    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;
    @FindBy(css = "div>#name")
    private WebElement nameTextField;

    @FindBy(id = "surname")
    private WebElement surnameTextField;

    @FindBy(id = "email")
    private WebElement emailTextField;
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;
    public void enterName(String name){
        nameTextField.sendKeys(name);
    }
    public void enterSurname(String surname){
        surnameTextField.sendKeys(surname);
    }
    public void enterEmail(String email){
        emailTextField.sendKeys(email);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public void enterAccountInformationAndSubmit(String name,String surname,String email){
        enterName(name);
        enterSurname(surname);
        enterEmail(email);
        clickSubmitButton();
    }

    public List<String> getRows(){
        return rowsOnTheTableBody.stream().map(WebElement::getText).toList();
    }
    public void clickOnCreateAccountButton(){
        createAccountButton.click();
    }
}
