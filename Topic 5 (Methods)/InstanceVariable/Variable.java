package InstanceVariable;

public class Variable {
   
	//instance variables Those who present in class outside the method without static also called Non Static Variable
	int a;
	int b;

	public static void main(String[] args) {
	//Local Variables present using static
	int m = 10;
	int n = 20;
	int z=Variable.add(m,n);
	System.out.println(z);
	}
	public static int add(int x ,int y) {
	int c = x+y;
	return c;
	}

}
