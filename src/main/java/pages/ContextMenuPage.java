package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickHotSpot(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(hotSpot);
        actions.contextClick(elementLocator).perform();

    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
}
