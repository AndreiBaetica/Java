package AnonymousClasses;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Machine {
	public void start(){
		System.out.println("Starting machine...");
	}
}
interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine(){
			@Override public void start(){
				System.out.println("Camera snapping...");
			}
		};
		machine1.start();
		Plant plant1 = new Plant(){

			@Override
			public void grow() {
				System.out.println("Plant growing...");
				// TODO Auto-generated method stub
				
			}
		};
		plant1.grow();
		
		
		
		String fileName = "C:/Users/Admin/Desktop/LocalRepos/Java/Example.txt";
		File textFile = new File(fileName);
		Scanner in = new Scanner(textFile);
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
		}
		in.close();
		}
	}


	
