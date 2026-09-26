package OpertorPractuce;

public class BitwiseAND {
public static void main(String[] args) {
	 boolean x = true;
     boolean y = false;
     
     // Performing bitwise AND operation
     boolean result = x & y;// if 1 one is false then result false
     boolean result1 = x | y;// if 1 one is true then result True
     
     // Output the result
     System.out.println("Bitwise AND of " + x + " and " + y + " is: " + result);
     System.out.println("Bitwise AND of " + x + " and " + y + " is: " + result1);
     
     
     var a = 32>>2;       
     System.out.println(a);
}
}
