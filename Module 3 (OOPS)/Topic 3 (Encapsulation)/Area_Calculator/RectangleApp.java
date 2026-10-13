package Area_Calculator;

public class RectangleApp {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(5.0);
		r.setWidth(2.0);
		
		System.out.println("Initial Rectangle Details:");
		System.out.println("Length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
		System.out.println("Area: " + r.calculateArea());
		
	}
}
