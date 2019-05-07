package TaskApp;

import java.time.LocalDate;

public class Task {



	private String teamMembersName;
	private String briefDescription;
	private LocalDate dueDate;
	private boolean isCompleted;

	
	public Task() {
		setTeamMembersName("John Doe");
		setBriefDescription("This task is about ");
		setDueDate(LocalDate.now()); // ("2015-02-20");
		setCompleted(false);

	}
	
	public String toString() {
		String s="";
		s = "Name: "+ teamMembersName + "\n" + "Description: " + briefDescription + "\n" + 
		"Due Date: " + dueDate.toString() + "\n" + "Project Finished: " + isCompleted + "\n";
		return s;
	}

	
	public String getTeamMembersName() {
		return teamMembersName;
	}

	
	public void setTeamMembersName(String teamMembersName) {
		this.teamMembersName = teamMembersName;
	}

	
	public String getBriefDescription() {
		return briefDescription;
	}

	
	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

	
	public LocalDate getDueDate() {
		return dueDate;
	}

	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	
	public boolean isCompleted() {
		return isCompleted;
	}

	
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public void printMenuChoices() {
		System.out.println("Options: ");
		System.out.println("1.  List tasks");
		System.out.println("2.  Add task");
		System.out.println("3.  Delete task");
		System.out.println("4.  Mark task complete");
		System.out.println("5.  Quit");
	}
	
	
	
	
	

}
