package waitAndNotify;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException{
		synchronized(this){
			System.out.println("Producer thread running.");
			wait();
			//waits to not consume resources, can only be called within synchronized code block
			System.out.println("Resumed.");
		}
	}
	public void consume() throws InterruptedException{
		Scanner scanner=new Scanner(System.in);
		Thread.sleep(2000);
		synchronized(this){
			System.out.println("Waiting for return key.");
			scanner.nextLine();
			System.out.println("Return key pressed");
			notify();
			//notifies one (the first) other thread that is locked to the lock object.
			
		}
	}
}
