package com.example.testngproject.OpenMRSWebsiteTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) {
        try {
            // Grid Hub URL from your terminal
            URL gridURL = new URL("http://192.168.0.213:4444");

            // Browser options (Chrome, but you can change to Edge or Firefox)
            ChromeOptions options = new ChromeOptions();

            // Create Remote WebDriver
            WebDriver driver = new RemoteWebDriver(gridURL, options);

            // Navigate to a webpage
            driver.get("https://youtube.com");
            System.out.println("Page Title is: " + driver.getTitle());

            // Close browser
            driver.quit();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
