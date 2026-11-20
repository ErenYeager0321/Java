package T8_String_RegEx_Matching;

import java.util.Scanner;

public class T1_RegEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String s1 = sc.nextLine();
//		String Pattern  = "a";// Only for a true all false
//		String Pattern  = "[abc]";// any 1 either a or b or c will match gives true , doesnt include abc it will give false 
//		String Pattern  = "[abc]*"; // "*" Means Zero Or More Occurences , Even leaving blank will be true abc too ,  abcd false
//		String Pattern  = "[abc]+"; // One Or More Occ. 1 , min 1 , leaving blank false , same as star only blank is not valid
//		String Pattern  = "[abc]?"; // Zero or One Occ(optional) , blank true and max 1 word true
//		String Pattern  = "[abc]."; // "." Means Any Single Char Even (.) , 1 From Abc and other any like ad aa ab ,  Min 2 Char
//		String Pattern  = "[abc]{3}"; // {n} Exactly n Occurrences a{3} aaa ,abc,cba,bca,bbb,ccc true , min 3
//		String Pattern  = "[abc]{3,}"; // Atleast n(3) Occurrences ,  Max any , Every Char should be from (abc) aaaabbb true 
//		String Pattern  = "[abc]{3,5}";// Atleast 3 , Maximum 5 , aaabb true aaabbb false
//		String Pattern  = "[a-z]"; // Only 1 Character From a-z
//		String Pattern  = "[a-zA-Z0-9]"; // Any 1 from a-z , A-Z ,0-9
		String Pattern  = "[A-Z]+[a-z]{3,}[@][a-z]+.com"; // 1 From Capital A-Z and any more bcz of + , 3 or more from a-z ,@,1 from a-z and any more bcz of + , then . , then com
						//  De   ,ves     ,@ ,gmail,.,.com    
		
		
		System.out.println(s1.matches(Pattern));
		sc.close();
		
	}
}
