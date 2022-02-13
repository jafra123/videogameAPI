package nav;
// what will be th output of following code 
// now create the object of the class 
public class Testing {
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Initialization Block");
	}	
	Testing(){
		System.out.println("constructor");
	}	
	public static void main(String[] args) {
		System.out.println("Main Method");
	 new Testing();
	}
}

