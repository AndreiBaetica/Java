package naturalOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	public Person(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		Set<Person> set = new TreeSet<Person>();
		
		addElements(list);
		addElements(set);
			
		showElements(list);
		System.out.println();
		showElements(set);
	}
	private static void addElements(Collection<Person> col){
		col.add(new Person("Charlie"));
		col.add(new Person("Echo"));
		col.add(new Person("Alpha"));
		col.add(new Person("Bravo"));	
		col.add(new Person("Delta"));
		
	}
	private static void showElements(Collection<Person> col){
		for(Person element: col){
			System.out.println(element);
		}
	}
}
