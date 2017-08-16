package demo1;

class Runner extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner();
		runner1.start();
		
	}

}
