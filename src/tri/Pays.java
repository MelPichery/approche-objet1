package tri;

public class Pays implements Comparable<Pays> {

	//attributs
	private String nom = null;
	private Integer nbreHabitants = 0;
	private Double pibParHabitant = null;
	
	public Pays() {
		
	}
	
	//constructeur
	public Pays(String nom, Integer nbreHabitants, Double pibParHabitant) {
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


	public Integer getNbreHabitants() {
		return nbreHabitants;
	}


	public void setNbreHabitants(Integer nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}


	public Double getPibParHabitant() {
		return pibParHabitant;
	}


	public void setPibParHabitant(Double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	//m�thode pour afficher les donn�es de la classe
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbreHabitants=" + nbreHabitants + ", pibParHabitant=" + pibParHabitant + "]\n";
	}

	//impl�mentation de l'interface comparable avec un tri sur le pib/habitant
	@Override
	public int compareTo(Pays o) {
		
		return this.pibParHabitant.compareTo(o.getPibParHabitant());
	}
	
	
	
}
