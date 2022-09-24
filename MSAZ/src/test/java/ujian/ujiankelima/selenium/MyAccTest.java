package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class MyAccTest {
	public static WebDriver driver;
	private MyAcc myAcc;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLS);
		myAcc = new MyAcc();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Case 1
	@Test (priority = 0)
	public void testKlik() throws InterruptedException { 
		myAcc.acc("admin123" , "admin");
		assertTrue(myAcc.getTxtLogin().contains("LOGIN"));
	}
	
	
	
}
