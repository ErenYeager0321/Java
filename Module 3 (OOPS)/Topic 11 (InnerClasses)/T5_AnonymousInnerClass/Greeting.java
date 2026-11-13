package T5_AnonymousInnerClass;
/*
	Works for interface too
*/
abstract class greeter{
	abstract void greet();
	abstract void greetuser(String name);
}
// 1st
//class Mygreeter extends greeter{
//
//	@Override
//	void greet() {
//		System.out.println("Hello");
//	}
//
//	@Override
//	void greetuser(String name) {
//		System.out.println("Hello"+name);
//	}
//	
//}
public class Greeting {
	public static void main(String[] args) {
		// 3rd main(Anonym class)
		greeter g = new greeter(){// Inside of that called AnonyMous Classs
			@Override
			void greet() {
				System.out.println("Hello");
			}
			@Override
			void greetuser(String name) {
				System.out.println("Hello"+name);
			}
		};	
		g.greet();
		g.greetuser("Haimiya Senpai");
		
		
	}		
}	
		
		
		
//	1	Mygreeter mg = new Mygreeter();
//		mg.greet();
//		mg.greetuser("Haimiya Senpai");
		
		// 2nd Method
//		class Mygreeter extends greeter{// 2nd Method ,instead of making extend class we directly ca implement here 
//			@Override
//			void greet() {
//				System.out.println("Hello");
//			}
//			@Override
//			void greetuser(String name) {
//				System.out.println("Hello"+name);
//			}
//		}
//		Mygreeter mg = new Mygreeter();
//		mg.greet();
//		mg.greetuser("Haimiya Senpai");
		
		
