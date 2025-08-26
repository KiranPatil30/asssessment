package com.example.testngproject.TestMySqlwithSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocalDragAndDrop {
	 public static void main(String[] args) throws InterruptedException {
		  
		 WebDriver driver = new ChromeDriver();
		 // Load local HTML
//		        File file = new File("C:\\selenium_test\\dragdrop.html");
//		        String url = "file:///" + file.getAbsolutePath();
		       driver.get("http://127.0.0.1:5500/dropAndDrop.html");
		  
		        WebElement dragElement = driver.findElement(By.id("drag"));
		        WebElement dropElement = driver.findElement(By.id("drop"));
		        Thread.sleep(2000);
		        Actions actions = new Actions(driver);
		       actions.dragAndDrop(dragElement, dropElement).perform();
		       Thread.sleep(200000);
		        driver.quit();
		    }
}
