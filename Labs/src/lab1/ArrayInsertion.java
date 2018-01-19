package lab1;

public class ArrayInsertion {
	
	static int[] arrayInsertion(int[] array1, int idx, int value){
		//inserts an int into an array
		//returns new array
		
		int[] array2 = new int[(array1.length)+1];
		
		array2[idx] = value;
		for(int i=0; i<array2.length; i++){
			if(i<idx){
				array2[i] = array1[i];
			}
			if(i>idx){
				array2[i] = array1[i-1];
			}
		}
		
		return array2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,4,7,9,6};
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		System.out.println('\n');
		
		array = ArrayInsertion.arrayInsertion(array, 3, 15);
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}

}
