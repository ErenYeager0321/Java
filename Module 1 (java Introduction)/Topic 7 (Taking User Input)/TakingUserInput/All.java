package TakingUserInput;

import java.util.Scanner;

public class All {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter Byte");
    	byte a =scan.nextByte();
    	System.out.println("Byte : "+a);
    	
    	System.out.println("Enter short");
    	short b = scan.nextShort();
    	System.out.println("Short : "+b);
    	
    	System.out.println("Enter int");
    	int c = scan.nextInt();
    	System.out.println("Int : "+c);
    	
    	System.out.println("Enter one word");
    String Word= scan.next();
    System.out.println("Word" + Word);
    	
    	System.out.println("Enter paragraph");
    	scan.nextLine();
    	String Paragraph= scan.nextLine();
    System.out.println("Paragraph" + Paragraph);
    	
    System.out.println("Enter long");
    long d = scan.nextLong();
    System.out.println("Long :"+ d);
    
    System.out.println("Enter float");
    float e = scan.nextFloat();
    System.out.println("Float :"+ e);
    
    System.out.println("Enter double");
    double f = scan.nextDouble();
    System.out.println("Double :"+f);
    
    System.out.println("Enter boolean");
    boolean g = scan.nextBoolean();
    System.out.println("Boolean :"+g);
    
    System.out.println("Enter character");
    char h = scan.next().charAt(0);
    System.out.println("Enter Char :"+ h);
    
	}
}
