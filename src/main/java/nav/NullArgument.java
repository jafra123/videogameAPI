package nav;

public class NullArgument {
	/*
	 * Pass null argument with method oveloading with String and Object types
	 */
	public static void main(String a[]) {
		test(null); 
	}
	public static void test(Object o) {
		System.out.println("Object Arguments ");
	}
	public static void test(String s) {//Object is super class of String & Object and String can have null value
		System.out.println("String Arguments ");
	}
	//public static void test(StringBuilder o) { //The method test(Object) is ambiguous for the type NullArgument
		//System.out.println("Object Arguments ");
	//}
	/*public static void test(StringBuffer o) {//The method test(Object) is ambiguous for the type NullArgument
		System.out.println("Object Arguments ");
	} */	
}
