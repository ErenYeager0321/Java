package DataTypes;

public class Boolean {
  public static void main(String[] args) {
	  int a = 10;
	  int b = 20;
	  boolean x = a<b;
	  boolean y = a>b;
	  System.out.println("true AND false = " + (x && y));
	  System.out.println("true OR false = " + (x || y));
	  System.out.println("NOT true = " + (!x));
	  
	  
	 
	  int i = 5;
	  int j = 3;
	  boolean k = i>j;
	  boolean l = i<j;
	  boolean m = i == j;
	  boolean n = i != j;
	  System.out.println("5 > 3 = " + (k));
	  System.out.println("5 < 3 = " + (l));
	  System.out.println("5 == 3 = " + (m));
	  System.out.println("5 != 3 = " + (n));

  }
}
