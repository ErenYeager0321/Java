package T7_Constructor_Chaining;
 // Super Constructor Calling
class Animal {
	String name;
	int age;
	public Animal(String name, int age) {//3. JVM Will come here Intialize the values
	this.name = name;// 4. Simba
	this.age = age;  // 5. 23
	} // 6. Sees Closing
}

class Tiger extends Animal {
	String foodHabit;
	int weight;

	public Tiger() {//This Constructor will be Called by "This() Function"
		// TODO Auto-generated constructor stub
		super("Simba" , 23);// then this one will come in use
		// 3. after This() JVm Will Come here and will go to Parents(Animal)
	}
	
	public Tiger(String foodHabit, int weight) {//1.Jvm 1st Comes here
	this();// 2. 'This()' will call the upper constructor  
	//super("Simba", 23); // 2. Sees that goes to parent(Animal) with these values
	this.foodHabit = foodHabit;// 7. After Parent JVM Will Come here And Intialize the Values to Both
	this.weight = weight;// 8. It will get Initialize 
	}// 9. Sees Closing
	
	/* Two 
	 Super() - (Calls Super Constructor Chaining)
	 This() - (Calls Local Constructor Chaining)
	 1. Calls Constructor Present In the SAme Class (thats Why Local CC)
	 2. Agar This() Ko use krenge to Super use nai Kar Payenge Use 1 at a time 
	 2. This() ka mtlb ek aur Constructor hai to This() us constructor ko call krega 
	 
	 	 */
}

public class AnimalApp {
	public static void main(String[] args) {
		Tiger t = new Tiger("Carnivorous" , 180);
		System.out.println(t.name+" "+t.age+" "+t.foodHabit+" "+t.weight);// 10. At End IT will Print this 
	}// 11. Sees Closing Ends here
}
