package ujian.ujiankeempat.nopcommerce;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.pages.LoginPage;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class TestLogin {
	public static WebDriver driver;
	private LoginPage loginPage;
	
//	@BeforeClass
//	public void setUp() {
//		
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLN);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test (priority = 0)
	public void testValidLogin() throws InterruptedException { //validasi login berhasil tanpa input (klik submit)
		loginPage.login("", "");
		assertEquals(loginPage.getTxtDashboard(), "Dashboard");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	@Test (priority = 1) //
	public void testValidLoginClear() throws InterruptedException { //validasi login berhasil dengan clear inputan terlebih dahulu
		loginPage.login1("admin@yourstore.com", "admin");
		assertEquals(loginPage.getTxtDashboard(), "Dashboard");
//		assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
	}
	
//	Negative Case
	@Test (priority = 2)
	public void testInvalidLoginEmptyField() throws InterruptedException { //validasi login gagal jika salah satu field kosong
		loginPage.login1("", "admin");
		assertEquals(loginPage.getTxtEmailError(), "Please enter your email");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
	@Test (priority = 3)
	public void testInvalidLogin() throws InterruptedException { //validasi login gagal karena password salah
		loginPage.login1("admin@yourstore.com", "Admin");
		assertTrue(loginPage.getTextCredential().contains("The credentials provided are incorrect"));
	}
	
	@Test (priority = 4)
	public void testInvalidLoginNoCust() throws InterruptedException { //validasi login gagal karena akun tidak terdaftar
		loginPage.login1("mbda@gmail.com", "afghj");
		assertEquals(loginPage.getTextNoCust(), "No customer account found");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
	
	@Test (priority = 5) //login berhasil dan dilanjutkan ke elemen -> logout
	public void testElementLogout() throws InterruptedException { 
		loginPage.loginInputLogout("admin@yourstore.com", "admin", "computer");
		assertEquals(loginPage.getTxtWelcome(), "Welcome, please sign in!");
//		assertTrue(loginPage.getTxtWelcome().contains("Welcome, please sign in"));
	}
	
	@Test (priority = 6) //login berhasil dan dilanjutkan ke elemen product tags -> edit 
	public void testElement() throws InterruptedException { 
		loginPage.loginInput("admin@yourstore.com", "admin", "awesome", "awesomes");
		assertEquals(loginPage.getTxtProduct(), "Product tags");
//		assertTrue(loginPage.getTxtWelcome().contains("Welcome, please sign in"));
	}
	}

