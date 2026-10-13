package Static_4Block;

public class Block1 {
	static {
		System.out.println("Hello");
	}
	static{
		System.out.println("Welcome");
		System.out.println("To");
	}
	//Means Kodnest will print right here after this static 
		{
		System.out.println("Technologies");
	}
	    {
		System.out.println("PVT");
	}
		{
		System.out.println("LTD");
	}
		public static void main(String[] args) {
		System.out.println("KODNEST");
		new Block1();//Bcz of that KODNEST will print right after the last static
	}
}
