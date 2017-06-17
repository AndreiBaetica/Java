package com.AIS.Application1;
class Person {
	String name;
	int age;
	void speak() {
		System.out.println("My name is " + name);
	}
	int calculateRetirement(){
		int yearsLeft = 65-age;
		return yearsLeft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}
class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height){
		System.out.println("Jumping: "+ height);
	}
	public void move(String direction, double distance){
		System.out.println("Moving "+ distance +" meters in direction " + direction);
	}
}
class Frog {
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Machine {
	private String name;
	public Machine() {
		System.out.println("Constructor running.");
		name = "Arnie";
	}
}
public class Application2 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 80;
		int years = person1.calculateRetirement();
		System.out.println("Years until retirement: " + years);
		int age = person1.getAge();
		String name = person1.getName();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		
		Robot sam = new Robot();
		sam.speak("speak");
		sam.jump(7);
		sam.move("West", 12.7);
	}

}
