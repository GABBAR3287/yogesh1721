package pojo;

public class player {
	/*
	 * STRUCTURE:
	 * 
	 * * first declare all the variables
	 * * all the methods except getters & setters
	 * * Constructors
	 * * getters and setters
	*/
	
	
	//declaration of the variables
	private Integer playerId;
	private String fname;
	private String lname;
	private String position;
	private Integer mobNo;
	private Integer teamId;
	private Integer age;

	//methods
	public void kick() {
		System.out.println("kick.................");
	}
	
	//default constructor
	public player() {
		playerId = 0;
		fname = "";
		lname = "";
		position = "";
		mobNo = 0;
		teamId = 0;
		age = 0;
	}
	
	//constructor with parameters
	public player(Integer playerId, String fname, String lname, String position, Integer mobNo, Integer teamId, Integer age) {
		this.playerId = playerId;
		this.fname = fname;
		this.lname = lname;
		this.position = position;
		this.mobNo = mobNo;
		this.teamId = teamId;
		this.age = age;
	}

	//getter and setter for playerId
	public Integer getplayerId() {
		return playerId;
	}
	public void setplayerId(Integer playerId) {
		this.playerId = playerId;
	}
	
	//getter and setter for playerFirstNAme
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	//getter and setter for playerLastName
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	//getter and setter for playerPosition
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	//getter and setter for playerMobNo
	public Integer getMobNo() {
		return mobNo;
	}
	public void setMobNo(Integer mobNo) {
		this.mobNo = mobNo;
	}

	//getter and setter for TeamId
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	//getter and setter for playerAge
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
