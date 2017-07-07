package queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		try{
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Too many items in queue.");
		}
		for (Integer value: q1){
			System.out.println("Queue value: " +value);
		}
		System.out.println("Element removed: "+ q1.remove());
		System.out.println("Element removed: "+ q1.remove());
		System.out.println("Element removed: "+ q1.remove());
		
		try{
			System.out.println("Element removed: "+ q1.remove());
		} catch(NoSuchElementException e){
			System.out.println("Tried to remove too many elements from queue");
		}
		q1.offer(10);
		q1.offer(30);
		q1.offer(20);
		if(q1.offer(50)==false)
			System.out.println("Cannot add item.");
		
	}

}
