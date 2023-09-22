package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.ExcelDataReader;



public class PaymentPage {

	WebDriver driver;
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement zipcode;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(css="div[class='summary_info'] :nth-child(2)")
	WebElement paymentInfo;
	
	@FindBy(css="div[class='summary_info'] :nth-child(8)")
	WebElement Paymenttotal;
	
	@FindBy(name="finish")
	WebElement finish;
	
	public PaymentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void send_first_Name()
	{
		String fn=ExcelDataReader.get_First_Name();
		firstName.sendKeys(fn);
	}
	
	public void send_last_Name()
	{
		String ln=ExcelDataReader.get_last_Name();
		lastName.sendKeys(ln);
	}
	
	public void send_ZIP_code()
	{
		String zip=ExcelDataReader.get_First_Name();
		zipcode.sendKeys(zip);
	}
	
	public void click_on_continue()
	{
		continuebutton.click();
	}
	
	public void verifyPaymentInfo()
	{
	    if(paymentInfo.isDisplayed()==true)
	    {
	    	String text=paymentInfo.getText();
	    	System.out.println(text);
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}
	
	public void verifyPaymentTotal()
	{
	    if(Paymenttotal.isDisplayed()==true)
	    {
	    	String text=Paymenttotal.getText();
	    	System.out.println(text);
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}
	
	public void click_on_finish()
	{
		finish.click();
	}
} 
