package semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection.getInstance().connect();
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0; i<200;i++){
			executor.submit(new Runnable(){
				public void run(){
					Connection.getInstance().connect();
				}
			});
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
