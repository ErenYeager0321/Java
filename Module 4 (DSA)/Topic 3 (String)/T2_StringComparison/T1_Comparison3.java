package T2_StringComparison;

public class T1_Comparison3 {
	public static void main(String[] args) {
		String s1 = ("Rama"); // StringPool
		String s2 = new String("Rama"); // Normal Heap(Outside StringPool)

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
