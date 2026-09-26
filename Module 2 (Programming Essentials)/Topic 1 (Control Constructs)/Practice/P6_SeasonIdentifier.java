package Practice;
import java.util.Scanner;
public class P6_SeasonIdentifier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		printSeason(month);
		scanner.close();
		}
	
		public static void printSeason(int month) {
		switch (month) {
		case 1 :
		System.out.println("Winter");
		break;
		case 2 :
		System.out.println("Winter");
		break;
		case 12 :
		System.out.println("Winter");
		break;
		case 3 :
		System.out.println("Spring");
		break;
		case 4 :
		System.out.println("Spring");
		break;
		case 5 :
		System.out.println("Spring");
		break;
		case 6 :
		System.out.println("Summer");
		break;
		case 7 :
		System.out.println("Summer");
		break;
		case 8 :
		System.out.println("Summer");
		break;
		case 9 :
		System.out.println("Autumn");
		break;
		case 10 :
		System.out.println("Autumn");
		break;
		case 11 :
		System.out.println("Autumn");
		break;
		}
		}
}
