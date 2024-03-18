package eDMS_Vehicle_Booking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VehicleBookingMain 
{
	 public static String getCellValueAsString(Cell cell) {
	        String cellValue = "";
	        if (cell != null) {
	            switch (cell.getCellType()) {
	                case STRING:
	                    cellValue = cell.getStringCellValue();
	                    break;
	                case NUMERIC:
	                    // Check if the numeric value is an integer
	                    if (cell.getNumericCellValue() == (int) cell.getNumericCellValue()) {
	                        cellValue = String.valueOf((int) cell.getNumericCellValue());
	                    } else {
	                        // If it's not an integer, treat it as a string
	                        cellValue = String.valueOf(cell.getNumericCellValue());
	                    }
	                    break;
	            }
	        }
	        return cellValue;
	    }
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://edmstest.infoman-edms.com/General/pgGLogin.aspx?LogOut=True");
	    driver.manage().window().maximize();	
	    
	    Login_Page login = new Login_Page(driver);
	    login.login("admin@tmpl", "ADMIN@#");
	    
	    Transaction_Page transaction = new Transaction_Page(driver);
	    transaction.clickTransaction();
	    
	    
	    VehicleBooking_Click vehicleClick = new VehicleBooking_Click(driver);
	    vehicleClick.click_on_VehicleBooking();
	   
	    driver.switchTo().frame("frmContent");
	   
	    VehicleDetails vehicle_details = new  VehicleDetails(driver);
	     
	    File excelFile = new File("./Data/BookingDetails.xlsx");
	    FileInputStream fis = new FileInputStream(excelFile);
	    Workbook workbook = WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet("Sheet1");
       
	    Row row = sheet.getRow(1);
	    String location = getCellValueAsString(row.getCell(0));
	    String bookingType = getCellValueAsString(row.getCell(1));
	    String segment = getCellValueAsString(row.getCell(2));
	    String source = getCellValueAsString(row.getCell(3));
	    String gst_category = getCellValueAsString(row.getCell(4));
	    String customer_salutation = getCellValueAsString(row.getCell(5));
	    String customer_name = getCellValueAsString(row.getCell(6));
	    String mobile = getCellValueAsString(row.getCell(7));
	    String relation = getCellValueAsString(row.getCell(8));
	    String relative_name = getCellValueAsString(row.getCell(9));
	    String email = getCellValueAsString(row.getCell(10));
	    String address = getCellValueAsString(row.getCell(11));
	    String pan = getCellValueAsString(row.getCell(12));
	    String place_of_supply = getCellValueAsString(row.getCell(13));
	    String state = getCellValueAsString(row.getCell(14));
	    String city = getCellValueAsString(row.getCell(15));
	    String pincode = getCellValueAsString(row.getCell(16));
	    String model = getCellValueAsString(row.getCell(17));
	    String sub_model = getCellValueAsString(row.getCell(18));
	    String color = getCellValueAsString(row.getCell(19));
	    String sales_consultant = getCellValueAsString(row.getCell(20));
	    String remarks = getCellValueAsString(row.getCell(21));
	    String finance_cash = getCellValueAsString(row.getCell(22));
	    String additional_discount = getCellValueAsString(row.getCell(23));
	    String addi_free_acc = getCellValueAsString(row.getCell(24));
	    String scheme_offer = getCellValueAsString(row.getCell(25));
	    String add_disc = getCellValueAsString(row.getCell(26));
	    String con_offer_cash = getCellValueAsString(row.getCell(27));
	    String select_date = getCellValueAsString(row.getCell(28));
	    
	    vehicle_details.enterDetails(location,bookingType,segment,source ,gst_category,customer_salutation,customer_name,mobile,relation,relative_name,email,address,pan,place_of_supply,state,city,pincode,model,sub_model,color,sales_consultant,select_date ,remarks,finance_cash,additional_discount,addi_free_acc,scheme_offer,add_disc,con_offer_cash);
	    
	    WebElement saveButton = driver.findElement(By.id("ctl00_cpForm_btnSave"));
	    saveButton.click();
	    
	    
	    
	    	
	   /*
	    String parentWindowHandle = driver.getWindowHandle();
	     System.out.println("Parent Window Handle: " + parentWindowHandle);
	     
	     
	    //this code is used when we click on document and upload document but the upload page is mot inspactable 
	    vehicle_details.clickOnDocument();
	    
	    Set<String> allWindowHandles = driver.getWindowHandles();
	    System.out.println("All Window Handles:");
        for (String windowHandle : allWindowHandles) {
            System.out.println(windowHandle);
        }
	    for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                
                String title =driver.getTitle();
                System.out.println(title);
               
            //    WebElement elementOnNewWindow = driver.findElement(By.id("element_on_new_window"));
              //  elementOnNewWindow.click(); // Example action on the new window
                // After performing actions, you can close the new window if needed
                driver.close();
                // Break out of the loop after performing necessary actions on the new window
                break;
            }
        }
	   
	    
	    driver.switchTo().window(parentWindowHandle); */
	}

}
