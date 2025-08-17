package tests;

import pages.EmployeeFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class EmployeeFormTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://127.0.0.1:5500/index.html");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // Wait for the empId field to be present
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("empid")));

            // Initialize page object
            EmployeeFormPage formPage = new EmployeeFormPage(driver);

            // Fill the form
            formPage.enterEmpId("101");
            formPage.enterEmpName("Harry");
            formPage.enterDOB("2001-01-11");
            formPage.enterAddress("123 ABC");
            formPage.enterContactNo("7777777777");
            formPage.enterEmail("harry@example.com");

            // Submit the form
            formPage.clickSubmit();

            // Optional: handle alert
            try {
                formPage.triggerAlertAndAccept();
            } catch (Exception e) {
                System.out.println("No alert was triggered.");
            }

            // Wait and get confirmation message
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
            String message = formPage.getConfirmationMessage();
            if (message != null) {
                System.out.println("Success: " + message);
            } else {
                System.out.println("Submission failed or message not shown.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
