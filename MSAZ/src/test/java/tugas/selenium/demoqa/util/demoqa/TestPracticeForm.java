package tugas.selenium.demoqa.util.demoqa;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import tugas.selenium.demoqa.drivers.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;
import tugas.selenium.demoqa.pages.demoqa.PracticeForm;

public class TestPracticeForm {
	public static WebDriver driver;
	private PracticeForm practiceForm;
	
//	@BeforeClass
//	public void setUp() {
//		
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLD);
		practiceForm = new PracticeForm();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test
	public void testValidLogin() throws InterruptedException , AWTException{
		practiceForm.box("kamu", "siapa", "mafa@gmail.com" , "4112414125", "05/04/2003", "Maths", "Jl Bersamamu");
//		assertTrue(practiceForm.getUsername().contains("Submit"));
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
}
