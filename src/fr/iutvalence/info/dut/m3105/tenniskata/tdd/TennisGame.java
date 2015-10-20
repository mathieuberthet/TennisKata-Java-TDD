package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	public static final String[] SERVER_SCORE = {"love", "fifteen", "thirty", "forty"};
	public static final String[] RECEIVER_SCORE = {"love", "fifteen", "thirty", "forty"};
	public static final String LOVE_ALL = "love all";
	public static final String FIFTEEN_LOVE = "fifteen love";
	public static final String LOVE_FIFTEEN = "love fifteen";
	public static final String SCORE_FIFTEEN = "fifteen all";
	public static final String THRITY_LOVE = "thirty love";
	public static final String FORTY_LOVE = "forty love";
	
	public int serverScore;
	public int receiverScore;	
	

	public TennisGame() 
	{
		this.serverScore = 0;
		this.receiverScore = 0;
	}

	public int getServerScore() 
	{
		return serverScore;
	}

	public int getReceiverScore() 
	{
		return receiverScore;
	}
	
	public String getScore() 
	{
		return LOVE_ALL;
		
	}

	public String getScoreAfterPoint() 
	{
		return FIFTEEN_LOVE;
	}

	public String getScoreAfterEnnemyPoint() 
	{
		return LOVE_FIFTEEN;
	}

	public String getScoreAfterBothPlayerMarkOnePoint() 
	{
		return SCORE_FIFTEEN;
	}

	public String getServerScoreTwoPoint() 
	{
		return THRITY_LOVE;
	}

	public Object getServerScoreThreePoint() 
	{
		return FORTY_LOVE;
	}

}
