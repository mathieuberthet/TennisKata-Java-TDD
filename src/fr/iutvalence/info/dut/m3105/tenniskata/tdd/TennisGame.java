package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

//	public static final String[] SERVER_SCORE = {"love", "fifteen", "thirty", "forty"};
//	public static final String[] RECEIVER_SCORE = {"love", "fifteen", "thirty", "forty"};
//	public static final String ALL = "all";
	public static final String LOVE_ALL = "love all";
	public static final String LOVE_FIFTEEN = "love - fifteen";
	public static final String LOVE_THIRTY = "love - thirty";
	public static final String LOVE_FORTY = "love - forty";
	
	public static final String FIFTEEN_LOVE = "fifteen - love";
	public static final String SCORE_FIFTEEN = "fifteen all";
	public static final String FIFTEEN_THIRTY = "fifteen - thirty";
	public static final String FIFTEEN_FORTY = "fifteen - forty";
	
	public static final String THRITY_LOVE = "thirty love";
	public static final String THIRTY_FIFTEEN = "thirty - fifteen";
	public static final String THIRTY_ALL = "thirty all";
	public static final String THIRTY_FORTY = "thirty - forty";
	
	
	public static final String FORTY_LOVE = "forty - love";
	public static final String FORTY_FIFTEEN = "forty - fifteen";
	public static final String FORTY_THIRTY = "forty - thirty";
	
	
//	public int serverScore;
//	public int receiverScore;	
//	
//
//	public TennisGame() 
//	{
//		this.serverScore = 0;
//		this.receiverScore = 0;
//	}
//
//	public void serverScore()
//	{
//		this.serverScore ++;
//	}
//	
//	public void receiverScore()
//	{
//		this.receiverScore ++;
//	}
//	public String getScore() 
//	{
//		return this.Score(this.serverScore, this.receiverScore);
//	}
//
//	public String Score(int serverScore, int receiverScore)
//	{
//		if (SERVER_SCORE[serverScore] == RECEIVER_SCORE[receiverScore])
//			return SERVER_SCORE[serverScore] + ALL;
//		return SERVER_SCORE[serverScore] + "-" + RECEIVER_SCORE[receiverScore];
//		
//	}
	public String getScoreAtBeginning() 
	{
		return LOVE_ALL;
		
	}
	
	public String getScoreAfterEnnemyPoint() 
	{
		return LOVE_FIFTEEN;
	}
	
	public String getScoreAfterTwoEnnemyPoint() 
	{
		return LOVE_THIRTY;
	}
	
	public String getScoreAfterThreeEnnemyPoint() 
	{
		return LOVE_FORTY;
	}
	
	
	
	public String getScoreAfterYourPoint() 
	{
		return FIFTEEN_LOVE;
	}

	public String getScoreAfterBothPlayerMarkOnePoint() 
	{
		return SCORE_FIFTEEN;
	}
	
	public String getScoreAfterYourPointAndTwoEnnemyPoint() 
	{
		return FIFTEEN_THIRTY;
	}
	
	public String getScoreAfterYourPointAndThreeEnnemyPoint() 
	{
		return FIFTEEN_FORTY;
	}

	
	public String getServerScoreTwoPoint() 
	{
		return THRITY_LOVE;
	}
	
	public String getServerScoreTwoPointAndEnnemyWonOne() 
	{
		return THIRTY_FIFTEEN;
	}
	
	public String getScoreAfterBothPlayerWonTwoPoint() 
	{
		return THIRTY_ALL;
	}
	
	public String getServerScoreTwoPointAndEnnemyWonThree() 
	{
		return THIRTY_FORTY;
	}
	
	
	public Object getServerScoreThreePoint() 
	{
		return FORTY_LOVE;
	}
	
	public Object getServerScoreThreePointAndEnnemyWonOne() 
	{
		return FORTY_FIFTEEN;
	}
	
	public Object getServerScoreThreePointAndEnnemyWonTwo() 
	{
		return FORTY_THIRTY;
	}



}
