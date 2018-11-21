package zoo;

public abstract class Animal {

	protected String nom = null;
	protected String type = null;
	protected String regimeAlimentaire = null;
		
	public static final String ALIMENT_CARNIVORE = "Carnivore";
	public static final String ALIMENT_HERBIVORE = "Herbivore";
	public static final String ALIMENT_OMNIVORE = "Omnivore";
	
	
	public Animal(String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom;
		this.type = type;
		this.regimeAlimentaire = regimeAlimentaire;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
		

	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}


	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", regimeAlimentaire=" + regimeAlimentaire + "]";
	}

	
}
