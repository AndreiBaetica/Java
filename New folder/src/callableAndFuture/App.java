package callableAndFuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newCachedThreadPool();
		Future <Integer> future = executor.submit(new Callable<Integer>() {
			//Future <?> future = executor.submit(new Callable<Void>() {
			// can do ^ to use other future methods when not returning anything (and instead of return x type return null)
			@Override
			public Integer call() throws Exception {

				Random random = new Random();
				int duration = random.nextInt(4000);
				
				if(duration>2000){
					throw new IOException("Timed out.");
				}
				
				System.out.println("Starting");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished");
				return duration;
			}

		});
		executor.shutdown();
		try {
			System.out.println("Result is: " + future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
