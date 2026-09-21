
public class Concatenaton {
      public static void main(String[] args) {
    	  System.out.println("Concatenation means joining text and data to make one message. In Java, we use the + symbol for this. It’s like "
    	  		+ "sticking two parts of a puzzle together to make a full picture.");
//		Ex1
    	    var name = "Subaru";
		var message = name + " Return By Death";
		System.out.println(message);
//		Ex2
		var name1 = "Sumit";
		System.out.println(name1 + " will get a job!");
//		Ex3
		var firstName = "Natsuki";
	    var lastName = "Subaru";
	    var message1 = firstName + " " + lastName + " is learning Java.";
	    System.out.println(message1);
//	    Ex4
	    var firstName1 = "Fuck Ajay";
	    System.out.println("Welcome" +" " +  firstName1 + "Lets learn Java together");    
//	    Ex5
	    System.out.println("Subaru " + 10 + 20);//Concatenation Not Addition
	    System.out.println("Subaru "+(10+20));//Now Addition Will Happen
      }
}
