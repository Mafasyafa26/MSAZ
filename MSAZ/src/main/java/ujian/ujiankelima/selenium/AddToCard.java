package ujian.ujiankelima.selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class AddToCard {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
		
		public AddToCard() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//a[normalize-space()='red satin round neck backless maxi dress']")
		private WebElement btnProduct;
		
		@FindBy(xpath = "//select[@id='pa_color']")
		private WebElement selColor;
		
		@FindBy(xpath = "//select[@id='pa_size']")
		private WebElement selSize;
		
		@FindBy(xpath = "//button[normalize-space()='Add to cart']")
		private WebElement btnAdd;
		
		@FindBy(xpath = "//a[@class='button wc-forward']")
		private WebElement btnView;
		
		@FindBy(xpath = "//th[@class='product-thumbnail']")
		private WebElement txtProduct;
		
		
//		Page Object
		public void addCard() throws InterruptedException {
			
			btnProduct.click();
			Constants.delay(3, strDelay);
			selColor.click();
		    Select selColor = new Select(driver.findElement(By.id("pa_color")));
			selColor.selectByVisibleText("Mauve");
			Constants.delay(3, strDelay);
			selSize.click();
		    Select selSize = new Select(driver.findElement(By.id("pa_size")));
			selSize.selectByVisibleText("Small");
			Constants.delay(3, strDelay);
			btnAdd.click();
			Constants.delay(3, strDelay);
		    btnView.click();
		    Constants.delay(3, strDelay);
		    
		}
		
		
		public String getTxtProduct() { //menampilkan laman selanjutnya
//			return txtNew.getText();
			return new WebDriverWait(driver, Duration.ofSeconds(10))
					.until(ExpectedConditions.visibilityOf(txtProduct)).getText();
		}
}
