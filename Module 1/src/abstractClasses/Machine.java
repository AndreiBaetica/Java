package abstractClasses;

public abstract class Machine {
	private int ID;

	public int getId() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	public void run(){
		start();
		doStuff();
		shutdown();
	}

}
