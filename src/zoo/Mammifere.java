package zoo;

public class Mammifere extends Animal{

	public Mammifere(String nom, String type, String regimeAlimentaire) {
		super(nom, type, regimeAlimentaire);
	}

	@Override
	public String toString() {
		return "Mammifere [nom=" + nom + ", type=" + type + ", regimeAlimentaire=" + regimeAlimentaire + "]\n";
	}
	
	
}
