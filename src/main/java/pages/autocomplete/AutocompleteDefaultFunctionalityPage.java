package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class AutocompleteDefaultFunctionalityPage extends BasePage {
    @FindBy(id = "tags-def-func")
    private WebElement textBox;

    @FindBy(id = "ui-id-39")
    private List<WebElement> autocompleteBoxElements;

    public void enterTextToTextBox(String text) {
        textBox.sendKeys(text);
    }

    public List<String> getAutocompleteBoxValues() {
        return autocompleteBoxElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public boolean checkAutocompleteBoxFunctionality(String enteredValue, List<String> displayedList) {
        return displayedList.stream().allMatch(item -> item.contains(enteredValue));
    }

}
