
public class OperatorsBitwise {
   public static void main(String[] args) {
	
	    //Bitwise Left And RightSwift Operators
		
		var a = 2;
		var b = a<<1;// Bitwise LeftSwift Basically Multiplies By 2
		var c = a>>1;// Bitwise RightSwift Basically Divides by 2
		System.out.println(b);//4
		System.out.println(b<<1);//8
		System.out.println(b<<2);//16
		
		System.out.println("LeftSwift");
		var i = 32>>2;       
	    System.out.println(i);
		
		System.out.println(c);//2/2
		System.out.println(8>>1);//RightSwift 8/2
		System.out.println(8>>2);//8/4
		System.out.println(8>>3);//8/8
		
		System.out.println("RightSwift");
		var h = 32>>2;       
	    System.out.println("Result :"+h);
	   
	   // Bitwise AND(&)
	   // AND gives 1 only when BOTH bits are 1.	 
       //		  0101   (5)
       //		& 0011   (3)
       //		------
       //		  0001   (1)
		
       //  0111(7)
	   //& 0111(7)
	   //  -----
	   //  0111(7)
		System.out.println(7 & 7);
	   
		
	   // Bitwise OR(|)
       // OR gives 1 when AT LEAST ONE bit is 1.
	   // AND gives 1 only when BOTH bits are 1.	 
	   //		  0101   (5)
	   //		& 0011   (3)
	   //		------
	   //		  0111   (7)
		
	   //  0111(7)
	   //| 0111(7)
	   //  -----
	   //  0111(7)
		System.out.println(7 | 7);
		   
		//Complement
		var d = 5; // Binary: 0101
		var result = ~d;
		System.out.println("Result of ~d: " + result);
		
		
		
		//Bitwise XOR (^)
		//The Bitwise XOR operator returns 1 only if the bits are different. If both bits are the same, it
		//returns 0.
		var e = 5;  // Binary: 0101
		var f = 3;  // Binary: 0011
		var result1 = e ^ f; // Binary: 0110 (Decimal: 6)

		System.out.println("Result of e ^ f: " + result1); // Output: 6
   
		
		//Unsigned Right Shift (>>>)
		//The Unsigned Right Shift operator shifts all bits to the right, filling the leftmost bits with 0. Unlike the regular right shift, which can fill with the sign bit, >>> always fills with 0.
		var g = -8;
		var result2 = g >>> 2;

		System.out.println("Result of g >>> 2: " + result2);
   
   
   }
}
