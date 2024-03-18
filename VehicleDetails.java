package eDMS_Vehicle_Booking;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleDetails {
	WebDriver driver;
	
	VehicleDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By locationField = By.id("ctl00_cpForm_txtLocation");
	By bookingTypeField = By.xpath("//select[@id=\"ctl00_cpForm_cmbOrderCategory\"]");
	By segmentField = By.name("ctl00$cpForm$cmbSubSegment");
	By sourceField = By.name("ctl00$cpForm$cmbSource");
	By gstCategoryField = By.name("ctl00$cpForm$ddlGSTCategory");
	By customerSalutationField = By.name("ctl00$cpForm$cmbSalutation");
	By customerNameField = By.name("ctl00$cpForm$txtCname");
	By mobileNumberField = By.id("ctl00_cpForm_txtMobile");
	By relationField = By.id("ctl00_cpForm_cmbRelation");
	By relativeNameField = By.id("ctl00_cpForm_txtRelativeName");
	By emailField = By.id("ctl00_cpForm_txtEmail");
	By addressField = By.id("ctl00_cpForm_txtBAdd");
	By panField = By.id("ctl00_cpForm_txtPAN");
	By placeOfSupplyField = By.name("ctl00$cpForm$ddlPlaceOfSlp");
	By stateField = By.name("ctl00$cpForm$cmbstate");
	By cityField = By.name("ctl00$cpForm$cmbCity");
	By pincodeField = By.id("ctl00_cpForm_txtPinCode");
	By modelField = By.id("ctl00_cpForm_txtModel");
	By subModelField = By.id("ctl00_cpForm_txtSubModel");
	By colorField = By.id("ctl00_cpForm_txtColor");
	By salesConsultantField = By.id("ctl00_cpForm_txtDSE");
	By remarksField = By.id("ctl00_cpForm_txtRemarks");
	By FinanceCashField = By.id("ctl00_cpForm_cmbPurchtypeCustomer");
	By additionalDiscountField = By.id("ctl00_cpForm_txtAddDiscount");
	By additionalFreeAccessoriesField=By.id("ctl00_cpForm_txtAddAcc");
	By schemeOfferField = By.id("ctl00_cpForm_cmbScheme");
	By addDisField = By.xpath("//input[@id=\"ctl00_cpForm_grdSchemedetail_ctl02_txtGSchmval2\"]");
	By conOfferCash = By.xpath("//input[@id=\"ctl00_cpForm_grdSchemedetail_ctl03_txtGSchmval2\"]");
	By dateField = By.xpath("//input[@id=\"ctl00_cpForm_ImgExpecteddt\"]");
	By documentField = By.id("ctl00_cpForm_btnDocuments");
	
	public void enterLocation(String location) 
	{
		
		WebElement loc=driver.findElement(locationField);
		loc.sendKeys(location);		
	}

	public void selectBookingType(String booking_type) throws InterruptedException {
	    try {
	       
	    	   WebElement bookingtype = driver.findElement(bookingTypeField);
		        bookingtype.click();
		        Thread.sleep(2000);
		        Select sb = new Select(bookingtype);
		        sb.selectByVisibleText(booking_type);
	  
	    } catch (StaleElementReferenceException e) {			
	    	
		        WebElement bookingtype = driver.findElement(bookingTypeField);
		        bookingtype.click();
		        Thread.sleep(2000);
		        Select sb = new Select(bookingtype);
		        sb.selectByVisibleText(booking_type);
	    }
	}
	public void selectSegment(String segment ) throws InterruptedException
	{
		try {
				WebElement select_segment = driver.findElement(segmentField);
				Select sg = new Select(select_segment);
				sg.selectByVisibleText(segment);				
			}
		catch(StaleElementReferenceException e)
			{
			WebElement select_segment = driver.findElement(segmentField);
			Select sg = new Select(select_segment);
			sg.selectByVisibleText(segment);
			}
	}	
	public void selectSource(String source) throws InterruptedException
	{
		try {
				WebElement selectSource = driver.findElement(sourceField);
				Select ss = new Select(selectSource);
				ss.selectByVisibleText(source);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement selectSource = driver.findElement(sourceField);
			Select ss = new Select(selectSource);
			ss.selectByVisibleText(source);
		}
	}
	public void gstCategory(String gst_category)
	{
		try 
		{
			WebElement selectGstCategory = driver.findElement(gstCategoryField);
			Select sgst = new Select(selectGstCategory);
			sgst.selectByVisibleText(gst_category);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement selectGstCategory = driver.findElement(gstCategoryField);
			Select sgst = new Select(selectGstCategory);
			sgst.selectByVisibleText(gst_category);
		}
	}	
	public void SelectCustomerSalutation(String customer_salutation) throws InterruptedException 
	{
		try 
		{
			WebElement selectCustomerSalutation = driver.findElement(customerSalutationField);
			Select scs = new Select(selectCustomerSalutation);
			scs.selectByVisibleText(customer_salutation);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement selectCustomerSalutation = driver.findElement(customerSalutationField);
			Select scs = new Select(selectCustomerSalutation);
			scs.selectByVisibleText(customer_salutation);
		}
	}	
	public void customerName(String customer_name) throws InterruptedException
	{
		try 
		{
			WebElement enterCustomerName = driver.findElement(customerNameField);
			enterCustomerName.click();
			Thread.sleep(1000);
			enterCustomerName.sendKeys(customer_name);	
		}
		catch(StaleElementReferenceException e)
		{
			WebElement enterCustomerName = driver.findElement(customerNameField);
			enterCustomerName.sendKeys(customer_name);	
		}
	}
	public void mobileNumber(String mobile) throws InterruptedException
	{
			WebElement mobile_number = driver.findElement(mobileNumberField);		
			   mobile = mobile.replace(".", "");
			    mobile_number.clear(); 
			    mobile_number.sendKeys(mobile);		
	}
	public void selectRelation(String relation)
	{
		WebElement select_Relation = driver.findElement(relationField);
		Select sr = new Select(select_Relation);
		sr.selectByVisibleText(relation);
	}	
	public void RelativeName(String relative_name)
	{
		WebElement rel_Name = driver.findElement(relativeNameField);
		rel_Name.sendKeys(relative_name);
	}	
	public void enterEmail(String email)
	{
		WebElement em = driver.findElement(emailField);
		em.sendKeys(email);
	}	
	public void enterAddress(String address)
	{
		WebElement add = driver.findElement(addressField);
		add.sendKeys(address);
	}	
	public void enterPAN(String pan)
	{
		WebElement p = driver.findElement(panField);
		p.sendKeys(pan);
	}	
	public void placeOfSupply(String place_of_supply) throws InterruptedException
	{
		WebElement ps = driver.findElement(placeOfSupplyField);
		ps.click();
		Thread.sleep(2000);
		Select supplyPlace = new Select(ps);
		supplyPlace.selectByVisibleText(place_of_supply);
	}	
	public void selectState(String state) throws InterruptedException
	{
		try {
				WebElement st = driver.findElement(stateField);
				
				Select stateS = new Select(st);
				stateS.selectByVisibleText(state);
				Thread.sleep(2000);
		
	  } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        // Handle interruption as needed
	    }
		catch(StaleElementReferenceException e)
		{
				WebElement st = driver.findElement(stateField);
				Select stateS = new Select(st);
				stateS.selectByVisibleText(state);
				Thread.sleep(2000);

		}
	}

	public void selectCity(String city) throws InterruptedException
	{
		try {
		WebElement cty = driver.findElement(cityField);		
		Select c = new Select(cty);
		c.selectByVisibleText(city);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement cty = driver.findElement(cityField);			
			Select c = new Select(cty);
			c.selectByVisibleText(city);
		}
	}
	public void enterPinCode(String pincode) throws InterruptedException
	{
		try {
		WebElement pc = driver.findElement(pincodeField);
		pc.click();
		Thread.sleep(2000);
		pc.sendKeys(pincode);
		}
		catch(StaleElementReferenceException e)
		{
			WebElement pc = driver.findElement(pincodeField);
			pc.click();
			Thread.sleep(2000);

			pc.sendKeys(pincode);
		}
	}
	
	public void selectModel(String model)
	{
		try {
				WebElement sm = driver.findElement(modelField);
				sm.sendKeys(model);
			}
		catch(StaleElementReferenceException e)
		{
				WebElement sm = driver.findElement(modelField);
				sm.sendKeys(model);	
		}
		}
	
	public void selectSubModel(String sub_model) throws InterruptedException {
	    try {
	        WebElement ssm = driver.findElement(subModelField);          
	        ssm.click();
	        Thread.sleep(2000);
	        ssm.sendKeys(sub_model);
	    } 
	    catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        // Handle interruption as needed
	    }
	    catch (StaleElementReferenceException e) {
	        WebElement ssm = driver.findElement(subModelField);     
	        ssm.click();
	        Thread.sleep(2000);
	        ssm.sendKeys(sub_model);
	    }
	}

	public void selectColor(String color) throws InterruptedException {
	    try {
	        WebElement sc = driver.findElement(colorField);           
	        sc.click();
	        Thread.sleep(2000); 
	        sc.sendKeys(color);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    } catch (StaleElementReferenceException e) {
	        WebElement sc = driver.findElement(colorField);    
	        sc.click();
	        Thread.sleep(2000);
	        sc.sendKeys(color);
	    }
	}
	
	public void salesConsultant(String sales_consultant) throws InterruptedException
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          wait.until(ExpectedConditions.elementToBeClickable(salesConsultantField));
				WebElement scf = driver.findElement(salesConsultantField);
				scf.click();
				Thread.sleep(2000);
				scf.sendKeys(sales_consultant);
			
	 } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	 }
		catch(StaleElementReferenceException e)
			{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          wait.until(ExpectedConditions.elementToBeClickable(salesConsultantField));
				WebElement scf = driver.findElement(salesConsultantField);
				scf.click();
				Thread.sleep(2000);
				scf.sendKeys(sales_consultant);			
			}
	}
	
	public void enterRemarks(String remarks) throws InterruptedException
	{
		try
			{	
				WebElement er = driver.findElement(remarksField);
				er.click();
				Thread.sleep(2000);
				er.sendKeys(remarks);
			
	 } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	 }
		catch(StaleElementReferenceException e)
			{
			WebElement er = driver.findElement(remarksField);
			er.click();
			Thread.sleep(2000);
			er.sendKeys(remarks);
			}
	}
	
	public void SelectfinanceOrCash(String finance_cash) throws InterruptedException
	{
		try {
			
				WebElement fc = driver.findElement(FinanceCashField);
				Select sfc = new Select(fc);
				
				sfc.selectByVisibleText(finance_cash);
			}
		catch(StaleElementReferenceException e)
			{
				WebElement fc = driver.findElement(FinanceCashField);
				Select sfc = new Select(fc);
				sfc.selectByVisibleText(finance_cash);
			}		
	}
	public void additionalDiscount(String additional_discount) throws InterruptedException
	{
		try {		
				WebElement ad = driver.findElement(additionalDiscountField);
				ad.click();
				Thread.sleep(2000);
				  Actions actions = new Actions(driver);
				  actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();	   		
				ad.sendKeys(additional_discount);	
			
	  } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	       
	    }
		catch(StaleElementReferenceException e)
			{
				WebElement ad = driver.findElement(additionalDiscountField);
				ad.click();
				Thread.sleep(2000);
				  Actions actions = new Actions(driver);
				  actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();	   		
				ad.sendKeys(additional_discount);	
			}
	}
	
	public void additionalFreeAcc(String addit_free_acc) throws InterruptedException
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          wait.until(ExpectedConditions.elementToBeClickable(additionalFreeAccessoriesField));
				WebElement afa = driver.findElement(additionalFreeAccessoriesField);
				afa.click();
				Thread.sleep(1000);
				afa.clear();
				afa.sendKeys(addit_free_acc);
		  } catch (InterruptedException e) {
		        Thread.currentThread().interrupt();
		        // Handle interruption as needed
		    }
		catch(StaleElementReferenceException e)
			{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          wait.until(ExpectedConditions.elementToBeClickable(additionalFreeAccessoriesField));
				WebElement afa = driver.findElement(additionalFreeAccessoriesField);
				afa.click();
				Thread.sleep(1000);
				afa.clear();
				afa.sendKeys(addit_free_acc);
			}
	}
	
	public void schemeOffer(String scheme_offer) throws InterruptedException
	{
		try {
				WebElement so = driver.findElement(schemeOfferField);
				Select sel = new Select(so);
				sel.selectByVisibleText(scheme_offer);			
			}
		catch(StaleElementReferenceException e)
			{
				WebElement so = driver.findElement(schemeOfferField);
				Select sel = new Select(so);
				sel.selectByVisibleText(scheme_offer);
			}
	}
	
	public void addDisc(String add_disc) throws InterruptedException
	{
		try {
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          wait.until(ExpectedConditions.elementToBeClickable(addDisField));
	          WebElement ad = driver.findElement(addDisField);
	          Actions actions = new Actions(driver);
			  actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();	      
	          ad.sendKeys(add_disc);
			}
		catch(StaleElementReferenceException e)
		{
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	          wait.until(ExpectedConditions.elementToBeClickable(addDisField));
	          WebElement ad = driver.findElement(addDisField);
	          Actions actions = new Actions(driver);
			  actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();	      
	          ad.sendKeys(add_disc);
		}
	}
	
	public void conOfferCash(String con_offer_cash) throws InterruptedException
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	         wait.until(ExpectedConditions.elementToBeClickable(conOfferCash));
			WebElement coc = driver.findElement(conOfferCash);
			 Actions actions = new Actions(driver);

		        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		        Thread.sleep(2000);
			
			coc.sendKeys(con_offer_cash);
		}
		catch(StaleElementReferenceException e)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	         wait.until(ExpectedConditions.elementToBeClickable(conOfferCash));
			WebElement coc = driver.findElement(conOfferCash);
			 Actions actions = new Actions(driver);
			  actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		        Thread.sleep(2000);
			
			coc.sendKeys(con_offer_cash);
		}
		
		}
	
	public void selectDate(String select_date)
	{
			WebElement selDate = driver.findElement(dateField);
			selDate.sendKeys(select_date);
	}
	
	public void clickOnDocument()
	{
		WebElement ud = driver.findElement(documentField);
		ud.click();
	}
	
	public void enterDetails(String location, String booking_type,String segment,String source,String gst_category,String customer_salutation,String customer_name,String mobile,String relation, String relative_name,String email,String address,String pan,String place_of_supply,String state,String city,String pincode,String model,String sub_model,String color,String sales_consultant,String select_date, String remarks,String finance_cash,String additional_discount,String addit_free_acc,String scheme_Offer,String add_disc,String con_offer_cash) throws InterruptedException
	{	
		enterLocation(location);
		selectBookingType(booking_type);
		selectSegment(segment);
		selectSource(source);
		gstCategory(gst_category);
		SelectCustomerSalutation(customer_salutation);
		customerName(customer_name);
		mobileNumber(mobile);
		selectRelation(relation);
		RelativeName(relative_name);
		enterEmail(email);
		enterAddress(address);
		enterPAN(pan);
		placeOfSupply(place_of_supply);
		selectState(state);
		selectCity(city);
		enterPinCode(pincode);
		selectModel(model);
		selectSubModel(sub_model);
		selectColor(color);
		salesConsultant(sales_consultant);
		selectDate(select_date);
		enterRemarks(remarks);
		SelectfinanceOrCash(finance_cash);
		additionalDiscount(additional_discount);
		additionalFreeAcc(addit_free_acc);
		schemeOffer(scheme_Offer);
		addDisc(add_disc);
		conOfferCash(con_offer_cash);
		
		}
}
