package entites;

public class AdressePostale {

	public int numrue = 0;
	public String rue="";
	public int codePostal = 0;
	public String ville ="";
	
	public AdressePostale() {
		
		
		
	}
	
	
	public AdressePostale(int numrue, String rue, int codePostal, String ville) {
		
		this.numrue = numrue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville ;
		
	}
	
	public void afficheAdresseComplete() {
		
		System.out.println("Numéro de rue : "+numrue+"   rue : "+rue+"  code postal : "+codePostal+"   ville : "+ville);
		
	}
	
	public void afficheAdresseSimple() {
		
		System.out.println(numrue+"  "+rue+"  "+codePostal+" "+ville);
		
	}
		
	
}
