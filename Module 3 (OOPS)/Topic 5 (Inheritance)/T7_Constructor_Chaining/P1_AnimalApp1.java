package T7_Constructor_Chaining;

// This Constructor Calling Also Super

class Animal1 {
	String name;
	int age;
	public Animal1() {
		name="Simba";// 6 Value changes from Herbi to Simba
		age=45;      // 7 age 560 to 45
	}                // Sees Closing  goes to 8    
	
				/* Herbivorous   560 */    // these value will be given to this.name and age
	public Animal1(String name, int age) { // 4. JVM Comes here gives the value Name(Herbi) Age(560)
		this();           // 5. Comes here Goes Up
		this.name = name; // 8. Value Changes back to Herbi bcz iss Cons ki jo values Hai wo (This.name) pe jayegi chahe jo bhi value pehle rhi ho
		this.age = age;   // 9. Age Changes Back to 560
	}                     // Sees Closing goes to 10
}

class Tiger1 extends Animal1{
	String foodHabit;
	int weight;
	
	public Tiger1() {              // 2. Comes here
		super("Herbivorous", 560); // 3. Comes here Goes with Value
		foodHabit="Omnivorous";    // 10 Carni Changes to Omni
		weight=150;                // 11 180 Changes to 150
	}                              // Sees Closing goes to 12
	
	                 /*  Carnivorous    180 */ // these value will be given to this.foodhabit and weight
	public Tiger1(String foodHabit, int weight) {
		this();    // 1. Jvm here goes up valuea given to Foodhabit(Carni) weight(180) 
		this.foodHabit = foodHabit; // 12 Changes Again From Omni to Carni
		this.weight = weight;       // 13 Again Changes From 150 to 180
	} // Sees Closing goes to 14
}

public class P1_AnimalApp1 {
	public static void main(String[] args) {
		Tiger1 t = new Tiger1("Carnivorous" , 180);
		System.out.println(t.name+" "+t.age+" "+t.foodHabit+" "+t.weight); // 14. At End IT will Print this 
	} // 11. Sees Closing Ends here
}

