package Static_4Block;

public class P6_Counter {
	public static void main(String[] args) {
		Counter.increment();
		System.out.println(Counter.count);

		Counter.increment();
		System.out.println(Counter.count);
	}
}
class Counter {
	static int count = 0;

	static void increment() {
		count++;
	}	
}