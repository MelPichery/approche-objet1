package zoo;

import java.util.Arrays;

public class Zoo {

	
	private static Zone[] zones= new Zone[4];
	
	public static final int INDICE_ZONE_CARNIVORE = 0;
	public static final int INDICE_SAVANE_AFRICAINE = 1;
	public static final int INDICE_FERME_REPTILE = 2;
	public static final int INDICE_AQUARIUM = 3 ;
	
	
	public Zoo() {
		super();

		zones[INDICE_ZONE_CARNIVORE] = new Zone("Carnivore");
		zones[INDICE_SAVANE_AFRICAINE] = new Zone("Savane Africaine");
		zones[INDICE_FERME_REPTILE] = new Zone("Ferme Reptile");
		zones[INDICE_AQUARIUM] = new Zone("Aquarium");
	}


	public Zone[] getZones() {
		return zones;
	}

	public void setZones(Zone[] zones) {
		this.zones = zones;
	}
	
	public static void addAnimalToZone(Animal animal) {
		
		if (animal instanceof Mammifere ) {
			
			if(animal.getRegimeAlimentaire().equals(Animal.ALIMENT_CARNIVORE)) {
	
				zones[INDICE_ZONE_CARNIVORE].addAnimal(animal);
				
			}
			
			if (animal.getRegimeAlimentaire().equals(Animal.ALIMENT_HERBIVORE)) {
				
				zones[INDICE_SAVANE_AFRICAINE].addAnimal(animal);
				
			}
			

		}
		
		if (animal instanceof Reptile) {
			
			zones[INDICE_FERME_REPTILE].addAnimal(animal);
		}
		
		if (animal instanceof Poisson) {
			
			zones[INDICE_AQUARIUM].addAnimal(animal);
			
		}
		
		
	}


	@Override
	public String toString() {
		return "Zoo [" + Arrays.toString(zones) +"\n"+ "]";
	}
	
	
}
