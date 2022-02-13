package nav;
public class Test123 {
	public static void main(String[] args) {
		System.out.println(Main.x);
	}
}
class Main{
	public static final int x =100;  // since this is final 
	//it will print this not static block( Class will not load)
	//public static int x =100;  // now it will print main - class static block than 100

	static {
	System.out.println("main - class static block");
}
}