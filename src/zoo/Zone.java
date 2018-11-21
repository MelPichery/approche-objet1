package zoo;

import java.util.Arrays;

public class Zone {

	private String nom = null;
	private Animal[] animaux = null;
		
	public Zone(String nom) {
		super();
		this.nom = nom;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Animal[] getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}
	
	public void addAnimal(Animal animal) {
		
		if(animaux != null) {
		
			Animal[] newAnimaux = new Animal[animaux.length + 1];
			 
			for (int i = 0; i < animaux.length; i++) {
				newAnimaux[i] = animaux[i] ;
			}
			
			 
			 
			 newAnimaux[newAnimaux.length - 1] = animal;
			 
			 animaux = new Animal[newAnimaux.length];
			
			 for (int i = 0; i < newAnimaux.length; i++) {
				 animaux[i] = newAnimaux[i];
			}
			 
			
			 
			 //animaux[animaux.length - 1] = animal ;
			
		}else{
					
			animaux = new Animal[1];
			
			animaux[0] = animal;
		}
		

	}



	@Override
	public String toString() {
		return "Zone [Nom=" + nom + ", animaux=" + Arrays.toString(animaux) + "]\n";
	}
	
	
}
