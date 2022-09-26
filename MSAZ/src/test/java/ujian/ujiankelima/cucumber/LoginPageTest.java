package ujian.ujiankelima.cucumber;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class LoginPageTest {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public LoginPageTest() {
		driver = DemoQAHooks.driver;
		extentTest = DemoQAHooks.extentTest;
	}
	
	@When("User open DEMOQA Web Browser")
	public void user_open_demoqa_web_browser() {
		driver.get(Constants.URLSLOG);
	    extentTest.log(LogStatus.PASS, "User open DEMOQA Web Browser");
	}

	@And("User login invalid input (.*) and (.*) or A$")
	public void user_login_invalid_input_username_and_password(String username, String password){
		System.out.println("username: " + username);
	    System.out.println("password: " + password);
	    loginPage.loginInvalid(username, password);
	    extentTest.log(LogStatus.PASS, "User login invalid input username and password");
	}

	@And("User click button login")
	public void user_click_button_login() {
		loginPage.clickLogin();
	    extentTest.log(LogStatus.PASS, "User click button login");
	}

	@Then("invalid validation")
	public void invalid_validation() {
	    loginPage.getTxtError();
	    assertTrue(loginPage.getTxtError().contains("ERROR"));
	    extentTest.log(LogStatus.PASS, "invalid validation");
	}

}
