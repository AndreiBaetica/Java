package innerClasses;

public class Robot {
	private int ID;
	
	class Brain {
		public void think() {
			System.out.println("Robot " + ID + " is thinking...");
		}
	}
	static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int iD) {
		ID = iD;
	}
	public void start(){
		System.out.println("Starting robot "+ID+".");
		Brain brain = new Brain();
		brain.think();
		
		class Temp {
			public void doTheThing(){
				System.out.println("ID is " + ID);
			}
		}
		Temp temp = new Temp();
		temp.doTheThing();
	}

}
