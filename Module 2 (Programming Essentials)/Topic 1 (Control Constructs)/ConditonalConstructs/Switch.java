package ConditonalConstructs;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number of the week eg: 1->Sunday");
		int day = sc.nextInt();
		
		switch(day){
//			case 1:
//			System.out.println("Sunday");
//			break;
//			case 2:
//			System.out.println("Monday");//In Switch if enter 2 then from 2 everything will be printed for not that to happen we use "BREAK"
//			break;
//			case 3:
//			System.out.println("Tuesday");
//			break;
//			case 4:
//			System.out.println("Wednesday");
//			break;
//			case 5:
//			System.out.println("Thursday");
//			break;
//			case 6:
//			System.out.println("Friday");
//			break;
//			case 7:
//			System.out.println("saturday");
//			break;
//			default:
//			System.out.println("Invalid No.");
			//To Reduce Complexity adn inc readibility we will use this -> symbl to avoid use of BREAK
			case 1 -> {
				System.out.println("Sunday");
				System.out.println("Sunday");
			}// For Multiple Statements Use braces
			case 2 ->System.out.println("monday");
			case 3 ->System.out.println("tuesday");
			case 4 ->System.out.println("Wednesday");
			case 5 ->System.out.println("Thursday");
			case 6 ->System.out.println("Friday");
			case 7 ->System.out.println("Saturday");
			default->System.out.println("Invalid day");
		}
	}
}
