package latihan.pagefactoryobject.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import latihan.pagefactoryobject.drivers.DriverSingleton;

public class LoginPage {
private WebDriver driver; //Driver yang akan digunakan untuk mencari elemen
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this); 
		//Mekanisme alternatif untuk menemukan elemen atau daftar elemen  menggunakan CSS locator
		//init elements membuat instance kelas yang diberikan padanya
		
	}
	
//	@FindBy -> menemukan  elemen di halaman menggunakan  strategi By 
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmployee;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmpInfo;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
	private WebElement txtRequired;
//	/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1] //abs
//	.oxd-text.oxd-text--span.oxd-input-field-error-message.oxd-input-group__message //cssSelector
	//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'] //password required
	//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'] 
		
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")//p[@class='oxd-text oxd-text--p oxd-alert-content-text']
	private WebElement txtCredential;
	//p[@class='oxd-text oxd-text--p oxd-alert-content-text']
	
	
//	Page Object -> Kelas yang akan diinisialisasi
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();
	}
	
	
	public String getTxtEmp() {
//		return txtEmployee.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(txtEmployee)).getText();
	}
	

	public String getTextCredential() {
//		return txtCredential.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(txtCredential)).getText();
	}
	
//	WebDriverWait menentukan kondisi dan waktu yang dibutuhkan
//	WebDriver akan menunggu hingga maksimum 10 detik agar elemen yang ditentukan oleh XPath dapat diklik.
	
	public String getTextRequired() {
		return txtRequired.getText();
		
	}
	
}
