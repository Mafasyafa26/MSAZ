package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import latihan.restassured.utils.ExcelReader;

public class ByCityNameCountryCode {
	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	private int count=1;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org";
		req = new JSONObject();
		String excelPath = "C:\\Users\\NEXSOFT\\Documents\\Nexsoft\\ujian\\MSAZ\\Ujian_Keempat\\RestAssured\\MSAZ_Ujian_Keempat.xlsx";
		String sheetName = "ByCityNameCountryCode";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenPost()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> rX = excelReader.getIter();
		int a=0;
		int b=1;
		while(rX.hasNext())
		{
			Row rows = rX.next();
			System.out.println();
			System.out.println("Data ke - " +b);
			for(int i=0;i<intColumnNums;i++)
			{
				dDriven[a][i] = excelReader.getCellData(a, i);
				System.out.println(dDriven[a][i]);
			}
			System.out.println("=====================================");
			a++;
			b++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testGet(String cityName, String country)
//	ambil data
	{
		System.out.println("=============================================");
		System.out.println("============ Log Data ke - " +(this.count++)+ " ===============");
		System.out.println("=============================================");
		given().
			param("q", cityName + "," + country).and(). 
			param("appid", "4749659a629528e3dcb50e4f6d082bb5"). 
		when().
			get("data/2.5/weather"). 
		then().
		statusCode(200).
		log().
		all();
	}
}
