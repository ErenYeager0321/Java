package T2_StringComparison;

public class T1_Comparison5 {
	public static void main(String[] args) {
		String s1 = "Rama";// Suppose Rama Has Add 1000
		String s2 = "Sita";// Suppose Sita Has Add 2000
		String s3 = s1+s2; // Here only using ref not creating another string in the heap
		String s4 = s1+s2; // if we concatenate 2 Strings using Reference so it will be created Outside StringPool(Heap Area) thats why here refrences are equal
						   // String s3 = s2 is diff it will executed inside the Stringpool , Concatenation Mean Making a new String
	if(s3==s4) {
		System.out.println("References Are Equal");
	}
	else {
		System.out.println("References Are Unequal");
	}
		
	if(s3.equals(s4)) {
		System.out.println("Strings Are Equal");
	}
	else {
		System.out.println("Strings Are Not Equal");
	}

	}
}
