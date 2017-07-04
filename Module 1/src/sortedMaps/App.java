package sortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
		
	}
	public static void testMap(Map<Integer, String> map){
		map.put(0, "Zero");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(5, "Five");
		map.put(4, "Four");
		
		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(key+": "+value);
		}
	}
}
