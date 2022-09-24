package tugas.selenium.demoqa.pages.demoqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tugas.selenium.demoqa.drivers.DriverSingleton;

public class PracticeForm {
private WebDriver driver;
	
	public PracticeForm() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
//	@FindBy(name = "username")
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement useremail;
	
	@FindBy(xpath = "//label[@for='gender-radio-2']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id='userNumber']")
	private WebElement usernumber;
	
	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	private WebElement datepicker;
	
	@FindBy(id = "subjectsInput")
	private WebElement subjects;
	
	@FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
	private WebElement hobbies;
	
	@FindBy(xpath = "//input[@id='uploadPicture']")
	private WebElement upload;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement currentAdd;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement btnSubmit;
	
	@FindBy(id = "closeLargeModal")
	private WebElement btnClose;
	
	
//	Page Object
	public void box(String firstname, String lastname, String useremail, String usernumber, String tgl, String subj, String currentAdd) throws InterruptedException, AWTException {
		Robot rbt = new Robot();
		for (int i = 0; i < 5; i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyRelease(KeyEvent.VK_SUBTRACT);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		
		
		
		this.firstname.sendKeys(firstname);
		Thread.sleep(1000);
		this.lastname.sendKeys(lastname);
		Thread.sleep(1000);
		this.useremail.sendKeys(useremail);
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		this.usernumber.sendKeys(usernumber);
		Thread.sleep(1000);
		isiTanggal(tgl);
		Thread.sleep(1000);
		isiSubjects(subj);
		Thread.sleep(1000);
		hobbies.click();
		Thread.sleep(1000);
		this.upload.sendKeys("C:\\Users\\NEXSOFT\\Documents\\Nexsoft\\txt\\Mafa.txt");
		Thread.sleep(1000);
		this.currentAdd.sendKeys(currentAdd);
		Thread.sleep(1000);
		state.click();
		Thread.sleep(500);
		List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-2"));
		selectedItemState.get(0).click();
		Thread.sleep(1000);
		city.click();
		Thread.sleep(1000); 
		List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
		selectedItemCity.get(0).click();
		Thread.sleep(1000);
		btnSubmit.click();
		Thread.sleep(1000);
		btnClose.click();
		Thread.sleep(1000);
	}
	
	public void isiTanggal(String tgl) {
		try {
			Robot rbt = new Robot();
			this.datepicker.click();
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_A);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_A);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			this.datepicker.sendKeys(tgl);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void isiSubjects(String subj) {
		try {
			Robot rbt = new Robot();
			this.subjects.click();
			this.subjects.sendKeys(subj);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public String getUsername() {
		return firstname.getText();
	}
}
