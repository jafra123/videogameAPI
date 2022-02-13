package nav;

public class StaticBlockQuestion2 {
// Q2. How can we run a java program without making any object?
	static {
		System.out.println("static blok");
	}
	public static void test() {
		System.out.println("testing method");
	}	
	public static void cover() {
		System.out.println("cover method");
		 test();
	}
	public static void main(String[] args) { // will be called by JVM	
		System.out.println("main block");
		test();	
		StaticBlockQuestion2.test();
		cover() ;
	}
}
