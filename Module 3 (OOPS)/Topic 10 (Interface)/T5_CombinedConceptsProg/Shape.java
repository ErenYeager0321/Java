package T5_CombinedConceptsProg;

import java.util.Scanner;

public interface Shape {
	public static final float pi = 3.14f;
	
	public void acceptinput();
	public void calculateareas();
	public void displayarea();
}

final class circle implements Shape {
	private int radius;
	float area;
	
	public circle() {
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@SuppressWarnings("resource")
	@Override
	public void acceptinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius ");
		radius  = sc.nextInt();
	}
	@Override
	public void calculateareas() {
		area = pi*radius;
	}
	@Override
	public void displayarea() {
		System.out.println("Area Of circle is " + area);
	}
}
class rectangle implements Shape{
	private int length;
	private int bredth;
	private float area;
	public rectangle() {
		
	}
	public int getLength() {
		return length;
	}
	
	public int getBredth() {
		return bredth;
	}
	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@SuppressWarnings("resource")
	@Override
	public void acceptinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length And Bredth");
		length=sc.nextInt();
		bredth=sc.nextInt();
		
	}
	@Override
	public void calculateareas() {
		area =  length*bredth;
	}
	@Override
	public void displayarea() {
		System.out.println("Area of rectangle is "+area);
	}
	
}

class square implements Shape{
	private int Side;
	private float area;
	public square() {
		// TODO Auto-generated constructor stub
	}
		
	
	@Override
	public void acceptinput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side");
		Side=sc.nextInt();
	}
	@Override
	public void calculateareas() {
		area =  Side*Side;
	}
	@Override
	public void displayarea() {
		System.out.println("Area of rectangle is "+area);
	}
	
}

class triangle implements Shape{
	private int base;
	private int height;
	private float area;
	public triangle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void acceptinput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base And Height");
		base = sc.nextInt();
		height = sc.nextInt();
	}
	@Override
	public void calculateareas() {
		area = 0.5f*base*height;
	}
	@Override
	public void displayarea() {
		System.out.println("Area of rectangle is "+area);
	}
	
}

class cylinder implements Shape{
	private int radius;
	private int height;
	private float area;
	
	public cylinder() {
		// TODO Auto-generated constructor stub
	}
		
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void acceptinput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius And Height");
		radius = sc.nextInt();
		height = sc.nextInt();
	}
	@Override
	public void calculateareas() {
		area = 2*pi*radius*radius*height;
	}
	@Override
	public void displayarea() {
		System.out.println("Area of rectangle is "+area);
	}
	
}

class geometry{
	 static void shape(Shape ref) {// can use interface as reference which will accept every class
		ref.acceptinput();
		ref.calculateareas();
		ref.displayarea();
	}
//	 static void rectangle(rectangle r) {  Can Make diff methods for each class
//		 r.acceptinput();
//		 r.calculateareas();
//		 r.displayarea();
//	 }

}

class RunAreas {
	public static void main(String[] args) {
		geometry.shape(new circle());
		geometry.shape(new rectangle());
		geometry.shape(new square());
		geometry.shape(new triangle());
		geometry.shape(new cylinder());
	}
}