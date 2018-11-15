package entites;

public class Personne {

	public String nom = "";
	public String prenom ="";
	public AdressePostale adressePostale = null;
	public int anneeNaissance = 0;
	
	public Personne() {}
	
	public Personne(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom ;
		
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		
		this.nom = nom;
		this.prenom = prenom ;
		this.adressePostale = adressePostale;
		
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale, int anneeNaissance) {
		
		this.nom = nom;
		this.prenom = prenom ;
		this.adressePostale = adressePostale;
		this.anneeNaissance = anneeNaissance ;
		
	}
	

	public void setNom(String nom) {

		this.nom = nom ;
		
	}
	
	public String getNom() {
		
		return this.nom;
	}
	
	public void setPrenom(String prenom) {
		
		this.prenom = prenom ;
		
	}
	
	public String getPrenom() {
		
		return this.prenom;
	}
	
	public void setAdresse(AdressePostale adressePostale) {
		
		this.adressePostale = adressePostale ;
		
	}
	
	public AdressePostale getAdresse() {
		
		return this.adressePostale;
	}
	
	
	public void setAnneeNaissance(int anneeNaissance) {
		
		this.anneeNaissance = anneeNaissance ;
		
	}
	
	public int getAnneeNaissance() {
		
		return this.anneeNaissance;
	}
	
	
	public int getAge() {
		
		int age = 0;
		
		age = 2018 - anneeNaissance;
		
		return age;
				
	}
	
	public void affichePersonne() {
		
		System.out.print("Nom : "+nom+"   Prénom : "+prenom+"   Adresse : ");
		adressePostale.afficheAdresseSimple();
	}
	

	public String toString() {
		
		return nom.toUpperCase()+"  "+prenom.toUpperCase();
	}
	
}
