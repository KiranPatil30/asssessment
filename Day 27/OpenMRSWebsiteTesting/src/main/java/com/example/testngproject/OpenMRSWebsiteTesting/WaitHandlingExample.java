package com.example.testngproject.OpenMRSWebsiteTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandlingExample {

	public static void main(String[] args) {
		   WebDriver driver = new ChromeDriver();
		   
	       try {
	          driver.get("https://practicetestautomation.com/practice-test-login/");
	 
	          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	           WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-43")));
	          element.click();
	       } catch (TimeoutException e) {
	          System.out.println("Element was not visible in time: " + e.getMessage());
	       } finally {
	          driver.quit();
	       }
	}

}
