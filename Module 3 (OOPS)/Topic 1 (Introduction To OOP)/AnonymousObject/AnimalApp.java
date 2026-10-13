package AnonymousObject;

public class AnimalApp {
	public static void main(String[] args) {
		
//		Animal a = new Animal();
//		a.eat(); //Thats called by the reference
//		Type 1 Of AnonymousObj Use only once
//		new Animal().eat();// Can call like that too thats anonymous object kyuki iska koi reference(object) nhi hai
		
		//type 2 Send as parameter
		AnimalApp.printAnimalAddress(new Animal());
	
	}
		public static void printAnimalAddress(Animal ref) {
		System.out.println(ref.name);
		System.out.println(ref);
		}
}
