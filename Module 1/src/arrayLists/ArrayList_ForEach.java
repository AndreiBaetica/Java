package arrayLists;

import java.util.ArrayList;

public class ArrayList_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (i != 10000) {
			list.add(i);
			i++;
		}
		long startTime1 = System.currentTimeMillis();
		int result1=0;
		for (Integer object : list) {
			result1+=object;}
		System.out.println(result1);
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-startTime1);
		System.out.println();
		
		list.forEach((object) -> System.out.print(object));
		
		System.out.println();
		
		list.forEach(System.out::print);
		
	}
}
