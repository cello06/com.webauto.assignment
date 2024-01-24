package pages.sortable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebAutomationPage;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class IncludeExcludeItemsPage extends WebAutomationPage {

    @FindBy(id = "hel-sortable")
    private WebElement frame;

    //Upper-Box Elements
    @FindBy(css = "#sortable-inc-exc-1 > li")
    private List<WebElement> elementsInTheUpperBox;
    @FindBy(xpath = "//ul[@id='sortable-inc-exc-1']/li[contains(text(),'not sortable')][1]")
    private WebElement notSortableOrADropTargetElement;

   @FindBy(xpath = "//ul[@id='sortable-inc-exc-1']/li[text()='Item 1']")
    private WebElement itemOneOfUpperBox;
   @FindBy(xpath = "//ul[@id='sortable-inc-exc-1']/li[text()='Item 4']")
    private WebElement itemFourOfUpperBox;

   //Below-box Element
    @FindBy(css = "#sortable-inc-exc-2 > li")
    private List<WebElement> elementsInTheBelowBox;


   public String getWebElementsNameByItsOrder(String blockName,String order){
       return switch (blockName) {
           case "below" ->
                   DRIVER.findElement(By.cssSelector("#sortable-inc-exc-2 > li:nth-child(" + order + ")")).getText();
           default -> DRIVER.findElement(By.cssSelector("#sortable-inc-exc-1 > li:nth-child(" + order + ")")).getText();
       };
   }
   public void moveUpperBoxElementByOffsets(String firstElementName,String secondElementName){

       List<String> stringsOfElements = elementsInTheUpperBox.stream().map(WebElement::getText).toList();
       WebElement first = elementsInTheUpperBox.get(stringsOfElements.indexOf(firstElementName));
       WebElement second = elementsInTheUpperBox.get(stringsOfElements.indexOf(secondElementName));
       int xOffset = second.getLocation().getX() + second.getSize().getWidth()/2 - first.getLocation().getX();
       int yOffset = second.getLocation().getY() + second.getSize().getHeight()/2 - first.getLocation().getY();


        actions.clickAndHold(first).moveByOffset(xOffset,yOffset).release().build().perform();
   }
    public void moveBelowBoxElementByOffsets(String firstElementName,String secondElementName){

        List<String> stringsOfElements = elementsInTheBelowBox.stream().map(WebElement::getText).toList();
        WebElement first = elementsInTheBelowBox.get(stringsOfElements.indexOf(firstElementName));
        WebElement second = elementsInTheBelowBox.get(stringsOfElements.indexOf(secondElementName));
        int xOffset = second.getLocation().getX()+ second.getSize().getWidth()/2 - first.getLocation().getX();
        int yOffset = second.getLocation().getY() + second.getSize().getHeight()/2 - first.getLocation().getY();

        actions.clickAndHold(first).moveByOffset(xOffset,yOffset).release().build().perform();
    }
    public void moveElementByOffset(String blockName,String element,int xOffset,int yOffset){
        List<String> stringsOfElements ;
        WebElement elementToMove = null;
        switch (blockName) {
            case "upper" -> {
                stringsOfElements = elementsInTheUpperBox.stream().map(WebElement::getText).toList();
                elementToMove = elementsInTheUpperBox.get(stringsOfElements.indexOf(element));
            }
            case "below" -> {
                stringsOfElements = elementsInTheBelowBox.stream().map(WebElement::getText).toList();
                elementToMove = elementsInTheBelowBox.get(stringsOfElements.indexOf(element));
            }
            default -> System.out.println("Wrong Block Name!");
        }
       actions.clickAndHold(elementToMove).moveByOffset(xOffset,yOffset).release().build().perform();
    }
}
