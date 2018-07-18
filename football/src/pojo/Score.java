package pojo;

public class Score {
	//declaration of the variables
	private Integer scoreId;
	private Integer gameId;
	private Integer gameScore;
	
	//default constructor
	public Score() {
		super();
		scoreId = 0;
		gameId = 0;
		gameScore = 0;
	}
	
	//constructor with parameters
	public Score(Integer scoreId, Integer gameId, Integer gameScore) {
		super();
		this.scoreId = scoreId;
		this.gameId = gameId;
		this.gameScore = gameScore;
	}
	
	//getter and setter for ScoreId
	public Integer getScoreId() {
		return scoreId;
	}
	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}
	
	//getter and setter for gameId
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	
	//getter and setter for GameScore
	public Integer getGameScore() {
		return gameScore;
	}
	public void setGameScore(Integer gameScore) {
		this.gameScore = gameScore;
	}
}

