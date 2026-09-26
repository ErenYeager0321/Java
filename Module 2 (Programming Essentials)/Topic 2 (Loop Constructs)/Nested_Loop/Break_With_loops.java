package Nested_Loop;

public class Break_With_loops {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++){
//		System.out.println(i+" KODNEST ");
//		if(i==4)
//		break;
//		}
		
//	    for(int j=1;j<=3;j++) {
//			for(int i=1;i<=5;i++) {
//			System.out.println(i+" KODNEST ");
//			break;
//			}
//		}

		
		
//		for(int j=1;j<=3;j++){
//			System.out.println("Hello");
//			for(int i=1;i<=5;i++){
//			System.out.println(i+" KODNEST ");
//			}
//			if(j==2)
//			break;
//			System.out.println("Technologies");
//		}
		
		
		loop1 : for(int j=1;j<=3;j++) {
			
			System.out.println("Hello");
			
			loop2: for(int i=1;i<=5;i++) {
			      System.out.println(i+" KODNEST ");
			       break loop1;
			      }
	 	   }
	}
}
