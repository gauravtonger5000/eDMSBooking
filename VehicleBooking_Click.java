package eDMS_Vehicle_Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleBooking_Click {

	WebDriver driver;
	
	VehicleBooking_Click(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_on_VehicleBooking()
	{
		WebElement VehicleClick = driver.findElement(By.xpath("//a[@id=\"TV1t4\"]"));
		
		VehicleClick.click();
	}
}
