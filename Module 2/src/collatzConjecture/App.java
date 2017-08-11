package collatzConjecture;

public class App {
	public static void main(String[] args){
		// TODO: create recursion
		int mn = 2;
		int mnd = mn;
		while (mnd!=1){
			if (mnd%2==0){
				mnd = mnd/2;
			}
			else{
				mnd = (3*mnd+1);
			}
		mn = mn+1;
		}
		
	}
}
