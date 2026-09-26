package Practice;

public class CombiningString {
	public static void main(String[] args) {
		String res = concatenate("Hello, ", "World!");
		System.out.println(res);
		
		int add1 = add(6,6);
		System.out.println(add1);
		System.out.println(CombiningString.add(5,5));
		}
	
		public static String concatenate(String str1, String str2) {
		String c = str1 + str2;
		return c;
		}
		
		public static int add(int a , int b) {
			int c = a+b;
		    return c;
		}
}
