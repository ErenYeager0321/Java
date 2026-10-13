package AnonymousObject;

public class AnimalApp2 {
	public static void main(String[] args) {
		Animal res=AnimalApp2.sendAnimalObject();
		System.out.println(res);
		}
		public static Animal sendAnimalObject() {
//		Animal b = new Animal();
//			System.out.println(b);
			// Type 3 Return as a value
			return new Animal();//write these upper 2 line or this single line
		}
}
