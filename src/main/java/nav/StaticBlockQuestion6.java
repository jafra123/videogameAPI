package nav;

public class StaticBlockQuestion6 {
	//Q6. Can we initialize member variables within static block ?
			 String name;
			 static int age;
			
			static {
				StaticBlockQuestion6 obj1 = new StaticBlockQuestion6();
				obj1.name ="Naveen";   
				age =25;
				System.out.println(obj1.name +" " +age);
			}			
			
	public static void main(String[] args) {	
    
	}

}
