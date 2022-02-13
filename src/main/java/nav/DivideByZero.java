package nav;

public class DivideByZero {

	public static void main(String[] args) {
		/*
		 * What will be the output when you divide a number by zero ? Number = Integer,
		 * Double, Float
		 */
		try {			
		}catch (ArithmeticException e) {
		
		System.out.println(9/0);   //"main" java.lang.ArithmeticException: / by zeroat DivideByZero.main(DivideByZero.java:13)
	
		}
		System.out.println(9.0 / 0);  // Infinity  - It will not give Aritematic Exception
		System.out.println(10/0.0);   // Infinity
		System.out.println(12.33f/0);   // Infinity
		//System.out.println(19.99999d/0);   // Infinity
		//System.out.println(0/0);   //"main" java.lang.ArithmeticException: / by zeroat DivideByZero.main(DivideByZero.java:13)
       //System.out.println(0.0/0); //NaN    - This is difined in double class
       System.out.println(0.0/0.0);   //NaN   - > not a number 
       System.out.println(12.33/0.0);  //Infinity
	}

}
