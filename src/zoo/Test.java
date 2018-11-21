package zoo;

public class Test {

	public static void main(String[] args) {
		
		
		 Zoo zoo = new Zoo();
		 Zoo.addAnimalToZone(new Mammifere("cymba","lion", Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Mammifere("lion2","lion",Animal.ALIMENT_CARNIVORE));
		 System.out.println(zoo.toString());

	}

}
