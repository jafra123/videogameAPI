package nav;

public class NotAnumber {

	public static void main(String[] args) {
 /*
  * What is NaN - Not A Number
  * How is NaN defined in different language ?
  * Java, C, C++, Ruby, Python, JavaScript
  */
		//System.out.println(2/0);
		//System.out.println(2.0/0.0);
		//System.out.println(0.0/0.0);
		//System.out.println(Math.sqrt(-1));   // NaN   -> not a number		
		//System.out.println(Float.NaN == Float.NaN);  //false
		//System.out.println(Float.NaN != Float.NaN);  //true		
		double nan = 2.1 % 0; 
		System.out.println((2.1 % 0) == nan); //false
		//System.out.println((NaN == nan);		
	
	
	}
}
