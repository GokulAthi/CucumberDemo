package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumWrapperMethods extends GlobalVariables{

    public void setupWebDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

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

    public void cleanupWebDriver(){
        driver.quit();
    }
}
