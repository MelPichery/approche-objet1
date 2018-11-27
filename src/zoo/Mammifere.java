package zoo;


public class Mammifere extends Animal{

	

	public Mammifere(String nom, RaceEnum race, SexeEnum sexe, String numTatouage) {
		super(nom, race, sexe, numTatouage);
		
	}

	@Override
	public String toString() {
		return "Mammifere [nom=" + nom + ", race="
				+ race + ", sexe=" + sexe + ", numTatouage=" + numTatouage + ", animalAccouple=" + animalAccouple + "]";
	}

	
	
	
}
