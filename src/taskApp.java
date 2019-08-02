import java.util.*;

public class taskApp {

	public static void main(String[] args) {

		String name, description, date;
		boolean quit = false;

		Scanner scan = new Scanner(System.in);
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("justin", "study", "7", false));

		System.out.println("Welcome to the Task Manager!");
		System.out.println();

		while (!quit) {

			System.out.println("1." + "" + " List tasks");
			System.out.println("2." + "" + " Add task ");
			System.out.println("3." + "" + " Delete task ");
			System.out.println("4." + "" + " Mark task complete ");
			System.out.println("5." + "" + " Quit ");
			System.out.println();
			System.out.println("What would you like to do? (Choose a number)");
			String choice = scan.nextLine();

			// List tasks
			if (choice.equals("1")) {

				System.out.println("LISTS TASKS");
				int counter = 1;
				for (Task t : taskList) { // loop for printing the task list
					System.out.println(counter++ + "." + t);
				}

				// Main menu prompt
				System.out.println();
				System.out.println("Return to the main menu? (y/n)");
				String ans = scan.nextLine();

				if (ans.equalsIgnoreCase("y")) {
					continue;
				} else {
					quit = true;
				}

				// Add a task
			} else if (choice.equals("2")) {
				System.out.println("ADD TASK");
				System.out.println("Team Member Name: ");
				name = scan.next();
				System.out.println("Task Description: ");
				description = scan.next();
				System.out.println("Due Date: ");
				date = scan.next();
				scan.nextLine(); // clear rest of line
				// assign data to arrayList
				taskList.add(new Task(name, description, date, false));
//				System.out.println("Task Entered!");

				// Main menu prompt
				System.out.println();
				System.out.println("Return to the main menu? (y/n)");
				String ans = scan.nextLine();

				if (ans.equalsIgnoreCase("y")) {
					continue;
				} else {
					quit = true;
				}

				// Delete a Task
			} else if (choice.equals("3")) {
				System.out.println("DELETE TASK");
				int counter = 1;
				for (Task t : taskList) {
					System.out.println(counter++ + "." + t);
				}
				System.out.println();
//				System.out.println("Select a task to delete: (Choose a number)");
//				int indexNum = scan.nextInt();
				int indexNum = validator.getIntInRange(scan, "Select a task to delete: (Choose a number)", 1,
						taskList.size());
				System.out.println("You have chosen task:");
				System.out.println(taskList.get(indexNum - 1));
				System.out.println("Are you sure you want to delete this task? (y/n)");
				scan.nextLine();
				String ans2 = scan.nextLine();

				if (ans2.equalsIgnoreCase("y")) {
					taskList.remove(indexNum - 1);
				} else {
					continue;
				}

				System.out.println();
				System.out.println("Return to the main menu? (y/n)");
				String ans = scan.nextLine();

				if (ans.equalsIgnoreCase("y")) {
					continue;
				} else {
					quit = true;
				}

				// Mark task as complete
			} else if (choice.equals("4")) {
				System.out.println("Mark Task Complete");
				System.out.println();
				int counter = 1;
				for (Task t : taskList) { // loop for printing the task list
					System.out.println(counter++ + "." + t);
				}
				System.out.println();
//				System.out.println("Which task would you like to change to complete?(Choose a number)");
//				int indexNum = scan.nextInt();
				int indexNum = validator.getIntInRange(scan,
						"Which task would you like to change to complete?(Choose a number)", 1, taskList.size());

				System.out.println("You have chosen the following task:");
				System.out.println();
				System.out.println(taskList.get(indexNum - 1));
				System.out.println();
				System.out.println("Are you sure you want to change the status of this task? (y/n)");
				scan.nextLine(); // garbage line
				String ans2 = scan.nextLine();

				if (ans2.equalsIgnoreCase("y")) {
					taskList.get(indexNum - 1).setComplete(true);
				} else {
					continue;
				}

				// Return to main menu prompt
				System.out.println();
				System.out.println("Return to the main menu? (y/n)");
				String ans = scan.nextLine();

				if (ans.equalsIgnoreCase("y")) {
					continue;
				} else {
					quit = true;
				}

			} else if (choice.equals("5")) {
				quit = true;
				System.out.println("Have a Great Day! :) ");

			} else {

				System.out.println("You have chosen incorrectly, please select again.");
			}
		}
		scan.close();
	}
}
