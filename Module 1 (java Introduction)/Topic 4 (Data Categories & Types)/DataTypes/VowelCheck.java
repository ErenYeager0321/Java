package DataTypes;

public class VowelCheck {

	 public static void main(String[] args) {
		 char inputChar = 'a';
//		 char inputChar = 'b';

		 // Checking if the character is a vowel
		 boolean isVowel = (inputChar == 'a' || inputChar == 'e' ||
		 inputChar == 'i' || inputChar == 'o' || inputChar == 'u' ||
		 inputChar == 'A' || inputChar == 'E' || inputChar == 'I' ||
		 inputChar == 'O' || inputChar == 'U');

		 // Printing the result
		 System.out.println(isVowel);
	}
}
