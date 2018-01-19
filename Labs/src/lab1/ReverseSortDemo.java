package lab1;
import java.util.*;

public class ReverseSortDemo {
	
	static void reverseSort(char[] array){
		//sorts an array in reverse order
		
		Arrays.sort(array);
		for(int i=0; i<array.length/2; i++){
			char temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b','m','z','a','u'};
		reverseSort(unorderedLetters);
		for(int i=0; i<unorderedLetters.length; i++){
			System.out.println(unorderedLetters[i]);
		}
	}

}
