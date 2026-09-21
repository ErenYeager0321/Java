package MethodType;

public class Method1 {
//	No input → type 1 → no output
//	   input → type 2 → no output
//	No input → type 3 → output
//	   input → type 4 → output
	
// Type 1 Methods without Parameters and Without Return Values(Means Void(nothing) Means No Int.. )
// yaha without Return value ka mtlb Void Likhenge agar Int ya kuch aur hua to wo With Return Value hoga	
	public static void main(String[] args) {
		add();
	}
	
	public static void add() {
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	
	
	
}
