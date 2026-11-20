package T9_StringBuffer;
/*
Why Are Strings Slow When We Modify Them? 😳
In Java, strings are like pieces of paper. Once you write something on a 
piece of paper, you can't change it directly. If you want to add something 
else, you need a whole new piece of paper. This can be slow and wasteful, 
especially when you need to add or change text multiple times.

When you keep changing text (for example, adding more posts to a social 
media feed or sending new messages in a chat), Java has to create a whole
 new string every time you change it. This takes time and uses more memory.

The Solution: StringBuilder and StringBuffer 🔧
StringBuilder:
* This is used when your program has only one task at a time.
* It's faster and great for situations like when you're creating a list of 
  things or building a long string from smaller pieces.

StringBuffer:
* This is like StringBuilder, but it is safe to use when there are multiple 
 tasks trying to change the text at the same time.
* It is slower than StringBuilder because it is built to handle multiple 
 users or processes safely.

How Do They Help?
The main advantage of StringBuilder and StringBuffer is that they do not 
create new strings every time you change something. They allow you to 
change the text directly, which is faster and uses less memory.

Let's Look at StringBuilder first:
Imagine you're creating a news feed for an app, and you want to keep adding new posts to it.

StringBuilder newsFeed = new StringBuilder("Latest News: ");
// Add more news
newsFeed.append("Java update released. ");
newsFeed.append("AI is growing rapidly. ");

System.out.println(newsFeed); // Output: Latest News: Java update released. AI is growing rapidly.

Explanation:
1. Initialization: We start with "Latest News: ".
2. Appending: We add more news using the append() method.
3. Final Output: The final chat log is printed all together in one go, without creating new strings each time.
Now, Let's Look at StringBuilder:

StringBuilder chatRoom = new StringBuilder("User's Hit");
// Adding more messages from different users
chatRoom.append("\nUser 1: Hello!");
chatRoom.append("\nUser 2: Hello!");
chatRoom.append("\nUser 3: Good evening!");

System.out.println(chatRoom);
// Output:
// User 1: Hello!
// User 2: Hello!
// User 3: Good evening!

Explanation:
1. Initialization: We start with "User's Hit".
2. Appending: We add more messages using append().
3. Final Output: The final chat log is printed with all the messages, and it's safe even if many users are sending messages at the same time.
Why Use StringBuilder or StringBuilder Instead of String?

• Efficiency: With StringBuilder and StringBuffer, you can change the text without creating new strings each time.
• Speed: They are faster than using regular strings when you need to make lots of changes.
• Memory: They use less memory because they reuse the same space for the text instead of creating new ones.

Common Methods in StringBuilder and StringBuffer

Here are a few useful methods you can use to work with StringBuilder and StringBuffer:

Method | What It Does | Example
------- | -------- | --------
append() | Adds more text to the end of the string | builder.append("World")
insert() | Adds text at a certain position | builder.insert(0, "Hello")
delete() | Removes text between two points | builder.delete(0, 5)
reverse() | Reverses the entire string | builder.reverse()

Using These Methods

StringBuilder builder = new StringBuilder("Hello");
builder.append("World"); // builder: HelloWorld
builder.insert(5, "Java"); // builder: HelloJavaWorld
builder.delete(0, 5); // builder: JavaWorld
builder.reverse(); // builder: dlroWavaJ

System.out.println(builder); // Output: dlroWavaJ

Real-Life Example:
Think of a String as a sealed envelope. Each time you want to add more text, you have to open it, rewrite everything, and seal it again. It's slow and uses extra resources.

When to Use Each?
On the other hand, StringBuilder and StringBuffer are like notebooks where you can add, erase, or change text without needing a new notebook each time.

When to use StringBuilder?
• Use StringBuilder when you don't need to worry about multiple processes changing the text at the same time. It's best for tasks where only one task is involved (e.g., creating a report).
• Use StringBuffer: When you have multiple processes changing the text at once. It's great for things like chat rooms or any app where multiple users are interacting with the text at the same time.

Key points to remember:
• Strings in Java are immutable and fast but used for single tasks.
• StringBuilder is safe for multi-tasks but slower than StringBuffer.

*/
public class About {

}
