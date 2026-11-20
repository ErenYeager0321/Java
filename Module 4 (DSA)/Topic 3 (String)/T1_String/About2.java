package T1_String;
/*
  Standard Definition
	A String in Java is a sequence of characters used to represent text. It is treated as a single data type and is enclosed in double
	quotes (" ").
	
	Simple Explanation
	A String is like a container where you store text. When you want to keep a word, sentence, or any text in a program, you use a String. In
	Java, it is very easy to work with Strings, and you can store anything from a name to a paragraph using this special container.
	
	How Strings Work in Java: More Than Just Text
	Java doesn't store text as simple characters. Strings in Java are special objects, meaning they come with extra features and abilities.
	Let's say you create a String:
	
	String mypassion = "I love Java programming!";
	
	Strings Are Immutable (They Can't Change)
	Once you put something inside a String box in Java, you cannot change what's inside. If you want to change it, Java will create a new box with the updated content, leaving the original untouched.
	
	Let's take a look at this example:
	
	String kodnest = "Hello";
	kodnest = kodnest + " World!";
	
	• Initially, the kodnest box contains "Hello".
	• When you add " World!", Java creates a new box that holds "Hello World!", while the original "Hello" remains the
	same.
	
	Two Ways to Create Strings in Java
	Java gives you two ways to create strings:
	1. Using Double Quotes (Recommended):
	This is the most common and easiest way to create a string:
	String kodnest = "Hello Kodnest!";
	
	2. Using the new Keyword (Less Common):
	You can also create a string using the new keyword:
	String kodnest = new String("Hello Kodnest!");
	
	While both methods work, using double quotes is generally more efficient because it reuses strings from the String Pool.
	
	Key points to remember:
	* What is a String?: A sequence of characters used to represent text, treated as a single data type in Java.
	* How to Create Strings: You can create strings using double quotes or the new keyword.
	* Immutability: Once created, Strings cannot be changed directly. If you modify a string, Java creates a new string.
	* String Pool: Java uses the String Pool to reuse existing strings and save memory.
	Common Interview Questions and Answers:
	1. What is a String in Java?
	Answer:
	A String in Java is a sequence of characters used to represent text. It is treated as a single data type, enclosed in double quotes (" "). Strings are objects in Java, which means they come with built-in features to help you manipulate and manage text easily.
	
	2. Why are Strings immutable in Java?
	Answer:
	Strings are immutable to:
	* Ensure security: For example, password values can't be changed unexpectedly.
	* Improve performance: By using the String Pool, Java can save memory by reusing common String values instead of creating new ones.
	* Thread safety: Immutability makes Strings safe to use in multi-threaded applications since their values can't be changed during execution.
	
	3. What is the String Pool in Java?
	Answer:
	The String Pool is a special memory area where Java stores commonly used strings. When a string is created, Java checks if that string already exists in the pool:
	* If it exists, Java reuses the existing string.
	* If it doesn't exist, Java adds it to the pool.
	This helps optimize memory usage.
	
	4. What are the two ways to create a String in Java?
	Answer:
	* Using Double Quotes (Recommended):
	String kodnest = "Hello Kodnest!";
	This method reuses the String from the String Pool, making it memory-efficient.
	
	* Using the new Keyword (Less Common):
	String kodnest = new String("Hello Kodnest!");
	This creates a new string object in memory, even if the same string exists in the String Pool.
 */
public class About2 {

}
