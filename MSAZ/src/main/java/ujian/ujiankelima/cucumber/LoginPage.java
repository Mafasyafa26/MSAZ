package ujian.ujiankelima.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class LoginPage {
	private WebDriver driver ;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//strong[normalize-space()='ERROR']")
	private WebElement txtLoginError;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Object 1
	public void loginInvalid(String username, String password){
		
		this.username.sendKeys(username);
		Constants.delay(3, strDelay);
		this.password.sendKeys(password);
		Constants.delay(3, strDelay);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void dismiss() {
		btnDismiss.click();
		Constants.delay(2, strDelay);
	}
	
	public String getTxtError() {
		return txtLoginError.getText();
	}
}
