package ujian.ujiankelima.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class ShopLadies {
	private WebDriver driver ;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	@FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
	private WebElement mobileClick;
	
	@FindBy(xpath = "//h3[normalize-space()='Secure payment']")
	private WebElement secureClick;
	
	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[2]//p[1]")
	private WebElement warrantyClick;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]")
	private WebElement moneyClick;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	private WebElement loveBtn;
	
	@FindBy(xpath = "//a[normalize-space()='My Wishlist']")
	private WebElement wishBtn;
	
	@FindBy(xpath = "//a[@aria-label='Select options for “playboy x missguided plus size grey lips print front cropped t shirt”']")
	private WebElement selectBtn;
	
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtProduct;
	
	@FindBy(xpath = "//a[@class='bx-next']")
	private WebElement btnProduct;
	
//	@FindBy(xpath = "//a[@aria-label='Select options for “pink drop shoulder oversized t shirt”']")
//	private WebElement selBtn ;
	
	public ShopLadies() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Page Object 1
	public void shopLad() throws InterruptedException {
//		btnDismiss.click();
		driver.findElement(By.linkText("Dismiss")).click();
		Constants.delay(3, strDelay);
		mobileClick.click();
		Constants.delay(1, strDelay);
		secureClick.click();
		Constants.delay(1, strDelay);
		warrantyClick.click();
		Constants.delay(1, strDelay);
		moneyClick.click();
		Constants.delay(1, strDelay);
		loveBtn.click();
		Constants.delay(3, strDelay);
		wishBtn.click();
		Constants.delay(3, strDelay);
		selectBtn.click();
		Constants.delay(3, strDelay);
		btnProduct.click();
//		Constants.delay(3, strDelay);
//		Constants.delay(3, strDelay);
//		
//		Constants.delay(3, strDelay);
	}
	
	public String getTxtProduct() { //menampilkan laman selanjutnya
//		return txtNew.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.visibilityOf(txtProduct)).getText();
	}
}
