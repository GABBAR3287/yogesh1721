package pojo;

public class ground {
	//declaration of the variables
	private Integer groundId;
	private String gName;
	private String address;
	private Integer glength;
	private Integer gbreath;
	private Integer gCapacity;
	
	//default constructor
	public ground() {
		groundId =0;
		gName="";
		address="";
		glength=0;
		gbreath=0;
		gCapacity=0;
	}
	
	//constructor with parameters
	public ground(Integer groundId, String gName, String address, Integer glength, Integer gbreath, Integer gCapacity) {
		super();
		this.groundId = groundId;
		this.gName = gName;
		this.address = address;
		this.glength = glength;
		this.gbreath = gbreath;
		this.gCapacity = gCapacity;
	}



	//getter and setter for groundId
	public Integer getgroundId() {
		return groundId;
	}
	public void setgroundId(Integer groundId) {
		this.groundId = groundId;
	}
	
	
	//getter and setter for groundName
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	
	
	//getter and setter for groundAddress
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//getter and setter for groundLength
	public Integer getGlength() {
		return glength;
	}
	public void setGlength(Integer glength) {
		this.glength = glength;
	}
	
	
	//getter and setter for groundBreath
	public Integer getGbreath() {
		return gbreath;
	}
	public void setGbreath(Integer gbreath) {
		this.gbreath = gbreath;
	}
	
	//getter and setter for groundCapacity
	public Integer getgCapacity() {
		return gCapacity;
	}
	public void setgCapacity(Integer gCapacity) {
		this.gCapacity = gCapacity;
	}
}