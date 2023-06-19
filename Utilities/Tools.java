package Burak_Test.Utilities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Tools extends GWD{

    WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor js ;
    Robot robot;
/*asd*/
    public void scrollToElement_Tools(WebElement element) {
        js = (JavascriptExecutor) getDriver();

        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElementFromDOM_Tools(WebElement element) {
        js = (JavascriptExecutor) getDriver();

        js.executeScript("arguments[0].click();", element);
    }

    public void waitUntilElementToBeVisible_Tools(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable_Tools(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void visibilityOfElementLocated_Tools(By path) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    public void waitUntilElementToBeClickable_Tools(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickElement_Tools(WebElement element) {
        waitUntilElementToBeClickable_Tools(element);
        //scrollToElement_Tools(element);
        element.click();
    }

    public void sendKeysElement_Tools(WebElement element, String value) {
        waitUntilElementToBeVisible_Tools(element);
        scrollToElement_Tools(element);
        element.sendKeys(value);
    }

    public void robotClass_TAB_ENTER(int TAB, int Enter) throws AWTException {
        robot = new Robot();

        for (int i=0; i < TAB; i++){
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i=0; i < Enter; i++){
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
        robot.setAutoDelay(2000);
    }

    public void robot_Clipboard_Paste_Enter(String path){
        StringSelection selection = new StringSelection(path);
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(selection,selection);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease((KeyEvent.VK_V));

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void verifyElementContainsText_Tools(WebElement element, String text){
        Assert.isTrue(element.getText().contains(text),"Does not contain");
    }

    public WebElement createElementByPartialLinkText(String txt){
       return GWD.getDriver().findElement(By.partialLinkText(txt));
    }

    public void waitUntilElementDoesNotContainsText(WebElement element, String text){
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element, text)));
    }
}