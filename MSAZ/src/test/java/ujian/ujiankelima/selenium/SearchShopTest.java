package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class SearchShopTest {
	public static WebDriver driver;
	private SearchShop searchShop;
	
//	@BeforeClass
//	public void setUp() {
//		
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLS);
		searchShop = new SearchShop();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Case 1
	@Test (priority = 0)
	public void testKlik() throws InterruptedException, AWTException { 
		searchShop.db("short");
		assertTrue(searchShop.getTxtProduct().contains("BLACK RIBBED SHORT SLEEVE LETTUCE HEM MIDI DRESS"));
	}
	
	}

