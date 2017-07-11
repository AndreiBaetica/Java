package lambda;
interface Executable{
	int execute();
}

class Runner {
	public void run(Executable e){
		System.out.println("Executing code block...");
		int value = e.execute();
		System.out.println("Return value: "+value);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
		runner.run((new Executable(){
			public int execute(){
				System.out.println("Hello there");
				return 7;
			}
		}));
		
		System.out.println("===================");
		
		runner.run(() -> {
			System.out.println("Lambda expression code");
			System.out.println("Hello there");
			return 8;
		});

	}

}
