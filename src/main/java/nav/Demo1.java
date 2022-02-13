package nav;
//Will the static block will be executed into the folwwijg  code ? Why ?
	//--if you remove-- static 

	//Will the static block will be executed into the folwwijg  code ? Why ?
	//static is removed
	public class Demo1 {

		public static void main(String[] args) {
			System.out.println(new Testa1().x);

		}
		}

	class Testa1
	{
		static 
		{
			System.out.println("Test Static Block");
		}
		
		public final int x =20;
		
	}
	
	

