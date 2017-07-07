package iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("Fox");
		animals.add("Hound");

		Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
	}

}
