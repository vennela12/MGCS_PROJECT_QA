package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/rekha/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initiated");
		Thread.sleep(1000);
		driver.get("http://65.122.74.58/MGCSMVC/Home/Login");
	    
	}

	@When("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
	    
	}

	@Then("^Navigate to Registration page$")
	public void navigate_to_Registration_page() throws Throwable {
	    
	}


}
