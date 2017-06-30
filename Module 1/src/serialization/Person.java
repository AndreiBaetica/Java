package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6396282624672191696L;
	private int ID;
	private String name;
	public Person(int ID, String name){
		this.ID=ID;
		this.name=name;
	}
	@Override
	public String toString(){
		return "Person [ID = "+ID+", name = "+name+"]";
	}
}
