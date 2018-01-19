package lab1;

public class CreateArray {
	
	static int[] createArray(int size){
		//creates an array of length size
		//array[i]==i*i
		
		int[] array = new int[size];
		for(int i=0; i<size; i++){
			array[i]=i*i;
		}
		return array;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = CreateArray.createArray(13);
		
		for(int i=0; i<array.length; i++){
			System.out.println("The square of "+i+" is: "+array[i]);
		}
	}

}
