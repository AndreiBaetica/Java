package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class LabExercise6 {
	
	public static void calculateAverage(double[] notes){
		
		double total = 0;
		for(int i=0; i<notes.length; i++){
			total+=notes[i];
		}
		System.out.println("Average is: " + total/notes.length);
	}
	
	public static void calculateMedian(double[] notes){
		
		Arrays.sort(notes);
		if(notes.length%2==0){
			double lowerMidIdx = notes.length/2;

			System.out.println("Median is: " + ((notes[(int) lowerMidIdx]+notes[(int) (lowerMidIdx+1)])/2));
		}
		else{
			System.out.println("Median isL "+ notes[(int) Math.ceil(notes.length/2)]);
		}
	}
	
	public static void calculateNumberFailed(double[] notes){
		int count = 0;
		for(int i=0; i<notes.length; i++){
			if(notes[i]>50){
				count++;
			}
		}
		System.out.println("Number failed: " + count);
	}
	
	public static void calculateNumberPassed(double[] notes){
		int count = 0;
		for(int i=0; i<notes.length; i++){
			if(notes[i]<50){
				count++;
			}
		}
		System.out.println("Number passed: " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double[] grades = new double[10];
		
		System.out.println("Enter first grade: ");
		String s0 = scanner.nextLine();
		double d0 = Double.parseDouble(s0);
		grades[0] = d0;
		
		System.out.println("Enter second grade: ");
		String s1 = scanner.nextLine();
		double d1 = Double.parseDouble(s1);
		grades[1] = d1;
		
		System.out.println("Enter third grade: ");
		String s2 = scanner.nextLine();
		double d2 = Double.parseDouble(s2);
		grades[2] = d2;
		
		System.out.println("Enter fourth grade: ");
		String s3 = scanner.nextLine();
		double d3 = Double.parseDouble(s3);
		grades[3] = d3;
		
		System.out.println("Enter fifth grade: ");
		String s4 = scanner.nextLine();
		double d4 = Double.parseDouble(s4);
		grades[4] = d4;
		
		System.out.println("Enter sixth grade: ");
		String s5 = scanner.nextLine();
		double d5 = Double.parseDouble(s5);
		grades[5] = d5;
		
		System.out.println("Enter seventh grade: ");
		String s6 = scanner.nextLine();
		double d6 = Double.parseDouble(s6);
		grades[6] = d6;
		
		System.out.println("Enter eighth grade: ");
		String s7 = scanner.nextLine();
		double d7 = Double.parseDouble(s7);
		grades[7] = d7;
		
		System.out.println("Enter ninth grade: ");
		String s8 = scanner.nextLine();
		double d8 = Double.parseDouble(s8);
		grades[8] = d8;
		
		System.out.println("Enter tenth grade: ");
		String s9 = scanner.nextLine();
		double d9 = Double.parseDouble(s9);
		grades[9] = d9;
		
		scanner.close();
		
		LabExercise6.calculateAverage(grades);
		LabExercise6.calculateMedian(grades);
		LabExercise6.calculateNumberFailed(grades);
		LabExercise6.calculateNumberPassed(grades);
	}

}
