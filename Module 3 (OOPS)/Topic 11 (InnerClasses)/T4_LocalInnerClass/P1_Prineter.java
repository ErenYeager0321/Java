package T4_LocalInnerClass;

class MessagePrinter {
	void printMessage(String message) {
		class Printer {
			void display() {
			System.out.println("Message: " + message);
			}
		}
		Printer printer = new Printer();
		printer.display();
	}
}

public class P1_Prineter {
	public static void main(String[] args) {
		MessagePrinter m = new MessagePrinter();
		m.printMessage("Gend Mara Gaandu");
	}
}
