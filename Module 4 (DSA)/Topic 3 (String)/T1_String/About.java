/*
Strings   

1.Immutable String - are such strings which cannot be changes once created
Eg: name,DOB,Gender
Created By Using Normal String Keyword

Three Ways Of Creating Immutable String
1) String s="Rama";
2) String s=new String("Rama");
3) char arr[]={'R','A','M','A'};
  String s=new String(arr);

2.mutable String - are such strings which can be changes once created
Ex. email, address,
    spouse names(get divorce and get married again)
Created By Using StringBuffer/StringBuilder 

String Comparision:
1. ==   --> Compares Address/References comparision
2. equals() --> Compares String values/Contents
3. equalsIgnoreCase() --> Compares String values by ignoreing cases
4. compareTo() --> Compares char by char
   which amongst 2 strings is greater

Why Strings Matter in Your Career
As you prepare for technical interviews, mastering Strings becomes essential. Many coding challenges in interviews focus on string manipulation. Employers want to see if you can
handle text efficiently, and this skill will come up frequently in interviews.

For example, an interviewer might ask you to:
• Reverse a string: Take the input "Kodnest" and reverse it to "tsendok".
• Check if two strings are anagrams: Determine if "listen" and "silent" contain the same characters.
• Find substrings: Extract a portion of text from a given string, like taking the first name from "Rahul Sharma".
Here's how Strings make tasks like these easier:

String fullName = "Rahul Sharma";
String firstName = fullName.substring(0, 5); // Extract "Rahul"
System.out.println("First Name: " + firstName);

Instead of managing each character manually, Strings provide built-in methods that help you manipulate text effortlessly. These skills aren't just useful for interviews-they are
essential in real-world programming.

Conclusion: Strings Make Life Easier
Without Strings, coding would be a challenge. You would have to handle each character individually, which would make your code long, messy, and prone to errors. But with Strings,
you can manage entire words, sentences, or even paragraphs effortlessly.

Whether you're working on your next project for Kodnest, preparing for an interview at Infosys or TCS, or just trying to become a better programmer, Strings make your life easier.
They allow you to focus on what really matters: solving problems, building apps, and growing as a developer.

Coding Example:

String message = "I love Java!";
String studentName = "Amit Kumar";

// Print a personalized message
System.out.println("Welcome to Kodnest, " + studentName);
System.out.println("Your message: " + message);

Summary of Key Points
• Problem: Without Strings, handling text in code would require managing each character individually, making coding tasks tedious and error-prone.
• Solution: Strings allow you to store and manipulate entire sequences of characters (like names or sentences) with ease.
• Real-world impact: Strings make tasks like user registration, password validation, and personalized messaging simpler and faster, freeing up time for more important coding
tasks.
• Career Importance: Mastering Strings is crucial for technical interviews, where you'll face challenges like reversing strings, finding substrings, and checking for anagrams.
• Conclusion: Strings simplify handling text in Java, making coding more efficient and preparing you for real-world projects and interviews.
*/
package T1_String;

public class About {

}
