package com.bptn.course._22_PuttingEverythingTogether;

import java.util.HashSet;
import java.util.Iterator;
// LinkedList, Iterator, Scanner, HashSet
import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {
		// Create a new LinkedList called "tasks"
		LinkedList<String> tasks = new LinkedList<>();

		// Create a new HashSet for storing Completed Task
		HashSet<String> completedTasks = new HashSet<>();

		// Crate a scanner object
		Scanner scanner = new Scanner(System.in);

		// Store user's input
		int choice;

		do {
			System.out.println("\n=========== Task Management System ======\n");
			System.out.println("1. Add Task");
			System.out.println("2. Mark as Complete");
			System.out.println("3. View Pending Tasks");
			System.out.println("4. View Completed Tasks");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter the task: ");
				String userTask = scanner.nextLine();
				tasks.add(userTask);
				System.out.println("Task added!");
				break;
			case 2:
				// Check if there are any tasks in the LinkedList
				if (tasks.isEmpty()) {
					System.out.println("No tasks found!");
				} else {
					System.out.println("Pick a task to mark it as complete: ");
					Iterator<String> iterator = tasks.iterator();
					int count = 1;
					while (iterator.hasNext()) {
						System.out.println(count + " - " + iterator.next());
						count++;
					}
					int taskNumber = scanner.nextInt();
					completedTasks.add(tasks.remove(taskNumber - 1));
					System.out.println("Task marked as Completed");
				}
				break;

			case 3:
				System.out.println("Pending Tasks: ");
				if (tasks.isEmpty()) {
					System.out.println("No pending tasks!");
				} else {
					// for-each
					for (String task : tasks) {
						System.out.println(task);
					}
				}
				break;

			case 4:
				System.out.println("Completed Tasks: ");
				// for-each
				if (completedTasks.isEmpty()) {
					System.out.println("No completed tasks!");
				} else {
					for (String task : completedTasks) {
						System.out.println(task);
					}
				}
				break;

			case 5:
				System.out.println("Thanks for using the app.... Exiting....");
				break;

			default:
				System.out.println("Invalid Option!");

			}

		} while (choice != 5);

		scanner.close();
	}

}