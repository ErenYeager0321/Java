package T5_AnonymousInnerClass;
/*
What Are Anonymous Classes?
An Anonymous Class is a class without a name, defined on-the-fly for one-time use. It is a quick and convenient way to create a class when you don't need to reuse it. You define it in place and immediately use it. Once the task is
completed, the anonymous class disappears, and there's no need to worry about it after that.

How to Create an Anonymous Class?
To create an Anonymous Class, you define the class at the point where it's needed. You don't provide a name for the class; instead, you create it as part of an object creation. Here's the basic structure:
1. Interface or Class: First, you need to have an interface or an abstract class.
2. Anonymous Class: Create the class while creating an object, and provide the method implementation directly.
Example:
Let's look at an example to understand how to create and use an Anonymous Class:

Interface Helper {
void help();
}

public class Event {
void organize() {
// Anonymous class (one-time helper)
Helper volunteer = new Helper() {
@Override
public void help() {
System.out.println("Setting up for the event!");
}
};
volunteer.help(); // Calling the method of the anonymous class
}
}

public class Main {
public static void main(String[] args) {
Event event = new Event();
event.organize(); // Using the anonymous class inside the method
}
}

How This Code Works:
1. Interface (Helper): We create an interface Helper with a method help(). This interface defines a task that needs to be done.
2. Anonymous Class: Inside the organize() method, we create an anonymous class that implements the Helper interface. We define the help() method on-the-fly, without giving the class a name.
3. Using the Anonymous Class:
* In the Main class, we call the organize() method of the Event class.
* Inside this method, the anonymous class is created and immediately used to display a message, saying the event is being set up.
*/
public class About {

}
