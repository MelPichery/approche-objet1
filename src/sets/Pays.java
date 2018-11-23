package sets;

public class Pays {

	//attributs
	private String nom = null;
	private int nbreHabitants = 0;
	private Double pibParHabitant = null;
	
	//constructeur
	public Pays(String nom, int nbreHabitants, Double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbreHabitants = nbreHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	//getters et setters
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbreHabitants() {
		return nbreHabitants;
	}


	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}


	public Double getPibParHabitant() {
		return pibParHabitant;
	}


	public void setPibParHabitant(Double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	//méthode pour afficher les données de la classe
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbreHabitants=" + nbreHabitants + ", pibParHabitant=" + pibParHabitant + "]\n";
	}
	
	
	
}
