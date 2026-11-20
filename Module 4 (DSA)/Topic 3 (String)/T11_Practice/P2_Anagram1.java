package T11_Practice;
import java.util.Arrays;
/*
An Anagram is a word or phrase formed by rearranging all the characters of another word or phrase.
In simple words: Two strings are anagrams if they contain exactly the same characters with the same
frequency, but their order can be different.

Examples

String 1 	String 2 	Result
LISTEN 		SILENT 		Anagram
HEART 		EARTH 		Anagram
RACE 		CARE 		Anagram
CAT 		ACT 		Anagram
HELLO 		WORLD 		Not Anagram
RAJU 		RAMU 		Not Anagram

How to check an Anagram in Java?
Example: LISTEN and SILENT
1. Both strings must have the same length.
2. Sort the characters of both strings.
3. Compare the sorted strings.
4. If they are equal, they are anagrams.
*/
public class P2_Anagram1 {
	   public static void main(String[] args) {
	        String s1 = "LISTEN";// take input form user or directly
	        String s2 = "SILENT";
	        char a[] = s1.toCharArray();// d
	        char b[] = s2.toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);
	       if(Arrays.equals(a, b))
	            System.out.println("Anagram");
	      else
	           System.out.println("Not Anagram");
	}
}
