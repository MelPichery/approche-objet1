package zoo;

public class Test {

	public static void main(String[] args) {
		
		//Test de l'enregistrement d'un animal accouplé
		Mammifere m = new Mammifere("lion", RaceEnum.LION, SexeEnum.MALE, "1234");
		Mammifere m2 = new Mammifere("Lionne",RaceEnum.LION,SexeEnum.FEMELLE,"5678");
		
		m.setAnimalAccouple(m2);
		
		m2.setAnimalAccouple(m);
		
		//Affichage des animaux
		System.out.println(m.toString());
		System.out.println(m2.toString());
		
		
		/* Zoo zoo = new Zoo();
		 Zoo.addAnimalToZone(new Mammifere("cymba","lion", Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Mammifere("lion2","lion",Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Mammifere("gazelle","gazelle",Animal.ALIMENT_HERBIVORE));
		 Zoo.addAnimalToZone(new Mammifere("antilope","antilope",Animal.ALIMENT_HERBIVORE));
		 Zoo.addAnimalToZone(new Poisson("requin","requin",Animal.ALIMENT_CARNIVORE));
		 Zoo.addAnimalToZone(new Reptile("serpent","serpent", Animal.ALIMENT_OMNIVORE));
		 System.out.println(zoo.toString());*/

	}

}
