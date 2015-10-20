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
		assertEquals(newTennisGame.getScore(), TennisGame.SCORE);
	}
	
	@Test
	public void afterOnePointScoreIsFifteenLove()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterPoint(), TennisGame.SCORE_AFTER_POINT);
	}
	
	@Test
	public void afterOnePointOfEnnemyScoreIsLoveFifteen()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterEnnemyPoint(), TennisGame.SCORE_AFTER_ENNEMY_POINT);
	}

	@Test
	public void afterBothPlayerMarkOnePoint()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterBothPlayerMarkOnePoint(), TennisGame.SCORE_FIFTEEN);
	}
}
