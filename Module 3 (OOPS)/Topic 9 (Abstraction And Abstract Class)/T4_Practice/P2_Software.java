package T4_Practice;

abstract class ProjectManager {
	public abstract void manageProject();
	public abstract void scheduleTasks();
}

class AgileManager extends ProjectManager {
	public void manageProject() {
	System.out.println("Manage project using Agile methodologies...");
	}
	
	public void scheduleTasks() {
	System.out.println("Schedule tasks based on sprints...");
	}
}

class WaterfallManager extends ProjectManager {
	public void manageProject() {
	System.out.println("Manage project using Waterfall methodologies...");
	}
	
	public void scheduleTasks() {
	System.out.println("Schedule tasks in a sequential phase...");
	}
}

public class P2_Software {
	public static void main(String[] args) {
	AgileManager agileManager = new AgileManager();
	WaterfallManager waterfallManager = new WaterfallManager();
	conductMeeting(agileManager);
	conductMeeting(waterfallManager);
	}

	public static void conductMeeting(ProjectManager manager) {
	manager.manageProject();
	manager.scheduleTasks();
	}
}

