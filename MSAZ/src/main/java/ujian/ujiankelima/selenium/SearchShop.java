package ujian.ujiankelima.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;

public class SearchShop {
private WebDriver driver;
	
	public SearchShop() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//input[@name='s']")
	private WebElement searchKey;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtNew;
	
	@FindBy(xpath = "//i[@class='icon_plus']")
	private WebElement qtyAdd;
	
	@FindBy(xpath = "//div[@class='summary entry-summary']//div[1]//a[1]")
	private WebElement btnAdd;
	
	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement pilColor;
	
	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement pilSize;
	
	
	
//	Page Object
	public void db(String searchKey) throws InterruptedException, AWTException {
		searchBtn.click();
		Thread.sleep(1000);
		this.searchKey.sendKeys(searchKey);
		Thread.sleep(1000);
		this.searchKey.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    pilColor.click();
	    Select pilColor = new Select(driver.findElement(By.id("pa_color")));
		pilColor.selectByVisibleText("Black");
	    Thread.sleep(1000);
	    pilSize.click();
	    Select pilSize = new Select(driver.findElement(By.id("pa_size")));
		pilSize.selectByVisibleText("Large");
		Thread.sleep(1000);
	    qtyAdd.click();
	    Thread.sleep(1000);
	    btnAdd.click();
	}
	
	
	public String getTxtProduct() { //menampilkan laman selanjutnya
		return txtNew.getText();
	}
}
