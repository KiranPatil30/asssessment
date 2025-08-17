//package pkg_test_website;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ListAllAttributes {
//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		
//		try {
//			driver.get("http://127.0.0.1:5500/index.html");
//			driver.manage().window().maximize();
//			
//            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//            System.out.println("Links:");
//            for (WebElement link : allLinks) {
//                System.out.println(link.getText() + " -> " + link.getAttribute("href"));
//            }
//			
//            List<WebElement> allInputs = driver.findElements(By.tagName("input"));
//            System.out.println("All INputs: ");
//            for (WebElement input : allInputs) {
//                System.out.println("Type: " + input.getAttribute("type") + " | Placeholder: " + input.getAttribute("placeholder"));
//            }
//            
//            List<WebElement> allButtons = driver.findElements(By.tagName("button"));
//            System.out.println("Buttons:");
//            for (WebElement button : allButtons) {
//                System.out.println("Text: " + button.getText());
//            }
//            
//            System.out.println("Headings:");
//            for (int i = 1; i <= 6; i++) {
//                List<WebElement> headings = driver.findElements(By.tagName("h" + i));
//                for (WebElement heading : headings) {
//                    System.out.println("H" + i + ": " + heading.getText());
//                }
//            }
//            
//            List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));
//            System.out.println("Paragraphs:");
//            for (WebElement para : allParagraphs) {
//                System.out.println(para.getText());
//            }
//			
//		}catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // 7. Close browser
//            driver.quit();
//        }
//
//	}
//
//}

//
//
//package pkg_test_website;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class ListAllAttributes {
//    public static void main(String[] args){
//
//        WebDriver driver = new ChromeDriver();
//
//        try{
//            // open target website
//            driver.get("file:///C:/Users/namde/OneDrive/Desktop/Wipro%20Training%20Techademy/Day%2022%2014082025/Employees.html");
//            driver.manage().window().maximize();
//
//            Thread.sleep(30000);
//
//            // extract all links from the website
//            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//            System.out.println("Links: \n");
//            for( WebElement links: allLinks){
//                System.out.println(links.getText()+" -> "+ links.getAttribute("href"));
//            }
//
//            // extract all inputs from the website
//            List<WebElement> allInputs = driver.findElements(By.tagName("input"));
//            System.out.println("\nInputs: \n");
//            for( WebElement input: allInputs){
//                System.out.println("Type: "+input.getAttribute("type")+" | Placeholder: "+input.getAttribute("placeholder"));
//            }
//
//            // extract all buttons
//            List<WebElement> allButtons = driver.findElements(By.tagName("button"));
//            System.out.println("\nButtons: \n");
//            for( WebElement button: allButtons){
//                System.out.println("Text: "+button.getText());
//            }
//
//            // extract all headings
//            System.out.println("\nHeadings: \n");
//            for( int i=1; i<=6; i++){
//                List<WebElement> allHeadings = driver.findElements(By.tagName("h"+ i));
//                for( WebElement heading: allHeadings){
//                    System.out.println("H"+i+" : "+heading.getText());
//                }
//            }
//
//            // extract all paragraphs
//            List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));
//            System.out.println("\nParagraphs: \n");
//            for (WebElement para : allParagraphs) {
//                System.out.println(para.getText());
//            }
//
//            // display employee id
//            WebElement empIDElement = driver.findElement(By.name("empId"));
//            String eId_value = empIDElement.getAttribute("value");
//            System.out.println("Employee Id: " + eId_value);
//
//            // display employee name
//            WebElement empNameElement = driver.findElement(By.name("empName"));
//            String ename_value = empNameElement.getAttribute("value");
//            System.out.println("Employee Name: " + ename_value);
//
//            // display employee email
//            WebElement empMailElement = driver.findElement(By.name("email"));
//            String email_value = empMailElement.getAttribute("value");
//            System.out.println("Employee Email: " + email_value);
//
//            // display employee phone number
//            WebElement empPhoneElement = driver.findElement(By.name("mobile"));
//            String ephone_value = empPhoneElement.getAttribute("value");
//            System.out.println("Employee Phone: " + ephone_value);
//
//        }catch( Exception e){
//            e.getMessage();
//
//        }finally {
//            driver.quit();
//        }
//
//    }
//}