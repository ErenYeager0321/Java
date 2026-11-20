package T5_StringOperations;

public class T1_Operations {
	public static void main(String[] args) {
		String s1 = "Natsuki Subaru";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('S'));// Tells The Number Of A Particular Character
		System.out.println(s1.charAt(8)); // Tells Which Char It is at the Mumber
		
		System.out.println(s1.contains("Subaru")); // Sees If Something Exist or Not If Yes Than True otherwise False 
		System.out.println(s1.contains("Sub")); // True
		System.out.println(s1.contains("Shaula")); // False Doesnt Contains Shaula in String
		
		System.out.println(s1.startsWith("N")); // is the String Starts With that Word Sentence So True Otherwise False
		System.out.println(s1.startsWith("Natsuki"));
		System.out.println(s1.endsWith("u"));
		System.out.println(s1.endsWith("Subaru"));
		
		System.out.println(s1.replace('S','N')); // Output - Natsuki Nubaru
		
		System.out.println(s1.substring(5)); // Print From GivenIndex To End - ki Subaru
		System.out.println(s1.substring(3, 8)); // Choose BeginIndex And Endindex
		System.out.println(s1.substring(3, s1.length()));
		
		char arr[] = s1.toCharArray();
		System.out.print("[ ");
		for (char c : arr) {
			System.out.print(c);
		}
		System.out.println(" ]");
		
		String s2 = new String();
		String s3 = new String("");
		String s4 = new String(" ");

		System.out.println(s2.isEmpty());// True
		System.out.println(s3.isEmpty());// True
		System.out.println(s4.isEmpty());// False Bcz Of Space

		System.out.println(s2.isBlank());// True ,  It Checks If There Is Any Character 
		System.out.println(s3.isBlank());// True
		System.out.println(s4.isBlank());// True 
	
		String s6 = "The Girl Next Door";
//		String s7[] = s6.split(""); // It will Splits Where Is No Space Means Everywhere - [ T h e   G i r l   N e x t   D o o r  ]
		String s7[] = s6.split("G"); // This Will Remove G
		System.out.print("[ ");
		for (String st : s7) {
//			System.out.print(st+" ");
			System.out.println(st+" "); // Using Println To See The Spilts 
		}
		System.out.println(" ]");
	
		String s8 = "Kayo";
		String s9 = " Kayo ";
	
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s9.trim()); // This Will Remove The Leading And Trailing Spaces
	}
}
