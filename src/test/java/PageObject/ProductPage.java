package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {

	WebDriver driver;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addcartButton;

	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;

	@FindBy(css="div[class='app_logo']")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]")
	WebElement Selectedproduct;

	@FindBy(css="button[name='checkout']")
	WebElement checkout;

	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void verify_title(String titl)
	{
		if(title.getText().equals(titl))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	

	public void click_on_AddToCart_button()
	{
		addcartButton.click();
	}

	public void click_Cart_button()
	{
		cart.click();
	}

	public void verify_Selected_Product_Info()
	{
		if(Selectedproduct.isDisplayed()==true)
		{
			String text=Selectedproduct.getText();
			System.out.println(text);
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	public void click_on_checkout()
	{
		checkout.click();
	}

}
