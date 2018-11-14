package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		
		personne1.nom = "Dupond";
		personne1.prenom = "Jeanne";
		personne1.adressePostale = new AdressePostale(9, "rue de la rue",44000,"Nantes");

		personne1.affichePersonne();
		
		
		Personne personne2 = new Personne();
		
		personne2.nom = "Eastwood";
		personne2.prenom = "Flint";
		personne2.adressePostale = new AdressePostale(423, "rue du Michigan",44000,"New York");

		personne2.affichePersonne();
	}

}
