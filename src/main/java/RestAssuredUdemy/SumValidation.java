package RestAssuredUdemy;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class SumValidation {

	@Test
	public void sumOfCourses()
	{
		JsonPath js = new JsonPath(Payload.coursePrice());
		//6. Verify if Sum of all Course prices matches with Purchase Amount	  
		int count =js.getInt("courses.size");		
		System.out.println(count);		
	   // int priceis=	js.get("courses[0].price");
	//System.out.println(priceis);		
		int sumofPrice=0;		
		for(int i=0; i<count;i++) {
			int priceise =js.getInt("courses["+i+"].price");
			int copies =js.getInt("courses["+i+"].copies");
			int amount = (priceise * copies);
		//	System.out.println(amount);
			sumofPrice= sumofPrice +amount;	
		}		
		System.out.println(sumofPrice);	
		 int purchaseAmountis=	js.get("dashboard.purchaseAmount");
		 System.out.println(purchaseAmountis);
		 Assert.assertEquals(sumofPrice, purchaseAmountis);
	}
	
}
