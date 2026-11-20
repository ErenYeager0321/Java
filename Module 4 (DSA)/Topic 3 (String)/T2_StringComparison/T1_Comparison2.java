package T2_StringComparison;

public class T1_Comparison2 {
	public static void main(String[] args) {
		String s1 = new String("Rama"); /* Here String Is Created Using New Operator 
		So IT will Go in Heap Where Duplicates Are Allowed , Means An String With 
		Diff Address Will be Created For 2nd String .
		Ex. If 1st String Add/ref is 1000 then 2nd will use the Ref(1000) Of 1st String */
		String s2 = new String("Rama");

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
