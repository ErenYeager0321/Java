package Loop_With_IF;

public class If1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
			System.out.println("Hello");
			continue;//Skip the rest and continue from loop again
			}
			System.out.println(i+ " KODNEST ");
			}
	}
}
