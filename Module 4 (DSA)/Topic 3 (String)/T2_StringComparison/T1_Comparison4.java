package T2_StringComparison;

public class T1_Comparison4 {
	public static void main(String[] args) {
			@SuppressWarnings("unused")
			String s1 = "Rama";
			@SuppressWarnings("unused")
			String s2= "Sita";
			String s3="Rama"+"Sita"; // if we concatenate 2 Strings so it will be created in StringPool thats why here refrences are equal
			String s4="Rama"+"Sita";

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
