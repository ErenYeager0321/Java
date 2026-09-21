package DataTypes;

public class DataTypes {
	
	public static void main(String[] args) {	
//	Datatypes: it is mechanism that is used to declare a variable and 
//	store the realworld data in the variable by converting 
//	the data into binary "in a specific format"
	
//  Types Of Data   Data Types
//	1. character    char
//	2. Integers     byte, short, int, Dong
//	3. Real Numbers float, double
//	4. Boolean      boolean	
		
//   Data Type 
//		Byte:
//		1 Byte
//		8 Bit
//		byte a;
//  		-128 to +127
//		a: -129 Underflow
//		a = 128 overflow

//		Short:
//		2 Byte
//		short b;
//		16-bit
//		-2^16-1 to 2^16-1
//		-32768 to 32767
//		b = -32769 -> underflow
//		b = 32768 -> Overflow

//	    Int:
//		4 Byte
//		int c;
//		32-bit
//		C
//		-2^32-1 to +2^32-1
//		-2147483648 to 2147483647
//		C= -2147483649 -> Underflow
//		C= 2147483648 -> Overflow
	
//      Long:
//		8 Bytes
//		64-bit
//		-2^64-1 To +2^64-1
//		-9223372036854775808 To 92233572036854775807L
		
		byte a = 127;
		System.out.println(a);

		short b = 32767;
		System.out.println(b);		
		
		int c = 2147483647;
		System.out.println(c);
		
		long d = 9223357203685477580L;
		System.out.println(d);
		
		float price = 19.99f;
		System.out.println("The price is: " + price);  // Output: The price is: 19.99
		
		double temperature = 36.67;
		System.out.println("Current temperature: " + temperature);  // Output: Current temperature: 36.67
		
		char t = 'Z';
		System.out.println(t);
		
		boolean isjavafun = true;
		System.out.println("isjavafun " + isjavafun);
		
		boolean isWeekend = true; 
		String activity = isWeekend ? "Relax and have fun!" : "Time to work hard!"; 
		System.out.println(activity); // Output: Relax and have fun!
		
	}
}
