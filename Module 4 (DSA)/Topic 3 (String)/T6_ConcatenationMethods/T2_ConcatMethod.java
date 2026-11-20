package T6_ConcatenationMethods;

import java.util.Scanner;

/*
 The concat() Method in Java
The concat() method is a straightforward but useful tool for joining two strings together in Java. It allows us to concatenate two strings without using the + operator. Let's break this down step-by-step:

Basic Concept
When you have two String variables, you can use the concat() method to combine them into a single string.

String str1 = "Hello";
String str2 = "World";
System.out.println(str1.concat(str2));

The output would be: HelloWorld . But why? The two strings are combined exactly as they are, without adding a space in between.

Key Point:
* The concat() method only concatenates strings and doesn't insert spaces unless you include them yourself.
* You can only concatenate one string at a time.

Quick Recap:
* concat() joins two strings.
* It doesn't automatically add spaces, punctuation, or any special characters.
*/
public class T2_ConcatMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Concatenate the strings
		// TODO: Print the concatenated result
		String s1 = sc.next();
		String s2 = sc.next();
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		StringBuffer sb3 = sb1.append(sb2);
		System.out.println("The full name is " + sb3 + ".");
		sc.close();
	}
}
