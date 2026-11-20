package T10_AdvFomatting;

public class T2_F2 {
	public static void main(String[] args) {
		String s1 = "Kodnest";
		String s2 = "Kodnest";
		String s3 = "KoDnEsT";
		String s4 = "Raju";
		String s5 = "Ramu";
		if(s1==s2)
			System.out.println("References of String s1=" +s1+ " And s2=" +s2+ " Are Equal");
		else
			System.out.println("References of String s1=" +s1+ " And s2=" +s2+ " Are Not Equal");
	
		if(s1.equals(s3))
			System.out.println("String Values of String s1= "+s1+" And s3= "+s3+" Are Equal");
		else
			System.out.println("String Values of String s1= "+s1+" And s3= "+s3+" Are Not Equal");

		if(s1.equalsIgnoreCase(s3))
			System.out.println("String Values of String s1= "+s1+" And s3= "+s3+" Are Equal By Ignoring Case");
		else
			System.out.println("String Values of String s1= "+s1+" And s3= "+s3+" Are Not Equal Inspite Of Case");
	
		int number  = s4.compareTo(s5);
		System.out.println(number);
		if(number>0)
			System.out.println("String s4="+s4+" Is Greater Than s5="+s5);
			else if(number<0)
			System.out.println("String s4="+s4+" Is Smaller Than s5="+s5);
			else
			System.out.println("String s4="+s4+" And s5="+s5+" Both Are Equal");
	/*
	Step-by-step comparison
Java compares the characters from left to right.

Position
s4 (Raju)
s5 (Ramu)
Position	s4 (Raju)	s5 (Ramu)	Result		
1	  		 R 				R		Equal
2			 a				a		Equal
3			 j				m		Different

Now Java calculates:
• Unicode value of j = 106
• Unicode value of m = 109

So:
106-109 = -3
	*/
	}
}
