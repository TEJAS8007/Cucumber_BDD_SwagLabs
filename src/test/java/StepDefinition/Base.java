package StepDefinition;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import PageObject.PaymentPage;
import PageObject.ProductPage;

public class Base {

	public WebDriver driver;
	public static LoginPage login;
	public static ProductPage product;
	public static PaymentPage payment;

	public static Logger log;
}
