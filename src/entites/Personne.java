package entites;

public class Personne {

	public String nom = "";
	public String prenom ="";
	public AdressePostale adressePostale = null;
	
	
	public void affichePersonne() {
		
		System.out.print("Nom : "+nom+"   Prénom : "+prenom+"   Adresse : ");
		adressePostale.afficheAdresseSimple();
	}
	
}
