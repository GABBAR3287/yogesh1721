
public class Teachingstaff extends staff
{
	private Integer numberofTeachinghours;
	

	public void calculateTeachinghours() 
	{
		// TODO Auto-generated method stub
		System.out.println("teaching staff");
	}
	
		public Teachingstaff()
		{
			super();
			numberofTeachinghours = 0;
		}

		public Integer getNumberofTeachinghours()
		{
			return numberofTeachinghours;
		}

		public void setNumberofTeachinghours(Integer numberofTeachinghours) 
		{
			this.numberofTeachinghours = numberofTeachinghours;
		}
		
		public void calculatesalary() 
		{
			System.out.println("Teaching salary is:");
		}
		
}