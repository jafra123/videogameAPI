package Sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
public class TC_VideoGameAPI {

	@Test                                // if you out // test will beignored
	public void test_getAllVideoGames()
	{
		given()
		.when().get("http://localhost:8080/app/videogames")		
		//when().get("http://petstore.swagger.io/store/inventory")
		.then()
		.statusCode(200);
		
	}	
	// the-internet.hero
	// jigsaw.w3.org/http/basic
	
	@Test(priority=2)
	public void test_addNewVideoGames() {
		/*
		 * {     // For Below is the body we can make hashmap and pu inot taht all
  "id": 0,
  "name": "string",
  "releaseDate": "2022-02-13T00:39:33.315Z",
  "reviewScore": 0,
  "category": "string",
  "rating": "string"
}
		 */
			HashMap data = new HashMap();
			data.put("id","200");			
			data.put("releaseDate", "2022-02-13T00:39:33.315Z");
			data.put("name","Spider-man");	
			data.put("reviewScore","5");
			data.put("category","Adventure");
			data.put("rating","Universal");
			
			Response res=
			 given()
			 .contentType("application/json")
			 .body(data)			
		    .when()
			. post("http://localhost:8080/app/videogames")
			
			.then()
			 .statusCode(200)
			 .log().body()
			 .extract().response();  // we can assert directory so we need toe save into Response variable
			
			
			String jsonString = res.asString();
			
			Assert.assertEquals(jsonString.contains("Record Added Successfully"), true);
		
	}
	
	
	//Returns the details of a single game by ID
	@Test(priority=3)
	public void test_getVideoGame() {	
		given()
		.when()
		.get("http://localhost:8080/app/videogames/100")
		.then()
		.statusCode(200)
		.log().body();
		//.body("videoGame.id" ,"100")
	   //.body("videoGame.name","Spider-man");
		
		
	}
	// put 
	@Test(priority=4)
	public void test_updateVideoGame() {
	
		HashMap data = new HashMap();
		data.put("id","200");			
		data.put("releaseDate", "2022-02-13T00:39:35.315Z");
		data.put("name","Pcaman");	
		data.put("reviewScore","4");
		data.put("category","Adventure");
		data.put("rating","Universalwithput");
		
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.put("http://localhost:8080/app/videogames/100")
		.then()
		.statusCode(200)
		.log().body();
		
		
	}
	
	//delete Deletes a video game from the DB by ID
	@Test(priority =6)
	public void test_deleteVideoGames() {
		
		Response res =
		given()
		.when()
		.delete("http://localhost:8080/app/videogames/100")
		.then()
		.statusCode(200)
        .log().body()
        .extract().response();	
		
		String jsonString = res.asString();
		Assert.assertEquals(jsonString.contains("Record Deleted Successfully"), true);
		
	}
	
	
	
	

}
