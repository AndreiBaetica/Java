package enumTypes;

public class App {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = Animal.CAT;
		switch(animal){
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;

		}
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.MOUSE.getName());
		System.out.println(Animal.DOG.toString());
		System.out.println("Enum as a string: "+Animal.DOG.name());
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);

	}

}
