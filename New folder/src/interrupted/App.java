package interrupted;

import java.util.Random;

public class App {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Started");
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				Random ran = new Random();
				for (int i=0;i<1E8;i++){
					/*
					if(Thread.currentThread().isInterrupted()){
						System.out.println("Interrupted.");
						break;
					}
					*/
					try{
						Thread.sleep(1);
					} catch(InterruptedException e){
						System.out.println("Interrupted.");
						break;
					}
					//sleep picks up interrupted automatically
					Math.sin(ran.nextDouble());
				}
			}
		});
		t1.start();
		Thread.sleep(500);
		t1.interrupt();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished");
	}

}
