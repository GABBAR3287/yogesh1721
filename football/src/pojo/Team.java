package pojo;

public class Team {

	//declaration of the variables
	private Integer teamId;
	private String tName;
	private Integer tStrength;
	
	//default constructor 
	public Team() {
		super();
		teamId = 0;
		tName = "";
		tStrength = 0;
	}
	
	//constructor with parameters
	public Team(Integer teamId, String tName, Integer tStrength) {
		super();
		this.teamId = teamId;
		this.tName = tName;
		this.tStrength = tStrength;
	}
	
	//getter and setter for TeamId
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	
	//getter and setter for teamName
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
	//getter and setter for teamStrength
	public Integer gettStrength() {
		return tStrength;
	}
	public void settStrength(Integer tStrength) {
		this.tStrength = tStrength;
	}
}
