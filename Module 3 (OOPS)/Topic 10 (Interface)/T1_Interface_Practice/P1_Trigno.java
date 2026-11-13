package T1_Interface_Practice;

public interface P1_Trigno {
	double sin(int a);
	double cos(int b);
	double tan(int c);
	double cot(int d);
}

class Operation implements P1_Trigno {

    public double sin(int a) {
        return Math.sin(Math.toRadians(a));
    }

    public double cos(int b) {
        return Math.cos(Math.toRadians(b));
    }

    public double tan(int c) {
        return Math.tan(Math.toRadians(c));
    }

    public double cot(int d) {
        return 1.0 / Math.tan(Math.toRadians(d));
    }
}

class TrignoOperations	 {
    public static void main(String[] args) {

        P1_Trigno ref = new Operation();

        System.out.println("Sin: " + ref.sin(90));
        System.out.println("Cos: " + ref.cos(90));
        System.out.println("Tan: " + ref.tan(45));
        System.out.println("Cot: " + ref.cot(45));
    }
}