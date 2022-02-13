package RestAssuredUdemy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	//object data and that data is read by data provider;
	
	@DataProvider (name = "BooksData")
    public Object[][] dpMethod(){
		// array =collection of element
		//multidimesion arry is collection of array
	 return new Object[][] {{"23456", "IS234561"}, {"44444444", "IS294u93842"}, {"44234444", "IS5555553"}};
    }
	
	/*
	 * @Test (dataProvider="data-provider") public void get(String val,String val2)
	 * { System.out.println("value is "+val); System.out.println("value is "+val2);
	 * }
	 */
	
	@Test (dataProvider="BooksData")
	public void addBook(String isle,String isbn) {
		
		RestAssured.baseURI="http://216.10.245.166";
				
		String response =given().log().all().header("Content-Type","application/json")
		//.body(Payload.Addbook("asdfdds","324532")).
				.body(Payload.Addbook(isle,isbn)).
		when()
		.post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).
		extract().response().asString();
		
		JsonPath js = ReusableMethods.raToJson(response);
		String id =js.get("ID");
		System.out.println(id);
		
		// deleteBook
		
		
	}
		
}
