
public class Patient {
	
	private String name;
	
	public Patient(String pName) {
		name = pName;
		
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	

}
