package com.AIS.Application1;
class Frogs {
	private int id;
	private String name;
	public Frogs(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}
public class Application4 {
	public static void main(String[] args) {
		Frogs frog1 = new Frogs(7, "Frank");
		
		System.out.println(frog1);
	}

}
