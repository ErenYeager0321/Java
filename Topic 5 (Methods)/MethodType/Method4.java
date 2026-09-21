package MethodType;

public class Method4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = Method4.add(a, b);
		System.out.println(result);
		
	}
	
//  	Methods with Parameters and Return Values	
	
	public static int add(int a , int b) {
		int c = a+b;
		return c;
	}
	
}