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
		
		Personne personne3 = new Personne("Micheline", "Micheline");
		personne3.setNom("Nom");
		System.out.println(personne3.toString());
		
		System.out.println(personne1.getNom());
		
		personne1.getAdresse().afficheAdresseSimple();
		
		Personne personne4 = new Personne("Jean","Jeanne");
		personne4.setAdresse(new AdressePostale(1,"rue",44,"ville"));
		personne4.affichePersonne();
		
		Personne personne5 = new Personne("Camille","Camille", new AdressePostale(2,"rue de la ruse",90,"ville2"),1979);
		System.out.println(personne5.getAge());
		personne5.setAnneeNaissance(1985);
		System.out.println(personne5.getAge());
	}

}
