package T1_UpCasting;

public class AnimalApp {
	public static void main(String[] args) {
//		Tiger t = new Tiger();Calling Child or Like That Is Called *Tight Coupling* //Child Type Refrence
//		t.eat();
//		t.sleep();
		
/*		Definition - Upcasting is a feature in Java where a child class 
        object is stored in a parent class reference
		*Having PArent type Ref To Child Object Is Loose Coupling/UpCasting
		
	//  **UpCasting - Converting Child class Object to parent child refrenece  
	1	Animal ref;//Parent type Reference Collectinng Address Of Child
		Tiger t = new Tiger();
		ref = t;
		
	2	ref  =  new Tiger();// Same Output
    3*/	
		Animal ref = new Tiger();
		ref.eat();
		ref.sleep();
//		ref.run(); ref cant access child specialized methods, for this to run we need to use *DownCasting
		
		((Tiger)ref).run(); // DownCasting
		
	}
}
