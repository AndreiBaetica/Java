package lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Lists {
	public static List<String> toDo = new LinkedList<String>();
	public static List<String> completed = new LinkedList<String>();

	public static void add(List l, String s) {
		l.add(s);
	}

	public static void removeToDo(String s) {
		toDo.remove(s);
	}
	public static void clear(List l) {
		l.clear();
	}
}
class InputCheck extends App{
	public static void check(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Are you sure you wish to clear all? Y/N");
		String input = reader.nextLine();
		if(input.equals("y")){
			Lists.toDo.clear();
			Lists.completed.clear();
		}
		else if(input.equals("n")){
		}
		else {
			System.out.println("Invalid input.");
			check();
		}
		
		
		
	}
}
public class App {
	// TODO: add are you sure check to option 4.

	public static void main(String[] args) {

		System.out.println("\n To Do List: " + Lists.toDo + "\n \n Completed tasks: " + Lists.completed + "\n \n");

		Scanner reader = new Scanner(System.in);
		System.out.println("Available commands: \n1. Add task \n2. Remove task \n3. Complete task \n4. Clear all");
		int n = reader.nextInt();

		if (n < 1 || n > 4) {
			System.out.println("\n Invalid input.");
			main(args);
		}
		if (n == 1) {
			Scanner reader1 = new Scanner(System.in);
			System.out.println("Enter a task to add: ");
			String task = reader1.nextLine();
			Lists.add(Lists.toDo, task);
			main(args);
		}
		if (n == 2) {
			Scanner reader2 = new Scanner(System.in);
			System.out.println("Enter a task to remove: ");
			String task = reader2.nextLine();
			Lists.removeToDo(task);
			main(args);
		}
		if (n == 3) {
			Scanner reader3 = new Scanner(System.in);
			System.out.println("Enter the completed task: ");
			String task = reader3.nextLine();
			if (Lists.toDo.contains(task)) {
				Lists.add(Lists.completed, task);
				Lists.removeToDo(task);
			} else {
				System.out.println("No such element in To Do list.");
			}
			main(args);
		}
		if (n == 4) {
			InputCheck.check();
			main(args);
		}
		reader.close();
		
	}
}
