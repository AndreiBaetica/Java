package lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		public static List<String> toDo = new LinkedList<String>();
		public static List<String> completed = new LinkedList<String>();



		Scanner reader = new Scanner(System.in);
		System.out.println("Available commands: \n1. Add task \n2. Remove task \n3. Remove completed task \n4. View to-do list \n5. View completed tasks \n");
		int n = reader.nextInt();
		reader.close();
		if (n < 1 || n > 5) {
			main(args);
		}
		if (n == 1) {
			Scanner reader1 = new Scanner(System.in);
			System.out.println("Enter a task to add: ");
			String task = reader1.nextLine();
			reader1.close();
			Lists.toDo.add(task);
			main(args);
		}

	}
}
