package zoo;

public class Poisson extends Animal {

	public Poisson(String nom, String type, String regimeAlimentaire) {
		super(nom, type, regimeAlimentaire);

	}

	@Override
	public String toString() {
		return "Poisson [nom=" + nom + ", type=" + type + ", regimeAlimentaire=" + regimeAlimentaire + "]\n";
	}

}
