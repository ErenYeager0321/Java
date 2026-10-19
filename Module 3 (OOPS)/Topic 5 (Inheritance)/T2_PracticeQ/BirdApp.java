package T2_PracticeQ;

public class BirdApp {
	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		e.name = "Eagle";
		e.eat();
		e.fly();
		
		MountainEagle Me = new MountainEagle();
		Me.name = "MountainEagle";
		Me.eat();
		Me.fly();
		SerpantEagle Se = new SerpantEagle();
		Se.name = "SerpantEagle";
		Se.eat();
		Se.fly();
		
		Sparrow s = new Sparrow();
		s.name = "Sparrow";
		s.eat();
		s.fly();
		
		VegSparrow Vs = new VegSparrow();
		Vs.name = "VegSparrow";
		Vs.eat();
		Vs.fly();
		NonVegSparrow Ns = new NonVegSparrow();
		Ns.name = "NonVegSparrow";
		Ns.eat();
		Ns.fly();
		
		
	}
}
