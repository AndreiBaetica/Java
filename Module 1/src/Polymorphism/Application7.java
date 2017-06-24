package Polymorphism;

public class Application7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		Tree tree = new Tree();
		Plant plant2 = tree;
		plant2.grow();
		doGrow(tree);
		
		Plant plantList[] = new Plant[2];
		plantList[0]=plant;
		plantList[1]=tree;
		
		System.out.println();
		
		//polymorphic array
		for(int x=0;x<2;x++){
			plantList[x].grow();
		}
		
	}
	public static void doGrow(Plant plant){
		plant.grow();
	}
}
