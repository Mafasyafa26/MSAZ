package ujian.ujiankelima.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ujian.ujiankeempat.nopcommerce.util.Constants;
import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
//import latihan.pagefactoryobject.drivers.DriverSingleton;

public class MyAcc {
	private WebDriver driver ;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnAcc;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//strong[normalize-space()='ERROR']")
	private WebElement txtLoginError;
	
	@FindBy(xpath = "//input[@id='rememberme']")
	private WebElement btnRemember;
	
	
	public MyAcc() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Object 1
	public void acc(String username, String password) throws InterruptedException {
//		btnDismiss.click();
		driver.findElement(By.linkText("Dismiss")).click();
		Constants.delay(3, strDelay);
		btnAcc.click();
		Constants.delay(3, strDelay);
		this.username.sendKeys(username);
		Constants.delay(3, strDelay);
		this.password.sendKeys(password);
		Constants.delay(3, strDelay);
		btnLogin.click();
		Constants.delay(3, strDelay);
	}
	
//	Page Object 2
	public void accRemember(String username, String password) throws InterruptedException {
		btnDismiss.click();
//		driver.findElement(By.linkText("Dismiss")).click();
		Constants.delay(3, strDelay);
		btnAcc.click();
		Constants.delay(3, strDelay);
		this.username.sendKeys(username);
		Constants.delay(3, strDelay);
		this.password.sendKeys(password);
		Constants.delay(3, strDelay);
		btnRemember.click();
		Constants.delay(3, strDelay);
		btnLogin.click();
		Constants.delay(3, strDelay);
	}
	
	
	public String getTxtLogin() { //menampilkan laman login error
//		return txtLoginError.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(txtLoginError)).getText();
	}
	
}
