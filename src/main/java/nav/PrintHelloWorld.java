package nav;

public class PrintHelloWorld {
	public static void main(String[] args) {
		
		// Print Hello World without using semi colon (;)
		//1
		if(System.out.printf("Hello World" + "\n") == null) {		
		
		}
		//2
		if(System.out.append("Hello World 1" + "\n") == null) {
			
		}
		//3
		if (System.out.append("Hello World 2" + "\n").equals(null)) {
			
		}
		
		// 4 
		for(int i=0; i<1 ; System.out.println("Hello World")) {
			i++;
		}
			
		
		
		

	}

}
