package latihan.cucumber.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.runner.FirstHooks;
import latihan.pagefactoryobject.pages.LoginPage;
import latihan.pagefactoryobject.util.Constants;

public class TestLogin {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage(); //membuat objek halaman dan juga memastikan bahwa objek yang sama tidak akan dibuat berulang kali.
	
	public TestLogin() {
		driver = FirstHooks.driver;
		extentTest = FirstHooks.extentTest;
	}
	
	@When("User go to Web HRM") //Merancang Kerangka Otomasi dengan cucumber.
	public void user_go_to_web_hrm() {
	    driver.get(Constants.URL);
	}
	

	@And("User enter username password invalid")
	public void user_enter_username_password_invalid() {
		loginPage.login("Admin", "admin12");
	}
	
	@Then("User invalid credentials")
	public void user_invalid_credentials() {
	    loginPage.getTextCredential();
	    assertTrue(loginPage.getTextCredential().contains("Invalid credentials"));
	    extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}


	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginPage.login("Admin", "admin123");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}


	@Then("User valid employee")
	public void user_valid_employee() {
	    loginPage.getTxtEmp();
	    assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	

	
}
