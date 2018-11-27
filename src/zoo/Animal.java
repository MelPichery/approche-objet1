package zoo;
/**
 * 
 * @author Mélanie Pichery
 *
 */

public abstract class Animal {
	/**
	 * Attributs de la classe
	 */
	protected String nom = null;
	protected String type = null;
	protected String regimeAlimentaire = null;
	protected RaceEnum race = null;
	protected SexeEnum sexe = null;
	protected String numTatouage = null;
	protected Animal animalAccouple = null;

	/**
	 * Constantes pour le régime alimentaires	
	 */
	public static final String ALIMENT_CARNIVORE = "Carnivore";
	public static final String ALIMENT_HERBIVORE = "Herbivore";
	public static final String ALIMENT_OMNIVORE = "Omnivore";
	
	
	/**
	 * 
	 * @param nom nom de l'animal
	 * @param type type de l'animal
	 * @param regimeAlimentaire regime alimentaire de l'animal
	 */
	public Animal(String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom;
		this.type = type;
		this.regimeAlimentaire = regimeAlimentaire;
	}


	/**
	 * 
	 * @param nom nom de l'animal
	 * @param race race de l'animal
	 * @param sexe sexe de l'animal
	 * @param numTatouage numéro de tatouage de l'animal
	 */
	public Animal(String nom, RaceEnum race, SexeEnum sexe, String numTatouage) {
		super();
		this.nom = nom;
		this.race = race;
		this.sexe = sexe;
		this.numTatouage = numTatouage;
		this.animalAccouple = null;
	}

	/**
	 * 
	 * les getters et setters des attributs
	 */

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
	
	
	
	public RaceEnum getRace() {
		return race;
	}


	public void setRace(RaceEnum race) {
		this.race = race;
	}


	public SexeEnum getSexe() {
		return sexe;
	}


	public void setSexe(SexeEnum sexe) {
		this.sexe = sexe;
	}


	public String getNumTatouage() {
		return numTatouage;
	}


	public void setNumTatouage(String numTatouage) {
		this.numTatouage = numTatouage;
	}

	
	

	public Animal getAnimalAccouple() {
		return animalAccouple;
	}


	/**
	 * 
	 * @param animalAccouple enregistrement de l'animal si c'est une femelle de même race 
	 */
	public void setAnimalAccouple(Animal animalAccouple) {
		
		if (this.sexe == SexeEnum.MALE && animalAccouple.getSexe() == SexeEnum.FEMELLE && animalAccouple.getRace() == this.race) {
			
			this.animalAccouple = animalAccouple;
			
		}else {
			
			System.out.println("Vous ne pouvez pas enregistrer cet animal pour l'accouplement");
			
		}
		
		
	}

	/**
	 * affichage d'un animal
	 */

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", regimeAlimentaire=" + regimeAlimentaire + "]";
	}

	
}
