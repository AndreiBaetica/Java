package lab1;

public class FizzBuzz {
	
	static void fizzBuzz(int max){
		//iterates through numbers i-max.
		//if divisible by 3, prints Fizz
		//if divisible by 5, prints Buzz
		//if divisible by 15, prints FizzBuzz
		
		for(int i=1; i<=max; i++){
			if(i%15==0){
				System.out.println(i+": FizzBuzz");
			}
			else if(i%5==0){
				System.out.println(i+": Buzz");
			}
			else if(i%3==0){
				System.out.println(i+": Fizz");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz.fizzBuzz(30);
	}

}
