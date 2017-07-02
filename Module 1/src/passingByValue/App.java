package passingByValue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		int value = 7;
		System.out.println("1. Value is: "+value);
		app.show(value);
		System.out.println("4. Value is: "+value);
	}
	
	public void show(int value){
		System.out.println("2. Value is: "+value);
		value=8;
		System.out.println("3. Value is: "+value);
	}
}
