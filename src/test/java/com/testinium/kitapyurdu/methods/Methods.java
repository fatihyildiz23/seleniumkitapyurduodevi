package com.testinium.kitapyurdu.methods;

import com.testinium.kitapyurdu.driver.KitapYurduBaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;
    Logger logger = LogManager.getLogger(Methods.class);

    public Methods() {
        driver = KitapYurduBaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
        // java script ile scroll.

    }
    public void clearValue(By by){
        driver.findElement(by).clear();
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public List<WebElement> findElements(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public String getText(By by){
        return findElement(by).getText();

    }
    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
        logger.info("send key işlemi gerçekleştirildi");

    }

    public void waitBySecond(long seconds) {
        try {
            Thread.sleep(seconds * 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean loginCheck(By by){
        logger.info("");
        try {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        logger.info("True");
       return true;
        }
        catch (Exception e){
            logger.info("False"+ e.getMessage());
            return false;
        }
    }




    public void turnBack(){
        driver.navigate().back();
    }
    public Select getSelect(By by) {

        return new Select(findElement(by));

    }
    public void selectByText(By by, String text) {

        getSelect(by).selectByVisibleText(text);
    }
    public boolean favoriCheck(By by){
        logger.info("");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("True");
            System.out.println("True");
            return true;
        }
        catch (Exception e){
            logger.info("False"+ e .getMessage());
            return false;
        }
    }

    public boolean hatalıGirisCheck(By by){
        logger.info("");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("True");
            System.out.println("True");
            return true;
        }
        catch (Exception e){
            logger.info("False"+ e .getMessage());
            return false;
        }

    }
    public boolean odemeCheck(By by){
        logger.info("");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("True");
            System.out.println("True");
            return true;
        }
        catch (Exception e){
            logger.info("False"+ e .getMessage());
            return false;
        }
    }
    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }
    public String getId(By by){

        return findElement(by).getAttribute("id");
    }
}
