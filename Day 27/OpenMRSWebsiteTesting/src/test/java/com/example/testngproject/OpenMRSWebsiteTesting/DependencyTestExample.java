package com.example.testngproject.OpenMRSWebsiteTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class DependencyTestExample {
	 WebDriver driver;
	 
	   @BeforeClass
	   public void setUp() {
	       driver = new ChromeDriver();
	   }
	 
	   @Test
	   public void launchWebsite() {
	       driver.get("http://127.0.0.1:5500/loginPage.html");
	       String expectedTitle = "Login Page";
	       String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	   }
	 
	   @Test(dependsOnMethods = {"launchWebsite"})
	   public void performLogin() {
	       // Simulate login functionality
	      System.out.println("Login test running...");
	      driver.findElement(By.id("username")).sendKeys("Kiran");
	   }
	 
	   @Test(dependsOnMethods = {"performLogin"})
	   public void verifyDashboard() {
	       // Simulate dashboard verification
	      System.out.println("Dashboard verification test running...");
	       // e.g., Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
	   }
	 
	   @AfterClass
	   public void tearDown() {
	       driver.quit();
	   }
}
