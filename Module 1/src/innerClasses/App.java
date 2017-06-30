package innerClasses;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		robot.start();
		
		//Only works if inner class is not private.
		Robot.Brain brain = robot.new Brain();
		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
