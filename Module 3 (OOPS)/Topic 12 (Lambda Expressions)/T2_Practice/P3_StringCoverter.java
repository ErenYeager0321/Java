package T2_Practice;

interface String1{
	String convert(String s);
}

public class P3_StringCoverter {
	public static void main(String[] args) {
		String1 toUpperCase = s -> s.toUpperCase();
		System.out.println(toUpperCase.convert("hello, world!"));
		
		String1 toLowerCase = s -> s.toLowerCase();
		System.out.println(toLowerCase.convert("HELLO, WORLD!"));
		}
}
