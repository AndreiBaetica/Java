package abstractClasses;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doStuff() {
		System.out.println("Car running.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shutdown() {
		System.out.println("Car stopped.");
		// TODO Auto-generated method stub
		
	}

}
