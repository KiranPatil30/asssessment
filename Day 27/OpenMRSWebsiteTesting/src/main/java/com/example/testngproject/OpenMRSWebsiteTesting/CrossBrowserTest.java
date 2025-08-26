package com.example.testngproject.OpenMRSWebsiteTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	public static WebDriver driver;
	   public static void main(String[] args) throws InterruptedException {
	       // Set the browser to test
	       String browser = "edge"; 
	 
	       // Launch the desired browser
	       switch (browser.toLowerCase()) {
	           case "chrome":
	               //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	               driver = new ChromeDriver();
	               break;
	           case "firefox":
	               //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
	               driver = new FirefoxDriver();
	               break;
	           case "edge":
	        	   System.setProperty("webdriver.edge.driver", "C:\\Users\\kiran\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	               driver = new EdgeDriver();
	               break;
	           default:
	              System.out.println("Unsupported browser!");
	              return;
	       }
	 
	       // Navigate to a website and perform actions
	      driver.get("https://example.com");
	      System.out.println("Title: " + driver.getTitle());
	 
	      Thread.sleep(2000);	       // Close the browser
	       driver.quit();
	   }
}
