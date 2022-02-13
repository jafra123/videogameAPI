package nav;

class StaticBlockQuestion4 {
//	Q4. How can we create objects if we make the constructor private ? 
	int age;
	
	private StaticBlockQuestion4() {
		age =30;
	}	
	public static void main(String[] args) {
		StaticBlockQuestion4 obj = new StaticBlockQuestion4();
		System.out.println(obj.age);		
		
	}
}
