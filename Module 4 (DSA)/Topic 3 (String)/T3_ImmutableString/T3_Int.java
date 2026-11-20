package T3_ImmutableString;

public class T3_Int {
	public static void main(String[] args) {
		int a = 45;
		System.out.println(a);
		int b = 045; // If An Integer Has Prefix 0 So it will be treated as Ocatal Number
		System.out.println(b);
		
		/* In Java If we put 0 First So Java Will Think We Octal No. , Java Consideres 0 As Octal No.
		0 -> 000
		1 -> 001
		2 -> 010
		3 -> 011
		4 -> 100
		5 -> 101
		6 -> 110
		7 -> 111
		 1   0   0   1   0   1
		 x   x   x   x   x   x
		2^5 2^4 2^3 2^2 2^1 2^0 Multiplying With 0 is 0
		 32     +    4   +    1 = 37
		*/
		
		int c = 0X45; /* 0   1   0   0   0   1   0   1
		 				 x	 x   x   x   x   x   x   x
					    2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0 Multiplying With 0 is 0 
		 				     64      +        4   +   1 = 37   */
		System.out.println(c);
		int d = 0B10101011; // 1 0 1 0 1 0 1 1 = 127
		System.out.println(d);
	}
}
