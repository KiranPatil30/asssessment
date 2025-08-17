package com.example.excelselenium.MyExcelSel;

/**
 * Hello world!
 *
 */import org.apache.poi.ss.usermodel.*;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.ChromeDriver;
  
 import java.io.File;
 import java.io.FileInputStream;
  
 public class App {
     static WebDriver driver;
  
     public static void main(String[] args) {
         try {
        	 FileInputStream file = new FileInputStream("C:\\Users\\kiran\\eclipse-workspace\\MyExcelSel\\TestSteps.xlsx");
             Workbook workbook = new XSSFWorkbook(file);
             Sheet sheet = workbook.getSheetAt(0);
  
             
  
           for (Row row : sheet) {
                 if (row.getRowNum() == 0) continue; // skip header
  
                 String keyword = row.getCell(1).getStringCellValue();
                 String locatorType = getCellValue(row.getCell(2)).trim();
                 String locatorValue = getCellValue(row.getCell(3)).trim();
                 String data = getCellValue(row.getCell(4));
  
                 executeStep(keyword, locatorType, locatorValue, data);
             }
  
             workbook.close();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
  
     public static String getCellValue(Cell cell) {
     	if (cell == null) return "";
  
     	switch (cell.getCellType()) {
     	    case STRING:
     	        return cell.getStringCellValue();
     	    case NUMERIC:
     	        return String.valueOf((int) cell.getNumericCellValue());
     	    default:
     	        return "";
     	}
 }
  
     public static void executeStep(String keyword, String locatorType, String locatorValue, String data) {
     	switch (keyword) {
         case "openBrowser":
             //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
             driver = new ChromeDriver();
             break;
  
         case "openURL":
             driver.get(data);
             break;
  
         case "inputText":
             getElement(locatorType, locatorValue).sendKeys(data);
             break;
  
         case "Click":
             getElement(locatorType, locatorValue).click();
             break;
  
         case "closeBrowser":
             driver.quit();
             break;
  
         default:
             System.out.println("Unknown keyword: " + keyword);
             break;
     }
     }
     public static WebElement getElement(String type, String value) {
     	type = type.toLowerCase();
  
     	switch (type) {
     	    case "id":
     	        return driver.findElement(By.id(value));
     	    case "name":
     	        return driver.findElement(By.name(value));
     	    case "cssselector":
     	        return driver.findElement(By.cssSelector(value));
     	    case "xpath":
     	        return driver.findElement(By.xpath(value));
     	    default:
     	        throw new IllegalArgumentException("Invalid locator type: " + type);
     	}
  
     }
 }