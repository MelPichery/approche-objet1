package zoo;

public enum RaceEnum {

	LION("Lion"),
	GIRAFE("Girafe"),
	REQUIN("Requin"),
	GORILLE("Gorille"),
	OURS("Ours");
	
	private String name = "";

	private RaceEnum(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return name;
		
	}
}
