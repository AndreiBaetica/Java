package hashmapping;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Five");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(1, "One");
		map.put(0, "Zero");
		
		String text = map.get(7);
		System.out.println(text);
		
		String text2 = map.get(0);
		System.out.println(text2);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+": "+value);
		}
		//note: Does not always maintain order
		for(int i=0; i<500; i++){
			for(Map.Entry<Integer, String> entry: map.entrySet()){
				int key = entry.getKey();
				String value = entry.getValue();
				
				System.out.println(key+": "+value);
				System.out.println();
				
			}
		}
	}

}
