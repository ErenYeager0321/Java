package T6_ConcatenationMethods;

public class T1_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Natsuki");
		System.out.println(sbf);
		sbf.append(" Subaru ");
		System.out.println(sbf);
		
		StringBuilder sb = new StringBuilder("Subaru");
		System.out.println(sb);
		sb.append(" Natsuki");
		System.out.println(sb);
	}
}
