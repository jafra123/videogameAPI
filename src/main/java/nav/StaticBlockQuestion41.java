package nav;

class StaticBlockQuestion41 {
//	Q4. How can we create objects if we make the constructor private ? 
	int age;
	
	static {
		StaticBlockQuestion41 obj1 = new StaticBlockQuestion41();
	}
	
	public static int createObject() {
		StaticBlockQuestion41 obj1 = new StaticBlockQuestion41();
		obj1.age =40;
		return obj1.age;
	}
	
	
	private StaticBlockQuestion41() {
		age =30;
	}	
	public static void main(String[] args) {
		StaticBlockQuestion41 obj = new StaticBlockQuestion41();
		System.out.println(obj.age);		
		
	}
}
