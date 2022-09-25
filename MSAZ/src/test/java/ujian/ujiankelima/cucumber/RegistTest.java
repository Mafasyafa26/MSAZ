package ujian.ujiankelima.cucumber;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ujian.ujiankeempat.nopcommerce.util.Constants;
import ujian.ujiankelima.cucumber.RegistTest;

public class RegistTest {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private Regist regist = new Regist();
	
	public RegistTest() {
		driver = DemoQAHooks.driver;
		extentTest = DemoQAHooks.extentTest;
	}
	
	@When("User open DEMOQA Web Browser")
	public void user_open_demoqa_web_browser() {
		driver.get(Constants.URLSLOG);
	    extentTest.log(LogStatus.PASS, "User go to demo qa register page");
	}

	@And("^User register input (.*) and (.*) and (.*)$")
	public void user_input_username_email_and_password(String username, String email, String password) {
		System.out.println("username: " + username);
		System.out.println("email: " + email);
	    System.out.println("password: " + password);
	    regist.testRegister(username, email, password);
	    extentTest.log(LogStatus.PASS, "User register input username and email and password");
	}

	@And("User click register button")
	public void user_click_register_button() {
	    regist.clickRegist();
	    extentTest.log(LogStatus.PASS, "User click register button");
	}

	@Then("valid validation")
	public void valid_validation() {
	    regist.getTxtError();
	    assertTrue(regist.getTxtError().contains("ERROR"));
	    extentTest.log(LogStatus.PASS, "valid validation");
	}
}
