package T3_ImmutableString;

public class T2_Reference {
	public static void main(String[] args) {
		String s1 = "Kodnest";
		
		String s2 = s1;
		if(s2==s1) {
			System.out.println("References Are Equal");
		}
		else {
			System.out.println("References Are UnEqual");
		}
	}
}
