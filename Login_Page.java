package eDMS_Vehicle_Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
    WebDriver driver;
    
    // we create the constructor of this class and pass the driver reference 
    public Login_Page(WebDriver driver)
    {
    	this.driver = driver;
    }    
 
    
    By usernameField = By.xpath("//input[@id=\"txtUserName\"]");
    By passwordField = By.xpath("//input[@id=\"txtPassword\"]");
    By loginButton = By.xpath("//input[@id=\"cmdSignIn\"]");
    
    public void setUsername(String username) { 	
    	driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
    	driver.findElement(passwordField).sendKeys(password);
    }
    
    public void clickLogin() {
    	driver.findElement(loginButton).click();
    }
    
    public void login(String username,String password)
    {
    	setUsername(username);
    	setPassword(password);
    	clickLogin();
		System.out.println("Successfully logged in");
    }
}
