package pages.checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;

import java.util.List;
import java.util.Locale;

public class ProductSelectorPage extends WebAutomationPage {
    @FindBy(css = "input[name='brand']")
    private List<WebElement> brands;

    @FindBy(css = "input[name='shape']")
    private List<WebElement> shapes;

    @FindBy(css = "input[name='color']")
    private WebElement shadow;

    @FindBy(css = "input[name='border']")
    private WebElement border;

    @FindBy(css = "input[name='background-color']")
    private WebElement backgroundColor;

    @FindBy(css = ".toggle-options > label >input[type='checkbox']")
    private List<WebElement> styles;

    @FindBy(css = ".preview > div")
    private WebElement preview;

    public boolean checkElementIsSelected(String categoryOfElement, String elementName) {
        List<String> strOfElements;
        boolean isSelected = false;
        switch (categoryOfElement) {
            case "brands" -> {
                strOfElements = brands.stream().map(item -> item.getAttribute("value").toLowerCase(Locale.ROOT)).toList();
                isSelected = brands.get(strOfElements.indexOf(elementName.toLowerCase(Locale.ROOT))).isSelected();
            }
            case "shapes" -> {
                strOfElements = shapes.stream().map(item -> item.getAttribute("value").toLowerCase(Locale.ROOT)).toList();
                isSelected = shapes.get(strOfElements.indexOf(elementName.toLowerCase(Locale.ROOT))).isSelected();
            }
            case "styles" -> {
                strOfElements = styles.stream().map(item -> item.getAttribute("name").toLowerCase(Locale.ROOT)).toList();
                isSelected = styles.get(strOfElements.indexOf(elementName.toLowerCase(Locale.ROOT))).isSelected();
            }
            default -> System.out.println("There is no such category!");
        }
        return isSelected;
    }

    public void clickElementByName(String categoryOfElement, String elementName) {
        List<String> strOfElements;
        switch (categoryOfElement) {
            case "brands" -> {
                strOfElements = brands.stream().map(item -> item.getAttribute("value").toLowerCase(Locale.ROOT)).toList();
                brands.get(strOfElements.indexOf(elementName.toLowerCase(Locale.ROOT))).click();
            }
            case "shapes" -> {
                strOfElements = shapes.stream().map(item -> item.getAttribute("value").toLowerCase(Locale.ROOT)).toList();
                shapes.get(strOfElements.indexOf(elementName.toLowerCase(Locale.ROOT))).click();
            }
            case "styles" -> {
                strOfElements = styles.stream().map(item -> item.getAttribute("name").toLowerCase(Locale.ROOT)).toList();
                styles.get(strOfElements.indexOf(elementName.toLowerCase(Locale.ROOT))).click();
            }
            default -> System.out.println("There is no such category!");
        }
    }

    public int getCountOfSelectedElements(String category) {
        int count = 0;
        switch (category) {
            case "brands" -> {
                for (WebElement brand : brands) {
                    if (brand.isSelected()) {
                        count++;
                    }
                }
            }
            case "shapes" -> {
                for (WebElement shape : shapes) {
                    if (shape.isSelected()) {
                        count++;
                    }
                }
            }
            case "styles" -> {
                for (WebElement style : styles) {
                    if (style.isSelected()) {
                        count++;
                    }
                }
            }
            default -> System.out.println("There is no such category!");
        }
        return count;
    }

    public boolean checkElementIsDisplayed(String elementName) {
        if (elementName.toLowerCase(Locale.ROOT).contains("brand")) {
            WebElement textElementOfPreview = DRIVER.findElement(By.cssSelector(".preview > div > p"));
            return textElementOfPreview.getText().equalsIgnoreCase(elementName);
        } else {
            String classOfPreview = preview.getAttribute("class");
            return classOfPreview.toLowerCase(Locale.ROOT).contains(elementName.toLowerCase(Locale.ROOT));
        }
    }

}
