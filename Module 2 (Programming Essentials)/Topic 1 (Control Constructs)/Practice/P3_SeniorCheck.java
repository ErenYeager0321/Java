package Practice;
import java.util.Scanner;
public class P3_SeniorCheck {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Age");
    int age = sc.nextInt();
    P3_SeniorCheck.SeniorCheck(age);
	}
	
	public static void SeniorCheck(int age) {
	if(age>=60) {
		System.out.println("Senior");
		
	     }
	else {
		System.out.println("Not Senior");
	     }
	}
}
