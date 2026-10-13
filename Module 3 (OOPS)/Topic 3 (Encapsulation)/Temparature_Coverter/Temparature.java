package Temparature_Coverter;

class Temperature {
	private double celsius;
	
	public void setCelsius(double cel) {
		celsius = cel;
	}
	public double getCelsius() {
		return celsius;
	}
	
	public double getFahrenheit() {
		return (celsius * 9/5) + 32;
	}
}
