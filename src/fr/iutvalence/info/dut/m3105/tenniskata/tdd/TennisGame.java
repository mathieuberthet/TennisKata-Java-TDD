package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	public static final String SCORE = "love all";
	public static final String SCORE_AFTER_POINT = "fifteen love";
	public static final String SCORE_AFTER_ENNEMY_POINT = "love fifteen";
	public static final String SCORE_FIFTEEN = "fifteen all";
	
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

	public String getScoreAfterBothPlayerMarkOnePoint() {
		return SCORE_FIFTEEN;
	}

}
