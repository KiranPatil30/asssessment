package com.example.testngproject.TestMySqlwithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormHandlingExample {
	 public static void main(String[] args) {
		 
		//Load the WebDriver
		WebDriver driver = new ChromeDriver();
		 
		       try {
		           // Load the local HTML file
		          driver.get("http://127.0.0.1:5500/FormFolder/form.html");
		 
		           // Select radio button (e.g., Male)
		           WebElement maleRadio = driver.findElement(By.id("male"));
		           if (!maleRadio.isSelected()) {
		              maleRadio.click();
		           }
		 
		           // Select checkbox
		           WebElement agreeCheckbox = driver.findElement(By.id("agree"));
		           if (!agreeCheckbox.isSelected()) {
		              agreeCheckbox.click();
		           }
		 
		           // Select dropdown value (India)
		           WebElement countryDropdownElement = driver.findElement(By.id("country"));
		           Select countryDropdown = new Select(countryDropdownElement);
		          countryDropdown.selectByVisibleText("Italy");
		 
		           // Print selected country
		           WebElement selected = countryDropdown.getFirstSelectedOption();
		          System.out.println("Selected Country: " + selected.getText());
		 
		          Thread.sleep(1000);		          	
		       } catch (Exception e) {
		          e.printStackTrace();
		       } finally {
		           // Close the browser
		          driver.quit();
		       }
		   }
}
