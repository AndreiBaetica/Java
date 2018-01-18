package blockingQueues;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//threadsafe, no need to worry about thread sync

public class App {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				producer();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				consumer();
			}
		});
		t1.start();
		t2.start();
	}
	private static void producer(){
		Random random = new Random();
		while(true){
			try {
				queue.put(random.nextInt(100));
				//if queue is full put method will wait until there is an empty slot
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void consumer(){
		Random random = new Random();
		
		while(true){
			try {
				Thread.sleep(100);
				if(random.nextInt(10)==0){
					Integer value = queue.take();
					//if queue is empty take method will wait until there is something in it
					System.out.println("Taken value: "+value+"; Queue size is: "+queue.size());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
