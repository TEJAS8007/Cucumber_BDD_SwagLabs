package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PropertyFIleReader;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login-button")
	WebElement Login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterLoginData()
	{
		String user=PropertyFIleReader.getuserName();
		String pass=PropertyFIleReader.getPassword();
		
		username.sendKeys(user);
       
		password.sendKeys(pass);
	}
	
	public void enter_Data_Driven_Data(String a,String b)
	{
		username.sendKeys(a);
		password.sendKeys(b);
	}
	
	public void clickonLogin()
	{
		Login.click();
	}
}
