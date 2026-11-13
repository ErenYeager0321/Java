package T2_LambdaExpression;


public class LambdaApp {
	public static void main(String[] args) {
		Functional f = ()->{
			System.out.println("Hello"); // ()-> Is the Lambda Expression
			System.out.println("Thenga");
		};
		f.greet();
		
//		T1_Lambda l = (name)->System.out.println("Hello "+name);
//		l.greet("Haimmiya");
		
//		T1_Lambda l = (name)->"Hello "+name;
		T1_Lambda l = (name)->{
			return "Hello " + name;
		};
		System.out.println(l.greet("Haimiya"));
	}
}
