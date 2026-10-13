package Course;

public class Details {
	int id = 80;
	String name = "Devesh";
	String mentor = "Punith Kumar";
	String timings = " 6 to 8";
	int duration = 8;
	
	void start(){
		System.out.println(name+" has started and will continue for "+duration+" months "+" everyday at ");
	}
	void learn() {
		System.out.println(name+" course is being learnt by students and the mentor is "+mentor);
	}
	void end() {
		System.out.println(name+" course is ended successfully "+ mentor);
	}
}
