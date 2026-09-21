package MethodType;

public class Method2 {
    public static void main(String[] args) {
		int a = 10;
		int b = 10;
		Method2.add(a,b);//Method Call
		Method2.add(10,20);//Method Call
	}
    
//   Methods with Parameters but Without Return Values
//   With parameters And Without Return value
    
    public static void add(int a , int b) {
    	int c = a+b;
    	System.out.println(c);
    }
	
	
	
	
	
}
