package latihan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSanaPencetSini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		 System.out.println("===========================GOOGLE===============================");

//		 String baseUrl = "http://www.google.com";
//		 driver.get(baseUrl);
		 
//		 WebElement formSearch = driver.findElement(By.name("q"));
//		 formSearch.sendKeys("Sutarno");
//		 
//		 WebElement buttonSearch = driver.findElement(By.name("btnK"));
//		 buttonSearch.click(); //klik otomatis pada searching
		
//		 WebElement basaBali = driver.findElement(By.linkText("Basa Bali"));
//		 basaBali.click(); //google bahasa
//		 
//		 System.out.println("=================================================================");

		
//		 System.out.println("===========================HEROKU================================");
		
		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 
		 WebElement formFirstName = driver.findElement(By.id("first-name"));
		 formFirstName.sendKeys("Kamu");
		 
		 WebElement formLastName = driver.findElement(By.id("last-name"));
		 formLastName.sendKeys("Siapa");
		 
		 WebElement formJob = driver.findElement(By.id("job-title"));
		 formJob.sendKeys("Pesulap");
		 
		 WebElement formRadio1 = driver.findElement(By.id("radio-button-1"));
		 formRadio1.click();	
		 
		 WebElement checkboxSex = driver.findElement(By.id("checkbox-2"));
		 checkboxSex.click();
		 
		 WebElement checkboxSex1 = driver.findElement(By.id("checkbox-3"));
		 checkboxSex1.click();
		 
		 Select selectExp = new Select(driver.findElement(By.id("select-menu"))); 
		 selectExp.selectByVisibleText("2-4"); 
		 selectExp.selectByIndex(2);
		 
		 WebElement selectDate = driver.findElement(By.id("datepicker"));
	     selectDate.sendKeys("04/26/2003");
	     
	     WebElement buttonSearch = driver.findElement(By.partialLinkText("Submit"));
//	     buttonSearch.click();
		  
//		 System.out.println("==================== HEROKU - AUTOCOMPLETE =====================");

//		 String baseUrl = "https://formy-project.herokuapp.com/autocomplete";
//		 driver.get(baseUrl);
//		
//		 WebElement formAdress = driver.findElement(By.id("autocomplete"));
//		 formAdress.sendKeys("Jkt");
//		 
//		 WebElement formStreetAdress = driver.findElement(By.id("street_number"));
//		 formStreetAdress.sendKeys("Jl dulu");
//
//		 WebElement formStreetAdress2 = driver.findElement(By.id("route"));
//		 formStreetAdress2.sendKeys("NO 20");
//		 
//		 WebElement formCity = driver.findElement(By.id("locality"));
//		 formCity.sendKeys("Jaksel");
//		 
//		 WebElement formState = driver.findElement(By.id("administrative_area_level_1"));
//		 formState.sendKeys("Indonesia");
		 
//		 WebElement logo = driver.findElement(By.className("navbar-brand"));
//		 logo.click();
		 
		 
	}

}
