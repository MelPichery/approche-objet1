package zoo;

public class Animal {

	private String nom;
	private String type;
	private Zone zone;
	
	
	public Animal(String nom, String type) {

		this.nom = nom;
		this.type = type;
		
	}

	

	public Animal(String nom, String type, Zone zone) {
		super();
		this.nom = nom;
		this.type = type;
		this.zone = zone;
	}



	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
		
	public Zone getZone() {
		return zone;
	}


	public void setZone(Zone zone) {
		this.zone = zone;
	}

	
}
