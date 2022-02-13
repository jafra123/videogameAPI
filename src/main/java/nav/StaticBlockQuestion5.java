package nav;

public class StaticBlockQuestion5 {
	// Q5. Is it possible to compile and run a Java program without writing main( ) method? 
	
	static int age =20;
	
	static {
		System.out.println("static 1");
	}
	static {
		System.out.println("static 2");
	}
	static {
		System.out.println("static 3");
	}
}
