package T2_Practice;

interface Greet{
	String greet(String name);
}

public class P1_Greeter {
	public static void main(String[] args) {
		Greet g = (name)->"Hey "+name;
		System.out.println(g.greet("Senpai"));
	}
}
