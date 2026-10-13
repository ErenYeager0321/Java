package Static_1Types;

public class Static {
	static int a;
	
	static
	{
	// initialize static variable
	a=100;
	}
	
	static void display1() {
	System.out.println(a);
	}
	
	int b;
	
	{
	// initialize non static variable
	b=999;
	}
	
	void display2() {
	System.out.println(b);
	}
}
