package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteWebForm {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCompleteWebForm() throws Exception {
    driver.get("https://formy-project.herokuapp.com/form");
    driver.findElement(By.id("first-name")).click();
    driver.findElement(By.id("first-name")).clear();
    driver.findElement(By.id("first-name")).sendKeys("abdjda");
    Thread.sleep(1000);
    driver.findElement(By.id("last-name")).click();
    driver.findElement(By.id("last-name")).clear();
    driver.findElement(By.id("last-name")).sendKeys("adhask");
    Thread.sleep(1000);
    driver.findElement(By.id("job-title")).click();
    driver.findElement(By.id("job-title")).clear();
    driver.findElement(By.id("job-title")).sendKeys("qa");
    Thread.sleep(1000);
    driver.findElement(By.id("radio-button-1")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("select-menu")).click();
    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("2-4");
    driver.findElement(By.xpath("//option[@value='2']")).click();
    driver.findElement(By.id("select-menu")).click();
    Thread.sleep(1000);
    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("0-1");
    driver.findElement(By.xpath("//option[@value='1']")).click();
    driver.findElement(By.id("datepicker")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2] | ]]
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[3]/following::span[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nov'])[1]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[32]")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Submit")).click();
    Thread.sleep(1000);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
