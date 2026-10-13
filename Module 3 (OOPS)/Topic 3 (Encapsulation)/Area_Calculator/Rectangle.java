package Area_Calculator;

class Rectangle {
	private double length;
	private double width;
	
	public void setLength(double l) {
		length = (l >= 0) ? l : 0.0;
	}
	public void setWidth(double w) {
		width = (w >= 0) ? w : 0.0;
	}
	
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double calculateArea() {
		return length * width;
	}
}
