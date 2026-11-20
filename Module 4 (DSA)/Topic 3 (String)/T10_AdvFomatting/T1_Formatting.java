package T10_AdvFomatting;

import java.text.MessageFormat;

public class T1_Formatting {
	public static void main(String[] args) {
//		String s1 = "Hello %s How are you";
//		System.out.printf(s1,"Subaru"/*Subaru will take the %s place*/);
		System.out.printf("Hello %s How are you, Had Your %s", "Subaru" , "Lunch");
		System.out.println();
		String s = "%s Was Good Today , I Have Learnt %s";
		String s2 = String.format(s,"Class" , "Formatting");
		System.out.println(s2);
	
		String s3 = "Hello {0} I Am Going To {1} Will You Come With Me?";
		String FormattedString  = MessageFormat.format(s3, "Friends" , "USA");
		System.out.println(FormattedString);
		
	}
}
