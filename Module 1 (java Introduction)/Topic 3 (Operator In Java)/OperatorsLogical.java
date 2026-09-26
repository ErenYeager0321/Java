
public class OperatorsLogical {
  public static void main(String[] args) {
	System.out.println("Logical And Operator");//Any one is false than its false for true both must be true
	var a = true;
	var b = false;
	System.out.println("true && true ?" + (a && a));
	System.out.println("true && false ?" + (a && b));  
	System.out.println("false && true ?" + (b && a));
	System.out.println("false && false ?" + (b && b));
	  
	System.out.println("true || true ? "+(a || a));
	System.out.println("true || false ? "+(a || b));
	System.out.println("false || true ? "+(b || a));
	System.out.println("flase || false ? "+(b || b));

	System.out.println("NOT TRUE " +(!(true)));
	System.out.println("NOT FALSE " +(!(false)));
	
	var c = 10;
	var d = 20;
	System.out.println(!(c<d));
	System.out.println(!(c>d));
	System.out.println(!(!( (c<d) && (d>c) )));
	
	
	
	
  }
}
