package zoo;

public class Zone {

	private String Nom;
	private Animal[] animaux;
		
	
	public Zone(String nom, Animal[] animaux) {
		super();
		Nom = nom;
		this.animaux = animaux;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}
	
	public Animal[] getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}
	
	
}
