package Method;


public class MethodCall {
 public static void main(String[] args) {
	System.out.println("Start");
	MethodCall.add();
	System.out.println(" ------- ");
	MethodCall.anime();
	System.out.println("End");
}
 
 
 public static void add() {
	 anime();
	 int a = 10;
	 int b = 10;
	 int c = a+b;
	 System.out.println(c);
	 anime();
 }
 
 public static void anime() {
	 System.out.println("Rezero is peak");
 }
}

