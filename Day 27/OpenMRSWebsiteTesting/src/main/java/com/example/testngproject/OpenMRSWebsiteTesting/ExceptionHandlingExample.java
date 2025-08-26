package com.example.testngproject.OpenMRSWebsiteTesting;

import java.util.NoSuchElementException;

import org.openqa.selenium.*;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
	       WebDriver driver = new ChromeDriver();
	      
	       try {
	          driver.get("https://www.wikipedia.org/");
	           WebElement element = driver.findElement(By.id("searchInput"));
	          element.click();
	       } catch (NoSuchElementException e) {
	          System.out.println("Element not found: " + e.getMessage());
	       } catch (ElementNotInteractableException e) {
	          System.out.println("Element not interactable: " + e.getMessage());
	       } catch (WebDriverException e) {
	          System.out.println("WebDriver error: " + e.getMessage());
	       } finally {
	          driver.quit();
	       }
	   }
}
