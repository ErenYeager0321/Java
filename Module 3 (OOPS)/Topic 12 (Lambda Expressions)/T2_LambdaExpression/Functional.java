package T2_LambdaExpression;
/*
// Functional Interface Means A interface 
	which Have Only 1 Public Abstract Method , if theres 2 it will show 
	error without annotation(@) we can have 2 or more methods 

	*Funactional Interface Allows only 1 Method , We dont need to tell the name bcz thers only 1 method exists

*/
@FunctionalInterface
 interface Functional { 
	void greet();
//	void greet1();
}

//class main {
//	public static void main(String[] args) {
//		Functional f = new Functional() {
//			
//			@Override
//			public void greet() {
//				System.out.println("Hello");
//			}
//		};
//		f.greet();
//	}
//}