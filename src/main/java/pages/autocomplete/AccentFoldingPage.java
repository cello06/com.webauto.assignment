package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class AccentFoldingPage extends BasePage {

    @FindBy(id = "developer-accentFolding")
    private WebElement textBox;
    @FindBy(xpath = "//ul[@id='ui-id-40']/li/div")
    private List<WebElement> autocompleteBoxElements;

    public void enterTextToTextBox(String text) {
        textBox.sendKeys(text);
    }
    public List<String> getAccentFoldingBoxValues(){
        return autocompleteBoxElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public boolean checkAccentFoldingBoxFunctionality(List<String>displayedWords,List<String> expectedCriterias){
        for ( String expectedCriteria : expectedCriterias){
            if(displayedWords.stream().allMatch(item -> item.contains(expectedCriteria))){
                return false;
            }
        }

        return true;
    }
    public boolean checkAccentFoldingBoxFunctionality(List<String>displayedWords,String expectedValue){
        return displayedWords.stream().allMatch(item ->item.contains(expectedValue));
    }
    public void clearTextBox(){
        textBox.clear();
    }
}
