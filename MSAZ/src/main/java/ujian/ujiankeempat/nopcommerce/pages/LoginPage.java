package ujian.ujiankeempat.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;

public class LoginPage {
private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboard;

	@FindBy(xpath = "//strong[normalize-space()='Welcome, please sign in!']")
	private WebElement txtWelcome;
	
	@FindBy(xpath = "//span[@id='Email-error']")
	private WebElement txtEmailError;
	
	@FindBy(xpath = "//li[normalize-space()='The credentials provided are incorrect']")
	private WebElement txtCredential;
	
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement txtNoCust;
	
	@FindBy(xpath = "//h1[@class='float-left']")
	private WebElement txtProduct;
	
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement catalog;
	
	@FindBy(xpath = "//p[normalize-space()='Product tags']")
	private WebElement productTags;
	
	@FindBy(xpath = "//div[@class='search-text']")
	private WebElement searchClick;
	
	@FindBy(xpath = "//i[@class='far fa-angle-down']")
	private WebElement dropdownSearch;
	
	@FindBy(xpath = "//input[@id='SearchTagName']")
	private WebElement search;
	
	@FindBy(xpath = "//button[@id='search-product-tags']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//i[@class='fas fa-pencil-alt']")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement editProd;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveEdit;
	
	@FindBy(xpath = "	//a[normalize-space()='Logout']")
	private WebElement logout;
	
	
	//a[normalize-space()='Logout']
	
	
//	Page Object
	public void login(String email, String password) throws InterruptedException {
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(1000);
	}
	
//	Page Object 1
	public void login1(String email, String password) throws InterruptedException {
		this.email.clear();
		Thread.sleep(1000);
		this.password.clear();
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(1000);
	}
	
//	Page Object 2
	public void loginInputLogout(String email, String password, String search) throws InterruptedException {
		this.email.clear();
		Thread.sleep(1000);
		this.password.clear();
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(1000);
		catalog.click();
		Thread.sleep(1000);
		productTags.click();
		Thread.sleep(1000);
		searchClick.click();
		Thread.sleep(1000);
		dropdownSearch.click();
		Thread.sleep(1000);
		this.search.sendKeys(search);
		Thread.sleep(1000);
		btnSearch.click();
		Thread.sleep(1000);
		logout.click();
		Thread.sleep(1000);
	}
	
//	Page Object 3
	public void loginInput(String email, String password, String search, String editProd) throws InterruptedException {
		this.email.clear();
		Thread.sleep(1000);
		this.password.clear();
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnLogin.click();
		Thread.sleep(1000);
		catalog.click();
		Thread.sleep(1000);
		productTags.click();
		Thread.sleep(1000);
		searchClick.click();
		Thread.sleep(1000);
		dropdownSearch.click();
		Thread.sleep(1000);
		this.search.sendKeys(search);
		Thread.sleep(1000);
		btnSearch.click();
		Thread.sleep(1000);
		btnEdit.click();
		Thread.sleep(1000);
		this.editProd.clear();
		Thread.sleep(1000);
		this.editProd.sendKeys(editProd);
		Thread.sleep(1000);
		saveEdit.click();
	}
	
	public String getTxtDashboard() { //menampilkan laman dashboard setelah login
		return txtDashboard.getText();
	}
	
	public String getTxtWelcome() { //menampilkan laman utama setelah logout
		return txtWelcome.getText();
	}
	
	public String getTxtEmailError() { //menampilkan pesan error ketika kolom email kosong
		return txtEmailError.getText();
	}
	
	public String getTextCredential() { //ditampilkan ketika input password salah
		return txtCredential.getText();
	}
	
	public String getTextNoCust() { //ditampilkan saat email dan password yang diinput merupakan akun tidak terdaftar
		return txtNoCust.getText();
	}
	
	public String getTxtProduct() { //menampilkan laman 
		return txtProduct.getText();
	}
}
