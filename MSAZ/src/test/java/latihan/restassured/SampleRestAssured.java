package latihan.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleRestAssured {
	

	JSONObject req;
	
	@BeforeTest
	public void befTest() 
	{
		req = new JSONObject();
		baseURI = "http://localhost:3000";
	}
	
	@Test (priority=0)
	public void testPost() 
	{
		req.put("first_name", "Mafasyafa");
		req.put("last_name", "Annisa");
		req.put("subject_id", 1);
		
		given(). //lampirkan
			header("Content-Type","application.json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(200).
			log().
			all();
	}
	
	@Test(priority=1)
	public void testGet()
//	ambil data
	{
//		?id=4&
		given().
		param("first_name","Aditya"). 
		get("/users/2"). //tanpa param
		then().
		statusCode(200).
		log().
		all();
	}
	
//	@Test (priority=2)
//	public void testPatch() 
//	//ganti
//	{
//		req.put("last_name", "Annisa");
//		
//		given(). //lampirkan
//			header("Content-Type","application.json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().
//			patch("/users").
//		then().
//			statusCode(200);
//	}
	
//	@Test (priority=3)
//	public void testPut() 
//	//update
//	{
//		req.put("last_name", "Zukhruff");
//		req.put("first_name", "Mafasyafa");
//		req.put("subject_id", 4);
//		
//		
//		given(). //lampirkan
//			header("Content-Type","application.json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().
//			patch("/users/4").
//		then().
//			statusCode(200);
//	}
	
//	@Test (priority=4)
////	hapus data
//	public void testDelete()
//	{
//		when().
//		delete("/users/4").
//		then().
//		statusCode(200);
//	}
	
}

