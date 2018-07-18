package pojo;

public class Referee {

	//declaration of the variables
	private Integer refreeId;
	private String r_fName;
	private String r_lname;
	private String r_dob;
	private String r_doj;
	private String r_graduation;
	private String r_phNo;
	
	
	//default constructor
	public Referee() {
		super();
		refreeId = 0;
		r_fName = "";
		r_lname = "";
		r_dob = "";
		r_doj = "";
		r_graduation = "";
		r_phNo = "";
	}
	
	//constructor with parameters
	public Referee(Integer refreeId, String r_fName, String r_lname, String r_dob, String r_doj, String r_graduation,
			String r_phNo) {
		super();
		this.refreeId = refreeId;
		this.r_fName = r_fName;
		this.r_lname = r_lname;
		this.r_dob = r_dob;
		this.r_doj = r_doj;
		this.r_graduation = r_graduation;
		this.r_phNo = r_phNo;
	}
	
	
	public Integer getRefreeId() {
		return refreeId;
	}
	public void setRefreeId(Integer refreeId) {
		this.refreeId = refreeId;
	}
	public String getR_fName() {
		return r_fName;
	}
	public void setR_fName(String r_fName) {
		this.r_fName = r_fName;
	}
	public String getR_lname() {
		return r_lname;
	}
	public void setR_lname(String r_lname) {
		this.r_lname = r_lname;
	}
	public String getR_dob() {
		return r_dob;
	}
	public void setR_dob(String r_dob) {
		this.r_dob = r_dob;
	}
	public String getR_doj() {
		return r_doj;
	}
	public void setR_doj(String r_doj) {
		this.r_doj = r_doj;
	}
	public String getR_graduation() {
		return r_graduation;
	}
	public void setR_graduation(String r_graduation) {
		this.r_graduation = r_graduation;
	}
	public String getR_phNo() {
		return r_phNo;
	}
	public void setR_phNo(String r_phNo) {
		this.r_phNo = r_phNo;
	}
}