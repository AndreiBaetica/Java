package writingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("WADFGHTRH");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
