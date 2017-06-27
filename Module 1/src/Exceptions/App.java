package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// test.txt does not exist
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);

	}

}
