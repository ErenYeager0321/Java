
public class OperatorsTernary {
   @SuppressWarnings("unused")
public static void main(String[] args) {
	
	   //
	   var a= 10;
	   var b = 20;
	   var c = (a>b) ? "A is Greater" : "B is Greater";
	   // condition ? valueIfTrue : valueIfFalse;
	   System.out.println(c);
       
       
	   var age = 20;
	   var message = (age >= 18) ? "You are an adult." : "You are not an adult.";
	   System.out.println(message);
   
	   
	   System.out.println((5<10) ?"Right":"Not Right");
	   System.out.println((!(5<10)) ?"Right":"Not Right");
   }
}
