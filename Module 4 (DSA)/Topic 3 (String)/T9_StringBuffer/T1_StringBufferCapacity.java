package T9_StringBuffer;

public class T1_StringBufferCapacity {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf.capacity());// At initialization Capacity Of A StringBuffer is 16 
		sbf.append("I am a Superman Not Batman"); // Here Capacity Gets Full/Exceeds , it will take more Capacity of (oldcapacity(16)*2+2) 
		System.out.println(sbf.capacity());
		sbf.append("I am a Superman Not Batman");
		System.out.println(sbf.capacity()); // it Will gets Full Again now 34*2+2=70
	}
}
