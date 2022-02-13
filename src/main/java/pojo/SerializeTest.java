package pojo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;
public class SerializeTest {

	public static void main(String[] args) {
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);	
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		p.setName("Frontline house");
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");		
		p.setTypes(mylist);
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		p.setLocation(l);
		
		
		
		
		// Post Call Code
		System.out.println("Jugnu Print-->");
		Response res1 =given().log().all().queryParam("key", "qaclick123")
		.body(p)		
		.when().post("/maps/api/place/update/json")
	    .then().assertThat().statusCode(200).extract().response();
	      
		String responseString1 = res1.asString();
		int responseString =	res1.getStatusCode();
		res1.body().asString();
		
		System.out.println("Jugnu Print-->"+res1.body().asString());
		System.out.println("Jugnu Print-->"+responseString);
	}

}
