 package com.AIS.Application1;

public class Application5 {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();
		
		Car car1=new Car();
		car1.start();
		car1.wipeWindShield();
		car1.stop();

		Person person = new Person("Bob");
		person.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		outputInfo(mach1);
		
	}
	private static void outputInfo(Info info){
		info.showInfo();
	}

}
