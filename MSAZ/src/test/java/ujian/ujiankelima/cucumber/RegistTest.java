package ujian.ujiankelima.cucumber;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ujian.ujiankeempat.nopcommerce.util.Constants;

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

//	@And("^User register input (.*) and (.*) and (.*)  orx k$")
	@When("^User register (.*) (.*) (.*) orx k$")
	public void user_register_username_email_password_orx_k(String username, String email, String password) {
		System.out.println("username: " + username);
		System.out.println("email: " + email);
	    System.out.println("password: " + password);
	    regist.testRegister(username, email, password);
	    extentTest.log(LogStatus.PASS, "User register input username and email and password");
	}

	@When("User click register button")
	public void user_click_register_button() {
	    regist.clickRegist();
	    extentTest.log(LogStatus.PASS, "User click register button");
	}

	@Then("valid validation")
	public void valid_validation() {
	    String strK = regist.getTxtError();
	    System.out.println("INVALID REGISTRATION "+strK);
//	    assertTrue(strK.contains("ERROR"));
	    assertTrue(strK.contains("Error"));
	    extentTest.log(LogStatus.PASS, "valid validation");
	}
}
