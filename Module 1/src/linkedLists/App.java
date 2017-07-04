package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	private static void doTimings(String type, List<Integer> list){
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++){
			list.add(0, i);
		}
		
		long stop = System.currentTimeMillis();
		
		System.out.println((stop-start) + " ms");
		
		
	}

}
