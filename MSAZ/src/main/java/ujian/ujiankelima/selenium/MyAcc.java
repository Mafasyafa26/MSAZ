package ujian.ujiankelima.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAcc {
	private WebDriver driver = new ChromeDriver();
	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnAcc;
	
	@FindBy(xpath = "//h2[normalize-space()='Login']")
	private WebElement txtLogin;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	
	
//	Page Object
	public void acc(String username, String password) throws InterruptedException {
//		btnDismiss.click();
		driver.findElement(By.linkText("Dismiss")).click();
		Thread.sleep(1000);
		btnAcc.click();
		Thread.sleep(1000);
		this.username.sendKeys(username);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
	}
	
	public String getTxtLogin() { //menampilkan laman selanjutnya
		return txtLogin.getText();
	}
	
}
