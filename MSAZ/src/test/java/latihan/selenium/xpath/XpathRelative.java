package latihan.selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathRelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);
		 
		WebElement form = driver.findElement(By.xpath("//input[@id = ‘first-name’]"));
				form.sendKeys("Marsinah");

	}

}
