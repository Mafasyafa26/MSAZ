package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class ShopLadiesTest {
	public static WebDriver driver;
	private ShopLadies shopLadies;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLS);
		shopLadies = new ShopLadies();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Case 1
	@Test (priority = 0)
	public void testKlik() throws InterruptedException { 
		shopLadies.shopLad();
		assertTrue(shopLadies.getTxtProduct().contains("PLAYBOY X MISSGUIDED PLUS SIZE GREY"));
	}
	
}
