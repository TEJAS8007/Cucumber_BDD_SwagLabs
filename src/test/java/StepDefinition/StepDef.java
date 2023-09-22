package StepDefinition;


import org.apache.logging.log4j.LogManager;
import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageObject.LoginPage;
import PageObject.PaymentPage;
import PageObject.ProductPage;
import Utilities.ExtentReportManager;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.*;



public class StepDef  extends Base {

	@Before
	public void beforemethod(Scenario scenario)
	{
		log=LogManager.getLogger(this.getClass());
		ExtentTest test = ExtentReportManager.createTest(scenario.getName());
		test.log(Status.INFO, "Scenario: " + scenario.getName() + " started.");
		System.setProperty("webdriver.chrome.driver","src//test//resources//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("^user should launch chrome browser$")
	public void user_should_launch_chrome_browser()   {
		
		login=new LoginPage(driver);
		product=new ProductPage(driver);
		payment=new PaymentPage(driver);
		log.info("Setup Method");
	}

	@When("^User Navigate to \"([^\"]*)\"$")
	public void user_Navigate_to(String url)   {
		driver.get(url);
		driver.manage().window().maximize();
		log.info("Url Passed");
	}

	@When("^user should enter Login data$")
	public void user_should_enter_Login_data() throws Throwable {
		login.enterLoginData();
		log.info("Login Data enterd");
	}

	@When("^click on login button$")
	public void click_on_login_button()   {
		login.clickonLogin();
		log.info("Login Button Clicked");
	}

	@Then("^Login Should be Success$")
	public void login_Should_be_Success()   {
		log.info("login done");
	}
	
	@When("^user should enter Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_should_enter_Email_as_and_password_as(String em, String pass)   {
	   login.enter_Data_Driven_Data(em, pass);
	   log.info("Data Driven data Entred");
	}



	@Given("^user should Login Succesfully$")
	public void user_should_Login_Succesfully()   {
		log.info("Succesffull login Action complete");
	}

	@When("^User should verify title of webpage$")
	public void user_should_verify_title_of_webpage()   {
		String title="Swag Labs";
		product.verify_title(title);
		log.info("Title matched");
	}

	@When("^user should click on add to cart button$")
	public void user_should_click_on_add_to_cart_button()   {
		product.click_on_AddToCart_button();
		log.info("clicked on Add to cart Button");
	}

	@When("^click on cart button at top$")
	public void click_on_cart_button_at_top()   {
		product.click_Cart_button();
		log.info("Click on cart button");
	}

	@When("^User verify selected product in desciption box$")
	public void user_verify_selected_product_in_desciption_box() throws Throwable {
		product.verify_Selected_Product_Info();
		log.info("selected Product verified");
	}

	@When("^Click on checkout button$")
	public void click_on_checkout_button() throws Throwable {
		product.click_on_checkout();
		log.info("clickeed on checkout");
	}

	@Then("^Add To cart process Complete$")
	public void add_To_cart_process_Complete() throws Throwable {
		log.info("successfull completion of add to cart process");
	}

	@Given("^user should have added product to cart$")
	public void user_should_have_added_product_to_cart() throws Throwable {
		log.info("after Completing Add to cart process");
	}

	@When("^User enter FirstName$")
	public void user_enter_FirstName() throws Throwable {
		payment.send_first_Name();
		log.info("First Name Entered");
	}

	@When("^user should enter LastName$")
	public void user_should_enter_LastName() throws Throwable {
		payment.send_last_Name();
		log.info("Last name entered");
	}

	@When("^user should have to enter zipcode$")
	public void user_should_have_to_enter_zipcode() throws Throwable {
		payment.send_ZIP_code();
		log.info("zip code entered");
	}

	@When("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		payment.click_on_continue();
		log.info("clicked on continue");
	}

	@When("^user should verify payment Information$")
	public void user_should_verify_payment_Information() throws Throwable {
		payment.verifyPaymentInfo();
		log.info("payment info Verified");
	}

	@When("^user should verify price total$")
	public void user_should_verify_price_total() throws Throwable {
		payment.verifyPaymentTotal();
		log.info("payement total verified");
	}

	@When("^click on finish$")
	public void click_on_finish() throws Throwable {
		payment.click_on_finish();
		log.info("user clicked on finish");
	}
	
	
	
	@After
	public void cleanup(Scenario scenario)
	{
		System.out.println("tear Down Methd executed");
		Log.info("SuccessFully Excuted Cleanup");
		ExtentTest test = ExtentReportManager.getTest();
		if (scenario.isFailed()) {
			test.log(Status.FAIL, "Scenario failed: " + scenario.getName());
			
		} else {
			test.log(Status.PASS, "Scenario passed: " + scenario.getName());
		ExtentReportManager.flushReport();
	}

	}
	
}
