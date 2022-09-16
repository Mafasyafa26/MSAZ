package tugas.selenium.demoqa.pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.demoqa.drivers.DriverSingleton;

public class FormAmazon {
private WebDriver driver;
	
	public FormAmazon() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
//	@FindBy(name = "username")
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//label[normalize-space()='Female']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id='dob']")
	private WebElement datepicker;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	
	@FindBy(xpath = "//select[@id='role']")
	private WebElement role;
	
	@FindBy(xpath = "//option[@value='High salary']")
	private WebElement jobExpectation;
	
	@FindBy(xpath = "//label[normalize-space()='Contribute to opensource projects']")
	private WebElement development;
	
	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement comment;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement btnSubmit;
	
//	@FindBy(xpath = "//span[@id='submit-msg']")
//	private WebElement btnSubmitMsg;
	
//	Page Object
	public void form(String firstname, String lastname, String datepicker, String address, String email, String password, String company, String comment) throws InterruptedException {
		this.firstname.sendKeys(firstname);
		Thread.sleep(1000);
		this.lastname.sendKeys(lastname);
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		this.datepicker.sendKeys(datepicker);
		Thread.sleep(1000);
		this.address.sendKeys(address);
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		this.company.sendKeys(company);
		Thread.sleep(1000);
		role.click();
		Thread.sleep(1000);
		jobExpectation.click();
		Thread.sleep(1000);
		development.click();
		Thread.sleep(1000);
		this.comment.sendKeys(comment);
		Thread.sleep(1000);
		btnSubmit.click();
	}
	
	
	
	public String getTxt() {
		return btnSubmit.getText();
	}
}
