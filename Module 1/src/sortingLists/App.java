package sortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("cheese");
		animals.add("apple");
		
		Collections.sort(animals, new StringLengthComparator());
		for(String animal: animals){
			System.out.println(animal);
		}
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(36);
		numbers.add(42);
		numbers.add(78);
		numbers.add(32);
		
		Collections.sort(numbers, new Comparator<Integer>(){
			public int compare(Integer num1, Integer num2){
				return -num1.compareTo(num2);
			};
		});
		for(Integer number:numbers){
			System.out.println(number);
		}
	}

}
