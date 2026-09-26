package ABCDE;

public class A_E {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			char x='A';
			for(int j=1;j<=5;j++,x++) {
			System.out.print(x);
//			x++;
			}
			System.out.println();
		}	
		
		for(int i=1;i<=5;i++) {
			char x='A';
			for(int j=1; j<=i; j++,x++) {
			System.out.print(x);
//			x++;
			}
			System.out.println();
		}	
		
		char b='A';
		for(int i=1; i<=5; i++ , b++) {
			for(int j=1; j<=i; j++) {
			System.out.print(b);
			}
//			b++;
			System.out.println();
		}	
	}
}
