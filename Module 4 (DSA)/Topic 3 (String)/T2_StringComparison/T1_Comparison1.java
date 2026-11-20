package T2_StringComparison;

// Immutable String Comparison
/*
String Comparision:
1. ==   --> Compares Address/References 
2. equals() --> Compares String values/Contents
3. equalsIgnoreCase() --> Compares String values by ignoring cases
4. compareTo() --> Compares char by char
   which amongst 2 strings is greater
*/
public class T1_Comparison1 {
	public static void main(String[] args) {
		String s1 = "Rama"; /* Here String is created without New Operator so 
		It will go in Stringpool , where duplicates are not alowed( Only Once 
		That string will be created than 2nd String will use The Reference Of 1st String 
		Ex. If 1st String Add/ref is 1000 then 2nd will use the Ref(1000) Of 1st String*/
		String s2 = "Rama";

		if(s1==s2) {// It will see if Address/Reference Are Same or not
			System.out.println("References Are Equal");
		}
		else {
			System.out.println("References Are Unequal");
		}

		if(s1.equals(s2)) { // It will See if the Content inside the Strings are same or not
			System.out.println("Strings Are Equal");
		}
		else {
			System.out.println("Strings Are Not Equal");
		}
	}
}
