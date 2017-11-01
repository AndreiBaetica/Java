package arrayLists;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayList_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (i < 10001) {
			list.add(i);
			i++;
		}
		long startTime = System.currentTimeMillis();
		i=0;
		while(i<1001){
			list.remove(0);
			list.add(i, (i+5));
			i++;
		}
		long result=0;
		for (Integer object : list) {
			result+=object;}
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime-startTime;
		System.out.println(elapsedTime);
		System.out.println();
		
		startTime = System.currentTimeMillis();
		result=0;
		result = list.stream().mapToInt(f -> f.intValue()).sum();
		System.out.println(result);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime-startTime;
		System.out.println(elapsedTime);
		System.out.println();
		
		
		
		list.forEach((object) -> System.out.println(((IntStream) list).sum()));
		
		
	}
}
