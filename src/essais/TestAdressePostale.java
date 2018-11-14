package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale();
		
		adresse1.numrue = 3;
		adresse1.rue = "rue des bars";
		adresse1.codePostal = 34070;
		adresse1.ville = "Montpellier";
		
		
		AdressePostale adresse2 = new AdressePostale();
		
		adresse2.numrue = 36;
		adresse2.rue = "quai des orfèvres";
		adresse2.codePostal = 75000;
		adresse2.ville = "Paris";
		
		adresse1.afficheAddresse();
		adresse2.afficheAddresse();
	}

}
