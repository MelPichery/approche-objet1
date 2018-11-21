package zoo;

public class Reptile extends Animal {

	public Reptile(String nom, String type, String regimeAlimentaire) {
		super(nom, type, regimeAlimentaire);
	}

	@Override
	public String toString() {
		return "Reptile [nom=" + nom + ", type=" + type + ", regimeAlimentaire=" + regimeAlimentaire + "]\n";
	}
	
	
}
