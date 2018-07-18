
public class NonTeachingstaff extends staff {
	private Integer numberofAdminLeaves;
	
	public NonTeachingstaff() {
		super();
		numberofAdminLeaves = 0;
	}

	public Integer getNumberofAdminLeaves() {
		return numberofAdminLeaves;
	}

	public void setNumberofAdminLeaves(Integer numberofAdminLeaves) {
		this.numberofAdminLeaves = numberofAdminLeaves;
	}
	
	public void calculatesalary() 
	{
		System.out.println("NonTeaching salary is:");
	}

}