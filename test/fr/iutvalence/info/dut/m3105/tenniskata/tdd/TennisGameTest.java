package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	@Test
	public void makeSureThatScoreIsLoveAllAtBeginnning()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScore(), TennisGame.LOVE_ALL);
	}
	
	@Test
	public void afterOnePointScoreIsFifteenLove()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterPoint(), TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void afterOnePointOfEnnemyScoreIsLoveFifteen()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterEnnemyPoint(), TennisGame.LOVE_FIFTEEN);
	}

	@Test
	public void afterBothPlayerMarkOnePoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterBothPlayerMarkOnePoint(), TennisGame.SCORE_FIFTEEN);
	}
	
	@Test
	public void serverWonTwoPoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreTwoPoint(), TennisGame.THRITY_LOVE);
	}
	
	@Test
	public void serverWonThreePoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreThreePoint(), TennisGame.FORTY_LOVE);
	}
}
