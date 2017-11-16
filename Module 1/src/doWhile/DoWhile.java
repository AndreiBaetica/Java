package doWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int value;
		do{
			System.out.println("Enter the number 5: ");
			value=scanner.nextInt();
			
		}
		while(value != 5);
	}
	//Do while checks condition at end as oppose while which checks at beginning. 
	//Guaranteed to run at least once even if condition is initially met.

}
