package TaskApp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class App {
	
	private static ArrayList<Task> tasks;
	
	public App() {
		if (tasks==null) {
			System.exit(1);
		}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		tasks = new ArrayList<Task>();
		int taskListItemChosen = 0;

		System.out.println("Welcome to the Task Manager");

		
		printMenuChoices();
		System.out.println("=============================");
		System.out.println("                             ");
		while (true) {

			taskListItemChosen = Validator.getInt(scan, "What would you like to do? ", 1, 5);
			System.out.println("                             ");

			if (taskListItemChosen == 1) {

				System.out.println("List task");

			} else if (taskListItemChosen == 2) {

				System.out.println("Add task");

			} else if (taskListItemChosen == 3) {

				System.out.println("Delete task");

			} else if (taskListItemChosen == 4) {

				System.out.println("Mark task complete");

			} else if (taskListItemChosen == 5) {

				System.out.println("Are you sure you want to quit? y/n");
				String s = scan.nextLine();
				if (s.charAt(0) == 'y') {
					System.out.println("Goodbye!");
					break;
				} else {
					continue;
				}

			}
			switch(taskListItemChosen) {
			case 1:
				break;
				
			case 2:
				Task t=new Task();
				if (t==null) {
				System.exit(1);
				}
				tasks.add(t);
				System.out.println(t.toString());
				break;
			
			}
		}

	}

	
	
	}

	private void printMenuChoices() {
		System.out.println("Options: ");
		System.out.println("1.  List tasks");
		System.out.println("2.  Add task");
		System.out.println("3.  Delete task");
		System.out.println("4.  Mark task complete");
		System.out.println("5.  Quit");
		
	}


}
