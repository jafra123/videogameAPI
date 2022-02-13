package nirajAPI;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDTO {

	public static void main(String[] args) throws IOException {
		//   DTO 

		Strudent abc = new Strudent();
		System.out.println(abc);
		
		abc.setCollege("bit");
		abc.setId("1234");

		ObjectMapper mapper = new ObjectMapper();
		// convert Object into the json
		String jsonStr = mapper.writeValueAsString(abc);
		// Display Json String
		System.out.println(jsonStr);
		
		//our data is very smal but how about big data, to making parsing easy we converitng json to object
		// conver json into the object
		Strudent student =	mapper.readValue(jsonStr, Strudent.class);
		System.out.println(student.getId());
		
		
		
		
		

	}

}
