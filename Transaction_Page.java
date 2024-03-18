package eDMS_Vehicle_Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transaction_Page {
	
	WebDriver driver;
	
	By Transaction = By.xpath("//a[@id=\"TV1t0\"]");
	
	public Transaction_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickTransaction() {
		driver.findElement(Transaction).click();
		System.out.println("Clicked on Transaction");
	}
	
	

}
