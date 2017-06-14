package com.AIS.Application2;

public class Application {

	public static void main(String[] args) {
		System.out.println("I have no idea what I'm doing.");
		int nmbr;
		short shortNmbr;
		long longNmbr;
		double doubleNmbr;
		float floatNmbr;
		nmbr=1;
		char chr='y';
		boolean bo=true;
		byte byt=123;
		boolean runThis=true; //global scope
		
		System.out.println(byt);
		
		String txt="<text goes here>";
		while( nmbr==1) {
			System.out.println("<Loop contents go here.>");
			nmbr=27;
//			boolean runThis=true; //variable with local scope
		}

		
		System.out.println();
		System.out.println("Spacing:");
		if (runThis) {
			System.out.println("It ran!");
		} else {
			System.out.println("It didn't run!");
		}
		System.out.println();
		System.out.println();
		
		for (int i=0; i<5; i++) {
			System.out.printf("The value of i is %d", i);
		}
		
		if( nmbr>20 ) {
			System.out.println("true");
		}
		
		else if( nmbr>20 ) {
			System.out.println("false");
		}
		
		System.out.println("test");
	}

}
