package com.example.testngproject.TestMySqlwithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/main.html");

        // Switch to first iframe and send keys
        driver.switchTo().frame("myFrame");
        WebElement messageInput1 = driver.findElement(By.id("message"));
        messageInput1.sendKeys("Hello from iframe 1!");
        
        // Back to main page before switching again
        driver.switchTo().defaultContent();

        // Switch to second iframe and send keys
        driver.switchTo().frame("myFrame2");
        WebElement messageInput2 = driver.findElement(By.id("message2"));
        messageInput2.sendKeys("Hello from iframe 2!");

      driver.switchTo().defaultContent();
 

        // Switch to third iframe and send keys
        driver.switchTo().frame("myFrame3");
        WebElement messageInput3 = driver.findElement(By.id("message3"));
        messageInput3.sendKeys("Hello from iframe 3!");

        // Back to main content

        Thread.sleep(2000);  // pause to see results

        //driver.quit();  // uncomment to close browser
    }
}
