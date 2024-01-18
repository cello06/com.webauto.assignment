package pages.control_group;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.WebAutomationPage;

import java.util.HashMap;
import java.util.Map;

public class ToolbarPage extends WebAutomationPage {
    @FindBy(css = ".form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(1)")
    private WebElement zoomDropBoxElement;
    @FindBy(css = ".form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(2)")
    private WebElement backGroundDropBoxElement;
    @FindBy(css = ".form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(3)")
    private WebElement colorDropBoxElement;
    @FindBy(css = ".btn.btn-primary.me-2.ui-button.ui-corner-all.ui-widget:nth-child(4)")
    private WebElement boldFontWeightButton;
    @FindBy(css = ".btn.btn-primary.me-2.ui-button.ui-corner-all.ui-widget:nth-child(5)")
    private WebElement italicFontStyleButton;
    @FindBy(css = ".btn.btn-primary.me-2.ui-button.ui-corner-all.ui-widget:nth-child(6)")
    private WebElement underLineTextDecorationButton;
    @FindBy(css = ".btn.btn-primary.me-2.ui-button.ui-corner-all.ui-widget:nth-child(7)")
    private WebElement printButton;
    @FindBy(id = "page")
    private WebElement textElement;

    public Map<String, String> getTextStyleFeatures() {
        Map<String, String> featureAsMap = new HashMap<>();
        String styleOfText = textElement.getAttribute("style");
        String[] features = styleOfText.split(";");
        for (String feature : features) {
            String[] currentFeature = feature.split(":");
            featureAsMap.put(currentFeature[0].trim(), currentFeature[1].trim());
        }
        return featureAsMap;
    }

    public void selectZoomRatio(String zoomRatio) {
        Select select = new Select(zoomDropBoxElement);
        select.selectByVisibleText(zoomRatio);
    }

    public void selectBackgroundColor(String backgroundColor) {
        Select select = new Select(backGroundDropBoxElement);
        select.selectByVisibleText(backgroundColor);
    }

    public void selectTextColor(String color) {
        Select select = new Select(colorDropBoxElement);
        select.selectByVisibleText(color);
    }

    public void clickOnBoldButton() {
        boldFontWeightButton.click();
    }

    public void clickItalicButton() {
        italicFontStyleButton.click();
    }

    public void clickUnderlineButton() {
        underLineTextDecorationButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

}
