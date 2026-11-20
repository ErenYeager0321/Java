package T3_ImmutableString;

public class T1_ImmutableString {
	public static void main(String[] args) {
		String s1 = "Kodnest";
		System.out.println(s1);
		
		s1.concat("tech");// Concatinating S1 ,  But S1 is immutable means cannot be changed , Suppose here s1 ref is 1000
		System.out.println(s1); // so it will give the output only Kodnest
	
//		s1 = s1.concat("tech"); // By doing this a new String(Kodnest Tech) with a diff ref(2000) will be created so s1 will take ref(2000) and stops refering(1000) and print new String  ,if we store it on the same object it will take
//		System.out.println(s1); // String ke Inside Ka Content Immutable hai Not the Refernce Isliye A String Can Change its Reference
	
		String s2 = s1.concat("tech"); // or can a take diff String to Store 
		System.out.println(s2);
	}
}
