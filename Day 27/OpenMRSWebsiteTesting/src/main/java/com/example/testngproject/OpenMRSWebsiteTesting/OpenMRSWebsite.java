package com.example.testngproject.OpenMRSWebsiteTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenMRSWebsite {
	  public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();

	       driver.get("https://o3.openmrs.org/openmrs/spa/login");
	  
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        WebElement user = driver.findElement(By.id("username"));
	        user.sendKeys("admin");
	        user.sendKeys(Keys.ENTER);
	       
	        WebElement pass = driver.findElement(By.id("password"));
	        pass.sendKeys("Admin123");
	        pass.sendKeys(Keys.ENTER);
	        
	        
//	        WebElement loginBtn = driver.findElement(By.xpath("//button[contain("))
	        Thread.sleep(3000);
	        
	        
	      
	        driver.quit();
	    }
}

