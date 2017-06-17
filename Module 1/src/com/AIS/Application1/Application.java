package com.AIS.Application1;

public class Application {

	public static void main(String[] args) {
		/*
		 * System.out.println("I have no idea what I'm doing."); int nmbr; short
		 * shortNmbr; long longNmbr; double doubleNmbr; float floatNmbr; nmbr=1;
		 * char chr='y'; boolean bo=true; byte byt=123; boolean runThis=true;
		 * //global scope
		 * 
		 * System.out.println(byt);
		 * 
		 * String txt="<text goes here>"; while( nmbr==1) {
		 * System.out.println("<Loop contents go here.>"); nmbr=27; // boolean
		 * runThis=true; //variable with local scope }
		 * 
		 * 
		 * System.out.println(); System.out.println("Spacing:"); if (runThis) {
		 * System.out.println("It ran!"); } else {
		 * System.out.println("It didn't run!"); } System.out.println();
		 * System.out.println();
		 * 
		 * for (int i=0; i<5; i++) { System.out.printf("The value of i is %d",
		 * i); }
		 * 
		 * if( nmbr>20 ) { System.out.println("true"); }
		 * 
		 * else if( nmbr>20 ) { System.out.println("false"); }
		 * 
		 * System.out.println("test");
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a line of text: "); String line =
		 * input.nextLine(); System.out.println("You entered: "+line);
		 * 
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("enter a number: "); int value =
		 * scanner.nextInt(); while(value != 5) {
		 * System.out.println("Enter a number: "); value = scanner.nextInt(); }
		 * 
		 * Scanner scanner = new Scanner(System.in); int value = 0; do {
		 * System.out.println("Enter a number: "); value = scanner.nextInt(); }
		 * while(value!=5);
		 * 
		 * System.out.println("got 5.");
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a command: "); String text =
		 * input.nextLine(); switch (text) { case "start":
		 * System.out.println("Machine started."); break; case "stop":
		 * System.out.println("Machine stopped."); break; default:
		 * System.out.println("Command not recognized");
		 * 
		 * 
		 * String[] numbers = { "one", "two" }; System.out.println(numbers[0]);
		 */
		int[][] grid = {
				{ 3, 5, 7 }, 
				{ 9, 6 }, 
				{ 20, 45, 67, 1 } 
		};

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
