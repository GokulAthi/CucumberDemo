package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWrapperMethods extends GlobalVariables{

    public void openURL(String URL){
        driver.get(URL);
    }

    public void enterDataIntoTextBox(By locator, String data){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(data);
    }

    public void simulateKeyBoardEnter(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void clickOnElement(By locator){
        driver.findElement(locator).click();
    }

    public void waitForDisplayOfElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }
}
