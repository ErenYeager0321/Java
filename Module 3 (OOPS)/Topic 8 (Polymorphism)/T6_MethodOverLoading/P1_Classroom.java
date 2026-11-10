package T6_MethodOverLoading;

class ClassroomManager {
	public void scheduleActivity(String activityType) {
		System.out.println("Scheduled: " + activityType);
	}
	
	public void scheduleActivity(String activityType, int duration) {
		System.out.println("Scheduled: " + activityType + " for " + duration + " minutes");
	}
	
	public void scheduleActivity(String activityType, int duration, int participants) {
		System.out.println("Scheduled: " + activityType + " for " + duration + " minutes with " + participants + " participants");
	}
}


public class P1_Classroom {
	public static void main(String[] args) {
		ClassroomManager manager = new ClassroomManager();
		manager.scheduleActivity("Lecture");
		manager.scheduleActivity("Quiz", 45);
		manager.scheduleActivity("Group Discussion", 30, 12);
		}
}
