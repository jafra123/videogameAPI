package RestAssuredUdemy;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class ComplexJasonPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JsonPath js1 = new JsonPath(Payload.coursePrice());
		
		//1. Print No of courses returned by API
		int count = js1.getInt("courses.size()");
		System.out.println(count);
		
		
		int totalAmt = js1.getInt("dashboard.purchaseAmount");   // parent to child use . operator (dashboard is parent and 
		//purchaseAmount is child
		
		System.out.println(totalAmt);
		
		String titleFisrtCourse =js1.get("courses[0].title") ;
		System.out.println(titleFisrtCourse);
	   
	
		String titleFisrtCourse2 =js1.get("courses[2].title") ;
		System.out.println(titleFisrtCourse2);
	  //4. Print All course titles and their respective Prices

	
	int sizecourses =js1.get("courses.size");	
	
	System.out.println(sizecourses);
	
	for(int i=0; i<sizecourses; i++) {		
	
		String coursesTitle = js1.get("courses["+i+"].title");
	
  // System.out.println(js1.get("courses["+i+"].price"));  // System.out.println always accept String as a argument in this case not sure 
   // so we can store this into an variable or give the .toString() method at the end 
    //System.out.println(js1.get("courses["+i+"].price").toString());

		System.out.println(coursesTitle)	;
      System.out.println( js1.get("courses["+i+"].price").toString());	

     	
	
	}
	
    // 5. Print no of copies sold by RPA Course
	System.out.println(" // 5. Print no of copies sold by RPA Course");

	for (int i = 0; i < sizecourses; i++) {
		String courseTitles = js1.get("courses[" + i + "].title");
		if (courseTitles.equalsIgnoreCase("RPA")) {
			int copies = js1.get("courses[" + i + "].copies");
			System.out.println(copies);
			break;

		}  	 
     }    
	
	}

}
