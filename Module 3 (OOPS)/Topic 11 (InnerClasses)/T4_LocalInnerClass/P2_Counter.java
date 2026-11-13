package T4_LocalInnerClass;

class CounterManager {
	void countUp(int maxCount) {
		class Counter {
		void count() {
			for (int i = 1; i <= maxCount; i++) {
			System.out.println("Count: " + i);
			}
		}
	}
	Counter counter = new Counter();
	counter.count();
	}
}

public class P2_Counter {
	public static void main(String[] args) {
		CounterManager cm = new CounterManager();
		cm.countUp(5);
	}
}
