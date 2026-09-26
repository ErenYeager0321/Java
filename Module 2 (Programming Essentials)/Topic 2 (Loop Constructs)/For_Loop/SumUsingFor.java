package For_Loop;

import java.util.Scanner;

public class SumUsingFor {
	public static void main(String[] args) {
//		int sum=0;
//		for (int i=1;i<=10;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A No.");
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum=sum+i;//1st 0+1 , 2nd loop 1+2=3 , 3rd 3+3=6 , 4th 6+4=10 , 5th 10+5=15 ,  
		}// it will run 5 times and then print the end value
		System.out.println(sum);
		
	}
}
