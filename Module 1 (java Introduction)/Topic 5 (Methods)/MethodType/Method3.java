package MethodType;

public class Method3 {
  public static void main(String[] args) {
	  
	     int result = Method3.add();
	     
	     System.out.println(result);
	     
	     //Or
	     
	     System.out.println(Method3.add());
  }

//    Methods without Parameters but with Return Values  
    
   		public static int add() {
   			int a = 10;
   			int b = 10;
   			int c = a+b;
   			return c;
	  
  }

}
