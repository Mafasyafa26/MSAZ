package ujian.ujiankelima.cucumber;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import ujian.ujiankeempat.nopcommerce.util.Constants;

public class DemoQAHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/ujiankelima/extentreport/ujiankelima-demoqa-outline-xr.html");
	private static DemoQAShop[] tests = DemoQAShop.values();
//	private static final int[] DATA_OUTLINE = {5, 3};
	private static final int[] DATA_OUTLINE = {3};
	private String testReport = "";
	
	@Before
	public void setUp() {
		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Constants.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		
		if(Constants.countOutline==DATA_OUTLINE[Constants.testCount])
		{
			Constants.countOutline=0;
			Constants.testCount++;
		}
		Constants.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Constants.getScreenshot(driver, "DemoQA_SceneHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	
	@AfterAll
	public static void closeBrowser() {
		delay(2);
		DriverSingleton.closeObjectInstance();
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
}
