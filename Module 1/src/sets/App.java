package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Zero");
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Zero");
		//Adding duplicate items does nothing. HashSet does not retain order.
		System.out.println(set1);
		
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Zero");
		set2.add("One");
		set2.add("Two");
		set2.add("Three");
		set2.add("Four");
		set2.add("Zero");
		set2.add("Six");
		set2.add("Seven");
		
		System.out.println(set2);
		//TreeSet uses natural order.
		
		for(String element: set1){
			System.out.println(element);
			
		}
		if(set1.contains("Five")){
			System.out.println("Positive");
		}
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		Set<String> difference = new HashSet<String>(set2);
		difference.removeAll(set1);
		System.out.println(difference);
	}

}
