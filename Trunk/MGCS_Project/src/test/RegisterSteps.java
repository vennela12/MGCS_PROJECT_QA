package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {

	WebDriver driver;
	private String register;
	// private WebElement Text;

	public RegisterSteps() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rekha/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

		System.out.println("Webdriver initiated");
		Thread.sleep(1000);
		driver.get("http://65.122.74.58/MGCSMVC/Home/Login");

	}

	@When("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
		driver.findElement(By.linkText("Register")).click();
		register = driver.getCurrentUrl();
		System.out.println("URL" + register);
	}

	@Then("^Navigate to Registration page$")
	public void navigate_to_Registration_page() throws Throwable {
		assertTrue(register.contains("MGCS"));
	}

	@Given("^The user is on Registration page$")
	public void the_user_is_on_Registration_page() throws Throwable {
		// driver.findElement(By.linkText("Register")).click();
		register = driver.getCurrentUrl();

	}

	@When("^The user enters the First Name$")
	public void the_user_enters_the_First_Name() throws Throwable {
		// driver.findElement(By.xpath(".//*[@id='txtFirstName_0']")).sendKeys("Giri");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_FirstName_')]")).sendKeys("Giri");

	}

	@When("^The user enters the Last Name$")
	public void the_user_enters_the_Last_Name() throws Throwable {
		// driver.findElement(By.xpath(".//*[@id='txtLastName_0']")).sendKeys("V");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_LastName_')]")).sendKeys("V");

	}

	@When("^The user enters the Title$")
	public void the_user_enters_the_Title() throws Throwable {
		// driver.findElement(By.xpath(".//*[@id='txtTitle_0']")).sendKeys("Manager");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_Title_')]")).sendKeys("Manager");

	}

	@When("^The user enters the Company Name$")
	public void the_user_enters_the_Company_Name() throws Throwable {
		// driver.findElement(By.xpath(".//*[@id='txtCompanyName_0']")).sendKeys("Tecra");
		// driver.findElement(By.xpath("//*[starts-with(@id,
		// 'txt_CompanyName_']")).sendKeys("Tecra");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_CompanyName_')]")).sendKeys("Tecra Systems");
	}

	@When("^The user enters the Address(\\d+)$")
	public void the_user_enters_the_Address(int arg1) throws Throwable {
		// driver.findElement(By.xpath(".//*[@id='txtAddress1_0']")).sendKeys("2452 Millbrook loop");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_Address1_')]")).sendKeys("2452 Millbrook");
	}

	@When("^The user enters the City$")
	public void the_user_enters_the_City() throws Throwable {
		// driver.findElement(By.xpath(".//*[@id='txtCity_0']")).sendKeys("Austin");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_City_')]")).sendKeys("Austin");

	}

	@When("^The user Selects the State$")
	public void the_user_Selects_the_State() throws Throwable {
		// Select s = new Select(driver.findElement(By.id("ddlState_0")));
		// Select s new Select
		driver.findElement(By.xpath("//*[starts-with(@id, 'ddl_State_')]")).sendKeys("Texas");
		// s.selectByVisibleText("Texas");;

	}

	@When("^The user enters the Zip$")
	public void the_user_enters_the_Zip() throws Throwable {
		//driver.findElement(By.xpath(".//*[@id='txtZip_0']")).sendKeys("78645");
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_Zip_')]")).sendKeys("78645");

	}

	@When("^The user enters the Work Phone$")
	public void the_user_enters_the_Work_Phone() throws Throwable {
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_WorkPhone_')]")).sendKeys("2547846773");

	}

	@When("^The user enters the Email Address$")
	public void the_user_enters_the_Email_Address() throws Throwable {
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_EmailAddress_')]")).sendKeys("giri@gmail.com");

	}
	
	@When("^The user enters the Promotion Code$")
	public void the_user_enters_the_Promotion_Code() throws Throwable {
		driver.findElement(By.xpath("//*[starts-with(@id, 'txt_PromotionCode_')]")).sendKeys("7863728");
	    
	}

	@When("^The user selects the Category$")
	public void the_user_selects_the_Category() throws Throwable {
		driver.findElement(By.xpath("//*[starts-with(@id, 'flexfield_')]")).sendKeys("Investor");
		//s.selectByVisibleText("Investor");

	}

	@When("^The user selects the Alumnus$")
	public void the_user_selects_the_Alumnus() throws Throwable {
		driver.findElement(By.xpath("//*[starts-with(@id, 'rdlYES_')]")).click();

	}

	@When("^The user selects the Fee$")
	public void the_user_selects_the_Fee() throws Throwable {
		//driver.findElement(By.id("rdlRegistrationFee_00")).click();
		driver.findElement(By.xpath("//*[starts-with(@id, 'rdl_RegistrationFee_')]")).click();
		

	}
	
//	@Then("^The user clicks on Add Another button to add more Registrants$")
//	public void the_user_clicks_on_Add_Another_button_to_add_more_Registrants() throws Throwable {
//		driver.findElement(By.xpath("//*[starts-with(@id, 'addGuestbutton')]")).click();
//	    
//	}

	
	@When("^The user selects Terms and Conditions$")
	public void the_user_selects_Terms_and_Conditions() throws Throwable {
		driver.findElement(By.xpath("//*[starts-with(@id, 'rdlTermsYES')]")).click();
	    
	}


	@Then("^The user clicks on Continue button$")
	public void the_user_clicks_on_Continue_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='frmPublicAttendees']/div[6]/button")).click();
	}

	// @Then("^The user clicks Add button to add more Registrants$")
	// public void the_user_clicks_Add_button_to_add_more_Registrants() throws
	// Throwable {
	// driver.findElement(By.xpath(".//*[@id='addGuestbutton']")).click();
	//
	// }

	// @When("^Clicks ok on alert box$")
	// public void clicks_ok_on_alert_box() throws Throwable {
	// //driver.switchTo().alert().dismiss();
	// Alert alert = driver.switchTo().alert();
	// String alertMessage = driver.switchTo().alert().getText();
	// System.out.println(alertMessage);
	// alert.accept();
	//

	// @Then("^The User navigates to review details page$")
	// public void the_User_navigates_to_review_details_page() throws Throwable
	// {
	// driver.navigate().to("http://65.122.74.58/MGCSMVC/Registration/ReviewMultipleAttendeePayment?AttendeeGroupID=1816");
	// Assert.assertEquals("The User can should be on review details page",
	// driver.findElement(By.className("className")).getText());
	//
}

// @Then("^The user enters the First Name$")
// public void the_user_enters_the_First_Name() throws Throwable {
//
// Assert.assertEquals("The user enters the First Name",
// driver.findElement(By.className("className")).getText());
//
// }
