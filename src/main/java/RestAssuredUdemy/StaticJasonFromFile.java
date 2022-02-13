package RestAssuredUdemy;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

public class StaticJasonFromFile {

	public static void main(String[] args) throws IOException {
		// validate if Add Place API is working as expected
		// below three principle used into Rest Assured
		// given - all input details
		// when- submit the api - resource , http method
		// then - validate the response

		
	
	
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		// given(). // manual add package because this is static auto suggestion not
		// work
		// Byte data to String
		
		/*##############################Logic below for File Read ###########################*/
		// content of the file to String  -Content of file can covert into Byte -> Byte data to String
	
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\manmo\\Desktop\\API-Testing-Notes\\addPlacse.json")))).when().post("maps/api/place/add/json").then().log().all().assertThat()
				
				.statusCode(200).body("scope", equalTo("APP")).header("Server", equalTo("Apache/2.4.18 (Ubuntu)"))
				.extract().asString();
		// Add place -> update place with new address -> Get Place to validate if New
		// address is present in

		System.out.println("response--->" + response);
		JsonPath js = new JsonPath(response); // for parsing Json

		String placeId = js.getString("place_id");
		System.out.println("placeId--->" + placeId);

		// update place
		String newAddress = "Summer Walk, Africa";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("/maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// Get Place APi
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
				.response().asString();

		JsonPath js1 = ReusableMethods.raToJson(getPlaceResponse);
		// JsonPath js1 = new JsonPath(getPlaceResponse);
		String actual_Address = js1.getString("address");
		System.out.println("actual_Address->" + actual_Address);
		// Testing framework - Testng and junit, he will teach cucumber
		Assert.assertEquals(actual_Address, newAddress);

	}

}
