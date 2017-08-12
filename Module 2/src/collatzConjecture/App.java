package collatzConjecture;

public class App {
	public static void main(String[] args) {
		// TODO: create recursion
		int mn = 2;
		int mnd = mn;
		while (mn < 1000000000) {
			while (mnd != 1) {
				if (mnd % 2 == 0) {
					mnd = mnd / 2;
				} else {
					mnd = (3 * mnd + 1);
				}
				System.out.println(mn + " does not slove the conjencture.");
				mn = mn + 1;
				mnd = mn;
			}
		}
	}
}
