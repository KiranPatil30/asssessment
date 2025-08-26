package com.example.testngproject.TestMySqlwithSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMySQLusingTestNG {
	WebDriver driver;
    Connection conn;
    Statement stmt;
    ResultSet rs;

    String dbUsername;
    String dbPassword;

    @BeforeClass
    public void setUp() {
        try {
            // MySQL JDBC connection
        	String url ="jdbc:mysql://localhost:3306/wipro_java_selenium";
        	String username = "root";
        	String password = "Ksp@3099";

            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT username, password FROM user_tbl WHERE id = 1");

            if (rs.next()) {
                dbUsername = rs.getString("username");
                dbPassword = rs.getString("password");
            }

            // Set up Selenium WebDriver (Make sure chromedriver is in PATH)
            driver = new ChromeDriver();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void loginTest() {
        try {
            // Load the login page
            driver.get("http://127.0.0.1:5500/loginPage.html");  // Update path or use real URL

            // Find elements
            WebElement usernameInput = driver.findElement(By.name("username"));
            WebElement passwordInput = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Use credentials from database
            usernameInput.sendKeys(dbUsername);
            passwordInput.sendKeys(dbPassword);
            loginButton.click();

            // Optionally, add assertions or validations after login
            // e.g., Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception ignored) {}

        if (driver != null) {
            driver.quit();
        }
    }
}
