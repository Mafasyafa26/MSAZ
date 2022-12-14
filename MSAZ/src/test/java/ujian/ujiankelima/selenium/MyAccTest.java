package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;

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
	
//	Case 1 -> Login Error
	@Test (priority = 0)
	public void testLogin() throws InterruptedException { 
		myAcc.acc("admin123" , "admin");
		assertTrue(myAcc.getTxtLogin().contains("ERROR"));
	}
	
//	Case 2 -> Login Remember
	@Test (priority = 1)
	public void testRemember() throws InterruptedException { 
		myAcc.accRemember("admin1234" , "admincakep");
		assertTrue(myAcc.getTxtLogin().contains("ERROR"));
	}
	
//	mohon maaf pak sebenernya mau saya tambahkan regist tapi ternyata tidak bisa, karena selalu muncul notif
//	"ERROR: Access from your IP address has been blocked for security reasons. Please contact the administrator."
	
	
	
	
}
