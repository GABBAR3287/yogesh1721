
public abstract class staff {
	private String name;

	public abstract void calculatesalary();
	
	public staff() {
			name = "";
	}
	
	public staff(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}