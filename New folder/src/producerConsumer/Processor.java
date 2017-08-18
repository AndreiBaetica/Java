package producerConsumer;

import java.util.LinkedList;

public class Processor {
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;

		while (true) {
			synchronized (lock) {
				while (list.size() == LIMIT) {
					list.add(value++);
					lock.notify();
					//note: use notifyAll if more than one thread waiting
				}
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (lock) {
				while(list.size()==0){
					lock.wait();
				}
				System.out.println("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("Value is: " + value);
				lock.notify();
			}
		}
	}
}
