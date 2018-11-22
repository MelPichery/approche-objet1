package zoo;

public class Test {

	public static void main(String[] args) {
		
		
		 Zoo zoo = new Zoo();
		 Zoo.addAnimalToZone(new Mammifere("cymba","lion", Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Mammifere("lion2","lion",Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Mammifere("gazelle","gazelle",Animal.ALIMENT_HERBIVORE));
		 Zoo.addAnimalToZone(new Mammifere("antilope","antilope",Animal.ALIMENT_HERBIVORE));
		 Zoo.addAnimalToZone(new Poisson("requin","requin",Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Reptile("serpent","serpent", Animal.ALIMENT_OMNIVORE));
		 System.out.println(zoo.toString());

	}

}
