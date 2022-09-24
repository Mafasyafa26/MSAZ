package ujian.ujiankelima.selenium;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;

public class CartPage {
private WebDriver driver;
	
	public CartPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='icon_bag_alt']")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//a[@class='button wc-backward']")
	private WebElement btnReturn;
	
	@FindBy(xpath = "//div[@class='pull-right noo_woocommerce-catalog']//select[@name='filter_color']")
	private WebElement filColor;
	
	@FindBy(xpath = "//div[@class='noo_responsive_header_shop eff']//select[@name='filter_size']")
	private WebElement filSize;
	
	@FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
	private WebElement dashBoard;
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement txtDb;
	
	
	
//	Page Object
	public void cart() throws InterruptedException, AWTException {
		cartBtn.click();
		Thread.sleep(1000);
		btnReturn.click();
		Thread.sleep(1000);
		filColor.click();
	    Select filColor = new Select(driver.findElement(By.name("filter_color")));
		filColor.selectByVisibleText("Beige");
		Thread.sleep(1000);
		dashBoard.click();
	}
	
	

	public String getTxtDb() { //menampilkan laman Color
	return txtDb.getText();
}

	
}
