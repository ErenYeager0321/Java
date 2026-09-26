package TypeCasting;

public class TypeCasting {
   public static void main(String[] args) {
	 //Type Casting Order
//	   byte
//	   short/Char
//	   int
//	   long
//	   float
//	   double
//  Top to Down Implict And Bottom To Top Explict    
	   
	//Implict TypeCasting/Widening
	byte a = 100;
	short b ;
	b=a;
	System.out.println(a+" "+b);
	
	//Explict TypeCasting/Narrowing
	double c = 3.147;
	int d;
	d=(int)c;
	System.out.println(c+" "+d);
	
	char x= 'A';//Output Will be UTf 16 value
	int y ;
	y = x;
	System.out.println(x+" "+y);
    
	int p = 65;
	char q ;
	q=(char)p;
	System.out.println(p+" "+q);
	
   
   
   
   
   
   
   
   }
}
