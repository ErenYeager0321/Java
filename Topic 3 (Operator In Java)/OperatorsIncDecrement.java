
public class OperatorsIncDecrement {
  
	public static void main(String[] args) {
		
//		var a= 10;
//		a++;// Post Increment
//		System.out.println(a);
//		
//		var b= 10;
//		++b;// Pre Increment
//		System.out.println(b);
//		
//		var c= 10;
//		c--;// Post Decrement
//		System.out.println(c);
//		
//		var d= 10;
//		--d;// Pre Decrement
//		System.out.println(d);

		
//		var a = 10;
//		var b = a++;// Post Increment Means pehle B me value Assign(10) Kro Ya do then Increment kro A(11) me 
//		System.out.println(a+" "+b);
//		
//		var c = 10;
//		var d = ++c;// Pre Increment Means B me value assign hone se pehle increment(a=11) then B(11) me assign karna 
//		System.out.println(c+" "+d);
//		
//		
//		var e = 10;
//		var f = e--;// Post Decrement Means pehle B me value Assign(10) Kro Ya do then Decrement kro A(9) me 
//		System.out.println(e+" "+f);
//		
//		var g = 10;
//		var h = --g;// Pre Decrement Means B me value assign hone se pehle Decrement(a=9) then B me assign(9) karna 
//		System.out.println(g+" "+h);
		
		
		
//		var a = 10;// 10+1 , 11+1 =12
//		var b = a++ + a++;// 10 + 11=21
//		System.out.println(a + " " + b);
//		
//		var c = 10;//12
//		var d = ++c + ++c;//11+12=23
//		System.out.println(c + " " + d);
//		
//		var e = 10;//10-1 , 9-1=8
//		var f = e-- + e--;//10+9=19
//		System.out.println(e + " " + f);
//		
//		var g = 10;//8
//		var h = --g + --g;//9+8=17
//		System.out.println(g + " " + h);
		
		
//		var a = 10;//13
//		var b = a++ + a++ + a++;//10 + 11 + 12 = 33
//		System.out.println(a+" "+b);
		
//     	var a = 10;//10+1. 11+1, 12-1. 11+1= 12
//		var b = ++a + a++ + a-- + ++a;//11+11+12+12
//		System.out.println(a+" "+b);
//	
//		var a = 10;
//		var b = a++ + a-- + a++;
//		System.out.println(a+" "+b);;
//		
//		var a = 10;
//		var b = a++ + a++ + --a + --a - a--;
//		System.out.println(a+" "+b);
		
		
		var a = 10;//11,12,13,14,15,14,13,12,13,14
		var b = a++ + ++a + a++ + a++ + ++a + --a + a-- + a-- + a++ - ++a;
		//      10+12+12+13+15+14+14+13+12-14
		System.out.println(a+" "+b);
	
		
		
	}
}
