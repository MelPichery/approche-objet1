package zoo;

public class Zoo {

	private String nom;
	private Zone[] zones;
	
	public Zoo(String nom, Zone[] zones) {
		super();
		this.nom = nom;
		this.zones = zones;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public Zone[] getZones() {
		return zones;
	}

	public void setZones(Zone[] zones) {
		this.zones = zones;
	}
	
	
	
}
