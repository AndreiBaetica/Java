package com.AIS.Application1;


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

class Thing {
	public final static int LUCKY_NMBR=7;
	public String name;
	public static String description;
	public void showName(){
		System.out.println(description+": "+name);
	}
	public static void showInfo() {
		System.out.println(description);	
	}
	public static int count=0;
	public int id;
	public Thing(){
		id=count;
		count++;
	}
}
public class Application2 {

	public static void main(String[] args) {
		
		
		
		Robot sam = new Robot();
		sam.speak("speak");
		sam.jump(7);
		sam.move("West", 12.7);
	
		
		Thing.description = "I am a thing";
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NMBR);
		System.out.println(Thing.count);
		System.out.println(thing2.id);
		System.out.println(thing1.id);
		
	}

}
