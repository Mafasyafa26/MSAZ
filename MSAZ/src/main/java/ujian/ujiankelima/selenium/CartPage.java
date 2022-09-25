package ujian.ujiankelima.selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class CartPage {
private WebDriver driver;
private String strDelay = Constants.GLOB_PARAM_DELAY;
	
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
		Constants.delay(3, strDelay);
		btnReturn.click();
		Constants.delay(3, strDelay);
		filColor.click();
	    Select filColor = new Select(driver.findElement(By.name("filter_color")));
		filColor.selectByVisibleText("Beige");
		Constants.delay(3, strDelay);
		dashBoard.click();
	}
	
	

	public String getTxtDb() { //menampilkan laman Color
//	return txtDb.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(txtDb)).getText();
}

	
}
