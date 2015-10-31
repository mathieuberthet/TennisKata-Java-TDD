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
		assertEquals(newTennisGame.getScoreAtBeginning(), TennisGame.LOVE_ALL);
	}
	
	@Test
	public void afterOnePointOfEnnemyScoreIsLoveFifteen()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterEnnemyPoint(), TennisGame.LOVE_FIFTEEN);
	}
	
	@Test
	public void afterEnnemyWonTwoPoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterTwoEnnemyPoint(), TennisGame.LOVE_THIRTY);
	}
	
	@Test
	public void afterEnnemyWonThreePoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterThreeEnnemyPoint(), TennisGame.LOVE_FORTY);
	}
	
	@Test
	public void afterOnePointScoreIsFifteenLove()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterYourPoint(), TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void afterBothPlayerMarkOnePoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterBothPlayerMarkOnePoint(), TennisGame.SCORE_FIFTEEN);
	}
	
	@Test
	public void afterOnePointForYouAndTwoForEnnemy()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterYourPointAndTwoEnnemyPoint(), TennisGame.FIFTEEN_THIRTY);
	}
	
	@Test
	public void afterOnePointForYouAndThreeForEnnemy()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterYourPointAndThreeEnnemyPoint(), TennisGame.FIFTEEN_FORTY);
	}
	
	@Test
	public void serverWonTwoPoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreTwoPoint(), TennisGame.THRITY_LOVE);
	}
	
	@Test
	public void serverWonTwoPointAndEnnemyWonOne()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreTwoPointAndEnnemyWonOne(), TennisGame.THIRTY_FIFTEEN);
	}
	
	@Test
	public void afterBothPlayerWonTwoPoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterBothPlayerWonTwoPoint(), TennisGame.THIRTY_ALL);
	}
	
	@Test
	public void serverWonTwoPointAndEnnemyWonThree()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreTwoPointAndEnnemyWonThree(), TennisGame.THIRTY_FORTY);
	}
	
	
	@Test
	public void serverWonThreePoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreThreePoint(), TennisGame.FORTY_LOVE);
	}
	
	@Test
	public void serverWonThreePointAndEnnemyWonOne()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreThreePointAndEnnemyWonOne(), TennisGame.FORTY_FIFTEEN);
	}
	
	@Test
	public void serverWonThreePointAndEnnemyWonTwo()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getServerScoreThreePointAndEnnemyWonTwo(), TennisGame.FORTY_THIRTY);
	}
}
