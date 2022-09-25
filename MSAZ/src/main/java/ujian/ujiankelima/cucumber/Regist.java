package ujian.ujiankelima.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class Regist {
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public Regist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Factory
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[@id='customer_login']/div[2]/form/p[3]/span/span")
	private WebElement iconShow;
	
	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnReg;
	
	@FindBy(xpath = "//body[@id='error-page']/div/strong")
	private WebElement txtErr;
	
	@FindBy(xpath = "//h1[contains(text(),'Your access to this site has been temporarily limi')]")
	private WebElement txtLimit;
	
//	Page Object
	public void testRegister(String username, String email, String password) {
		Constants.delay(1, strDelay);
		this.username.sendKeys(username);
		Constants.delay(1, strDelay);
		this.email.sendKeys(email);
		Constants.delay(1, strDelay);
		this.password.sendKeys(password);
	}
	
	public void clickShow() {
		iconShow.click();
	}
	
	public void clickRegist() {
		btnReg.click();
	}
	
	public String getTxtError() {
		return txtErr.getText();
	}

}
