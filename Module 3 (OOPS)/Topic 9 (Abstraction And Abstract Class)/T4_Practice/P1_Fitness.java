package T4_Practice;

abstract class FitnessTrainer{
	public abstract void conductSession();
	public abstract void giveAdvice();
}

class YogaInstructor extends FitnessTrainer {
	public void conductSession() {
	System.out.println("Conduct a yoga session...");
	}
	public void giveAdvice() {
	System.out.println("Give advice on flexibility and stress relief...");
	}
}
	
class WeightTrainingCoach extends FitnessTrainer {
	public void conductSession() {
	System.out.println("Conduct a weight training session...");
	}
	public void giveAdvice() {
	System.out.println("Give advice on strength training and muscle gain...");
	}
}

public class P1_Fitness {
	public static void main(String[] args) {
		YogaInstructor yogaInstructor = new YogaInstructor();
		WeightTrainingCoach weightCoach = new WeightTrainingCoach();
		startWorkout(yogaInstructor);
		startWorkout(weightCoach);
	}
	public static void startWorkout(FitnessTrainer trainer) {
		trainer.conductSession();
		trainer.giveAdvice();
	}
}
