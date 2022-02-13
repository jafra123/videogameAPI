package nav;

public class StaticBlockQuestion1 {
//   Q1. Explain static blocks in Java ?
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}	
	
	public static void main(String[] args) {		
		System.out.println("main method");		

	}
	static {
		System.out.println("static block4");
	}
	

}
