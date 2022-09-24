package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class CartPageTest {
	public static WebDriver driver;
	private CartPage cartPage;
	
//	@BeforeClass
//	public void setUp() {
//		
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLS);
		cartPage = new CartPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Case 1
	@Test (priority = 0)
	public void testCart() throws InterruptedException, AWTException { 
		cartPage.cart();
		assertTrue(cartPage.getTxtDb().contains("Search"));
	}
	
}
