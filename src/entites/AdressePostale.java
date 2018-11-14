package entites;

public class AdressePostale {

	public int numrue = 0;
	public String rue="";
	public int codePostal = 0;
	public String ville ="";
	
	public void afficheAddresse() {
		
		System.out.println("Numéro de rue : "+numrue+"   rue : "+rue+"  code postal : "+codePostal+"   ville : "+ville);
		
	}
	
}
