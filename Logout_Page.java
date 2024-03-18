package eDMS_Vehicle_Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_Page {
    WebDriver driver;
    
    By logoutButton = By.xpath("//input[@id=\"imgLogout\"]");
    
    public Logout_Page(WebDriver driver)
    {
    	this.driver = driver;
    } 
    
    public void clicklogoutButton()
    {
    	driver.findElement(logoutButton).click();
		System.out.println("Successfully loggedout");

    }
    
    
    
    

}
