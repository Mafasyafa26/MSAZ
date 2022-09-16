package tugas.selenium.demoqa.util.amazon;

//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import tugas.selenium.demoqa.drivers.DriverSingleton;
import tugas.selenium.demoqa.util.Constants;
import tugas.selenium.demoqa.pages.amazon.FormAmazon;

public class TestFormAmazon {
	public static WebDriver driver;
	private FormAmazon formAmazon;
	
//	@BeforeClass
//	public void setUp() {
//		
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLA);
		formAmazon = new FormAmazon();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test
	public void testInputform() throws InterruptedException {
		formAmazon.form("Mafa", "syafa", "09/08/2009" , "Jl. Dulu" , "mafa@gmail.com", "mafa124" , "Indonesia", "gaada komen");
		assertTrue(formAmazon.getTxt().contains("Submit"));
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
}
