package arrayLists;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		//retrieving
		System.out.println(numbers.get(0));
		//indexed for loop iteration
		System.out.println("Iteration 1:");
		for(int i=0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		System.out.println("Iteration 2:");
		for(Integer value: numbers){
			System.out.println(value);
		}
		//Removing items
		numbers.remove(numbers.size()-1);
		//note:removing from beginning of list is very slow
		numbers.remove(0);
	}

}
