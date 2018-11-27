package zoo;

public enum SexeEnum {
	
	FEMELLE("Femelle"),
	MALE("Male");
	
	private String name = "";

	private SexeEnum(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return name;
		
	}

}
