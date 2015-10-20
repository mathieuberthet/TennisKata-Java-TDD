package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	static final String SCORE = "love all";
	static final String SCORE_AFTER_POINT = "fifteen love";
	static final String SCORE_AFTER_ENNEMY_POINT = "love fifteen";
	
	public TennisGame() 
	{
		
	}

	public String getScore() 
	{
		return SCORE;
		
	}

	public String getScoreAfterPoint() 
	{
		return SCORE_AFTER_POINT;
	}

	public String getScoreAfterEnnemyPoint() {
		return SCORE_AFTER_ENNEMY_POINT;
	}

}
